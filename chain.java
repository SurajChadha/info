package work;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class One{
	int o1=100;
	Two t;
	One(Two o){
		t=o;
	}
	public void show()
	{
		System.out.println(o1);
		t.show();
	}\
	
	public double cube(double x)
	{
		return x * t.square(x);
	}
}
class Two
{
	int o2;
	Three t3;
	Two(Three x)
	{
		o2=200;
		t3=x;
	}
	public double square(double x) {
		return x*t3.getnum(x);
	}
	public void show() {
		System.out.println(o2);
		t3.show();
	}
}
class Three
{
	int o3;
	
	Three()
	{
		o3=300;
	}
	public double getnum(double x)
	{
		return x;
	}
	public void show() {
		System.out.println(o3);
	}
}
public class chain {
  public static void main(String[] args) {
	Three t3=new Three();
	Two t2=new Two(t3);
	One t1=new One(t2);
	
	System.out.println(t1.cube(2));
	System.out.println(t2.square(2));
	System.out.println(t3.getnum(2));
	
	One obj=new One(new Two(new Three()));
	System.out.println(obj.cube(3));
	
BufferedReader br=new BufferedReader(new InputStreamReader(SYstem.in));
System.out.println("Enter names");
String name;
try {
	name=br.readLine("name : "+name);
	
}
catch(IOException e) {
	e.printStackTrace();
    }
  }
}
