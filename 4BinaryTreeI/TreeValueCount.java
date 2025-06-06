// tree value count
// Write a method, treeValueCount, that takes in the root of a binary tree and a target value. The method should return the number of times that the target occurs in the tree.

// Node<Integer> a = new Node<>(12);
// Node<Integer> b = new Node<>(6);
// Node<Integer> c = new Node<>(6);
// Node<Integer> d = new Node<>(4);
// Node<Integer> e = new Node<>(6);
// Node<Integer> f = new Node<>(12);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //      12
// //    /   \
// //   6     6
// //  / \     \
// // 4   6     12

// Source.treeValueCount(a,  6); // -> 3
// Node<Integer> a = new Node<>(12);
// Node<Integer> b = new Node<>(6);
// Node<Integer> c = new Node<>(6);
// Node<Integer> d = new Node<>(4);
// Node<Integer> e = new Node<>(6);
// Node<Integer> f = new Node<>(12);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;

// //      12
// //    /   \
// //   6     6
// //  / \     \
// // 4  6     12

// Source.treeValueCount(a,  12); // -> 2
// Node<Integer> a = new Node<>(7);
// Node<Integer> b = new Node<>(5);
// Node<Integer> c = new Node<>(1);
// Node<Integer> d = new Node<>(1);
// Node<Integer> e = new Node<>(8);
// Node<Integer> f = new Node<>(7);
// Node<Integer> g = new Node<>(1);
// Node<Integer> h = new Node<>(1);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// f.right = h;

// //      7
// //    /   \
// //   5     1
// //  / \     \
// // 1   8     7
// //    /       \
// //   1         1
// Source.treeValueCount(a, 1); // -> 4
// Node<Integer> a = new Node<>(7);
// Node<Integer> b = new Node<>(5);
// Node<Integer> c = new Node<>(1);
// Node<Integer> d = new Node<>(1);
// Node<Integer> e = new Node<>(8);
// Node<Integer> f = new Node<>(7);
// Node<Integer> g = new Node<>(1);
// Node<Integer> h = new Node<>(1);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// f.right = h;

// //      7
// //    /   \
// //   5     1
// //  / \     \
// // 1   8     7
// //    /       \
// //   1         1

// Source.treeValueCount(a, 9); // -> 0

// Source.treeValueCount(null, 42); // -> 0

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
  public static <T> int treeValueCount(Node<T> root, T target) {
    if (root == null) {
      return 0;
    }
    ArrayDeque<Node<T>> queue = new ArrayDeque<>();
    queue.add(root);
    int count = 0;
    while (!queue.isEmpty()) {
      Node<T> node = queue.remove();
      if (node.val == target) {
        count += 1;
      }
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }
    }
    return count;
  }

  public static <T> int treeValueCountRecur(Node<T> root, T target) {
    if (root == null) {
      return 0;
    }
    int match = root.val==target?1:0;
    return match + treeValueCountRecur(root.left,target)+treeValueCountRecur(root.right,target);
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
