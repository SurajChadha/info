package work;
import java.util.*;
class Student
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
class MyNameDesc implements Comparator<Student>
{

	@Override
	public int compare(Student o1,Student o2) {
		return o2.getName().compareTo(o1.getName());
		
	}
	
}
class MyIDDesc implements Comparator<Student>
{
	@Override
	public int compare(Student o1,Student o2) {
		return o2.getId() - o1.getId();
	
	}
	
}
public class Testing {
  public static void main(String[] args) {
	ArrayList<Student> obj = new ArrayList<Student>();
	Student ar[] = new Student[] { new Student(1,"ram"),
			                       new Student(2,"sam")
	                             };
	
	obj.add(new Student(1,"jam"));
	obj.add(new Student(6,"sam"));
	obj.add(new Student(3,"aam"));
	obj.add(new Student(5,"ram"));
	System.out.println(obj);
	
	Arrays.sort(ar,new MyIDDesc());
	System.out.println("-----arr-----:"+Arrays.toString(ar));
	Collections.sort(obj, new MyIDDesc());
	System.out.println(obj);
	}
}

