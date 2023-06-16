package student_new;



class Node
{
	int key;
	Node left,right;
	
	public Node(int value) {
		key=value;
		left=right=null;
	}
}

class BST_Search {
	Node root;
	
	//Constructor
	public BST_Search() {
		root=null;
	}
	
	public BST_Search(int value) {
		root=new Node(value);
	}	
	//This method mainly calls insertRec()
		
	void insert(int key) {
		root=insertRec(root,key);
	}
	
	//A Recursive function to insert a new key in BST
	Node insertRec(Node root, int key) {
		
		//If the tree is empty, return a new node.....
		if(root == null) {
			root=new Node(key);
			return root;
		}
		
		//Otherwise recur down the tree //
		else if(key < root.key)
			root.left=insertRec(root.left,key);
		else if(key > root.key)
			root.right=insertRec(root.right,key);
		
		//return the (unchanged) node Pointer
		return root;
	}
	
	//This method mainly calls InorderRec()
	
	void Inorder() {
		InorderRec(root);
	}
	
	//A utility function to do Inorder traversal of BST
	
	void InorderRec(Node root) {
		if(root != null) {
			InorderRec(root.left);
			System.out.println(root.key);
			InorderRec(root.right);
		}
	}
	
	//A utility function to search a given key in BST
	
	public Node search(Node root,int key) {
		
		//Base cases: root is null or key is present at root
		
			if(root == null || root.key==key) 
				return root;
			
		//Key is greater than root's key
			if(root.key<key) 
				return search(root.right,key);
			
			
		//Key is smaller than root's key
			return search(root.left,key);
				
	}
}

public class Binary_Search_Tree_Operation {
	public static void main(String[] args) {
		 
		BST_Search tree=new BST_Search();
		
		/* let us create following BST
		 *         50
		 *        /  \
		 *      30    70
		 *     /  \   /  \
		 *    20  40  60  80
		 *         
		 */
		
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		Node found=tree.search(tree.root, 60);
		
		if(found==null)
			System.out.println("Not Found");
		else
			System.out.println("Found: "+found+" " + found.key);
	}
}

