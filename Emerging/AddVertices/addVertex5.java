public void addVertex() {
    vertexCount++;
    match = Arrays.copyOf(match, vertexCount);
    visited = Arrays.copyOf(visited, vertexCount);
    Arrays.fill(match, -1);  // Initialize new matches to -1 (unmatched)
}
