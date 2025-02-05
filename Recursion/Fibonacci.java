/*  fibonacci
Write a method, fibonacci, that takes in a number argument, n, and returns the n-th number of the Fibonacci sequence.

The 0-th number of the sequence is 0.

The 1-st number of the sequence is 1.

To generate further numbers of the sequence, calculate the sum of previous two numbers.

You must solve this recursively.

Source.fibonacci(0); // -> 0
Source.fibonacci(1); // -> 1
Source.fibonacci(2); // -> 1
Source.fibonacci(3); // -> 2
Source.fibonacci(4); // -> 3
Source.fibonacci(5); // -> 5
*/

class Fibonacci {
  public static int fibonacci(int n) {
    if(n==0 || n==1)
      return n;
    return fibonacci(n-1)+fibonacci(n-2);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
