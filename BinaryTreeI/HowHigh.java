// how high
// Write a method, howHigh, that takes in the root of a binary tree. The method should return a number representing the height of the tree.

// The height of a binary tree is defined as the maximal number of edges from the root node to any leaf node.

// If the tree is empty, return -1.

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

// Source.howHigh(a); // -> 2
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

// Source.howHigh(a); // -> 3
// Node<String> a = new Node<>("a");
// Node<String> c = new Node<>("c");

// a.right = c;

// //      a
// //       \
// //        c

// Source.howHigh(a); // -> 1
// Node<String> a = new Node<>("a");

// //      a

// Source.howHigh(a); // -> 0

// Source.howHigh(null); // -> -1

