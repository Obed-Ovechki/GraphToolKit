import java.util.*;

public class Boruvka {
    private int vertexCount;
    private List<Edge> edges;

    // Default constructor
    public Boruvka() {
        this.vertexCount = 0;
        this.edges = new ArrayList<>();
    }

    // Constructor with vertex count
    public Boruvka(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new ArrayList<>();
    }

    // Constructor with list of edges
    public Boruvka(List<Edge> edges, int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = edges;
    }

    // Edge class to represent graph edges
    public static class Edge {
        int from, to, weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
}
