/*
shortest path
Write a method, shortestPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return the length of the shortest path between A and B. Consider the length as the number of edges in the path, not the number of nodes. If there is no path between A and B, then return -1. You can assume that A and B exist as nodes in the graph.

List<List<String>> edges = List.of(
  List.of("w", "x"),
  List.of("x", "y"),
  List.of("z", "y"),
  List.of("z", "v"),
  List.of("w", "v")
);

Source.shortestPath(edges, "w", "z"); // -> 2
List<List<String>> edges = List.of(
  List.of("w", "x"),
  List.of("x", "y"),
  List.of("z", "y"),
  List.of("z", "v"),
  List.of("w", "v")
);

Source.shortestPath(edges, "y", "x"); // -> 1
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "a", "e"); // -> 3
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "e", "c"); // -> 2
List<List<String>> edges = List.of(
  List.of("a", "c"),
  List.of("a", "b"),
  List.of("c", "b"),
  List.of("c", "d"),
  List.of("b", "d"),
  List.of("e", "d"),
  List.of("g", "f")
);

Source.shortestPath(edges, "b", "g"); // -> -1
List<List<String>> edges = List.of(
  List.of("c", "n"),
  List.of("c", "e"),
  List.of("c", "s"),
  List.of("c", "w"),
  List.of("w", "e")
);

Source.shortestPath(edges, "w", "e"); // -> 1
List<List<String>> edges = List.of(
  List.of("c", "n"),
  List.of("c", "e"),
  List.of("c", "s"),
  List.of("c", "w"),
  List.of("w", "e")
);

Source.shortestPath(edges, "n", "e"); // -> 2

List<List<String>> edges = List.of(
  List.of("m", "n"),
  List.of("n", "o"),
  List.of("o", "p"),
  List.of("p", "q"),
  List.of("t", "o"),
  List.of("r", "q"),
  List.of("r", "s")
);

Source.shortestPath(edges, "m", "s"); // -> 6


*/

// for shortest path its better to use bfs because it checks all neighbours for each increment of length
// whereas dfs goes oneway till the end and then goes to other end i.e., it snakes throughout
//so better to use bfs for faster search
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;

class Source {
  public static int shortestPath(List<List<String>> edges, String nodeA, String nodeB) {
    HashMap<String, List<String>> graph = buildGraph(edges);
    ArrayDeque<SimpleEntry<String,Integer>> queue = new ArrayDeque<>();

    HashSet<String> visited = new HashSet<>();
    queue.add(new SimpleEntry<>(nodeA,0));
    visited.add(nodeA);
    int distance=0;
    
    while(!queue.isEmpty()){
      SimpleEntry<String,Integer> entry = queue.remove();
      String node = entry.getKey();
      distance = entry.getValue();
      if(node==nodeB){
        return distance;
      }
      for(String neighbor: graph.get(node)){
        if(!visited.contains(neighbor)){
        queue.add(new SimpleEntry<>(neighbor,distance+1));
        visited.add(neighbor);
      }
      }
    }
    return -1;
  }

  public static HashMap<String, List<String>>  buildGraph(List<List<String>> edges){
    HashMap<String, List<String>> graph = new HashMap<>();
    for(List<String> edge: edges){
      String nodeA = edge.get(0);
      String nodeB = edge.get(1);
      if(!graph.containsKey(nodeA)){
        graph.put(nodeA, new ArrayList<>());
      }
      if(!graph.containsKey(nodeB)){
        graph.put(nodeB, new ArrayList<>());
      }
      graph.get(nodeA).add(nodeB);
      graph.get(nodeB).add(nodeA);
    }
    return graph;
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
    List<List<String>> edges = List.of(
  List.of("w", "x"),
  List.of("x", "y"),
  List.of("z", "y"),
  List.of("z", "v"),
  List.of("w", "v")
);

Source.shortestPath(edges, "w", "z"); // -> 2

  }
}