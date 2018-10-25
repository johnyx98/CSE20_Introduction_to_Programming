import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	
		int i = 0;
		int counter = 0;
		int total = 0;
		do {
			
			System.out.println("Enter " + counter + " number: ");
			i = input.nextInt();
			
			if (i>=0) {
				total += i;
			counter++;
			}
		} while ( i > 0);
		
		
		System.out.println("Average is " + total/counter);
	}
}
