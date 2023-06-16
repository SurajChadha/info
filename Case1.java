package employee;
//Java program to illustrate overriding of equals and
//hashcode methods

import java.io.*;
import java.util.*;

class Case1 
{
 
String name;  //attributes state (Obj)
int id;
 
Case1(String name, int id)
{   this.name = name;
   this.id = id;
}
 



@Override
public boolean equals(Object obj)
{  
// if both the object references are referring to the same object.
if(this == obj)
       return true;       
   // it checks if the argument is of the 
   // type Person by comparing the classes 
   // of the passed argument and this object.
   // if(!(obj instanceof Person)) return false; ---> avoid.
   if(obj == null || obj.getClass()!= this.getClass())
       return false;
     
   // type casting of the argument. 
   Case1 geek = (Case1) obj;
     
   // comparing the state of argument with 
   // the state of 'this' Object.
   return (geek.name.equals(this.name)  && geek.id == this.id);
}

 
@Override
public int hashCode()
{     
   // We are returning the Person_id 
   // as a hashcode value.
   // we can also return some 
   // other calculated value or may
   // be memory address of the 
   // Object on which it is invoked. 
   // it depends on how you implement 
   // hashCode() method.
   return this.id;           //put(K,V)---internally put() code
}
 







//Driver code

public static void main (String[] args) 
{     
   // creating two Objects with same state
	 Case1 g1 = new Case1("aditya", 1);
	 Case1 g2 = new Case1("aditya", 1);
     
   Map<Case1, String> map = new HashMap<Case1, String>();
   map.put(g1, "CSE");
   map.put(g2, "IT");
     
   for(Case1 geek : map.keySet())
   {   System.out.println(map.get(geek).toString());
   }

}
}

