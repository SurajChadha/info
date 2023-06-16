package work;
import java.util.Scanner;
public class AccountSolution {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 AccountNew a=new AccountNew(sc.nextInt(),sc.next(),sc.nextDouble());
	 a.deposit(sc.nextDouble());
	 a.withdrawal(sc.nextDouble());
	 System.out.println(String.format("Balance:%.2f",a.getBalance()));
     sc.close();
 }
}
