/*most frequent char
Write a function, mostFrequentChar, that takes in a string as an argument. The function should return the most frequent character of the string. If there are ties, return the character that appears earlier in the string.

You can assume that the input string is non-empty.

Source.mostFrequentChar("mississippi"); // -> 'i'
Source.mostFrequentChar("eleventennine"); // -> 'e'
Source.mostFrequentChar("riverbed"); // -> 'r'
*/

import java.util.HashMap;
import java.util.Map;
class MostFrequentChar {
  public static char mostFrequentChar(String s) {
    HashMap<Character,Integer> countMap=charCount(s);
    char mostFreq='\0';
    int large=0;
    for(char c : s.toCharArray()){
      // if((int)countMap.get(c)>large){
      //   mostFreq=c;
      //   large=(int)countMap.get(c);
      // }
      if(mostFreq == '\0' || countMap.get(c)>countMap.get(mostFreq)){
        mostFreq = c;
      }
    }
    return mostFreq;
  }
  public static HashMap<Character,Integer> charCount(String s){

    HashMap<Character,Integer> countMap = new HashMap<>();
    for(char c : s.toCharArray() ){
      if(countMap.get(c)==null){
        countMap.put(c,0);
      }
      int val = countMap.get(c);
      countMap.put(c,val+1);
    }
    return countMap;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

