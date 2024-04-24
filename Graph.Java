public class Graph{
    
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.vertices = new ArrayList<Vertex>();
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data); 
        this.vertices.add(newVertex);
        return newVertex;
    }

    public static void main(string[] args){

    }
}