// sum list
// Write a method, sumList, that takes in the head of a linked list containing integers as an argument. The method should return the total sum of all values in the linked list.

// Node<Integer> a = new Node<>(2);
// Node<Integer> b = new Node<>(8);
// Node<Integer> c = new Node<>(3);
// Node<Integer> d = new Node<>(-1);
// Node<Integer> e = new Node<>(7);

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;

// // 2 -> 8 -> 3 -> -1 -> 7

// Source.sumList(a); // 19
// Node<Integer> x = new Node<>(38);
// Node<Integer> y = new Node<>(4);

// x.next = y;

// // 38 -> 4

// Source.sumList(x); // 42
// Node<Integer> z = new Node<>(100);

// // 100

// Source.sumList(z); // 100

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class SumList {
  public static int sumList(Node<Integer> head) {
    int sum=0;
    Node<Integer> curr = head;
    while(curr!=null){
      sum=sum+curr.val;
      curr=curr.next;
    }
    return sum;
  }

  public static void main(String a[]) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
