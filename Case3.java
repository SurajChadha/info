package student;

import java.io.*;
import java.util.*;

public class Case3 
{
 String name;
 int id;
    
 Case3(String name, int id)
 {
     this.name = name;
     this.id = id;
  }
   
 @Override
 public int hashCode()
 {
        
     // We are returning the Geek_id 
     // as a hashcode value.
     // we can also return some 
     // other calculated value or may
     // be memory address of the 
     // Object on which it is invoked. 
     // it depends on how you implement 
     // hashCode() method.
     return this.id;
 }
    



 public static void main (String[] args)
 {
       
     // creating two Objects with  same state
	 Case3 g1 = new Case3 ("aditya", 1);
	 Case3  g2 = new Case3 ("aditya", 1);
       
     Map<Case3 , String> map = new HashMap<Case3 , String>();
     map.put(g1, "CSE");
     map.put(g2, "IT");
       
     for(Case3  geek : map.keySet())
     {
         System.out.println(map.get(geek).toString());
     }

 }
}

