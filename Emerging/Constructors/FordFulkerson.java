public class FordFulkerson {
    private int[][] capacity;
    private int[] parent;
    private boolean[] visited;
    private int vertexCount;

    // Default constructor
    public FordFulkerson() {
        this.vertexCount = 0;
        this.capacity = new int[0][0];
        this.parent = new int[0];
        this.visited = new boolean[0];
    }

    // Constructor with vertex count
    public FordFulkerson(int vertexCount) {
        this.vertexCount = vertexCount;
        capacity = new int[vertexCount][vertexCount];
        parent = new int[vertexCount];
        visited = new boolean[vertexCount];
    }

    // Constructor with adjacency matrix
    public FordFulkerson(int[][] capacity) {
        this.vertexCount = capacity.length;
        this.capacity = new int[vertexCount][vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                this.capacity[i][j] = capacity[i][j];
            }
        }
        parent = new int[vertexCount];
        visited = new boolean[vertexCount];
    }

    // Constructor with vertex count, parent array, and visited array
    public FordFulkerson(int vertexCount, int[] parent, boolean[] visited) {
        this.vertexCount = vertexCount;
        capacity = new int[vertexCount][vertexCount];
        this.parent = parent.clone(); // cloning to avoid modification of original array
        this.visited = visited.clone(); // cloning to avoid modification of original array
    }

}
