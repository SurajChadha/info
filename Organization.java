package work9;
import java.util.ArrayList;
class Empl
{
	private int eID;
	private String eName;
	public int geteID() {
		return eID;
	}
	public void seteID(int eID)
	{
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	
	public Empl(int i,String n)
	{
		eID=i;
		eName=n;
	}
	@Override
	public String toString() {
		return "Empl [eID=" + eID + ", eName=" + eName + "]";
	}
	
	
	
}
public class Organization {
  private String orName;
  private int strength;
  
  ArrayList<Empl> alist=new ArrayList();

public Organization(String string) {
	strength = 0;
	orName = string;
}

public String getOrName() {
	return orName;
}

public void setOrName(String orName) {
	this.orName = orName;
}

public int getStrength() {
	return strength;
}

public void  addEmp(Empl x) {
	alist.add(x);
	System.out.println("added emp....");
	strength+=1;
}
public void showEmps() {
	for(Empl x:alist)
		System.out.println(x);
}
public static void main(String[] args) {
	Organization o=new Organization("Chitkara");
	System.out.println(o.getOrName());
	o.addEmp(new Empl(1,"Arpit"));
	o.addEmp(new Empl(2,"Aman"));
	o.showEmps();
	System.out.println(o.getStrength());
}
}



