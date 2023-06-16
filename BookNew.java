package work9;
import java.io.*;
public class BookNew {
  Node head;
  static class Node{
	  int data;
	  Node next;
	  
	  Node(int d)
	  {
		  data = d;
		  next = null;
	  }
  }
  public static LinkedList insert(LinkedList list, int data)
  {
	  Node new_node = new Node(data);
	  
	  if(list.head == null) {
		  list.head = new_node;
	  }
	  else
	  {
		  Node last = list.head;
		  while(last.next != null)
		  {
			  last = last.next;
		  }
	  }
  }
  
public BookNew() {
	super();
	// TODO Auto-generated constructor stub
}

public BookNew(Node head) {
	super();
	this.head = head;
}

@Override
public String toString() {
	return "BookNew [head=" + head + "]";
}
  
}
