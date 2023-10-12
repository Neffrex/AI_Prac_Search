import StateGraph.Path;
import StateGraph.State;
import jdk.jshell.spi.ExecutionControl;

import java.util.stream.Stream;

public class AStarSearch {

    private boolean found;

    public AStarSearch() {
        this.found = false;
    }

    public Path search(Stream<State> stateStream) throws ExecutionControl.NotImplementedException {
        //TODO: Implement A* Search
        throw new ExecutionControl.NotImplementedException("a");
    }
}
