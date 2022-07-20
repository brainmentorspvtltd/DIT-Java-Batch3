import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Vertex {
    // A hashmap contains neighbour name and it's cost
    HashMap<String, Integer> neighbours = new HashMap<>();
}

class Graph {
    // Name of the Vertex (A) and Neighbour of the Vertex
    HashMap<String, Vertex> allVertex = new HashMap<>();

    int countVertex() {
        return allVertex.size();
    }

    void addVertex(String vertexName) {
        Vertex vertex = new Vertex(); // Vertex with No Neighbour
        allVertex.put(vertexName, vertex);
        System.out.println("Vertex Added in Graph");
    }

    void removeVertex(String vertexName) {
        Vertex one = allVertex.get(vertexName);
        Set<String> keys = one.neighbours.keySet();
        for (String key : keys) {
            Vertex neighbourVertex = allVertex.get(key);
            neighbourVertex.neighbours.remove(vertexName);
        }
        allVertex.remove(vertexName);
    }

    void removeEdge(String firstVertex, String secondVertex) {
        if (isEdgeExist(firstVertex, secondVertex)) {
            Vertex one = allVertex.get(firstVertex);
            Vertex two = allVertex.get(secondVertex);
            one.neighbours.remove(secondVertex);
            two.neighbours.remove(firstVertex);
            System.out.println("Edge Removed...");
        } else {
            System.out.println("No Edge Present so Can't Remove the Edge...");
        }
    }

    void addEdge(String firstVertex, String secondVertex, int cost) {
        // is both vertex exist
        Vertex one = allVertex.get(firstVertex);
        Vertex two = allVertex.get(secondVertex);
        if (one == null || two == null) {
            System.out.println("Can't Add Edge B/w Empty Vertex....");
            return;
        }
        // is edge already exist
        if (isEdgeExist(firstVertex, secondVertex)) {
            System.out.println("Edge Already Present Can't Add New One....");
        } else {
            one.neighbours.put(secondVertex, cost);
            two.neighbours.put(firstVertex, cost);
            System.out.println("Edge Added...");
        }

    }

    boolean isEdgeExist(String firstVertex, String secondVertex) {
        Vertex one = allVertex.get(firstVertex);
        Vertex two = allVertex.get(secondVertex);
        return one.neighbours.containsKey(secondVertex);

    }

    void print() {
        for (Map.Entry<String, Vertex> currentVertex : allVertex.entrySet()) {
            System.out.println(currentVertex.getKey()
                    + " => " + currentVertex.getValue().neighbours);
        }
    }

}

public class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addEdge("A", "B", 2);
        graph.addEdge("B", "C", 4);
        graph.addEdge("A", "D", 5);
        graph.addEdge("C", "D", 1);
        graph.addEdge("E", "F", 7);
        graph.addEdge("D", "E", 3);
        graph.addEdge("F", "G", 9);
        graph.addEdge("E", "G", 8);
        graph.print();

    }
}
