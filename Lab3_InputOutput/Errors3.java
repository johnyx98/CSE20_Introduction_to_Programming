import java.util.Scanner;

//public class Errors3
public class Errors3 {

	public static void main(String[] args) {
		//Scanner kbd = new Scanner System.in;
		Scanner kbd = new Scanner (System.in);
		//Int numerator;
		int numerator;
		//integer denominator;
		int denominator;
		
		

		//System.println("This program divides two numbers.");
		System.out.println("This program divides two numbers.");
		//System.print("Enter the numerator: ");
		System.out.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		//denomintaor = kbd.nextInt();
		denominator = kbd.nextInt();

		//system.out.print(numerator);
		System.out.print(numerator);
		System.out.print("/");
		//System.out.Print(denominator);
		System.out.print(denominator);
		System.out.print(" = ");
		//System.out.println(double) numerator/denominator);
		System.out.println(numerator/denominator);
		
	}
}