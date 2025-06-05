// tree sum
// Write a method, treeSum, that takes in the root of a binary tree that contains number values. The method should return the total sum of all values in the tree.

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

// Source.treeSum(a); // -> 21
// Node<Integer> a = new Node<>(1);
// Node<Integer> b = new Node<>(6);
// Node<Integer> c = new Node<>(0);
// Node<Integer> d = new Node<>(3);
// Node<Integer> e = new Node<>(-6);
// Node<Integer> f = new Node<>(2);
// Node<Integer> g = new Node<>(2);
// Node<Integer> h = new Node<>(2);

// a.left = b;
// a.right = c;
// b.left = d;
// b.right = e;
// c.right = f;
// e.left = g;
// f.right = h;

// //      1
// //    /   \
// //   6     0
// //  / \     \
// // 3   -6    2
// //    /       \
// //   2         2

// Source.treeSum(a); // -> 10

//Source.treeSum(null); // -> 0

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
  public static int treeSumRecursive(Node<Integer> root) {
    if(root==null)
      return 0;
    return root.val+treeSumRecursive(root.left)+treeSumRecursive(root.right);
  }

  public static int treeSum(Node<Integer> root) {
    if(root==null)
      return 0;
    int sum=0;
    Stack<Node<Integer>> s = new Stack<>();
    s.add(root);
    while(!s.isEmpty()){
      Node<Integer> node = s.pop();
      sum+=node.val;
      if(node.right!=null){
        s.push(node.right);
      }
      if(node.left!=null){
        s.push(node.left);
      }
    }
    return sum;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}
