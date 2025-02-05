/*pair sum
Write a method, pairSum, that takes in a List and a target sum as arguments. The function should return a List containing a pair of indices whose elements sum to the given target. The indices returned must be unique.

Be sure to return the indices, not the elements themselves.

There is guaranteed to be one such pair that sums to the target.

Source.pairSum(List.of(3, 2, 5, 4, 1), 8); // -> [0, 2]
Source.pairSum(List.of(4, 7, 9, 2, 5, 1), 3); // -> [3, 5]
Source.pairSum(List.of(9, 9), 18); // -> [0, 1]

ArrayList<Integer> numbers = new ArrayList<>();
for (int i = 1; i <= 25000; i += 1) {
  numbers.add(i);
}
pairSum(numbers, 49999); // -> [ 24998, 24999 ] 

*/

import java.util.List;
import java.util.HashMap;
import java.util.Map;


class PairSum {
  public static List<Integer> pairSum(List<Integer> numbers, int target) {
    Map<Integer,Integer> previousNums = new HashMap<>();
    for(int i =0; i<numbers.size();i++){
      int otherNumber=target-numbers.get(i);
      if(previousNums.containsKey(otherNumber)){
        return List.of(previousNums.get(otherNumber),i);
      }
      previousNums.put(numbers.get(i),i);
    }
    return null;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
