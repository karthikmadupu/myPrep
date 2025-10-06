/*
Write a method, longestPath, that takes in an adjacency list for a directed acyclic graph.
The method should return the length of the longest path within the graph. 
A path may start and end at any two nodes. The length of a path is considered the number of edges in the path, not the number of nodes.

Map<String, List<String>> graph = Map.of(
  "a", List.of("c", "b"),
  "b", List.of("c"),
  "c", List.of()
);

Source.longestPath(graph); // -> 2
Map<String, List<String>> graph = Map.of(
  "a", List.of("c", "b"),
  "b", List.of("c"),
  "c", List.of(),
  "q", List.of("r"),
  "r", List.of("s", "u", "t"),
  "s", List.of("t"),
  "t", List.of("u"),
  "u", List.of()
);

Source.longestPath(graph); // -> 4
Map<String, List<String>> graph = Map.of(
  "h", List.of("i", "j", "k"),
  "g", List.of("h"),
  "i", List.of(),
  "j", List.of(),
  "k", List.of(),
  "x", List.of("y"),
  "y", List.of()
);

Source.longestPath(graph); // -> 2
Map<String, List<String>> graph = Map.of(
  "a", List.of("b"),
  "b", List.of("c"),
  "c", List.of(),
  "e", List.of("f"),
  "f", List.of("g"),
  "g", List.of("h"),
  "h", List.of()
);

Source.longestPath(graph); // -> 3

Map<String, List<String>> graph = new HashMap<>();
graph.put("a", List.of("b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"));
graph.put("b", List.of("c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"));
graph.put("c", List.of("d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"));
graph.put("d", List.of("e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"));
graph.put("e", List.of("f", "g", "h", "i", "j", "k", "l", "m", "n", "o"));
graph.put("f", List.of("g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"));
graph.put("g", List.of("h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"));
graph.put("h", List.of("i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"));
graph.put("i", List.of("j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"));
graph.put("j", List.of("k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"));
graph.put("k", List.of("l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w"));
graph.put("l", List.of("m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y"));
graph.put("m", List.of("n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x"));
graph.put("n", List.of("o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
graph.put("o", List.of("p", "q", "r", "s", "t", "u", "v", "w", "x"));
graph.put("p", List.of("q", "r", "s", "t", "u", "v", "w", "x", "y"));
graph.put("q", List.of("r", "s", "t", "u", "v", "w", "x", "y"));
graph.put("r", List.of("s", "t", "u", "v", "w", "x", "y", "z"));
graph.put("s", List.of("t", "u", "v", "w", "x", "y", "z"));
graph.put("t", List.of("u", "v", "w", "x", "y", "z"));
graph.put("u", List.of("v", "w", "x", "y", "z"));
graph.put("v", List.of("w", "x", "y", "z"));
graph.put("w", List.of("x", "y", "z"));
graph.put("x", List.of("y", "z"));
graph.put("y", List.of("z"));
graph.put("z", List.of( ));

Source.longestPath(graph); // -> 25

*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;


class Source {
  public static int longestPath(Map<String, List<String>> graph) {
    // maintain edge nodes i.e., edge node will be last for long path, so get edge nodes by below logic in distance Map
    HashMap<String,Integer> distance = new HashMap<>();
    for(String node:graph.keySet()){
      if(graph.get(node).size()==0){
        distance.put(node,0);
      }
    }

    for(String node:graph.keySet()){
      traverseDistance(node,graph,distance);
    }
    return Collections.max(distance.values());
  }

  public static int traverseDistance(String node,Map<String, List<String>> graph, HashMap<String,Integer>  distance){
    //base case for recursion will be node with no neighbor or dead end
    if(distance.containsKey(node)){
      return distance.get(node);
    }

    int maxDistance=0;
    for(String neighbor : graph.get(node)){
      int attemptDistance = traverseDistance(neighbor,graph,distance);
      if(attemptDistance>maxDistance)
        maxDistance=attemptDistance;
    }
    //store the distance in map,so we can use later on
    distance.put(node,1+maxDistance);

    //here we add 1 because we know there is one edge which seperates current node from neighbor 
    return 1+maxDistance;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}