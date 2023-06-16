package work;
import java.util.Scanner;
class Tax {
   public static void main(String[] args) {
	   int sal;double Tax;
	   System.out.println("Enter salary");
	   Scanner r=new Scanner(System.in);
	   sal=r.nextInt();
	   
	   if(sal<=10000)
	   {
		   System.out.println(sal + "No Tax");
	   }
	   else if(sal>10000 && sal<=10000)
	   {
		   Tax=sal*0.10;
		   System.out.println(sal+" "+Tax);
		   
		   
	   }
	   else
	   {
		   Tax=sal*0.20;
		   System.out.print(sal+" "+Tax);
	   }
   }
}
