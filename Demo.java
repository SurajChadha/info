package work9;
import java.util.Scanner;
class frequency {
  int a[]=new int[10];//class variables
  int key;
  void getdata()
  {
	  Scanner sc=new Scanner(System.in);
	  int i;
	  for(i=0;i<10;i++)
	  {
		  System.out.println("Enter no");
		  a[i] = sc.nextInt();
	  }
	  System.out.println("Enter no to find frequency");
	  key = sc.nextInt();
  }
  void count()
  {
	  int i,count=0;
	  for(i=0;i<=10;i++)
	  {
		  if(a[i]==key)
			  count=count+1;
	  }
	  System.out.println("Frequency="+count);
  }
}
class Demo
{
	public static void main(String[] args) {
		frequency aa = new frequency();
		aa.getdata();
		aa.count();
	}
}
