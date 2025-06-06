// // is palindrome
// // Write a method, isPalindrome, that takes in a string and returns a boolean indicating whether or not the string is the same forwards and backwards.

// // isPalindrome("pop") // -> true
// // isPalindrome("kayak") // -> true
// // isPalindrome("pops") // -> false
// // isPalindrome("boot") // -> false
// // isPalindrome("rotator") // -> true
// // isPalindrome("abcbca") // -> false
// is palindrome
// Write a method, isPalindrome, that takes in a string and returns a boolean indicating whether or not the string is the same forwards and backwards.

// isPalindrome("pop") // -> true
// isPalindrome("kayak") // -> true
// isPalindrome("pops") // -> false
// isPalindrome("boot") // -> false
// isPalindrome("rotator") // -> true
// isPalindrome("abcbca") // -> false
// isPalindrome("") // -> true
class Source {
  public static boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length()-1;
    while(i<j){
      if(s.charAt(i)==s.charAt(j)){
        i++;
        j--;
        continue;
      }
      else
        return false;
    }
    return true;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
