/* intersection
Write a method, intersection, that takes in two Lists, a,b, as arguments. The method should return a new List containing elements that are in both of the two Lists.

You may assume that each input List does not contain duplicate elements.

List<Integer> a = List.of(4,2,1,6);
List<Integer> b = List.of(3,6,9,2,10);
Source.intersection(a, b) // -> [2,6]


List<Integer> a = List.of(2,4,6);
List<Integer> b = List.of(4,2);
Source.intersection(a, b) // -> [2,4]

List<Integer> a = List.of(0,1,2);
List<Integer> b = List.of(10,11);
Source.intersection(a, b) // -> []


List<Integer> a = new ArrayList<>();
List<Integer> b = new ArrayList<>();

for (int i = 0; i < 60000; i += 1) {
  a.add(i);
  b.add(i);
}
Source.intersection(a, b) // -> [0,1,2,3,..., 49999]

*/
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
class Intersection {
  public static List<Integer> intersection(List<Integer> listA, List<Integer> listB) {
    List<Integer> res = new ArrayList<>();
    HashSet<Integer> h = new HashSet<>(listA);
    for(int val :listB){
      if(h.contains(val)){
        res.add(val);
      }
    }
    return res;
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}