import java.util.Scanner;

public class movieDiscounts {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		int ticketPrice = 7; 
		if(age > 60) {
			System.out.println("Total price is: "+(ticketPrice*0.45)+" Euros.");
		}
		else if(age < 5) {
			System.out.println("Total price is: "+(ticketPrice*0.40)+" Euros.");
		}
		else {System.out.println("Total price is: "+ticketPrice+" Euros.");
		}//if

	}//main

}
