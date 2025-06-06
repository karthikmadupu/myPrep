// insert node
// Write a method, insertNode, that takes in the head of a linked list, a value, and an index. The method should insert a new node with the value into the list at the specified index. Consider the head of the linked list as index 0. The method should return the head of the resulting linked list.

// Do this in-place.

// You may assume that the input list is non-empty and the index is not greater than the length of the input list.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.insertNode(a, "x", 2);
// // a -> b -> x -> c -> d
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.insertNode(a, "v", 3);
// // a -> b -> c -> v -> d
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.insertNode(a, "m", 4);
// // a -> b -> c -> d -> m


// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");

// a.next = b;

// // a -> b

// Source.insertNode(a, "z", 0);
// // z -> a -> b 

class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static <T> Node<T> insertNode(Node<T> head, T value, int index) {
    Node<T> insert = new Node<>(value);
    if(index ==0){
      insert.next = head;
      return insert;
    }
    Node<T> curr = head;
    Node<T> prev =null;
    int position = 0;

    while(true){
      if(position==index){
        prev.next= insert;
        insert.next=curr;
        return head;
      }
      position++;
      prev=curr;
      curr=curr.next;
    }
  }

  public static <T> Node<T> insertNoder(Node<T> head, T value, int index) {
    return insertNodeRecur(head, null, value, index);
  }
  
  public static <T> Node<T> insertNodeRecur(Node<T> head, Node<T> prev, T value, int index) {
    if (index == 0) {
      Node<T> newNode = new Node<>(value);
      newNode.next = head;
      if (prev != null) {
        prev.next = newNode;
      }
      return newNode;
    }
    head.next = insertNode(head.next, head, value, index - 1);
    return head;
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}