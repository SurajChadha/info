package Task;

import java.util.Arrays;

public class practise{
	public static void   main(String[] args)
	{
		int[] num1={10,3,5};
		int[] num2=new int[]{10,4,7};  //dyn multiple
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(Arrays.toString(num1));
		
		System.out.println(Arrays.equals(num1, num2));
	}
}