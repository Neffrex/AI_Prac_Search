package src.map.data;

import java.util.List;
import java.util.Stack;

public class StackFrontier implements Frontier {

    private Stack<Node> nodes;

    @Override
    public void add(Node node) {
        nodes.add(node);
    }

    @Override
    public void addAll(List<Node> _nodes) {
        nodes.addAll(_nodes);
    }

    @Override
    public boolean empty() {
        return nodes.empty();
    }

    public Node getNext() {
        return nodes.pop();
    }

    public boolean contains(Node node) {
        return nodes.contains(node);
    }
}
