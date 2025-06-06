/*reverse string recursive
Write a method, reverseString, that takes in a string as an argument. The method should return the string with its characters in reverse order. You must do this recursively.

reverseString("hello"); // -> "olleh"
reverseString("abcdefg"); // -> "gfedcba"
reverseString("stopwatch"); // -> "hctawpots"
*/

class ReverseString {
  public static String reverseString(String s) {
    // todo
    if(s.length()==0)
      return "";
    return reverseString(s.substring(1))+s.charAt(0);
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
