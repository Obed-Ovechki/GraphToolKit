import java.util.*;

public class BellmanFord {
    private int vertexCount;
    private List<Edge> edges;
    private int[] distance;

    // Default constructor
    public BellmanFord() {
        this.vertexCount = 0;
        this.edges = new ArrayList<>();
        this.distance = new int[0];
    }

    // Constructor with vertex count
    public BellmanFord(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new ArrayList<>();
        this.distance = new int[vertexCount];
        Arrays.fill(distance, Integer.MAX_VALUE);  // Initialize distances
    }

    // Constructor with list of edges
    public BellmanFord(List<Edge> edges, int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = edges;
        this.distance = new int[vertexCount];
        Arrays.fill(distance, Integer.MAX_VALUE);  // Initialize distances
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
