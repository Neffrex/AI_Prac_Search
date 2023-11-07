package src.map.data;

import java.util.*;

public class Path<T> implements Iterator<T> {

    Stack<T> path;

    public Path() {
        path = new Stack<>();
    }

    public Path<T> addAll(List<T> _nodes) {
        path.addAll(_nodes);
        return this;
    }

    public Path<T> addAllReversed(List<T> _nodes) {
        for (T node: _nodes)
            path.push(node);
        return this;
    }

    @Override
    public boolean hasNext() {
        return !path.empty();
    }

    @Override
    public T next() {
        return path.pop();
    }
}
