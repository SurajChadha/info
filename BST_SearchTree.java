package employee;

import student_new.BST_Search;
import student_new.BST_Search.Node;

public class BST_SearchTree {
	class Node{
		int key;
		Node left,right;
		
		public Node(int item)
		{
			key=item;
			left=right=null;
		}
		//Root of BST
		Node root;
		//This method calls InorderRec()
		void inorder()
		{
			inorderRec(root);
		}
		//A utility function to do inorder traversal of BST
		void inorderRec(Node root)
		{
			if(root!=null) {
				inorderRec(root.left);
				System.out.println(root.key);
				inorderRec(root.right);
			}
		}
	}
	public static void main(String[] args) {
		BST_Search tree = new BST_Search();
		/*Let us create following BST
		 *50
		 /\
		 30 70
		 /\ /\
	   20 40 60 80
	*/
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
