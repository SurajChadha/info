package student;

public class HashDemo {
 public static void main(String[] args) {
	//keys:15 11 27 8 custom impl--------------HashSet Collection --- HashMap
	 int arr[] = new int[7];  //bucket 0-6
	 int keys[]= {15,11,27,8}; //data key-value
	 
	 System.out.println("buckets fr hash table "+arr.length);
	 
	 for(int i=0; i<4; i++) {
		 int hashindex = keys[i] % 7;
		 System.out.println("Key:"+hashindex+" "+keys[i]);
		 arr[hashindex]=keys[i];
	 }
	 
}
}

