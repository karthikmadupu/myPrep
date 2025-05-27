// remove node
// Write a method, removeNode, that takes in the head of a linked list and a target value as arguments. The method should delete the node containing the target value from the linked list and return the head of the resulting linked list. If the target appears multiple times in the linked list, only remove the first instance of the target in the list.

// Do this in-place.

// You may assume that the input list is non-empty.

// You may assume that the input list contains the target.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");
// Node<String> e = new Node<>("e");
// Node<String> f = new Node<>("f");

// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;

// // a -> b -> c -> d -> e -> f

// Source.removeNode(a, "c");
// // a -> b -> d -> e -> f
// Node<String> x = new Node<>("x");
// Node<String> y = new Node<>("y");
// Node<String> z = new Node<>("z");

// x.next = y;
// y.next = z;

// // x -> y -> z

// Source.removeNode(x, "z");
// // x -> y
// Node<String> q = new Node<>("q");
// Node<String> r = new Node<>("r");
// Node<String> s = new Node<>("s");

// q.next = r;
// r.next = s;

// // q -> r -> s

// Source.removeNode(q, "q");
// // r -> s
// Node<String> node1 = new Node<>("h");
// Node<String> node2 = new Node<>("i");
// Node<String> node3 = new Node<>("j");
// Node<String> node4 = new Node<>("i");

// node1.next = node2;
// node2.next = node3;
// node3.next = node4;

// // h -> i -> j -> i

// Source.removeNode(node1, "i");
// // h -> j -> i

// Node<String> t = new Node<>("t");

// // t

// Source.removeNode(t, "t");
// // null

class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> removeNode(Node<T> head, T targetVal) {
    // todo
    Node<T> curr = head;
    Node<T> prev = null;
    if(curr.val==targetVal){
      return curr.next;
    }

    while(curr!=null){
      if(curr.val==targetVal){
        prev.next = curr.next;
        break;
      }
      prev=curr;
      curr=curr.next;
    }
    return head;
  }
    
    public static <T> Node<T> removeNodeRecursive(Node<T> head, T targetVal) {
    if (head.val == targetVal) {
      return head.next;
    }
    
    head.next = removeNodeRecursive(head.next, targetVal);
    return head;
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}