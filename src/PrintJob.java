
// print job class that implements Comparable interface
public class PrintJob implements Comparable<PrintJob>{

	// private variables to hold user name, number of pages being printed, and user priority
	private String username;
	private int numPages;
	private int userPriority;
	
	// default constructor
	public PrintJob()
	{
		username = "";
		numPages = 0;
		userPriority = 0;
	}
	
	// PrintJob constructor
	public PrintJob(String username, int numPages, int userPriority)
	{
		// initialize username, numPages, and userPriority to passed values
		this.username = username;
		this.numPages = numPages;
		this.userPriority = userPriority;
	}
	
	// username accessor method
	public String getUsername()
	{
		return username;
	}
	
	// number of pages accessor method
	public int getNumPages()
	{
		return numPages;
	}
	
	// userPriority accessor method
	public int getUserPriority()
	{
		return userPriority;
	}
	
	// compareTo method
	public int compareTo(PrintJob otherPrintJob)
	{
		// if the priority of the current object is greater return 1
		if((this.numPages*this.userPriority) > (otherPrintJob.numPages*otherPrintJob.userPriority))
		{
			return 1;
		}
		// if the priority of the objects are equal return 0
		else if((this.numPages*this.userPriority) == (otherPrintJob.numPages*otherPrintJob.userPriority))
		{
			return 0;
		}
		// if the priority of the current object is less return -1
		else
		{
			return -1;
		}
	}
	
	// printJob function prints the username, user priority, and number of pages
	public void printJob()
	{
		System.out.println("Name: " + getUsername() + "\nUser Priority: " + getUserPriority() + "\nNumber of Pages: " + getNumPages() + "\n");
	}
}
