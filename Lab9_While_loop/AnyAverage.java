import java.util.Scanner;


public class AnyAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number you would like to average: ");

		int max = input.nextInt();  //max is to keep in loop and to keep track of numbers they want to divide by
		int counter = 1; //counter will be the number that they want to divide by
		int total = 0;   //total will be the numbers that the user wants to add
		int i = 0;		
		while ( counter <= max) {
			//ask user enter the counter number 
			System.out.println("enter " + counter + " number ");
			total += input.nextInt(); 
			counter++; 
			
			
	}

		
		//print the average 
		System.out.println("The average of the numbers is " + (total / max));
}
}

//requires code that will give you the number of total = max