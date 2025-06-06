// zipper lists
// Write a method, zipperLists, that takes in the head of two linked lists as arguments. The method should zipper the two lists together into single linked list by alternating nodes. If one of the linked lists is longer than the other, the resulting list should terminate with the remaining nodes. The method should return the head of the zippered linked list.

// Do this in-place, by mutating the original Nodes.

// You may assume that both input lists are non-empty.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// a.next = b;
// b.next = c;
// // a -> b -> c

// Node<String> x = new Node<>("x");
// Node<String> y = new Node<>("y");
// Node<String> z = new Node<>("z");
// x.next = y;
// y.next = z;
// // x -> y -> z

// Source.zipperLists(a, x);
// // a -> x -> b -> y -> c -> z
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");
// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;
// // a -> b -> c -> d -> e -> f

// Node<String> x = new Node<>("x");
// Node<String> y = new Node<>("y");
// Node<String> z = new Node<>("z");
// x.next = y;
// y.next = z;
// // x -> y -> z

// Source.zipperLists(a, x);
// // a -> x -> b -> y -> c -> z -> d -> e -> f
// Node<String> s = new Node<>("s");
// Node<String> t = new Node<>("t");
// s.next = t;
// // s -> t

// Node<String> one = new Node<>("1");
// Node<String> two = new Node<>("2");
// Node<String> three = new Node<>("3");
// Node<String> four = new Node<>("4");
// one.next = two;
// two.next = three;
// three.next = four;
// // 1 -> 2 -> 3 -> 4

// Source.zipperLists(s, one);
// // s -> 1 -> t -> 2 -> 3 -> 4
// Node<String> w = new Node<>("w");

// // w

// Node<String> one = new Node<>("1");
// Node<String> two = new Node<>("2");
// Node<String> three = new Node<>("3");
// one.next = two;
// two.next = three;
// // 1 -> 2 -> 3 

// Source.zipperLists(w, one);
// // w -> 1 -> 2 -> 3

class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ZipperLists {
  public static <T> Node<T> zipperLists(Node<T> head1, Node<T> head2) {
    Node<T> head = head1;
    Node<T> tail = head;
    Node<T> current1 = head1.next;
    Node<T> current2 = head2;
    
    int count = 0;
    while (current1 != null && current2 != null) {
      if (count % 2 == 0) {
        tail.next = current2;
        current2 = current2.next;
      } else {
        tail.next = current1;
        current1 = current1.next;
      }
      tail = tail.next;
      count += 1;
    }
    
    if (current1 != null) {
      tail.next = current1;
    }
    if (current2 != null) {
      tail.next = current2;
    }

    return head;
  }
  
  public static void main(args []) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}