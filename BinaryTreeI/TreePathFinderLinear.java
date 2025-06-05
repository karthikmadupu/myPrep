// tree path finder
// Write a method, pathFinder, that takes in the root of a binary tree and a target value. The method should return an array representing a path to the target value. If the target value is not found in the tree, then return null.

// You may assume that the tree contains unique values.

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

// Source.pathFinder(a, "e"); // -> [ "a", "b", "e" ]
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

// Source.pathFinder(a, "p"); // -> null
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

// Source.pathFinder(a, "c"); // -> ["a", "c"]
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

// Source.pathFinder(a, "h"); // -> ["a", "c", "f", "h"]
// Node<String> x = new Node<>("x");

// //      x

// Source.pathFinder(x, "x"); // -> ["x"]
// Source.pathFinder(null, "x"); // -> null


// Node<Integer> root = new Node<>(0);
// Node<Integer> curr = root;
// for (int i = 1; i <= 200; i += 1) {
//   curr.right = new Node<>(i);
//   curr = curr.right;
// }

// //      0
// //       \
// //        1
// //         \
// //          2
// //           \
// //            3
// //             .
// //              .
// //               .
// //              199
// //                \
// //                200

// Source.pathFinder(root, 116); // -> [0, 1, 2, 3, ..., 115, 116]

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


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

  public static <T> List<T> pathFinder(Node<T> root, T target) {
    List<T> path = pathFinderRecur(root, target);
    if(path==null)
      return null;
    Collections.reverse(path);
    return path;
  }

  public static <T> List<T> pathFinderRecur(Node<T> root, T target) {
    //ArrayList<T> a = new ArrayList<>();
    if(root==null)
      return null;
    if(root.val==target){
      return new ArrayList<>(List.of(target));
    }

    List<T> leftPath = pathFinderRecur(root.left,target);
    if(leftPath !=null){
      // List<T> newPath = new ArrayList<>();
      // newPath.add(root.val);
      // newPath.addAll(leftPath);
      leftPath.add(root.val);
      return leftPath;
    }

    List<T> rightPath = pathFinderRecur(root.right,target);
    if(rightPath!=null){
      // List<T> newPath = new ArrayList<>();
      // newPath.add(root.val);
      // newPath.addAll(rightPath);
      rightPath.add(root.val);
      return rightPath;
    }
    return null; 
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}