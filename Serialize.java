package javaWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
class Empl implements java.io.Serializable{
	public String name;
	public String address;
	public transient int SSN;
	public int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Empl [name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
	
}
public class Serialize {
  public static void main(String[] args) {
	Empl e=new Empl("ram","mumbai",23456,101);
	
	File file=new File("myfile.ser");
	try {
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		fos.close();
		System.out.println("serialize done..");
		
	}
	catch(FileNotFoundException e1) {
		e1.printStackTrace();
	}
	catch (IOException e1)
	{
		e1.printStackTrace();
	}
	catch(ClassNotFoundException e1) {
		e1.printStackTrace();
	}
	System.out.println("rest of code.........");
}
}
