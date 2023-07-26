import java.util.Scanner;
public class CommissionCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the amount of sales:");
		int sales = in.nextInt();
		if(sales <= 1000) {
			System.out.println("N/A");
		}
		else if(sales > 1000 && sales <= 5000) {
			System.out.println("The commission on this sale is: "+(sales*0.10F));
		}
		else if(sales > 5000 && sales <= 10000) {
			System.out.println("The commission on this sale is: "+(sales*0.20F));
		}
		else{
			System.out.println("The commission on this sale is: "+(sales*0.30F));
		}//if commission
	}//main

}
