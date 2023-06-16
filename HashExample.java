package student;



import java.util.HashMap;
import java.util.Map;

public class HashExample {
  public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();//creating hashmap
    map.put(1, "Mango");
    map.put(2, "Apple");
    map.put(3, "Banana");
    map.put(4, "Grapes");
    
    System.out.println("Iterating Hashmap...");
    for(Map.Entry m : map.entrySet()) {
    	System.out.println(m.getKey()+" "+m.getValue());
    	
    	System.out.println("Initial list of elements:"+map);
    	//key-based removal
    	map.remove(100);
    	System.out.println("Updated list of elements:"+map);
    	map.remove(101);
    	System.out.println("Updated list of elements:"+map);
    	//key value pair based removal
    	map.remove(102,"Rahul");
    	System.out.println("Updated list of elements:"+map);
    	
    }
  }
}

