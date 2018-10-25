import java.util.Scanner;

public class Lab_trials {

	public Lab_trials() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the sample size ");
		int max = input.nextInt(); 

		int[]arr1 = new int[max];
		int[]arr2 = new int[max];
		int[]arr3 = new int[max];
		int[]arr4 = new int[max];
		int []avg = new int[1000000];
		int min = Integer.MAX_VALUE;
		int maxavg = Integer.MIN_VALUE;
		int counter = 0; 
		int sumavg = 0 , countavg = max;

		//trial 0 
		System.out.println("Enter numbers for Trial 0 ");
		while (counter < max) {
			System.out.print("Enter sample " + " #" + counter + " :");
			arr1[counter] = input.nextInt();
			sumavg += arr1[counter];
			avg[0] = sumavg/countavg;
			counter++;
			
		}
		sumavg = 0;
		counter = 0;
		
		//trial 1
		System.out.println("Enter numbers for Trial 1 ");
		while (counter < max) {
			System.out.print("Enter sample " + " #" + counter + " :");
			arr2[counter] = input.nextInt(); 
			sumavg += arr2[counter];
			avg[1] = sumavg/countavg;
			counter++;
			
		}
		sumavg = 0;
		counter = 0;
		
		//trial 2
		System.out.println("Enter numbers for Trial 2  ");
		while (counter < max) {
			System.out.print("Enter sample " + " #" + counter + " :");
			arr3[counter] = input.nextInt(); 
			sumavg += arr3[counter];
			avg[2] = sumavg/countavg;
			counter++;
		}

		sumavg = 0;
		counter = 0;

		//trial 3
		System.out.println("Enter numbers for Trial 3 ");	
		while (counter < max) {
			System.out.print("Enter sample " + " #" + counter + " :");
			arr4[counter] = input.nextInt(); 
			sumavg += arr4[counter];
			avg[3] = sumavg/countavg;
			counter++;
		}

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial3\tTrial 4");
		
		for (counter = 0; counter < max; counter++) {
			System.out.println("\t" + counter + "\t\t" + arr1[counter] + "\t" + arr2[counter] + "\t" + arr3[counter] + "\t" + arr4[counter]);
			
		}
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("Average:" + "\t\t" + avg[0] + "\t" + avg[1] + "\t" + avg[2] + "\t" + avg[3]);
		
		for (counter = 0; counter < 4; counter++) {
			if (avg[counter] < min) {
				min = avg[counter];
			}
			if (avg[counter] > maxavg) {
				maxavg = avg[counter];
			}
		}
		System.out.println("Min Average: " + min);
		System.out.println("Max Average: " + maxavg);

		if (min == maxavg) {
			System.out.println("The trials match EXACTLY!");
		}
		else if (maxavg < (2 * min)) {
			System.out.println("The trials concur with each other!");
		}
		else {
			System.out.println("The trials do NOT concur!");
		}
		
	}

}
