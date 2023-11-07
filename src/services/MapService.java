package src.services;

import src.map.data.Map;
import src.map.data.Node;
import src.map.data.Path;
import src.map.data.StateID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MapService {

    Map map;
    private static final int[][] successorsOffsets = {{-1,-1}, {-1,1}, {1,-1}, {1,1}};

    public MapService(Map _map) {
        map = _map;
    }

    public boolean isGoal(Node _node) {
        return Arrays.asList(map.getFinalStatesID()).contains(_node.stateID());
    }

    public List<Node> getSuccessors(Node _node) {
        StateID stateID = _node.stateID();
        List<Node> successors = new ArrayList<>();

        for(int[] offset: successorsOffsets) {
            StateID successorID = new StateID(
                    stateID.x() + offset[0],
                    stateID.y() + offset[1]
            );

            if (inBounds(successorID))
                successors.add(new Node(_node, successorID));
        }

        return successors;
    }


    private boolean inBounds(int x, int y) {
        return x >= 0 && x < map.rows() &&
               y >= 0 && y < map.columns();
    }

    public boolean inBounds(StateID _stateID) {
        return inBounds(_stateID.x(), _stateID.y());
    }

    public Node getInitialNode() {
        return new Node(null, map.getInitialStateID());
    }

    public Path<Node> getPath(Node _node) {
        List<Node> nodes = new LinkedList<>();
        for (Node node = _node; node.parent() != null; node = node.parent())
            nodes.add(node);
        return new Path<Node>().addAllReversed(nodes);
    }
}
