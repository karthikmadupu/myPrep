/*five sort
Write a method, fiveSort, that takes in an ArrayList of numbers as an argument. The method should rearrange elements of the ArrayList such that all 5s appear at the end. Your method should perform this operation in-place by mutating the original ArrayList. The method should return the ArrayList.

Elements that are not 5 can appear in any order in the output, as long as all 5s are at the end of the array.

List<Integer> array = new ArrayList<>(List.of(12, 5, 1, 5, 12, 7));
Source.fiveSort(array);
// -> [12, 7, 1, 12, 5, 5] 

List<Integer> array = new ArrayList<>(List.of(5, 5, 6, 5, 5, 5, 5));
Source.fiveSort(array);
// -> [6, 5, 5, 5, 5, 5, 5] 

List<Integer> array = new ArrayList<>(List.of(5, 1, 2, 5, 5, 3, 2, 5, 1, 5, 5, 5, 4, 5));
Source.fiveSort(array);
// -> [4, 1, 2, 1, 2, 3, 5, 5, 5, 5, 5, 5, 5, 5] 

List<Integer> fives = new ArrayList<>(Collections.nCopies(20000, 5));
List<Integer> fours = new ArrayList<>(Collections.nCopies(20000, 4));
List<Integer> array = new ArrayList<>();
array.addAll(fives);
array.addAll(fours);
Source.fiveSort(array);
// twenty-thousand 4s followed by twenty-thousand 5s
// -> [4, 4, 4, 4, ..., 5, 5, 5, 5]

*/

import java.util.List;
import java.util.Collections;
class FiveSort {
  public static List<Integer> fiveSort(List<Integer> array) {
    // todo
    int i=0,j=array.size()-1;
    while(i<j){
      if(array.get(j)==5){
        j--;
      }
      else if(array.get(i)!=5){
        i++;
      }
      else{
        int temp = array.get(i);
        array.set(i,array.get(j));
        array.set(j,temp);

      }
      
    }
    return array;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function, but should not remove it
  }
}