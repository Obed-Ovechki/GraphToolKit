public void addVertex(String vertex) {
    if (!graph.containsKey(vertex)) {
        graph.put(vertex, new ArrayList<>());
        heuristic.put(vertex, 0);
    }
}
