// linked list values
// Write a method, linkedListValues, that takes in the head of a linked list as an argument. The method should return a List containing all values of the nodes in the linked list.

// Hey. This is our first linked list problem, so you should be liberal with watching the Approach and Walkthrough. Be productive! -AZ

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.linkedListValues(a); 
// // -> [ "a", "b", "c", "d" ]
// Node<String> x = new Node<>("x");
// Node<String> y = new Node<>("y");

// x.next = y;

// // x -> y

// Source.linkedListValues(x); 
// // -> [ "x", "y" ]
// Node<String> q = new Node<>("q");

// // q

// Source.linkedListValues(q); 
// // -> [ "q" ]

import java.util.List;
import java.util.ArrayList;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class LinkedListValues {
  public static List<String> linkedListValues(Node<String> head) {
    List<String> l = new ArrayList<String>();
    Node curr = head;
    while(curr!=null){
      l.add(curr.val+"");
      curr=curr.next;
    }
    return l;
  }

  public static void main(String ...ar) {
    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    System.out.print(linkedListValues(a));
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
