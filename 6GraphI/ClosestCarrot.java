/*
closest carrot
Write a method, closestCarrot, that takes in a grid, a starting row, and a starting column. In the grid, "X"s are walls, "O"s are open spaces, and "C"s are carrots. The method should return a number representing the length of the shortest path from the starting position to a carrot. You may move up, down, left, or right, but cannot pass through walls (X). If there is no possible path to a carrot, then return -1.

List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "O", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("O", "X", "C", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("C", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 1, 2); // -> 4
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "O", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("O", "X", "C", "O", "O"),
  List.of("O", "X", "X", "O", "O"),
  List.of("C", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 0, 0); // -> 5
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "X", "X"),
  List.of("O", "X", "X", "X", "C"),
  List.of("O", "X", "O", "X", "X"),
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "X", "X", "X", "X"),
  List.of("O", "O", "O", "O", "O"),
  List.of("O", "O", "C", "O", "O"),
  List.of("O", "O", "O", "O", "O")
);

Source.closestCarrot(grid, 3, 4); // -> 9
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("O", "X", "C", "C", "O")
);

Source.closestCarrot(grid, 1, 4); // -> 2
List<List<String>> grid = List.of(
  List.of("O", "O", "X", "O", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("O", "X", "C", "C", "O")
);

Source.closestCarrot(grid, 2, 0); // -> -1
List<List<String>> grid = List.of(
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "O", "O"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "X"),
  List.of("O", "O", "O", "O", "O", "O", "O", "O", "X", "C")
);

Source.closestCarrot(grid, 0, 0); // -> -1

List<List<String>> grid = List.of(
  List.of("O", "O", "X", "C", "O"),
  List.of("O", "X", "X", "X", "O"),
  List.of("C", "X", "O", "O", "O")
);

Source.closestCarrot(grid, 2, 2); // -> 5


*/

import java.util.List;
import java.util.ArrayDeque;
import java.util.HashSet;

class Source {
  public static int closestCarrot(List<List<String>> grid, int startRow, int startCol) {
    ArrayDeque<List<Integer>> queue = new ArrayDeque<>();
    HashSet<List<Integer>> visited = new HashSet<>();
    
    queue.add(List.of(startRow,startCol,0));
    visited.add(List.of(startRow,startCol));
    while(!queue.isEmpty()){
      List<Integer> entry = queue.remove();
      int row = entry.get(0);
      int col = entry.get(1);
      int distance = entry.get(2);

      if(grid.get(row).get(col)=="C"){
        return distance;
      }

      List<List<Integer>> deltas = List.of(
        List.of(1,0),
        List.of(-1,0),
        List.of(0,1),
        List.of(0,-1)
      );

      for(List<Integer> delta : deltas){
        int dRow = delta.get(0);
        int dCol = delta.get(1);
        int newRow = row+dRow;
        int newCol = col+dCol;

        boolean rowInbound = 0<=newRow && newRow<grid.size();
        boolean colInbound = 0<=newCol && newCol<grid.get(0).size();

        if(rowInbound && colInbound &&grid.get(newRow).get(newCol) !="X" && !visited.contains(List.of(newRow,newCol))){
          queue.add(List.of(newRow,newCol,distance+1));
          visited.add(List.of(newRow,newCol));
        }
      }
    }
    return -1;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}