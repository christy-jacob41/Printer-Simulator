
public class OutsidePrintJob extends PrintJob {

	// variable to hold cost
	private double cost;
	
	// default constructor
	public OutsidePrintJob()
	{
		// calling super class constructor and initializing cost to 0
		super();
		cost = 0;
	}
		
	// constructor
	public OutsidePrintJob(String username, int numPages, int userPriority)
	{
		// calling super class constructor and initializing cost which is number of pages times .10 cents
		super(username, numPages, userPriority);
		cost = numPages * .10;
	}
	
	// cost accessor method 
	public double getCost()
	{
		return cost;
	}
	
	// printJob function overloads super class' printJob function and prints the username, user priority, number of pages, and cost
	public void printJob()
	{
		// also print dollar sign and ending zero since it's 10 cents per page to make it look better
		System.out.println("Name: " + getUsername() + "\nUser Priority: " + getUserPriority() + "\nNumber of Pages: " + getNumPages() + "\nCost: $" + getCost() + "0\n");
	}
}
