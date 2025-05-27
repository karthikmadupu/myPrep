// is univalue list
// Write a method, isUnivalueList, that takes in the head of a linked list as an argument. The method should return a boolean indicating whether or not the linked list contains exactly one unique value.

// You may assume that the input list is non-empty.

// Node<Integer> a = new Node<>(7);
// Node<Integer> b = new Node<>(7);
// Node<Integer> c = new Node<>(7);

// a.next = b;
// b.next = c;

// // 7 -> 7 -> 7

// Source.isUnivalueList(a); // true
// Node<Integer> a = new Node<>(7);
// Node<Integer> b = new Node<>(7);
// Node<Integer> c = new Node<>(4);

// a.next = b;
// b.next = c;

// // 7 -> 7 -> 4

// Source.isUnivalueList(a); // false
// Node<Integer> u = new Node<>(2);
// Node<Integer> v = new Node<>(2);
// Node<Integer> w = new Node<>(2);
// Node<Integer> x = new Node<>(2);
// Node<Integer> y = new Node<>(2);

// u.next = v;
// v.next = w;
// w.next = x;
// x.next = y;

// // 2 -> 2 -> 2 -> 2 -> 2

// Source.isUnivalueList(u); // true
// Node<Integer> u = new Node<>(2);
// Node<Integer> v = new Node<>(2);
// Node<Integer> w = new Node<>(3);
// Node<Integer> x = new Node<>(3);
// Node<Integer> y = new Node<>(2);

// u.next = v;
// v.next = w;
// w.next = x;
// x.next = y;

// // 2 -> 2 -> 3 -> 3 -> 2

// Source.isUnivalueList(u); // false
// Node<String> z = new Node<>("z");

// // z

// Source.isUnivalueList(z); // true

// Node<Integer> u = new Node<>(2);
// Node<Integer> v = new Node<>(1);
// Node<Integer> w = new Node<>(2);
// Node<Integer> x = new Node<>(2);
// Node<Integer> y = new Node<>(2);

// u.next = v;
// v.next = w;
// w.next = x;
// x.next = y;

// // 2 -> 1 -> 2 -> 2 -> 2

// Source.isUnivalueList(u); // false

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    T val = head.val;
    Node<T> cur = head;
    while(cur!=null){
      if(val!=cur.val){
        return false;
      }
      cur=cur.next;
    }
    return true;
  }

  public static <T> boolean isUnivalueListR(Node<T> head) {
    return isUnivalueList(head, head.val);
  }
  
  public static <T> boolean isUnivalueListrecursive(Node<T> head, T value) {
    if (head == null) {
      return true;
    }
    if (head.val != value) {
      return false;
    }
    return isUnivalueList(head.next, value);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
