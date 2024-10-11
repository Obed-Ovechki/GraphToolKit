public void addVertex() {
    vertexCount++;
    distance = Arrays.copyOf(distance, vertexCount);
    Arrays.fill(distance, Integer.MAX_VALUE);  // Initialize new distances
}
