// has path
// Write a method, hasPath, that takes in an object representing the adjacency list of a directed acyclic graph and two nodes (src, dst). The method should return a boolean indicating whether or not there exists a directed path between the source and destination nodes.

// Hey. This is our first graph problem, so start by watching the Approach and Walkthrough! Be productive, not stubborn.

// Map<String, List<String>> graph = Map.of(
//   "f", List.of("g", "i"),
//   "g", List.of("h"),
//   "h", List.of(),
//   "i", List.of("g", "k"),
//   "j", List.of("i"),
//   "k", List.of()
// );

// Source.hasPath(graph, "f", "k"); // true
// Map<String, List<String>> graph = Map.of(
//   "f", List.of("g", "i"),
//   "g", List.of("h"),
//   "h", List.of(),
//   "i", List.of("g", "k"),
//   "j", List.of("i"),
//   "k", List.of()
// );

// Source.hasPath(graph, "f", "j"); // false
// Map<String, List<String>> graph = Map.of(
//   "f", List.of("g", "i"),
//   "g", List.of("h"),
//   "h", List.of(),
//   "i", List.of("g", "k"),
//   "j", List.of("i"),
//   "k", List.of()
// );

// Source.hasPath(graph, "i", "h"); // true
// Map<String, List<String>> graph = Map.of(
//   "v", List.of("x", "w"),
//   "w", List.of(),
//   "x", List.of(),
//   "y", List.of("z"),
//   "z", List.of()
// );

// Source.hasPath(graph, "v", "w"); // true

// Map<String, List<String>> graph = Map.of(
//   "v", List.of("x", "w"),
//   "w", List.of(),
//   "x", List.of(),
//   "y", List.of("z"),
//   "z", List.of()
// );

// Source.hasPath(graph, "v", "z"); // false

/*

time complexity
n = number of nodes
e = number edges
Time: O(e)
Space: O(n)

*/
import java.util.Map;
import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;

class Source {
  public static boolean hasPathRecur(Map<String, List<String>> graph, String src, String dst) {
    if(src==dst)
      return true;

    for(String neighbor: graph.get(src)){
      if(hasPathRecur(graph,neighbor,dst))
        return true;
    }
    return false;
  }

    public static boolean hasPath(Map<String, List<String>> graph, String src, String dst) {
        Queue<String> q = new ArrayDeque<>();
        q.add(src);
        while(!q.isEmpty()){
            String node = q.remove();
            if(node==dst)
                return true;
            for(String neighbour : graph.get(node)){
                q.add(neighbour);
            }
        }
        return false;
    }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}