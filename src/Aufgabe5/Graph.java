package Aufgabe5;

import edu.princeton.cs.algs4.In;

public class Graph
{
    private final int vertices; // number of vertices
    private int E; // number of edges
    private Bag<Edge>[] adj; // adjacency lists
    public Graph(int V)
    {
        this.vertices = V; this.E = 0;
        adj = (Bag<Edge>[]) new Bag[V]; // Create array of lists.
        for (int v = 0; v < V; v++) // Initialize all lists
            adj[v] = new Bag<Edge>(); // to empty.
    }

    public int V() { return vertices; }
    public int E() { return E; }
    public void addEdge(int v, int w, int distance)
    {
        adj[v].add(new Edge(w, distance)); // Add w to v’s list.
        adj[w].add(new Edge(v, distance)); // Add v to w’s list.
        E++;
    }
    public Iterable<Edge> adj(int v)
    { return adj[v]; }
}