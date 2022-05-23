package Aufgabe5;

public class Edge {
    public int to;
    public int distance;

    public Edge(int to, int distance) {
        this.to = to;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("Edge: {To: %d, Distance: %d}", this.to, this.distance);
    }
}
