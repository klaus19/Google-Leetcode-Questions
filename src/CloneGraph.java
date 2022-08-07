import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
public class CloneGraph {


    HashMap<Integer,Node>check = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        if (check.containsKey(node.val)) {
            return check.get(node.val);
        }
        Node clone = new Node(node.val);
        check.put(clone.val, clone);
        for (Node n : node.neighbors) {
            clone.neighbors.add(cloneGraph(n));

        }

        return clone;
    }
}
