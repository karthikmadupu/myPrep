/*
connected components count
Write a method, connectedComponentsCount, that takes in the adjacency list of an undirected graph. The method should return the number of connected components within the graph.

Source.connectedComponentsCount(Map.of(
  0, List.of(8, 1, 5),
  1, List.of(0),
  5, List.of(0, 8),
  8, List.of(0, 5),
  2, List.of(3, 4),
  3, List.of(2, 4),
  4, List.of(3, 2)
)); // -> 2
Source.connectedComponentsCount(Map.of(
  1, List.of(2),
  2, List.of(1,8),
  6, List.of(7),
  9, List.of(8),
  7, List.of(6, 8),
  8, List.of(9, 7, 2)
)); // -> 1
Source.connectedComponentsCount(Map.of(
  3, List.of(),
  4, List.of(6),
  6, List.of(4, 5, 7, 8),
  8, List.of(6),
  7, List.of(6),
  5, List.of(6),
  1, List.of(2),
  2, List.of(1)
)); // -> 3
Source.connectedComponentsCount(Map.of()); // -> 0


Source.connectedComponentsCount(Map.of(
  0, List.of(4,7),
  1, List.of(),
  2, List.of(),
  3, List.of(6),
  4, List.of(0),
  6, List.of(3),
  7, List.of(0),
  8, List.of()
)); // -> 5


*/
import java.util.Map;
import java.util.List;
import java.util.HashSet;

class Source {
  public static int connectedComponentsCount(Map<Integer, List<Integer>> graph) {
    HashSet<Integer> visited = new HashSet<>();
    int count = 0;
    for(Integer node: graph.keySet()){
      if(traverseComponent(graph,node,visited)){
        count+=1;
      }
    }
    return count;
  }
  public static boolean traverseComponent(Map<Integer,List<Integer>> graph, Integer node, HashSet<Integer> visited){
    if(visited.contains(node)){
      return false;
    }
    visited.add(node);
    for(int neighbour:graph.get(node)){
      traverseComponent(graph,neighbour,visited);
    }
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}