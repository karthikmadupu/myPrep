// tree min value
// Write a method, treeMinValue, that takes in the root of a binary tree that contains number values. The method should return the minimum value within the tree.

// You may assume that the input tree is non-empty.

// Node<Double> a = new Node<>(3.);
// Node<Double> b = new Node<>(11.);
// Node<Double> c = new Node<>(4.);
// Node<Double> d = new Node<>(4.);
// Node<Double> e = new Node<>(-2.);
// Node<Double> f = new Node<>(1.);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //       3
// //    /    \
// //   11     4
// //  / \      \
// // 4   -2     1

// Source.treeMinValue(a); // -> -2
// Node<Double> a = new Node<>(5.);
// Node<Double> b = new Node<>(11.);
// Node<Double> c = new Node<>(3.);
// Node<Double> d = new Node<>(4.);
// Node<Double> e = new Node<>(14.);
// Node<Double> f = new Node<>(12.);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //       5
// //    /    \
// //   11     3
// //  / \      \
// // 4   14     12

// Source.treeMinValue(a); // -> 3
// Node<Double> a = new Node<>(-1.);
// Node<Double> b = new Node<>(-6.);
// Node<Double> c = new Node<>(-5.);
// Node<Double> d = new Node<>(-3.);
// Node<Double> e = new Node<>(-4.);
// Node<Double> f = new Node<>(-13.);
// Node<Double> g = new Node<>(-2.);
// Node<Double> h = new Node<>(-2.);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// f.right = h;

// //        -1
// //      /   \
// //    -6    -5
// //   /  \     \
// // -3   -4   -13
// //     /       \
// //    -2       -2

// Source.treeMinValue(a); // -> -13

// Node<Double> a = new Node<>(42.);

// //        42

// Source.treeMinValue(a); // -> 42

import java.util.ArrayDeque;
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
  public static Double treeMinValueRecur(Node<Double> root) {
    if(root == null)
      return Double.POSITIVE_INFINITY;
    Double smallerChildVal= Math.min(treeMinValueRecur(root.left),treeMinValueRecur(root.right));
    return Math.min(root.val,smallerChildVal);
  }

  public static Double treeMinValue(Node<Double> root) {
    ArrayDeque<Node<Double>> queue = new ArrayDeque<>();
    
    Double minVal = Double.POSITIVE_INFINITY;
    queue.add(root);
    while(!queue.isEmpty()){
      Node<Double> node = queue.remove();
      minVal = Math.min(node.val,minVal);
      if(node.left!=null){
        queue.add(node.left);
      }
      if(node.right!=null){
        queue.add(node.right);
      }
    }
    return minVal;

  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}