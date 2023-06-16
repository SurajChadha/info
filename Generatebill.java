package Work;
import java.util.Scanner;
public class Generatebill {
   public static void main(String[] args)
   {
	   getPlanFactory gpf=new getPlanFactory();
	   System.out.println("Enter plans and units");
	   Scanner sc=new Scanner(System.in);
	   
	   String name=sc.next();
	   int units=sc.nextInt();
	   
	   plan p =gpf.getPlan(name);
	   p.getRate();
	   p.calculateBill(units);
	   
   }
}
