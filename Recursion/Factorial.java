/*factorial
Write a method, factorial, that takes in a number n and returns the factorial of that number. The factorial of n is the product of all the positive numbers less than or equal to n. You must solve this recursively.

For example, the factorial of 6 is:

6 * 5 * 4 * 3 * 2 * 1 = 720
You can assume that n is a non-negative integer. Note that the factorial of 0 is defined to be 1 (wiki).

Source.factorial(3); // -> 6
Source.factorial(6); // -> 720
Source.factorial(18); // -> 6402373705728000
Source.factorial(1); // -> 1
Source.factorial(13); // -> 6227020800
*/

class Factorial {
  public static long factorial(int n) {
    if(n==0){
      return 1;
    }
    return n*factorial(n-1);
  }

  public static void main(String[] args) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
