// level averages
// Write a method, levelAverages, that takes in the root of a binary tree that contains number values. The method should return a list containing the average value of each level.

// Node<Integer> a = new Node<>(3);
// Node<Integer> b = new Node<>(11);
// Node<Integer> c = new Node<>(4);
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
// //   11     4
// //  / \      \
// // 4   -2     1

// Source.levelAverages(a); // -> [ 3., 7.5, 1. ] 
// Node<Integer> a = new Node<>(5);
// Node<Integer> b = new Node<>(11);
// Node<Integer> c = new Node<>(54);
// Node<Integer> d = new Node<>(20);
// Node<Integer> e = new Node<>(15);
// Node<Integer> f = new Node<>(1);
// Node<Integer> g = new Node<>(3);

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

// Source.levelAverages(a); // -> [ 5., 32.5, 17.5, 2. ] 
// Node<Integer> a = new Node<>(-1);
// Node<Integer> b = new Node<>(-6);
// Node<Integer> c = new Node<>(-5);
// Node<Integer> d = new Node<>(-3);
// Node<Integer> e = new Node<>(0);
// Node<Integer> f = new Node<>(45);
// Node<Integer> g = new Node<>(-1);
// Node<Integer> h = new Node<>(-2);

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
// // -3   0     45
// //     /       \
// //    -1       -2

// Source.levelAverages(a); // -> [ -1., -5.5, 14., -1.5 ]
// Node<Integer> q = new Node<>(13);
// Node<Integer> r = new Node<>(4);
// Node<Integer> s = new Node<>(2);
// Node<Integer> t = new Node<>(9);
// Node<Integer> u = new Node<>(2);
// Node<Integer> v = new Node<>(42);

// q.left = r;
// q.right = s;
// r.right = t;
// t.left = u;
// u.right = v;

// //        13
// //      /   \
// //     4     2
// //      \
// //       9
// //      /
// //     2
// //    /
// //   42

// Source.levelAverages(q); // -> [ 13., 3., 9., 2., 42. ]

// Source.levelAverages(null); // -> [ ]
import java.util.List;
import java.util.ArrayList;

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
  public static List<Double> levelAverages(Node<Integer> root) {
    List<List<Double>> levels = new ArrayList<>();
    levelAverages(root,0,levels);
    List<Double> averags = new ArrayList<>();
    for(List<Double> l: levels){
      averags.add(l.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
    }
    // todo
    return averags;
  }

  public static  void levelAverages(Node<Integer> root, Integer levelIdx,List<List<Double>> levels ){

    if(root==null)
      return;

    if(levelIdx==levels.size()){
      List<Double> l = new ArrayList<>();
      l.add(Double.valueOf(root.val));
      levels.add(l);
    }else{
      levels.get(levelIdx).add(Double.valueOf(root.val));
    }
    levelAverages(root.left,levelIdx+1,levels);    
    levelAverages(root.right,levelIdx+1,levels);
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}