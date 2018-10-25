import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		
		System.out.println("Please enter in the base:");
		
		int base = input.nextInt();
		
		int multiple;
		
		multiple = base;
		for (int i = 0; i <= max; i+=base) {
			System.out.println("Number " + i);
			
			
			
			
		}
	}
}
