/*sum numbers recursive
Watch the Approach video first!

Write a method sumNumbersRecursive that takes in a list of numbers and returns the sum of all the numbers in the list. All elements will be integers. Solve this recursively.

Source.sumNumbersRecursive(List.of(5, 2, 9, 10)); // -> 26
Source.sumNumbersRecursive(List.of(1, -1, 1, -1, 1, -1, 1)); // -> 1
Source.sumNumbersRecursive(List.of()); // -> 0
Source.sumNumbersRecursive(List.of(1000, 0, 0, 0, 0, 0, 1)); // -> 1001
Source.sumNumbersRecursive(List.of(700, 70, 7)); // -> 777
Source.sumNumbersRecursive(List.of(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1)); // -> -55
Source.sumNumbersRecursive(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)); // -> 0
*/

import java.util.List;

class SumNumbersRecursive {
  public static int sumNumbersRecursive(List<Integer> numbers) {
    // todo
    if(numbers.isEmpty()){
      return 0;
    }
    return numbers.get(numbers.size()-1)+sumNumbersRecursive(numbers.subList(0,numbers.size()-1));
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
