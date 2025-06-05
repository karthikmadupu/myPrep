// max root to leaf path sum
// Write a method, maxPathSum, that takes in the root of a binary tree that contains number values. The method should return the maximum sum of any root to leaf path within the tree.

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

// Source.maxPathSum(a); // -> 18
// Node<Double> a = new Node<>(5.);
// Node<Double> b = new Node<>(11.);
// Node<Double> c = new Node<>(54.);
// Node<Double> d = new Node<>(20.);
// Node<Double> e = new Node<>(15.);
// Node<Double> f = new Node<>(1.);
// Node<Double> g = new Node<>(3.);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// e.left = f;
// e.right = g;

// //        5
// //     /    \
// //    11    54
// //  /   \
// // 20   15
// //      / \
// //     1  3

// Source.maxPathSum(a); // -> 59
// Node<Double> a = new Node<>(-1.);
// Node<Double> b = new Node<>(-6.);
// Node<Double> c = new Node<>(-5.);
// Node<Double> d = new Node<>(-3.);
// Node<Double> e = new Node<>(0.);
// Node<Double> f = new Node<>(-13.);
// Node<Double> g = new Node<>(-1.);
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
// // -3   0    -13
// //     /       \
// //    -1       -2

// Source.maxPathSum(a); // -> -8

// Node<Double> a = new Node<>(42.);

// //        42

// Source.maxPathSum(a); // -> 42

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

//       3
//    /    \
//   11     4
//  / \      \
// 4   -2     1

class Source {
  public static Double maxPathSum(Node<Double> root) {
    if(root==null){
        return Double.NEGATIVE_INFINITY;
    }
    if(root.left==null && root.right==null){
        return root.val;
    }
    return root.val+Math.max(maxPathSum(root.left),maxPathSum(root.right));
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
