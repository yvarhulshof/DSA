import java.util.*;

public class MinimizeEdgeWeights{

  private ArrayList<Integer> distances;
  private List<Vertex> previousVertices;

  private List<Vertex> vertices;
  private List<Edge> edges;

  public void initialize(){

    for(Integer distance : distances)
    {
      distance = Integer.MAX_VALUE;
    }

  }

  public void updateDistances(Graph g, Vertex source){
    vertices = g.getVertexes();
    edges = g.getEdges();
    int minWeight = edges.get(0).getWeight();
    Vertex nextVertex = null;
    Vertex currentVertex = source;

    for(Edge edge : edges)
    {
      if(edge.getWeight() < minWeight){
        minWeight = edge.getWeight();
        nextVertex = edge.getDestination();
      }
    }

  }

}

/*
Suppose that CONTROL, a secret U.S. government counterintelligence agency based in Washington, D.C.,
has build a communication network that links n stations spread across the world using m communication channels
between pairs of stations. Suppose further that the evil spy agency, KAOS, is able to eavesdrop on some number,
k, of these channels and that CONTROL knows the k channels that have been compromised. Now, CONTROL has a message
M, that it wants to send from its headquarters station, s, to one of its field stations, t.
The problem is that the message is super secret and should traverse a path that minimizes the number of
compromised edges that occur along this path.

Write an algorithm to solve CONTROL’s problem.

Hint: Think about how you can assign weights to edges. Which algorithm is most appropriate for this problem?
Given that you will use this algorithm, which graph implementation should you use?
