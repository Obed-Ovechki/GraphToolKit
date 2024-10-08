import java.util.*;

public class StoerWagner {
    private int vertexCount;
    private int[][] capacity;
    private List<Edge> edges;

    // Constructor for an empty graph
    public StoerWagner() {
        this.vertexCount = 0;
        this.capacity = new int[0][0];
        this.edges = new ArrayList<>();
    }

    // Constructor with vertex count
    public StoerWagner(int vertexCount) {
        this.vertexCount = vertexCount;
        this.capacity = new int[vertexCount][vertexCount];
        this.edges = new ArrayList<>();
    }

    // Constructor with adjacency matrix
    public StoerWagner(int[][] capacity) {
        this.vertexCount = capacity.length;
        this.capacity = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                this.capacity[i][j] = capacity[i][j];
            }
        }
        this.edges = new ArrayList<>();
    }

    // Constructor with list of edges
    public StoerWagner(List<Edge> edges, int vertexCount) {
        this.vertexCount = vertexCount;
        this.capacity = new int[vertexCount][vertexCount];
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
