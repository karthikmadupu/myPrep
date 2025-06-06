// exclusive items
// Write a method, exclusiveItems, that takes in two lists, a,b, as arguments. The method should return a new list containing elements that are in either list but not both lists.

// You may assume that each input list does not contain duplicate elements.

// List<Integer> a = List.of(4,2,1,6);
// List<Integer> b = List.of(3,6,9,2,10);
// exclusiveItems(a, b); // -> [4,1,3,9,10]

// List<Integer> a = List.of(2,4,6);
// List<Integer> b = List.of(4,2);
// exclusiveItems(a, b); // -> [6]
// List<Integer> a = List.of(4,2,1);
// List<Integer> b = List.of(1,2,4,6);
// exclusiveItems(a, b); // -> [6]
// List<Integer> a = List.of(0,1,2);
// List<Integer> b = List.of(10,11);
// exclusiveItems(a, b); // -> [0,1,2,10,11]


// List<Integer> a = new ArrayList<>();
// List<Integer> b = new ArrayList<>();

// for (int i = 0; i < 60000; i += 1) {
//   a.add(i);
//   b.add(i);
// }
// exclusiveItems(a, b); // -> [ ]

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

class Source {
  public static List<Integer> exclusiveItems(List<Integer> a, List<Integer> b) {
    HashSet<Integer> setA = new HashSet<>(a);
    HashSet<Integer> setB = new HashSet<>(b);
    List<Integer> diff = new ArrayList<>();
    for(int item: a){
      if(!setB.contains(item))
        diff.add(item);
    }
    for(int item: b){
      if(!setA.contains(item))
        diff.add(item);
    }
    return diff;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

//here if we use arrayList.contains() its O(n) and in for loop its O(n^2)
//so we convert list into set and set.contains() is O(1) then for loop is O(n)
// total time complexity is O(n+m)