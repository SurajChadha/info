package dataStructures;

public class CircularInsertion {
  static class Node
  {
	  int data;
	  Node next;
  };
  static Node addToEmpty(Node last,int data)
  {
	  //function for empty list
	  if(last != null)
		  return last;
	  //creating a node dynamically
	  Node temp = new Node();
	  //assigning the data
	  temp.data = data;
	  last = temp;
	  
	  temp.next = last;
	  return last;
  }
  static Node addBegin(Node last,int data)
  {
	  if(last == null)
		  return addToEmpty(last,data);
	  //create a node dynamically
	  Node temp = new Node();
	  //assiging the data
	  temp.data=data;
	  //adjusting the link circular
	  temp.next = last.next;
	  last.next = temp;
	  return last;
  }
  static Node addEnd(Node last, int data)
  {
	  if(last == null)
		  return addToEmpty(last, data);
	  //create a node dynamically
	  Node temp = new Node();
	  //assiging the data
	  temp.data = data;
	  //Adjusting the links
	  temp.next=last.next;
	  last.next=temp;
	  last = temp;
	  return last;
  }
  static Node addAfter(Node last,int data,int item)
  {
	  if(last == null)
		  return null;
	  Node temp, p;
	  p = last.next;
	  do
	  {
		  if(p.data == item)
		  {
			  temp=new Node();
			  temp.data = data;
			  temp.next = p.next;
			  p.next = temp;
			  
			  if(p==last)
				  last = temp;
			  return last;
		  }
		  p=p.next;
		  
	  }while(p != last.next);
	  System.out.println(item+"not present in the list");
	  return last;
  }
  static void traverse(Node last)
  {
	  Node p;
	  //if list is empty , return
	  if(last == null)
	  {
		  System.out.println("List is empty");
		  return;
	  }
	  //pointing to first node
	  p=last.next;
	  //traverse
	  do {
		  System.out.println(p.data + " ");
		  p=p.next;
	  }
	  while(p!=last.next);
  }
  public static void main(String[] args) {
	Node last = null;
	last=addToEmpty(last,6);
	last = addBegin(last,4);
	last = addBegin(last,2);
	last = addEnd(last, 8);
	last = addEnd(last,12);
	last = addAfter(last,10,8);
	traverse(last);
}
}
  

