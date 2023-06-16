package work;
import java.util.Scanner;
public class SalesTax {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.println("Enter the purchase amount: ");
	
	double purchaseAmount = input.nextDouble();
	
	double tax = purchaseAmount * 0.0725;
    
	System.out.println("The sale amount is $" + tax);
    System.out.println("The amount of tax is $" + (int)(tax * 100) / 100.0);
    System.out.println("The total cost is $" + (int) (tax + purchaseAmount* 100) / 100.0);
  }
}
