// merge lists
// Write a method, mergeLists, that takes in the head of two sorted linked lists as arguments. The method should merge the two lists together into single sorted linked list. The method should return the head of the merged linked list.

// Do this in-place, by mutating the original Nodes.

// You may assume that both input lists are non-empty and contain increasing sorted numbers.

// Node<Integer> a = new Node<>(5);
// Node<Integer> b = new Node<>(7);
// Node<Integer> c = new Node<>(10);
// Node<Integer> d = new Node<>(12);
// Node<Integer> e = new Node<>(20);
// Node<Integer> f = new Node<>(28);
// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;
// // 5 -> 7 -> 10 -> 12 -> 20 -> 28

// Node<Integer> q = new Node<>(6);
// Node<Integer> r = new Node<>(8);
// Node<Integer> s = new Node<>(9);
// Node<Integer> t = new Node<>(25);
// q.next = r;
// r.next = s;
// s.next = t;
// // 6 -> 8 -> 9 -> 25

// Source.mergeLists(a, q);
// // 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 12 -> 20 -> 25 -> 28 
// Node<Integer> a = new Node<>(5);
// Node<Integer> b = new Node<>(7);
// Node<Integer> c = new Node<>(10);
// Node<Integer> d = new Node<>(12);
// Node<Integer> e = new Node<>(20);
// Node<Integer> f = new Node<>(28);
// a.next = b;
// b.next = c;
// c.next = d;
// d.next = e;
// e.next = f;
// // 5 -> 7 -> 10 -> 12 -> 20 -> 28

// Node<Integer> q = new Node<>(1);
// Node<Integer> r = new Node<>(8);
// Node<Integer> s = new Node<>(9);
// Node<Integer> t = new Node<>(10);
// q.next = r;
// r.next = s;
// s.next = t;
// // 1 -> 8 -> 9 -> 10

// Source.mergeLists(a, q);
// // 1 -> 5 -> 7 -> 8 -> 9 -> 10 -> 10 -> 12 -> 20 -> 28 

// Node<Integer> h = new Node<>(30);
// // 30

// Node<Integer> p = new Node<>(15);
// Node<Integer> q = new Node<>(67);
// p.next = q;
// // 15 -> 67

// Source.mergeLists(h, p);
// // 15 -> 30 -> 67
class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static Node<Integer> mergeLists(Node<Integer> head1, Node<Integer> head2) {
    Node<Integer> dummyHead = new Node<>(0);
    Node<Integer> head = dummyHead;
    Node<Integer> curr1 = head1;
    Node<Integer> curr2 = head2;

    //Node<Integer> tail = head;
    while(curr1!=null && curr2 != null){
      if(curr1.val>curr2.val){
        head.next=curr2;
        curr2=curr2.next;
      } else{
        head.next=curr1;
        curr1=curr1.next;
      }
      head = head.next;
    }
    if(curr1!=null){
      head.next=curr1;
    }
    if(curr2!=null){
      head.next=curr2;
    }
    return dummyHead.next;
  }

    public static Node<Integer> mergeListsRecursive(Node<Integer> head1, Node<Integer> head2) {
    if (head1 == null) {
      return head2;
    }
    if (head2 == null) {
      return head1;
    }
    if (head1.val < head2.val) {
      head1.next = mergeLists(head1.next, head2);
      return head1;
    } else {
      head2.next = mergeLists(head1, head2.next);
      return head2;
    }
  }
  
  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  } 
}


