/*Write a method, uncompress, that takes in a string as an argument. The input string will be formatted into multiple groups according to the following pattern:

<number><char>

for example, '2c' or '3a'.
The method should return an uncompressed version of the string where each 'char' of a group is repeated 'number' times consecutively. You may assume that the input string is well-formed according to the previously mentioned pattern.

Source.uncompress("2c3a1t"); // -> "ccaaat"
Source.uncompress("3n12e2z"); // -> "nnneeeeeeeeeeeezz"
Source.uncompress("127y"); // ->"yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"

*/
class Uncompress {
  public static String uncompress(String s) {
    // todo
    String result="";
    int i=0,j=0;
    String numbers ="0123456789";
    
    for(j =0;j<s.length();){
      String currChar= String.valueOf(s.charAt(j));
      if(numbers.contains(currChar)){
        j++;
      }
      else{
        int charTimes = Integer.parseInt(s.substring(i,j));
        result+=currChar.repeat(charTimes);
        j++;
        i=j;
      }
      
    }
    return result;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}