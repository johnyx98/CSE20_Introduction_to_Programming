import java.util.Scanner;

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.getProperty("line.separator"));
		
		//question
		
		System.out.println("What is your name?");
		String username = input.nextLine();
		System.out.print("what is your age?");
		
		
		int age = input.nextInt();
		
		
		
		System.out.println("Their name is " + username + ".");
		System.out.println("Their age is " + age + "." );
	}

}
