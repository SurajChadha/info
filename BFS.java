package exams;

import java.io.*;

public class BFS {
    private int node;
    private LinkedList<Integer> adj[];// total number of nodes in the graph
    private Queue<Integer> que;// adjacency list

    BFS(int v) {
        node = v;
        adj = new LinkedList[node];
        for (int i = 0; i < v; i++) {
            adj[i] = new linkedList<>();
        }
        que = new linkedList<Integer>();

    }

    void insertEdge(int v, int w) {
        adj[v].add(w);
        // adding an edge to the adjacent list

    }

    void BFS(int n) {
        boolean nodes[] = new boolean[node];// initialize boolean array for holding the data
        int a = 0;
        nodes[n] = true;
        que.add(n);// root node is added to the top of the queue
        while (que.size() != 0) {
            n = que.poll();// remove the top element of the queue
            System.out.print(n + " ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if (!nodes[a])
                // insert nodes in queue
                {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(v:6);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 5);
        graph.insertEdge(0, 5);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 0);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 4);
        graph.insertEdge(0, 3);
System.out.println("Breadth first traversal");
graph.BFS(0);

    }
}
