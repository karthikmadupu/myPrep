import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

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

    public static <T> List<T> leafList(Node<T> root) {
      List<T> leaves = new ArrayList<>();
      leafList(root,leaves);
      return leaves;

    }
  public static <T> void leafList(Node<T> root, List<T> leaves) {
    if(root==null)
      return;
    if(root.left == null && root.right==null){
        leaves.add(root.val);
    }

    leafList(root.left,leaves);
    leafList(root.right,leaves);
    
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}