import java.util.*;

public class AStar {
    private Map<String, List<Node>> graph;
    private Map<String, Integer> heuristic;

    // Constructor for an empty graph
    public AStar() {
        this.graph = new HashMap<>();
        this.heuristic = new HashMap<>();
    }

    // Constructor with adjacency list
    public AStar(Map<String, List<Node>> graph) {
        this.graph = graph;
        this.heuristic = new HashMap<>();
    }

    // Constructor with adjacency list and heuristic values
    public AStar(Map<String, List<Node>> graph, Map<String, Integer> heuristic) {
        this.graph = graph;
        this.heuristic = heuristic;
    }

    // AddEdge and other methods go here...

    // Node class to represent graph nodes
    public static class Node {
        String name;
        int cost;

        public Node(String name, int cost) {
            this.name = name;
            this.cost = cost;
        }
    }
}
