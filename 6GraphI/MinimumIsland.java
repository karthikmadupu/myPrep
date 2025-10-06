/*
minimum island
Write a method, minimumIsland, that takes in a grid containing Ws and Ls. W represents water and L represents land. The method should return the size of the smallest island. An island is a vertically or horizontally connected region of land.

You may assume that the grid contains at least one island.

List<List<String>> grid = List.of(
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "L", "W", "W", "W"),
  List.of("W", "W", "W", "L", "W"),
  List.of("W", "W", "L", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("L", "L", "W", "W", "W")
);

Source.minimumIsland(grid); // -> 2
List<List<String>> grid = List.of(
  List.of("L", "W", "W", "L", "W"),
  List.of("L", "W", "W", "L", "L"),
  List.of("W", "L", "W", "L", "W"),
  List.of("W", "W", "W", "W", "W"),
  List.of("W", "W", "L", "L", "L")
);

Source.minimumIsland(grid); // -> 1
List<List<String>> grid = List.of(
  List.of("L", "L", "L"),
  List.of("L", "L", "L"),
  List.of("L", "L", "L")
);

Source.minimumIsland(grid); // -> 9

List<List<String>> grid = List.of(
  List.of("W", "W"),
  List.of("L", "L"),
  List.of("W", "W"),
  List.of("W", "L")
);

Source.minimumIsland(grid); // -> 1


*/

import java.util.List;
import java.util.HashSet;
import java.util.AbstractMap.SimpleEntry;


class Source {
  public static int minimumIsland(List<List<String>> grid) {
    double min=Double.POSITIVE_INFINITY;
    HashSet<SimpleEntry<Integer,Integer>> visited = new HashSet<>();
    for(int i =0;i<grid.size();i++){
      for(int j=0;j<grid.get(0).size();j++){
        double size = explore(i,j,grid,visited);
        if(size>0&&size<min)
          min=size;
      }
    }

    return (int)min;
  }

  public static double explore(Integer r,Integer c,List<List<String>> grid,HashSet<SimpleEntry<Integer,Integer>> visited){
    boolean rowInbound = 0<=r && r<grid.size();
    boolean colInbound = 0<=c && c<grid.get(0).size();
    if(!rowInbound || !colInbound){
      return 0;
    }
    SimpleEntry<Integer,Integer> curr = new SimpleEntry<>(r,c);
    if(visited.contains(curr)){
      return 0;
    }
    visited.add(curr);

    if(grid.get(r).get(c)=="W"){
      return 0;
    }

    int totalSize =1;

    totalSize+=explore(r+1,c,grid,visited);
    totalSize+=explore(r-1,c,grid,visited);
    totalSize+=explore(r,c+1,grid,visited);
    totalSize+=explore(r,c-1,grid,visited);
    
    return totalSize;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}