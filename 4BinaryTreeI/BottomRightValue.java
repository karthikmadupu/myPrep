// bottom right value
// Write a method, bottomRightValue, that takes in the root of a binary tree. The method should return the right-most value in the bottom-most level of the tree.

// You may assume that the input tree is non-empty.

// Node<Integer> a = new Node<>(3);
// Node<Integer> b = new Node<>(11);
// Node<Integer> c = new Node<>(10);
// Node<Integer> d = new Node<>(4);
// Node<Integer> e = new Node<>(-2);
// Node<Integer> f = new Node<>(1);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //       3
// //    /    \
// //   11     10
// //  / \      \
// // 4   -2     1

// Source.bottomRightValue(a); // -> 1
// Node<Integer> a = new Node<>(-1);
// Node<Integer> b = new Node<>(-6);
// Node<Integer> c = new Node<>(-5);
// Node<Integer> d = new Node<>(-3);
// Node<Integer> e = new Node<>(-4);
// Node<Integer> f = new Node<>(-13);
// Node<Integer> g = new Node<>(-2);
// Node<Integer> h = new Node<>(6);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// e.right = h;

// //        -1
// //      /   \
// //    -6    -5
// //   /  \     \
// // -3   -4   -13
// //     / \       
// //    -2  6

// Source.bottomRightValue(a); // -> 6
// Node<Integer> a = new Node<>(-1);
// Node<Integer> b = new Node<>(-6);
// Node<Integer> c = new Node<>(-5);
// Node<Integer> d = new Node<>(-3);
// Node<Integer> e = new Node<>(-4);
// Node<Integer> f = new Node<>(-13);
// Node<Integer> g = new Node<>(-2);
// Node<Integer> h = new Node<>(6);
// Node<Integer> i = new Node<>(7);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// e.right = h;
// f.left = i;

// //        -1
// //      /   \
// //    -6    -5
// //   /  \     \
// // -3   -4   -13
// //     / \    /   
// //    -2  6  7 

// Source.bottomRightValue(a); // -> 7
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");

// a.left = b;
// a.right = c;
// b.right = d;
// d.left = e;
// e.right = f;

// //      a
// //    /   \ 
// //   b     c
// //    \
// //     d
// //    /
// //   e
// //   \
// //    f
          
// Source.bottomRightValue(a); // -> "f"

// Node<Integer> a = new Node<>(42);

// //      42

// Source.bottomRightValue(a); // -> 42

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
  public static <T> T bottomRightValue(Node<T> root) {
    ArrayDeque<Node<T>> queue = new ArrayDeque<>();
    queue.add(root);
    Node<T> curr = null;
    while(!queue.isEmpty()){
      curr=queue.remove();
      if(curr.left!=null)
        queue.add(curr.left);
      if(curr.right!=null)
        queue.add(curr.right);
    }
    return curr.val;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}