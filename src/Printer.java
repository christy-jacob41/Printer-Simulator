import java.util.Scanner;
import java.io.*;

public class Printer {

	public static void main(String args[]) throws IOException
	{
		// create a scanner to read in the "input.txt" file
		Scanner inputFile = new Scanner(new File("input.txt"));	
		
		// create a Binary Heap containing printerQueue
		BinaryHeap<PrintJob> printerQueue = new BinaryHeap<>();
		
		// while loop to read in each line from the input file
		while(inputFile.hasNextLine())
		{
			// read in the username, user Priority, number of pages, and whether it's an outside or inside printJob
			String username = inputFile.next();
			int userPriority = inputFile.nextInt();
			int numPages = inputFile.nextInt();
			String outsideOrInside = inputFile.next();
				
			// add the current job as an inside print job to the priority queue if it is stated as one
			if(outsideOrInside.contentEquals("I"))
			{
				printerQueue.insert(new PrintJob(username, numPages, userPriority));
			}
			// add the current job as an outside print job to the priority queue if it is stated as one
			else
			{
				printerQueue.insert(new OutsidePrintJob(username, numPages, userPriority));
			}
		}
		
		// pop of objects from the queue while it isn't empty and print the information to the screen
		while(!printerQueue.isEmpty())
		{
			// delete the min object and use printJob function to print the corresponding information
			printerQueue.deleteMin().printJob();
			
		}
		
		// close the scanner
		inputFile.close();
		
	}
}

