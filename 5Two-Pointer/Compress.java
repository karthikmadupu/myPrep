/*compress
Write a method, compress, that takes in a string as an argument. The method should return a compressed version of the string where consecutive occurrences of the same characters are compressed into the number of occurrences followed by the character. Single character occurrences should not be changed.

'aaa' compresses to '3a'
'cc' compresses to '2c'
't' should remain as 't'
You can assume that the input only contains alphabetic characters.



Source.compress("ccaaatsss"); // -> "2c3at3s"
Source.compress("ssssbbz"); // -> "4s2bz"
Source.compress("ppoppppp"); // -> "2po5p"
Source.compress("nnneeeeeeeeeeeezz"); // -> "3n12e2z"

Source.compress("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy"); 
// -> "127y"
*/

class Compress {
  public static String compress(String s) {
    int i=0,j=0;
    String result="";
    s+="!";
    while(j<s.length()){
      if(s.charAt(i)==s.charAt(j)){
        j++;
      }
      else{
        int count = j-i;
        if(count>1){
          result+=""+count+s.charAt(i);
        }
        else{
          result+=""+s.charAt(i);
        }
        i=j;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}