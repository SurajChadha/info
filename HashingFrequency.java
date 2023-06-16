package info;
import java.util.*;
public class HashingFrequency {
  public static void main(String[] args) {
	int[] arr = {12, 5, 64, 22, 7, 65, 12, 53, 52, 96, 42, 12, 54, 5};
	HashMap<Integer, Integer> hm = new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i]))  hm.put(arr[i], hm.get(arr[i])+1);
		else                                  hm.put(arr[i], 1);
	}
	System.out.println(hm);
}
}
