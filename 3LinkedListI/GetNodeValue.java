// get node value
// Write a method, getNodeValue, that takes in the head of a linked list and an index. The method should return the value of the linked list at the specified index.

// If there is no node at the given index, then return null.

// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.getNodeValue(a, 2); // "c"
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.getNodeValue(a, 3); // "d"
// Node<String> a = new Node<>("a");
// Node<String> b = new Node<>("b");
// Node<String> c = new Node<>("c");
// Node<String> d = new Node<>("d");

// a.next = b;
// b.next = c;
// c.next = d;

// // a -> b -> c -> d

// Source.getNodeValue(a, 7); // null
// Node<String> node1 = new Node<>("banana");
// Node<String> node2 = new Node<>("mango");

// node1.next = node2;

// // banana -> mango

// Source.getNodeValue(node1, 0); // "banana"
class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class GetNodeValue {
  public static <T> T getNodeValue(Node<T> head, int index) {
    Node<T> curr = head;
    for(int i=0;i<=index && curr!=null;i++){
      if(i==index){
        return curr.val;
      }
      curr=curr.next;
    }
    return null;
  }
  
  public static void main(String a[]) {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}