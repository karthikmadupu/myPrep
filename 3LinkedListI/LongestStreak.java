// longest streak
// Write a method, longestStreak, that takes in the head of a linked list as an argument. The method should return the length of the longest consecutive streak of the same value within the list.

// Node<Integer> a = new Node<>(5);
// Node<Integer> b = new Node<>(5);
// Node<Integer> c = new Node<>(7);
// Node<Integer> d = new Node<>(7);
// Node<Integer> e = new Node<>(7);
// Node<Integer> f = new Node<>(6);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;

// // 5 -> 5 -> 7 -> 7 -> 7 -> 6

// Source.longestStreak(a); // 3
// Node<Integer> a = new Node<>(3);
// Node<Integer> b = new Node<>(3);
// Node<Integer> c = new Node<>(3);
// Node<Integer> d = new Node<>(3);
// Node<Integer> e = new Node<>(9);
// Node<Integer> f = new Node<>(9);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;

// // 3 -> 3 -> 3 -> 3 -> 9 -> 9

// Source.longestStreak(a); // 4
// Node<Integer> a = new Node<>(9);
// Node<Integer> b = new Node<>(9);
// Node<Integer> c = new Node<>(1);
// Node<Integer> d = new Node<>(9);
// Node<Integer> e = new Node<>(9);
// Node<Integer> f = new Node<>(9);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;

// // 9 -> 9 -> 1 -> 9 -> 9 -> 9

// Source.longestStreak(a); // 3
// Node<Integer> a = new Node<>(5);
// Node<Integer> b = new Node<>(5);

// a.next = b;

// // 5 -> 5

// Source.longestStreak(a); // 2
// Node<Integer> a = new Node<>(4);

// // 4

// Source.longestStreak(a); // 1

// Source.longestStreak(null); // 0

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> int longestStreak(Node<T> head) {
    // todo
    Node<T> curr = head;
    int currCount =0;
    int maxCount =0;
    T preVal = null;
    while(curr!=null){
      if(preVal==curr.val){
        currCount++;
      } else{
        currCount=1;
      }
      if(maxCount<currCount)
          maxCount=currCount;
      preVal=curr.val;
      curr=curr.next;
    }
    return maxCount;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
