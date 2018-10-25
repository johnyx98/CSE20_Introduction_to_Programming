import java.util.Scanner;
public class AnyAverageArr {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("This program will find the average of any numbers ");
		System.out.println("Please enter the max number:");
		int max = input.nextInt();
		

		int[]arr1 = new int[max+1];
		
		int i = 0;
		int counter = 0;
		int total = arr1[i]; 
		//assign each array their number
		while (i<max) {
			
		System.out.println("Please enter in " + counter + " number" );
		arr1[i]=input.nextInt();
		counter++;
		i++;
		//repeat statement and makes sure that the total is counted up.
		}
		System.out.println("The numbers being averaged: ");
		for (i = 0; i < max; i++) {
			//makes sure that the displayed array is in rows of five
			if (i % 5 == 4)
				System.out.println(arr1[i] + " ");
			else
				System.out.print(arr1[i] + " ");
			total += arr1[i];
			
			
		}		
		
		System.out.println("Average is: " + total/max);
		
	
		
		
		

	}

}
