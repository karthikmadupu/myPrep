// depth first values
// Write a method, depthFirstValues, that takes in the root of a binary tree. The method should return a List containing all values of the tree in depth-first order.

// Hey. This is our first binary tree problem, so be extra sure to check out the approach video! -AZ

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

// Source.depthFirstValues(a); 
// //    -> ["a", "b", "d", "e", "c", "f"]
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");
// Node<String> g = new Node<>("g");

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;

// //      a
// //    /   \
// //   b     c
// //  / \     \
// // d   e     f
// //    /
// //   g

// Source.depthFirstValues(a); 
// //    -> ["a", "b", "d", "e", "g", "c", "f"]
// Node<String> a = new Node<>("a");
// //      a
// Source.depthFirstValues(a); 
// //    -> ["a"]
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");

// a.right = b;
// b.left = c;
// c.right = d;
// d.right = e;

// //      a
// //       \
// //        b
// //       /
// //      c
// //       \
// //        d
// //         \
// //          e

// Source.depthFirstValues(a); 
// //    -> ["a", "b", "c", "d", "e"]

// Source.depthFirstValues(null); 
// //    -> []

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

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
  public static List<String> depthFirstValues(Node<String> root) {
    List<String> values = new ArrayList<>();
    Stack<Node<String>> stack = new Stack<>();

    if (root != null) {
      stack.push(root);
    }
    while (!stack.empty()) {
      Node<String> node = stack.pop();
      values.add(node.val);
      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }
    return values;
  }

    public static List<String> depthFirstValuesRecur(Node<String> root) {
    if(root==null)
      return List.of();
    List<String> left = depthFirstValuesRecur(root.left);
    List<String> right = depthFirstValuesRecur(root.right);
    List<String> values = new ArrayList<>();
    values.add(root.val);
    values.addAll(left);
    values.addAll(right);
    return values;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
