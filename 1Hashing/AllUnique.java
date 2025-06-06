// all unique
// Write a method, allUnique, that takes in an list. The method should return a boolean indicating whether or not the list contains unique items.

// allUnique(List.of("q", "r", "s", "a")); // -> true
// allUnique(List.of("q", "r", "s", "a", "r", "z")); // -> false
// allUnique(List.of("red", "blue", "yellow", "green", "orange")); // -> true
// allUnique(List.of("cat", "cat", "dog")); // -> false
// allUnique(List.of("a", "u", "t", "u", "m", "n")); // -> false
import java.util.List;
import java.util.HashSet;

class Source {
  public static boolean allUnique(List<String> items) {
    HashSet uniqueSet = new HashSet<>(items);
    return uniqueSet.size()==items.size();
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
