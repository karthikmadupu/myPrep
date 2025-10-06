/*
island count
Write a method, islandCount, that takes in a grid containing Ws and Ls. W represents water and L represents land. The method should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.

List<List<String>> grid = List.of(
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "W", "W", "L", "W"),
  List.of("W", "W", "L", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("L", "L", "W", "W", "W")
);

Source.islandCount(grid); // -> 3
List<List<String>> grid = List.of(
  List.of("L", "W", "W", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("W", "L", "W", "L", "W"),
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "L", "L", "L")
);

Source.islandCount(grid); // -> 4
List<List<String>> grid = List.of(
  List.of("L", "L", "L"),
  List.of("L", "L", "L"),
  List.of("L", "L", "L")
);

Source.islandCount(grid); // -> 1

List<List<String>> grid = List.of(
  List.of("W", "W"),
  List.of("W", "W"),
  List.of("W", "W")
);

Source.islandCount(grid); // -> 0

*/
import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;

class Source {
  public static int islandCount(List<List<String>> grid) {
    HashSet<SimpleEntry<Integer,Integer>> visited = new HashSet<>();
    int count=0;
    for(int i = 0; i<grid.size();i++){
      for(int j = 0; j<grid.get(0).size();j++){
        if(explore(i,j,grid,visited)){
          count++;
        }
      }
    }
    return count;
  }

  public static boolean explore(int r,int c,List<List<String>> grid,HashSet<SimpleEntry<Integer,Integer>> visited){
    boolean rowInbound = 0<=r && r<grid.size();
    boolean colInbound = 0<=c && c<grid.get(0).size();
    SimpleEntry<Integer,Integer> curr = new SimpleEntry<>(r,c);
    //if outof range return false
    if(!rowInbound || !colInbound){
      return false;
    }
    //if already visited return false
    if(visited.contains(curr)){
      return false;
    }
    visited.add(curr);

    //if its water W then also return false
    if(grid.get(r).get(c)=="W"){
      return false;
    }

    //now we need to traverse all four neighbors for dfs
    explore(r-1,c,grid,visited);//above neighbor
    explore(r+1,c,grid,visited);//below neighbor
    explore(r,c-1,grid,visited);//left neighbor
    explore(r,c+1,grid,visited);//right neighbor

    //once everything explored then we can say new island so return true;
    return true;
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}