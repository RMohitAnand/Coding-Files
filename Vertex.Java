public class Vertex{
    private String data;
    private ArrayList<Edge> edges;

    public Vertex(String inputData){
        this.data = inputData;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weigth){
        this.edges.add(new Edge(this, endVertex, weigth))
    }

    public void removeEdge(Vertex endVertex){
        this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public String getData(){
        return this.data;
    }

    public ArrayList getEdges(){
        return this.edges;
    }

}