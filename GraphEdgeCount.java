package student_new;

import java.io.IOException;
import java.util.Vector;

public class GraphEdgeCount {
   int V;
   Vector<Integer>[] adj;
   
   //@SuppressWarnings("unchecked")
   GraphEdgeCount(int V)
   {
	   this.V=V;
	   this.adj = new Vector[V];
	   
	   for(int i = 0; i < V; i++)
		   adj[i] = new Vector<Integer>();
	   
   }
   //add edge to graph
   void addEdge(int u,int v) {
	   adj[u].add(v);
	   adj[v].add(u);
   }
   int countEdges()
   {
	   int sum=0;
	   
	   //traverse all vertex
	   for(int i = 0;i < V; i++)
		   
		   //add all edges that are linked to the 
		   //current vertex
		   sum += adj[i].size();
	   
	   //the count of edges will always be even because in 
	   //undirected graph every edge is connected
	   //twice between two vertices
	   return sum / 2;
   }
   //Driver code
  public static void main(String[] args)throws IOException
  {
	  int V=9;
	  GraphEdgeCount g = new GraphEdgeCount(V);
	  //making above shown graph
	  g.addEdge(0, 1);             g.addEdge(0, 7);
	  g.addEdge(1 , 2);            g.addEdge(1, 7);
	  g.addEdge(2, 3);             g.addEdge(2, 8);
	  g.addEdge(2, 5);             g.addEdge(3, 4);
	  g.addEdge(3, 5);             g.addEdge(4, 5);
	  g.addEdge(5, 6);             g.addEdge(6, 7);
	  g.addEdge(6, 8);             g.addEdge(7, 8);
      
	  System.out.println(g.countEdges());
  }
}
