//To calculate salary of employees
package practise;
import java.util.*;

class employee
{
	public static void main(String args[])
	{
		int wages,days;
		double basic,HRA,DA,PF,netsalary;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of days:");
		days=sc.nextInt();
		
		System.out.println("Enter the wages: ");
		wages=sc.nextInt();
		
		basic=wages*days;
		HRA=basic*0.1;
		DA=basic*0.2;
		PF=basic*0.12;
		netsalary=basic+HRA+DA-PF;
		
		System.out.println("The basic pay is:"+basic);
		System.out.println("The HRA is:"+HRA);
		System.out.println("The DA is:"+DA);
		System.out.println("The PF is:"+PF);
		System.out.println("The NETSALARY is:"+netsalary);
				
				
	}
}