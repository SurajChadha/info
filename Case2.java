package student;


	import java.io.*;
	import java.util.*;
	public class Case2 {
	class Person 
	{
	   
	 String name;
	 int id;
	   
	 Person(String name, int id)
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
	     Person geek = (Person) obj;
	       
	     // comparing the state of argument with 
	     // the state of 'this' Object.
	     return (geek.name.equals(this.name)  && geek.id == this.id);
	 } 
	

	//Driver code
	
	 public static void main (String[] args) 
	 {     
	     // creating two Objects with same state
		 Person g1 = new Person("aditya", 1);
		 Person g2 = new Person("aditya", 1);
	       
	     Map<Person, String> map = new HashMap<Person, String>();
	     map.put(g1, "CSE");
	     map.put(g2, "IT");
	       
	     for(Person geek : map.keySet())
	     {   System.out.println(map.get(geek).toString());
	     }

	 }
	}
	}

