import java.util.Map;
import java.util.List;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Queue;


class Node{

    public static void depthFirstSearch(Map<String, List<String>> graph, String  src){
        Stack<String> stack = new Stack<>();
        stack.push(src);

        while(!stack.isEmpty()){
            String node = stack.pop();
            System.out.println(node);
            for(String neighbour: graph.get(node)){
                stack.push(neighbour);
            }
        }
    }

    public static void depthFirstSearchRecursion(Map<String, List<String>> graph, String  src){
        System.out.println(src);

        List<String> neighbours = graph.get(src);
        for(String neighbour: neighbours){
            depthFirstSearchRecursion(graph,neighbour);
        }
    }

    public static void breadthFirstSearch(Map<String, List<String>> graph, String  src){
        Queue<String> deque = new ArrayDeque<>();
        deque.add(src);

        while(!deque.isEmpty()){
            String node = deque.remove();
            System.out.println(node);
            for(String neighbour: graph.get(node)){
                deque.add(neighbour);
            }
        }
    }

    public static void main(String args[]){
        Map<String,List<String>> graph = Map.of(
            "a", List.of("b","c"),
            "b", List.of("d"),
            "c", List.of("e"),
            "d", List.of(),
            "e",List.of()
        );
        depthFirstSearch(graph,"a");
        depthFirstSearchRecursion(graph,"a");
        //breadthFirstSearch(graph,"a");
    }
}