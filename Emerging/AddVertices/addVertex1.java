    public void addVertex() {
        int newVertexCount = vertexCount + 1;
        int[][] newCapacity = new int[newVertexCount][newVertexCount];
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                newCapacity[i][j] = capacity[i][j];
            }
        }
        capacity = newCapacity;
        parent = Arrays.copyOf(parent, newVertexCount);
        visited = Arrays.copyOf(visited, newVertexCount);
        vertexCount = newVertexCount;
    }
