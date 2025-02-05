/*pair product
Write a method, pairProduct, that takes in a List and a target product as arguments. The function should return a List containing a pair of indices whose elements multiply to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair whose product is the target.

Source.pairProduct(List.of(3, 2, 5, 4, 1), 8); // -> [1, 3]
Source.pairProduct(List.of(4, 7, 9, 2, 5, 1), 35); // -> [1, 4]

Source.pairProduct(List.of(4, 6, 8, 2), 16); // -> [2, 3]

ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 25000; i += 1) {
  numbers.add(i);
}
pairProduct(numbers, 624975000); // -> [ 24998, 24999 ] 
*/

import java.util.List;
import java.util.Map;
import java.util.HashMap;

class PairProduct {
  public static List<Integer> pairProduct(List<Integer> numbers, int target) {
    HashMap<Double,Integer> vals = new HashMap<>();
    for( int i =0; i<numbers.size();i++){
      int currNumber =numbers.get(i);  
      double otherNumber=(double)target/currNumber;
      if(vals.containsKey(otherNumber)){
        return List.of(vals.get(otherNumber),i);
      }
      vals.put((double)currNumber,i);
    }
    // todo
    return null;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
