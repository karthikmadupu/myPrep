class Node<T>{
    T value;
    Node<T> next;

    public Node(T value){
        this.value=value;
        this.next=null;
    }
}
class LinkedList{

    public static void printList(Node head){
        Node current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
    }

    public static void printListRecursive(Node head){
        if(head==null){
            return;
        }
        System.out.println(head.value);
        printListRecursive(head.next);
    }

    public static void main(String args[]){

        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");

        a.next=b;
        b.next=c;
        printList(a);
        printListRecursive(a);

    }
}