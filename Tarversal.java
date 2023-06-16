package student_new;
import java.io.*;
class Traversal
{
class Node{
  int data;
  Node left;
  Node right;
  Node(int v)
  {
	  this.data = v;
	  this.left = this.right = null;
  }
 
}

	public static void printInorder(Node node)
	{
		if(node == null)
			return;
		//Traverse left subtree
		printInorder(node.left);
		
		//visit node
		System.out.println(node.data + " ");
		
		//Traverse right subtree
		printInorder(node.right);
	}
	public static void printPreorder(Node node)
	{
		if(node == null)
			return;
		
		//visit node
		System.out.println(node.data + " ");
		//Traverse left subtree
		printPreorder(node.left);
		
		//Traverse right subtree
		printPreorder(node.right);
	}
	//postOrder Traversal
	public static void printPostOrder(Node node)
	{
		if(node == null)
			return;
		
		//Traverse left subtree
		printPostOrder(node.left);
		
		//Traverse right subtree
		printPostOrder(node.right);
		
		//visit node
		System.out.println(node.data + " ");
	}
	
	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node(200);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(150);
		root.right.right = new Node(300);
		
		//Function call
		System.out.println("Inorder traversal:");
		printInorder(root);
		//Function call
		System.out.println("Preorder traversal:");
		printPreorder(root);
		//Function call
		System.out.println("Preorder traversal:");
		printPostOrder(root);
	}
}

