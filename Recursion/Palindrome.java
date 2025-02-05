/*palindrome recursive
Write a method, palindrome, that takes in a string and returns a boolean indicating whether or not the string is the same forwards and backwards.

You must solve this recursively.

palindrome("pop") # -> true
palindrome("kayak") # -> true
palindrome("pops") # -> false
palindrome("boot") # -> false
palindrome("rotator") # -> true
palindrome("abcbca") # -> false
*/

class Palindrome {
  public static boolean palindrome(String s) {
  if(s.length()<=1)//==0||s.length()==1)
    return true;
  if(s.charAt(0)!=s.charAt(s.length()-1))
    return false;
  return palindrome(s.substring(1,s.length()-1));
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
