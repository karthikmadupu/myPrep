// linked list find
// Write a method, linkedListFind, that takes in the head of a linked list and a target value. The method should return a boolean indicating whether or not the linked list contains the target.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.linkedListFind(a, "c"); // true
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.linkedListFind(a, "d"); // true
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.linkedListFind(a, "q"); // false
// Node<String> node1 = new Node<>("jason");
// Node<String> node2 = new Node<>("leneli");

// node1.next = node2;

// // jason -> leneli

// Source.linkedListFind(node1, "jason"); // true
// Node<Integer> node1 = new Node<>(42);

// // 42

// Source.linkedListFind(node1, 42); // true
class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class LinkedListFind {
  public static <T> boolean linkedListFind(Node<T> head, T target) {
    Node<T> curr = head;
    while(curr!=null){
      if(curr.val==target)
        return true;
      curr=curr.next;
    }
    return false;
  }
  
  public static void main(String a[]) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}