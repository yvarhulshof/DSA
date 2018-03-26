import java.util.*;

public class GraphTest{

  public static void main(String[] args) {

  List<Vertex> vertices = new ArrayList<Vertex>();
  List<Edge> edges = new ArrayList<Edge>();

  Vertex v1 = new Vertex("V01", "A");
  Vertex v2 = new Vertex("V02", "B");
  Vertex v3 = new Vertex("V03", "C");
  Vertex v4 = new Vertex("V04", "D");

  vertices.addAll(Arrays.asList(v1,v2,v3,v4));

  Edge e1 = new Edge("E01", v1 , v2, 5);
  Edge e2 = new Edge("E02", v1 , v3, 5);
  Edge e3 = new Edge("E03", v1 , v4, 5);
  Edge e4 = new Edge("E04", v2 , v3, 5);

  edges.addAll(Arrays.asList(e1,e2,e3,e4));

  Graph g = new Graph(vertices,edges);


  for(int i = 0; i < g.getVertexes().size(); i++){
    System.out.println(g.getVertexes().get(i).toString());
  }

  for(Edge edge : g.getEdges()){
    System.out.println(edge.toString());
  }

  System.out.println(g.adjacent("V02", "V04"));

  for(Vertex vA : g.getVertexes())
  {
    for(Vertex vB : g.getNeighbours(vA.getId()))
    {
      System.out.println(vA.toString() + " has neighbour: " + vB.toString());
    }
  }

  }
}
