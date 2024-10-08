import java.util.*;

public class Blossom {
    private int vertexCount;
    private List<Edge> edges;
    private int[] match;
    private boolean[] visited;

    // Default constructor
    public BlossomAlgorithm() {
        this.vertexCount = 0;
        this.edges = new ArrayList<>();
        this.match = new int[0];
        this.visited = new boolean[0];
    }

    // Constructor with vertex count
    public BlossomAlgorithm(int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = new ArrayList<>();
        this.match = new int[vertexCount];
        this.visited = new boolean[vertexCount];
        Arrays.fill(match, -1); // Initialize matches to -1 (unmatched)
    }

    // Constructor with list of edges
    public BlossomAlgorithm(List<Edge> edges, int vertexCount) {
        this.vertexCount = vertexCount;
        this.edges = edges;
        this.match = new int[vertexCount];
        this.visited = new boolean[vertexCount];
        Arrays.fill(match, -1); // Initialize matches to -1 (unmatched)
    }

    // Edge class to represent graph edges
    public static class Edge {
        int from, to;

        public Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
}
