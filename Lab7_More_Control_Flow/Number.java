import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		System.out.println("You have entered " + num);
		
		if (num <= 25 && num >= 0)
			System.out.println(num + " Character of alphabet is " + (char)(num + 'A'));
		
		else 
			System.out.println("Outside of acceptable range ");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
