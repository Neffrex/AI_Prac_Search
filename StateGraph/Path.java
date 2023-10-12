package StateGraph;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Path implements Iterable<State> {

    List<State> states;

    public Path(Iterable<State> _nodes) {
        _nodes.forEach((_state) -> this.states.add(_state));
    }

    @Override
    public Iterator<State> iterator() {
        return new Iterator<>() {
            int index;

            @Override
            public boolean hasNext() {
                return index < states.size();
            }

            @Override
            public State next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return states.get(index++);
            }
        };
    }

}
