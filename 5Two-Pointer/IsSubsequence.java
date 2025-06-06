// is subsequence
// Write a method, isSubsequence, that takes in string1 and string2. The method should return a boolean indicating whether or not string1 is a subsequence of string2.

// A subsequence is a string that can be formed by deleting 0 or more characters from another string.

// isSubsequence("bde", "abcdef"); // -> true
// isSubsequence("bda", "abcdef"); // -> false
// isSubsequence("ser", "super"); // -> true
// isSubsequence("serr", "super"); // -> false
// isSubsequence("ama", "camera"); // -> true
// isSubsequence("unfun", "unfortunate"); // -> true
// isSubsequence("riverbed", "river"); // -> false
//isSubsequence("river", "riverbed"); // -> true
class Source {
  public static boolean isSubsequence(String string1, String string2) {

    int i=0,j=0;

    while(i < string1.length() && j<string2.length()){
      if(string1.charAt(i)==string2.charAt(j)){
        i++;
        j++;
      } else {
        j++;
      }
    }
    return i==string1.length();
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
