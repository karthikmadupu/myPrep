/*sum of lengths
Write a method sumOfLengths that takes in a list of strings and returns the total length of the strings.

You must solve this recursively.

sumOfLengths(List.of("goat", "cat", "purple")); // -> 13
sumOfLengths(List.of("bike", "at", "pencils", "phone")); // -> 18
sumOfLengths(List.of()); // -> 0
sumOfLengths(List.of("", " ", "  ", "   ", "    ", "     ")); // -> 15
*/

import java.util.List;

class SumOfLengths {
  public static int sumOfLengths(List<String> strings) {
    // todo
    if(strings.isEmpty()){
      return 0;
    }
    return strings.get(0).length()+sumOfLengths(strings.subList(1,strings.size()));
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
