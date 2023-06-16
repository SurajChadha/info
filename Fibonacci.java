package work;
import java.util.*;
public class Fibonacci {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	int t1 = 0,t2=1;
	System.out.println("Enter the no of terms");
    int n=sc.nextInt();
    System.out.println("FIrst"+n+"terms of fibonacci series: ");
    for(int i = 1;i<=n;++i)
    {
    	System.out.println(t1 + " ");
    	int sum=t1 + t2;
    	t1 = t2;
    	t2 = sum;
    }
  }
}
