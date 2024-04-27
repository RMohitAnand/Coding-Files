public class Edge{
    private Vertex start;
    private Vertex end;
    private Integer weigth;

    public Edge(Vertex startV, Vertex endV, Integer edgeweight){
        this.start = startV;
        this.end = endV;
        this.weigth = edgeweight;
    }

    public Vertex getStart(){
        return this.start;
    }

    public Vertex getEnd(){
        return this.end;
    }

    public Integer getWeight(){
        return this.weigth
    }
    
}