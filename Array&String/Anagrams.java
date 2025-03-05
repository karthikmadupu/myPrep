/**problem statement
anagrams
Write a method, anagrams, that takes in two strings as arguments. The method should return a boolean indicating whether or not the strings are anagrams. Anagrams are strings that contain the same characters, but in any order.

Source.anagrams("restful", "fluster"); // -> true
Source.anagrams("abbc", "aabc"); // -> false
Source.anagrams("po", "popp"); // -> false
**/



import java.util.HashMap;
import java.util.Map;
class Anagrams {
  public static boolean anagrams(String s1, String s2) {
    // todo
    if(charCount(s1).equals(charCount(s2)))
      return true;
    return false;
  }

  public static Map<Character,Integer> charCount(String s){
    Map<Character,Integer> charCountVar = new HashMap<>();
    for(char c : s.toCharArray()){
      if(charCountVar.get(c) == null)
        charCountVar.put(c,0);
      charCountVar.put(c,charCountVar.get(c)+1);
    }
    return charCountVar;
    
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
