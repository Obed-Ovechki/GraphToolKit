import java.util.*;

public class PrimsAlgorithm {
    private int vertexCount;
    private int[][] graph;
    private boolean[] visited;
    private int[] minEdge;

    // Default constructor
    public PrimsAlgorithm() {
        this.vertexCount = 0;
        this.graph = new int[0][0];
        this.visited = new boolean[0];
        this.minEdge = new int[0];
    }

    // Constructor with vertex count
    public PrimsAlgorithm(int vertexCount) {
        this.vertexCount = vertexCount;
        this.graph = new int[vertexCount][vertexCount];
        this.visited = new boolean[vertexCount];
        this.minEdge = new int[vertexCount];
        Arrays.fill(minEdge, Integer.MAX_VALUE);
    }

    // Constructor with adjacency matrix
    public PrimsAlgorithm(int[][] graph) {
        this.vertexCount = graph.length;
        this.graph = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                this.graph[i][j] = graph[i][j];
            }
        }
        this.visited = new boolean[vertexCount];
        this.minEdge = new int[vertexCount];
        Arrays.fill(minEdge, Integer.MAX_VALUE);
    }
}
