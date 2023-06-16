package work;

public class showOuter {
	//static member
   static int outer x = 10;
  // instance(non-static)member
   int outer y = 20;
   //private member
   private static int outer private = 30;
   
   public void showOuter()
   {
	   System.out.println(outer x);
	   System.out.println(outer y);
	   System.out.println(outer private);
   }
//static nested class
   static class StaticNestedClass
   {
	   void display() {
		   //can access static member of outer class
		   System.out.println("outer x="+outer x);
	   }
   }
   
   
   
}
