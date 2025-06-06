// all tree paths
// Write a method, allTreePaths, that takes in the root of a binary tree. The method should return a 2-Dimensional list where each sublist represents a root-to-leaf path in the tree.

// The order within an individual path must start at the root and end at the leaf, but the relative order among paths in the outer list does not matter.

// You may assume that the input tree is non-empty.

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

// Source.allTreePaths(a); // ->
// // [ 
// //   [ 'a', 'b', 'd' ], 
// //   [ 'a', 'b', 'e' ], 
// //   [ 'a', 'c', 'f' ] 
// // ] 
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");
// Node<String> g = new Node<>("g");
// Node<String> h = new Node<>("h");
// Node<String> i = new Node<>("i");

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// e.right = h;
// f.left = i;

// //         a
// //      /    \
// //     b      c
// //   /  \      \
// //  d    e      f
// //      / \    /   
// //     g  h   i 

// Source.allTreePaths(a); // ->
// // [ 
// //   [ 'a', 'b', 'd' ], 
// //   [ 'a', 'b', 'e', 'g' ], 
// //   [ 'a', 'b', 'e', 'h' ], 
// //   [ 'a', 'c', 'f', 'i' ] 
// // ] 
// Node<String> q = new Node<>("q");
// Node<String> r = new Node<>("r");
// Node<String> s = new Node<>("s");
// Node<String> t = new Node<>("t");
// Node<String> u = new Node<>("u");
// Node<String> v = new Node<>("v");

// q.left = r;
// q.right = s;
// r.right = t;
// t.left = u;
// u.right = v;

// //      q
// //    /   \ 
// //   r     s
// //    \
// //     t
// //    /
// //   u
// //  /
// // v

// Source.allTreePaths(q); // ->
// // [ 
// //   [ 'q', 'r', 't', 'u', 'v' ], 
// //   [ 'q', 's' ] 
// // ] 
// Node<String> z = new Node<>("z");

// //      z

// Source.allTreePaths(z); // -> 
// // [
// //   ['z']
// // ]

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
    public static <T> List<List<T>> allTreePaths(Node<T> root) {
      List<List<T>>  list = allTreePathsRecur(root);
      for(List<T> l : list){
        Collections.reverse(l);
      }
      return list;
    }
  
  
  public static <T> List<List<T>> allTreePathsRecur(Node<T> root) {
    if(root==null){
      return List.of();
    }
    if(root.left==null && root.right==null){
      List<T> path = new ArrayList<>();
      path.add(root.val);
      return List.of(path);
    }

    List<List<T>> allPath = new ArrayList<>();
    for( List<T> left : allTreePathsRecur(root.left)){ //here allTreePathsRecur(root.left) gives all left paths(arrays of left side)
      left.add(root.val);
      allPath.add(left);
    }
    for( List<T> right : allTreePathsRecur(root.right)){ //here allTreePathsRecur(root.right) gives all right paths(arrays of right side)
      right.add(root.val);
      allPath.add(right);
    }
    return allPath;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}

/*
here consider n as no. of nodes of tree for below its 7
//      a                                                                 1 1
//    /   \                                                               3 2
//   b     c                                                              7 3
//  / \    / \
// d   e   g  f                                                           n=2^h-1
Then considering full tree like above about half nodes are leave. so, we can consider leaf nodes= n/2
Then height of tree is log(n)
Because we visit every node for recursion and construct subarrays below is
Time complexity is height* leaf nodes  n/2*log(n)== O(nlog(n))

*/