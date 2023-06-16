package info;
import java.util.Arrays;
public class MergeSort {
  public static void main(String[] args) {
	int arr[]= {7,4,2,36,23};
	
	System.out.println(Arrays.toString(arr));
	merge_sort(arr,0,arr.length-1);
	System.out.println(Arrays.toString(arr));
	merge_sort(arr,0,arr.length-1);
}
  
}
