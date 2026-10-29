/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
 public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * The price of a ticket is fixed at 1000 cents.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
    }
    
    /**
 * Constructor for objects of class TicketMachine.
 * Sets the price of a ticket to the value of cost.
 */
public TicketMachine(int cost)
{
    price = cost;
    balance = 0;
    total = 0;
}

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket
     */
    public int getBalance()
    {
        return balance;
    }
    
    /**
     * Return the value of the total Field.
     */
    public int getTotal()
    {
        return total;
    }


    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        if(amount < 0) {
            System.out.println("use a positive amount rather than: " + amount);
        }
        else{
            balance = balance + amount;
        }
        
        balance = balance + amount;
    }
    /**
     * Set the price of ticket
     */
    public void setPrice(int cost)
    {
        price=cost;
    }
    
    /**
     * Print a prompt asking the customer to insert money.
     */
    public void prompt()
    {
        System.out.println("please insert the correct amount of money.");
    }
    
    /**
     * Print the price of a ticket.
     */
    public void showPrice()
    {
        System.out.println("The price of a ticket is" + price + "cents.");
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
    
    public void PrintTicket()
{
    int amountLeftToPay = price - balance;
    
    if(amountLeftToPay <= 0) {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        
        total = total + price;
        balance = balance - price;
    }
    else {
        System.out.println("You must insert at least: " +
                            amountLeftToPay + " more cents.");
    }
}
    
    /**
 * Empty the machine of the money it has collected in
 * total so far. This simulates removing the money and
 * resetting the total to zero.
 */
public void empty()
{
    total = 0;
}

/**
 * Empty the machine of the total amount collected, and
 * return the amount that was collected before resetting.
 */
public int emptyMachine()
{
    int amountToReturn = total;
    total = 0;
    return amountToReturn;
}
}
