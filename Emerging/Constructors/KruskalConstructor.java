import java.util.*;

public class Kruskal {
    private int vertexCount;
    private List<Edge> edges;

    // Default constructor
    public Kruskal() {
        this.vertexCount = 0;
        this.edges = new ArrayList<>();
    }

    // Constructor with vertex count
    public Kruskal(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new ArrayList<>();
    }

    // Constructor with list of edges
    public Kruskal(List<Edge> edges, int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = edges;
    }

    // Edge class to represent graph edges
    public static class Edge implements Comparable<Edge> {
        int from, to, weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
}
