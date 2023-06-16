package work;
import java.util.Scanner;
class swap
{
	public static void main(String[] args) {
		System.out.println("Enter the values of x and y");
         Scanner sc = new Scanner(System.in);
         /*Define variables*/
         int x = sc.nextInt();
         int y = sc.nextInt();
         
         x = x + y;
         y = x - y;
         x = x - y;
         System.out.println("After swapping:"+x+" "+y);
	}
}

