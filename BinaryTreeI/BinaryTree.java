class Node<T>{
    T val;
    Node<T> left;
    Node<T> right;

    public Node(T val){
        this.val = val;
        this.left=null;
        this.right=null;
    }
}

class BinaryTree{
    public static void main(String args[]){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        a.left=b;
        a.right=c;
        System.out.println(a.left.val);
        System.out.println(a.right.val);

    }
}