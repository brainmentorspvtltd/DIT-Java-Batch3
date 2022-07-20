import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
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

    boolean isPathExist(String startVertex, String reachVertex,
            HashMap<String, Boolean> visitedMap) {
        // Put the start vertex in map , marked as visited.
        visitedMap.put(startVertex, true);
        // Check there is direct edge b/w the startVertex and the reachVertex
        if (isEdgeExist(startVertex, reachVertex)) {
            return true;
        }
        // Neighbour Explore
        Vertex one = allVertex.get(startVertex);
        Set<String> neighbours = one.neighbours.keySet();
        for (String key : neighbours) {
            if (!visitedMap.containsKey(key) && isPathExist(key, reachVertex, visitedMap)) {
                return true;
            }
        }
        return false;
    }

    static class Pair {
        String vertexName;
        String processedTill; // Path till process
    }

    boolean bfs(String source, String target) {
        // Define Visited Map
        HashMap<String, Boolean> visitedMap = new HashMap<>();
        // Maintain a Queue for Level Order (BFS)
        Queue<Pair> queue = new LinkedList<>();
        Pair pair = new Pair();
        pair.vertexName = source;
        pair.processedTill = source;
        queue.add(pair);
        while (!queue.isEmpty()) {
            // Remove the queue first element
            Pair p = queue.poll();
            // if that vertex is already processed (Already visited)
            if (visitedMap.containsKey(p.vertexName)) {
                continue;
            }
            // If not visited so mark it
            visitedMap.put(p.vertexName, true);
            // is edge exist b/w source and target
            if (isEdgeExist(p.vertexName, target)) {
                // Vertex Found....
                return true;
            }
            // there is no direct edge , explore the neighbour (p object)
            Set<String> neighbours = allVertex.get(p.vertexName).neighbours.keySet();
            for (String key : neighbours) {
                // Check this neighbour is already visited or not
                if (!visitedMap.containsKey(key)) {
                    Pair newPair = new Pair();
                    newPair.vertexName = key;
                    newPair.processedTill = p.processedTill + key;
                    queue.add(newPair);
                }
            }

        }
        return false;
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
        HashMap<String, Boolean> visitedMap = new HashMap<>();
        boolean result = graph.isPathExist("A", "E", visitedMap);
        System.out.println(result ? "Path Exist" : "Not Exist");
        System.out.println(graph.bfs("A", "P") ? "Found " : "Not found...");
    }
}
