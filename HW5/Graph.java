import java.util.List;

public class Graph {
    private final List<Vertex> vertexes;
    private final List<Edge> edges;

    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public boolean adjacent(String x, String y)	{
        // Returns true when there’s an edge from x to y
        // TODO: Implement this method
        Vertex vX = null;
        Vertex vY = null;

        for(int i = 0; i < vertexes.size(); i++)
        {
          if(x == vertexes.get(i).getId())
            vX = vertexes.get(i);

          if(y == vertexes.get(i).getId())
            vY = vertexes.get(i);
        }
        for(int i = 0; i < edges.size(); i++)
        {
          if(edges.get(i).getSource() == vX && edges.get(i).getDestination() == vY)
            return true;
          if(edges.get(i).getSource() == vY && edges.get(i).getDestination() == vX)
            return true;
        }

        return false;
    }

    public List<Vertex> getNeighbours(String vertex) {
        // Returns all neighbours of a given vertex
        // TODO: Implement this method
        Vertex vX = null;
        List<Edge> connectedEdges = null;
        List<Vertex> neighbours = null;

        for(int i = 0; i < vertexes.size(); i++)
        {
          if(vertex == vertexes.get(i).getId())
            vX = vertexes.get(i);
        }

        for(int i = 0; i < edges.size(); i++)
        {
          if(edges.get(i).getSource() == vX)
            connectedEdges.add(edges.get(i));
        }
        for(int i = 0; i < connectedEdges.size(); i++)
        {
          neighbours.add(connectedEdges.get(i).getDestination());
        }
        return neighbours;
    }
}
