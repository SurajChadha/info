package work;
import java.util.Arrays;
public class RadixSortDemoNew {
   int getMax(int a[],int n) {
	   int max = a[0];
	   for(int i = 1;i<n;i++) {
		   if(a[i]>max)
			   max = a[i];
	   }
	   return max;//maximum element from max
   }
   void countingSort(int a[],int n,int place)//function
   {
	   int[] output = new int[n+1];
	   int[] count = new int[10];
	   
	   //calculate count of elements
	   for(int i=0;i<n;i++)
		   count[(a[i]/place)%10]++;
	   
	   //calculate cumulative frequency
	   for(int i = 1;i < 10; i++)
		   count[i] += count[i-1];
	   
	   //Place the elements in sorted order
	   for(int i=n-1;i>=0;i--)
	   {
		   output[count[(a[i]/place)%10]-1]=a[i];
		   count[(a[i]/place)%10]--;
	   }
	   for(int i=0;i<n;i++)
	   a[i] = output[i];
   }
   void radixsort(int a[], int n) {
	   //get maximum element from array
	   int max = getMax(a, n);
	   //Apply counting sort to sort elements based on place value
	   for(int place=1; max / place>0;place *= 10) {
		   countingSort(a, n, place);
	   }
   }
	   //function to print array elements
	   void printArray(int a[], int n) {
	   for(int i = 0; i < n; ++i) {
	   System.out.println(a[i]+" ");
           }
	   }
	   public static void main(String args[]) {
		   int a[] = {151, 259, 360, 91, 115, 706, 34, 858, 2};
		   int n = a.length;
		   RadixSortDemoNew r1 = new RadixSortDemoNew();
		   System.out.println("Before sorting array elements are:-\n");
		   r1.printArray(a, n);
		   r1.radixsort(a, n);
		   
		   System.out.println("\nAfter applying array elements are-\n");
		   r1.printArray(a, n);
		   
	   }
	   
   }
