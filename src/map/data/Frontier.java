package src.map.data;

import java.util.List;

public interface Frontier {

    public void add(Node node);
    public Node getNext();

    void addAll(List<Node> _nodes);

    public boolean empty();
    public boolean contains(Node node);

}
