// tree levels
// Write a method, treeLevels, that takes in the root of a binary tree. The method should return a 2-Dimensional list where each sublist represents a level of the tree.

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

// Source.treeLevels(a); // ->
// // [
// //   ['a'],
// //   ['b', 'c'],
// //   ['d', 'e', 'f']
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

// Source.treeLevels(a); // ->
// // [
// //   ['a'],
// //   ['b', 'c'],
// //   ['d', 'e', 'f'],
// //   ['g', 'h', 'i']
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

// Source.treeLevels(q); //->
// // [
// //   ['q'],
// //   ['r', 's'],
// //   ['t'],
// //   ['u'],
// //   ['v']
// // ]

// Source.treeLevels(null); // -> []

import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;
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

  public static <T> List<List<T>> treeLevels(Node<T> root) {
      List<List<T>> levels = new ArrayList<>();
      treeLevels(root,0,levels);
      return levels;
  }
  public static <T> void treeLevels(Node<T> root,Integer levelIdx,List<List<T>> levels) {
    if(root==null)
      return;

    if(levelIdx == levels.size()){
      List<T> level = new ArrayList<>();
      level.add(root.val);
      levels.add(level);
    }else{
      levels.get(levelIdx).add(root.val);
    }


    treeLevels(root.left,levelIdx+1,levels);
    treeLevels(root.right,levelIdx+1,levels);

  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}