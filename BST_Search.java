package employee;
/*TASK 67: java program to demonstrate insert operations in binary search tree
   operation:Inserting Building BST|search in BST|Display(in order)
 */
import java.io.*;

import student_new.BST_Search;
public class BST_Search {
	Node root;
	/* class containing left and right child of current node and key value*/
	class Node{
		int key;
		Node left,right;

		public Node(int item)
		{
			this.key=item;
			left=right=null;
		}
		//Root of BST
		//Node root;


		//public Node(int key, Node left, Node right, Node root) {
		//		super();
		//		this.key = key;
		//		this.left = left;
		//		this.right = right;
		//		this.root = root;
		//	}
		//	//constructor
//		void BST_Search() {
//			root=null;
//		}


		void BST_Search(int value)
		{
			root =new Node(value);


		}
		//This method mainly calls insertRec()
		//void insert(int key) {
		//	root = insertRec(root,key);//Building BST
		//}
		//to insert a new key in BST
		Node insertRec(Node root,int key)
		{
			if(root==null) {
				root=new Node(key);
				return root;
			}
			/*Otherwise rec down the tree*/
			else if(key<root.key)
				root.left = insertRec(root.left,key);
			else if(key>root.key)
				root.right=insertRec(root.right,key);
			/*return the unchanged node pointer*/
			return root;

		}

	
	private void insert(int key) {
		root = insertRec(root,key);//Building BST
	}
	

	public static void main(String[] args) {
		BST_Search tree = new BST_Search();
		/*Let us create following BST
		 *  50
		 *  /  \
		 *  30  70
		 *  /\   /\
		 *20 40 60 80
		 */
		tree.root = new Node(1);
		tree.insert(50);  tree.insert(30);
		tree.insert(20);  tree.insert(40);
		tree.insert(70);  tree.insert(60); tree.insert(80);
		Node found=tree.search(tree.root,60);
		if(found==null)
			System.out.println("not found");
		else
			System.out.println("Found"+found+""+found.key);


	}
	}
	public void insert(int i) {
		// TODO Auto-generated method stub
		
	}
	public Node search(Node root2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}


