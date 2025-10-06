// undirected path
// Write a method, undirectedPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.

//  List<List<String>> edges = List.of(
//   List.of("i", "j"),
//   List.of("k", "i"),
//   List.of("m", "k"),
//   List.of("k", "l"),
//   List.of("o", "n")
// );

// Source.undirectedPath(edges, "j", "m"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("i", "j"),
//   List.of("k", "i"),
//   List.of("m", "k"),
//   List.of("k", "l"),
//   List.of("o", "n")
// );

// Source.undirectedPath(edges, "m", "j"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("i", "j"),
//   List.of("k", "i"),
//   List.of("m", "k"),
//   List.of("k", "l"),
//   List.of("o", "n")
// );

// Source.undirectedPath(edges, "l", "j"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("i", "j"),
//   List.of("k", "i"),
//   List.of("m", "k"),
//   List.of("k", "l"),
//   List.of("o", "n")
// );

// Source.undirectedPath(edges, "k", "o"); // -> false
//  List<List<String>> edges = List.of(
//   List.of("i", "j"),
//   List.of("k", "i"),
//   List.of("m", "k"),
//   List.of("k", "l"),
//   List.of("o", "n")
// );

// Source.undirectedPath(edges, "i", "o"); // -> false
//  List<List<String>> edges = List.of(
//   List.of("b", "a"),
//   List.of("c", "a"),
//   List.of("b", "c"),
//   List.of("q", "r"),
//   List.of("q", "s"),
//   List.of("q", "u"),
//   List.of("q", "t"),
// );


// Source.undirectedPath(edges, "a", "b"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("b", "a"),
//   List.of("c", "a"),
//   List.of("b", "c"),
//   List.of("q", "r"),
//   List.of("q", "s"),
//   List.of("q", "u"),
//   List.of("q", "t"),
// );

// Source.undirectedPath(edges, "a", "c"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("b", "a"),
//   List.of("c", "a"),
//   List.of("b", "c"),
//   List.of("q", "r"),
//   List.of("q", "s"),
//   List.of("q", "u"),
//   List.of("q", "t"),
// );

// Source.undirectedPath(edges, "r", "t"); // -> true
//  List<List<String>> edges = List.of(
//   List.of("b", "a"),
//   List.of("c", "a"),
//   List.of("b", "c"),
//   List.of("q", "r"),
//   List.of("q", "s"),
//   List.of("q", "u"),
//   List.of("q", "t"),
// );

// Source.undirectedPath(edges, "r", "b"); // -> false


//  List<List<String>> edges = List.of(
//   List.of("s", "r"),
//   List.of("t", "q"),
//   List.of("q", "r"),
// );

// Source.undirectedPath(edges, "r", "t"); // -> true

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.ArrayDeque;
import java.util.Queue;


class Source {
  public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
    //For undirectedGraph its given of List<List> where its bi-directional relation, we need to make  it into graph format of Map<Node,List>
    Map<String, List<String>> graph = buildGraph(edges);
    boolean bfsBool = bfs(graph,nodeA,nodeB,new HashSet<>());
    System.out.println(bfsBool);
    return dfs(graph,nodeA,nodeB,new HashSet<>());
  }

    public static boolean bfs(Map<String, List<String>> graph,String src,String dest,HashSet<String> visited){
        Queue q = new ArrayDeque<String>();
        q.add(src);
        visited.add(src);
        while(!q.isEmpty()){
            String node = q.remove();
            if(node==dest){
                return true;
            }
            for(String neighbor : graph.get(node)){
                if(!visited.contains(neighbor)){
                    q.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return false; 
    }

  public static boolean dfs(Map<String, List<String>> graph,String src,String dest,HashSet<String> visited){
    if(src==dest)
      return true;
    if(visited.contains(src)){
      return false;
    }
    visited.add(src);

    for(String neighbor: graph.get(src)){
      if(dfs(graph,neighbor,dest,visited))
        return true;
    }
    return false;
  }

  public static Map<String,List<String>> buildGraph(List<List<String>> edges){
    Map<String, List<String>> map = new HashMap<>();
    for(List<String> edge : edges){
      String a = edge.get(0);
      String b = edge.get(1);
      if(!map.containsKey(a)){
        map.put(a,new ArrayList<>());
      }
      if(!map.containsKey(b)){
        map.put(b,new ArrayList<>());
      }
      map.get(a).add(b);
      map.get(b).add(a);
    }
    return map;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}