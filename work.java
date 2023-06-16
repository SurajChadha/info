package Task;

import java.util.Arrays;
import java.util.Scanner;

public class work{
  public static void   main(String[] args)
	{
	//input nos and create a dynamic array
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt(); //3
	  int arr[]=new int[n];//dynamic array of n  numbers 3
	  for(int i=0; i<n; i++)//input that much nos 
	  arr[i]=sc.nextInt();//3
	  System.out.println(arr[0] + arr[arr.length-1]);//add first and add
	}
}