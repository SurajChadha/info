package work9;
//-------struct data-------------//
class LinkedList    //OC
{  Node head=null;      //dm of 

     //operations methods
     public void displayNodes()
     {   Node tmp=head;
    	 
           while(tmp !=null)
           {
        	   System.out.println(tmp.data);
        	   tmp=tmp.next;
           }
           System.out.println("done..");
     }
     //inner class
	 class Node    //data for your rules
	 {
		 int data;  //PT (basic types)--obj Book
		 Node next; //ptr-obref
		 
		 public Node(int d)
		 {	 data=d;
		     next=null;
		 }
	 }	
}

//driver
public class Book
{	public static void main(String[] args) {
		LinkedList  ls=new LinkedList();
		System.out.println(ls.head);
		
		ls.head = ls.new Node(10);
		System.out.println(ls.head);
		System.out.println(ls.head.data);
		System.out.println(ls.head.next);
		
		work9.LinkedList.Node second =  ls.new Node(20);
		ls.head.next=second;
		System.out.println(ls.head.next.data);
		
		work9.LinkedList.Node third =  ls.new Node(30);
		second.next=third;
		
		System.out.println(ls.head.next.next.data);
		
		ls.displayNodes();
		
	}
}