package student;
/*class conatining left and right child of current node and key value*/
class Node
{
	int key;    //data Int/Char/Object
	Node left,right;
	

public Node(int item)
{
	key = item;
	left = right = null;
}
public void displayData()
{
	System.out.println(key+" ");
}
}

public class TreeBasic {
   Node root;
   
   TreeBasic(int key){
	   root = new Node(key);
   }
   TreeBasic(){
	   root = null;
   }
   

public static void main(String[] args) {
	TreeBasic tree = new TreeBasic();
	
	System.out.println(tree.root);
	/*create root*/
	tree.root = new Node(1);            //root---Node(1)
	/*following is the tree after above statement
	   1
	  /  \
   null null */
	
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	/*2 and 3 become left and right children of 1
	        1  
	      /    \
	      2   3 
	      /\  /\
	 null null null null */
	tree.root.left.left = new Node(4);
	
	tree.root.right.displayData();
	tree.root.left.left.displayData();
	
}
}

