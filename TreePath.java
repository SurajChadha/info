package employee;

public class TreePath {
   Node root;
   static class Node
   {
	   int data;
	   Node left,right;
	   
	   Node(int item)
	   {
		   data = item;
		   left = right = null;
	   }
   }

   void printPathsRecur(Node node,int path[],int path)
   {
	   if(node == null)
		   return;
   }
   /*append this node to path array*/
   path[pathlen]=node.data;
   pathLen++;
   
   /*if its a leaf,so print the path that leads to height*/
   if(node.left == null && node.right == null) {
	   printArray(path,pathLen);
   }
   else {
	   /*otherwise try both subtrees*/
	   printPathsRecur(node.left,path,pathLen);
       printPathsRecur(node.right,path,pathLen);
}
   void printArray(int ints[],int len)
   {
	   int i;
	   for(i=0;i<len;i++)
	   {
		   System.out.println(int[] + " ");
		   
	   }
	   System.out.println("");
   }
   public static void main(String[] args) {
	TreePath tree = new TreePath();
	tree.root = new Node(10);
	tree.root.left = new Node(8);
	tree.root.right = new Node(2); tree.root.left.left = new Node(3);
	tree.root.left.right = new Node(5); tree.root.right.left = new Node(2);
	tree.printPathsRecur(tree.root);
}
}
