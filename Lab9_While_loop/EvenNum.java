import java.util.Scanner;


public class EvenNum {

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
		while ( counter <= max) {
			//if counter is even input a statement that says this
			if (counter % 2 == 0) {
			System.out.println("Number " + counter + " % " + "2 " + "= " + counter % 2);
			
			
			}
			counter++;
	}

		
		
}

}