import java.util.*;

public class GraphOptimalPathTest{

  public static void main(String[] args) {

  List<Vertex> vertices = new ArrayList<Vertex>();
  List<Edge> edges = new ArrayList<Edge>();

  Vertex v1 = new Vertex("V01", "A");
  Vertex v2 = new Vertex("V02", "B");
  Vertex v3 = new Vertex("V03", "C");
  Vertex v4 = new Vertex("V04", "D");

  vertices.addAll(Arrays.asList(v1,v2,v3,v4));

  Edge e1A = new Edge("E01", v1 , v2, 1);
  Edge e1B = new Edge("E01", v2 , v1, 1);

  Edge e2A = new Edge("E02", v1 , v3, 3);
  Edge e2B = new Edge("E02", v3 , v1, 3);

  Edge e3A = new Edge("E03", v1 , v4, 2);
  Edge e3B = new Edge("E03", v4 , v1, 2);

  Edge e4A = new Edge("E04", v2 , v3, 3);
  Edge e4B = new Edge("E04", v3 , v2, 3);

  edges.addAll(Arrays.asList(e1A,e2A,e3A,e4A,e1B,e2B,e3B,e4B));

  Graph g = new Graph(vertices,edges);

  GraphOptimalPath gop = new GraphOptimalPath();

  gop.updateDistances(g, v1);
  String result = gop.findOptimalPath(g, v1, v3);
  System.out.println("The optimal path is: " + result);

  }
}
