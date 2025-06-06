// reverse list
// Write a method, reverseList, that takes in the head of a linked list as an argument. The method should reverse the order of the nodes in the linked list in-place and return the new head of the reversed linked list.

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

// reverseList(a); // f -> e -> d -> c -> b -> a
// Node<String> x = new Node<>("x");
// Node<String> y = new Node<>("y");

// x.next = y;

// // x -> y

// reverseList(x); // y -> x

class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ReverseList {
  public static <T> Node<T> reverseList(Node<T> head) {
    Node<T> curr = head;
    // Node<T> nextPtr; //= curr.next;
    Node<T> prev = null;
    while(curr!=null){
      Node<T> nextPtr = curr.next;
      curr.next=prev;
      prev=curr;
      curr=nextPtr;
      // nextPtr.next=curr;
      
    }
    return prev;
  }

  public static <T> Node<T> reverseListRecur(Node<T> head) {
      reverseListRecur(head, null);
  }
  
  public static <T> Node<T> reverseListRecur(Node<T> head, Node<T> prev){
    if(head==null){
      return prev;
    }
    Node<T> next = head.next;
    head.next= prev;
    return reverseListRecur(next,head);
  }

  public static void main(String a[]) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}