// breadth first values
// Write a method, breadthFirstValues, that takes in the root of a binary tree. The method should return an array containing all values of the tree in breadth-first order.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //      a
// //    /   \
// //   b     c
// //  / \     \
// // d   e     f

// Source.breadthFirstValues(a); 
// //    -> ["a", "b", "c", "d", "e", "f"]
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");
// Node<String> g = new Node<>("g");
// Node<String> h = new Node<>("h");

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// f.right = h;

// //      a
// //    /   \
// //   b     c
// //  / \     \
// // d   e     f
// //    /       \
// //   g         h

// Source.breadthFirstValues(a); 
// //   -> ["a", "b", "c", "d", "e", "f", "g", "h"]
// Node<String> a = new Node<>("a");

// //      a

// Source.breadthFirstValues(a); 
// //    -> ["a"]
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> x = new Node<>("x");

// a.right = b;
// b.left = c;
// c.left = x;
// c.right = d;
// d.right = e;

// //      a
// //       \
// //        b
// //       /
// //      c
// //    /  \
// //   x    d
// //         \
// //          e

// Source.breadthFirstValues(a); 
// //    -> ["a", "b", "c", "x", "d", "e"]


// Source.breadthFirstValues(null); 
// //    -> []

import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;


class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;
  
  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class Source {
  public static List<String> breadthFirstValues(Node<String> root) {
    List<String> values = new ArrayList<>();
    Queue<Node<String>> deq = new ArrayDeque<>();
    if(root == null)
      return values;
        
    deq.add(root);
    while(!deq.isEmpty()){
      Node<String> node = deq.remove();
      values.add(node.val);
      if(node.left != null)
        deq.add(node.left);
      if(node.right != null)
        deq.add(node.right);
    }
    return values;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}