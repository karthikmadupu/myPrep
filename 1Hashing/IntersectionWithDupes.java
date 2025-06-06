// intersection with dupes
// Write a method, intersectionWithDupes, that takes in two lists, a,b, as arguments. The method should return a new list containing elements that are common to both input lists. The elements in the result should appear as many times as they occur in both input lists.

// You can return the result in any order.

// intersectionWithDupes(
//   List.of("a", "b", "c", "b"), 
//   List.of("x", "y", "b", "b")
// ); // -> ["b", "b"]
// intersectionWithDupes(
//   List.of("q", "b", "m", "s", "s", "s"), 
//   List.of("s", "m", "s")
// ); // -> ["m", "s", "s"]
// intersectionWithDupes(
//   List.of("p", "r", "r", "r"), 
//   List.of("r")
// ); // -> ["r"]
// intersectionWithDupes(
//   List.of("r"), 
//   List.of("p", "r", "r", "r")
// ); // -> ["r"]
// intersectionWithDupes(
//   List.of("t", "v", "u"), 
//   List.of("g", "e", "d", "f")
// ); // -> [ ]
// intersectionWithDupes(
//   List.of("a", "a", "a", "a", "a", "a"), 
//   List.of("a", "a", "a", "a")
// ); // -> ["a", "a", "a", "a"]


// List<String> a = new ArrayList<>();
// List<String> b = new ArrayList<>();
// for (int i = 0; i < 200000; i += 1) {
//   a.add(Integer.toString(i));
//   b.add(Integer.toString(i));
// }

// intersectionWithDupes(a, b); // -> [0, 1, 2, ..., 199999]
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Source {
  public static List<String> intersectionWithDupes(List<String> listA, List<String> listB) {
    HashMap<String,Integer> aMap = createMap(listA);// a1,b
    HashMap<String,Integer> bMap = createMap(listB);
    List<String> elements = new ArrayList<>();
    for(String ele : aMap.keySet()){
      if(bMap.containsKey(ele)){
        for(int i =0; i<Math.min(aMap.get(ele),bMap.get(ele));i++){
          elements.add(ele);
        }
      }
    }
    
    return elements;
  }

  public static HashMap<String,Integer> createMap(List<String> l){
    HashMap<String,Integer> itemMap = new HashMap<>();
    for(String item: l){
      if(!itemMap.containsKey(item)){
        itemMap.put(item,1);
      }else{
        itemMap.put(item,itemMap.get(item)+1);
      }
    }
    return itemMap;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}