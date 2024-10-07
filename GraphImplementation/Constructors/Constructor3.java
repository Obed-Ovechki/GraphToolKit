public class Constructor3 {
    private Node startNode;
    private Node goalNode;
    private int gridSize;
    private double heuristicWeight;


    public AStarAlgorithm(){
        this.gridSize = 10;
        this.heuristicWeight = 1.0;
    }
    public AStarAlgorithm(Node startNode, Node goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
        this.gridSize = 10;
        this.heuristicWeight = 1.0;
    }
    public AStarAlgorithm(Node startNode, Node goalNode, int gridSize){
        this.startNode = startNode;
        this.goalNode = goalNode;
        this.gridSize = gridSize;
        this.heuristicWeight = 1.0;
    }
    public AStarAlgorithm(Node startNode, Node goalNode, int gridSize, double heuristicWeight){
        this.startNode = startNode;
        this.goalNode = goalNode;
        this.gridSize = gridSize;
        this.heuristicWeight = heuristicWeight;
    }
