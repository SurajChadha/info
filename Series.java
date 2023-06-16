package Work;
import java.util.Scanner;
public class Series {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int nos=sc.nextInt();
    	
    	int arr[]=new int[nos];
    	int arr1[]=new int[nos];
    	
    	for(int i=0; i<nos ;i++)
    		arr[i]=sc.nextInt();
    	for(int i=0;i<nos;i++)
    	{
    		{
    			for(int j=0;j<nos;j++)
    			{
    				if(i!=j)//0 1
    				{
    					arr1[i] += arr[j]*arr[j];
    				}
    			}
    		}
    	}
    }
}
