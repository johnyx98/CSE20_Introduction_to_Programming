import java.util.Scanner;


public class SumAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int counter = 0;
		int i = 0;
		int total = 0;
		while ( counter <= max) {
			//print counter here
			System.out.println("Number " + counter); 
			total += counter; 
			counter ++; 
			
	}
		
		//print total
		System.out.println("The total of the numbers is " + total);

}
}