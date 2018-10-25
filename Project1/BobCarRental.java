import java.util.Scanner;
public class BobCarRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard"); 

		System.out.print("Please choose the rental car: ");
		int car = input.nextInt();

		if (car > 3 || car <0){
			System.out.println("Incorrect entry" );
			
		}	else {
			
		System.out.print("Please enter the number of rental days: ");
		int days = input.nextInt();

		System.out.print("Club Member?: 1 for yes, 0 for no: ");
		int mem = input.nextInt();
		
		if (mem < 0 || mem > 1) {
			System.out.println("Incorrect entry" );
		
		}	else {
			

		//if they are a member
		if (mem == 1){				
			System.out.print("Plantinum Executive Package?: 1 for yes, 0 for no: ");
			int pack = input.nextInt();
			
			

			int result = 0;

			if (car == 1){
				result= 35; 								
			} else if (car == 2) {
				result= 45;
			} else if (car == 3){
				result= 95;

			} else {
				System.out.print("Incorrect entry ");
			}

	int base;
	base= (days * result);
	System.out.print("Base: " + days + " days for " + car + " @ " + result + " per day.");
	System.out.println(" $ " + base );

		if (mem == 1) {
		int discount;
		discount= (int)(days/7) * result;
		System.out.print("Club Member Discount:             ");
		System.out.println("- $ " + discount);
			} else if (mem == 0){

			}
			if (pack == 1) {  //if they get package with the membership
				int discount;
				discount= (days/7) * result;

		double discountpack; 
		discountpack= (double)(base * .15); 
		System.out.print("Platinum Executive Package:       ");
		System.out.println("+ $ " + discountpack );
		double total; 
		total= base - discount + discountpack;
		System.out.print("Total Estimate for Rental:         ");
		System.out.println(" $ " + total );

			} else if (pack == 0) {  
				int discount;
				discount= (days/7) * result;

				int total;
				total = base- discount;
				System.out.print("Total Estimate for Rental:        ");
				System.out.println("  $ " + total );   
			} else {

			}

			//If they are not a member
		} else if (mem == 0){   
			int result = 0;

	if (car == 1){
		result= 35;
	} else if (car == 2) { 
		result= 45;
	} else if (car == 3){  
		result= 95;
	} else {
		System.out.print("Incorrect entry ");
			} 

			int base; 
			base= (days * result);
			System.out.println("Base: " + days + " days for " + car + " @ " + result + " per day." + " $ " + base );

			int total; 
			total = base;
			System.out.println("Total Estimate for Rental:  $"  + total    );
			


		} else {
			System.out.print("Incorrect entry ");
		}

	}

}

}
}



