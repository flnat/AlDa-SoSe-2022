package Aufgabe5;

import edu.princeton.cs.algs4.In;

public class GraphClient {
    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 4);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 4);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 5);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 5);
        graph.addEdge(3, 5, 3);


    }
}
