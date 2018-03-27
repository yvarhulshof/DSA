import java.util.*;

public class MinimizeEdgeWeights{

  private ArrayList<Integer> distances;
  private List<Vertex> previousVertices;

  private List<Vertex> vertices;
  private List<Edge> edges;
  private List<Edge> currentEdges;

  public void initialize(){

    for(Integer distance : distances)
    {
      distance = Integer.MAX_VALUE;
    }
    distances.set(0,0);
  }

  public void updateDistances(Graph g, Vertex source){
    vertices = g.getVertexes();
    edges = g.getEdges();
    int minWeight;

    Vertex currentVertex = source;
    Vertex nextVertex = null;
    Vertex minVertex = null;


    //check for the vertex we're currently at what its edges are
    for(Edge edge : edges)
    {
      for(Vertex vertex : g.getNeighbours(currentVertex.getId()))
      {
      if(edge.getSource() == currentVertex && edge.getDestination() == vertex)
        currentEdges.add(edge);
      }
    }

    //set initial min weight of the current edges to first found weight
    minWeight = currentEdges.get(0).getWeight();

    //update the distances for neighbour nodes, and store the node with the lowest distance
    //find the min weight of the current edges
    for(Edge edge : currentEdges)
    {
      nextVertex = edge.getDestination();
      nextVertex.setDistance(edge.getWeight());
      if(edge.getWeight() < minWeight)
      {
        minWeight = edge.getWeight();
        minVertex = nextVertex;
      }
    }

    currentVertex = minVertex;

    /*
    for(Edge edge : edges)
    {
      if(edge.getWeight() < minWeight){
        minWeight = edge.getWeight();
        nextVertex = edge.getDestination();
      }
    }
    */
  }
}

/*
 1  function Dijkstra(Graph, source):
 2
 3      create vertex set Q
 4
 5      for each vertex v in Graph:             // Initialization
 6          dist[v] ← INFINITY                  // Unknown distance from source to v
 7          prev[v] ← UNDEFINED                 // Previous node in optimal path from source
 8          add v to Q                          // All nodes initially in Q (unvisited nodes)
 9
10      dist[source] ← 0                        // Distance from source to source
11
12      while Q is not empty:
13          u ← vertex in Q with min dist[u]    // Node with the least distance
14                                                      // will be selected first
15          remove u from Q
16
17          for each neighbor v of u:           // where v is still in Q.
18              alt ← dist[u] + length(u, v)
19              if alt < dist[v]:               // A shorter path to v has been found
20                  dist[v] ← alt
21                  prev[v] ← u
22
23      return dist[], prev[]
*/

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
*/
