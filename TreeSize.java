package student;
/*class Node{
	int data;
	Node left, right;
public Node (int item)
{
	data=item;
	left=right=null;
}
}*/
/*class to find size of binary tree*/
public class TreeSize {
  Node root;
  
 /*Function to return the size of the binary tree*/
  int size() {
	  return size(root);
  }
  /*compute number of nodes in tree*/
  int size(Node node)
  {
	  if(node == null)
		  return 0;
	  else
		  return(size(node.left)+1+size(node.right));
  }
  public static void main(String[] args) {
	/*creating a binary tree and entering the nodes*/
	  TreeSize tree = new TreeSize();
	  tree.root = new Node(1);
	  tree.root.left = new Node(2);
	  tree.root.right = new Node(3);
	  tree.root.left.left = new Node(4);
	  tree.root.left.right = new Node(5);
	  
}
}
