package Work;

public class diamond {
 static void halfDiamondStar(int N)
 {
	 int i,j;
	 for(i=0;i<N;i++)
	 {
		 for(j=0;j<i+1;j++)
			 System.out.print("*");
		 System.out.println("\n");
	 }
	 for(i=1;i<N;i++)
	 {
		 for(j=i;j<N;j++)
			 
			 System.out.print("*");
		 System.out.println("\n");
	 }
 }
	 //Driver code
	 public static void main(String[] args)
	 {
		 int N=5;
		 halfDiamondStar(N);
	 }
 }

