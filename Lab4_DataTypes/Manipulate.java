import java.util.Scanner;
public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This lab is designed to calculate two numbers while displaying 5 results");
		
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Please type in the first number");
		n1 = input.nextInt();
		
		System.out.println("Please type in the second number");
		n2 = input.nextInt();
		
		int add;
		add = n1+n2;
		int sub;
		sub = n1-n2;
		int mul;
		mul = n1*n2;
		int div;
		div = n1/n2;
		
		System.out.println("The addition of the numbers is");
		System.out.println(add);
		System.out.println("The subtraction of the numbers is");
		System.out.println(sub);
		System.out.println("The multiplication of the numbers is");
		System.out.println(mul);
		System.out.println("The division of the numbers is");
		System.out.println(div);
		
		System.out.println("The decimal number of your numbers added is " + (float)(add));
		System.out.println("The decimal number of your numbers subtracted is " + (float)(sub));
		System.out.println("The decimal number of your numbers multiplied is " + (float)(mul));
		System.out.println("The decimal number of your numbers divided is " + (float)(div));
		
		System.out.println("please input 2 more numbers");
		short n3, n4;
		n3 = input.nextShort();
		n4 = input.nextShort();
		
		System.out.print("n3 + n4 = ");
		System.out.println((short)(n3 + n4));
		
		System.out.print("n3 - n4 = ");
		System.out.println((short)(n3 - n4));
		
		System.out.print("n3 * n4 = ");
		System.out.println((short)(n3 * n4));
		
		System.out.print("n3 / n4 = ");
		System.out.println((short)(n3 / n4));
		
		System.out.print("n3 % n4 = ");
		System.out.println((short)(n3 % n4));
		
		System.out.println("please input 2 more numbers");
		float n5, n6;
		n5 = input.nextFloat();
		n6 = input.nextFloat();
		
		System.out.print("n5 + n6 = ");
		System.out.println((float)(n5 + n6));
		
		System.out.print("n5 - n6 = ");
		System.out.println((float)(n5 - n6));
		
		System.out.print("n5 * n6 = ");
		System.out.println((float)(n5 * n6));
		
		System.out.print("n5 / n6 = ");
		System.out.println((float)(n5 / n6));
		
		System.out.print("n5 % n6 = ");
		System.out.println((float)(n5 % n6));
		
		System.out.println("please input 2 more numbers");
		double n7, n8;
		n7 = input.nextDouble();
		n8 = input.nextDouble();
		
		System.out.print("n7 + n8 = ");
		System.out.println((double)(n7 + n8));
		
		System.out.print("n7 - n8 = ");
		System.out.println((double)(n7 - n8));
		
		System.out.print("n7 * n8 = ");
		System.out.println((double)(n7 * n8));
		
		System.out.print("n7 / n8 = ");
		System.out.println((double)(n7 / n8));
		
		System.out.print("n7 % n8 = ");
		System.out.println((double)(n7 % n8));
	}

}
