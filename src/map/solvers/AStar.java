package src.map.solvers;

import src.map.data.*;
import src.services.MapService;

import java.util.List;

public class AStar implements Solver {

    MapService mapService;
    StackFrontier frontier;
    List<Node> explored;

    public AStar(Map _map) {
        mapService = new MapService(_map);
        frontier = new StackFrontier();
    }

    @Override
    public Path<Node> search() {
        Node current_node;
        List<Node> successors;
        frontier.add(mapService.getInitialNode());
        while(!frontier.empty()) {
            current_node = frontier.getNext();
            if (mapService.isGoal(current_node))
                return mapService.getPath(current_node);
            successors = getValidSuccessors(current_node);
            frontier.addAll(successors);
        }
        return null;
    }

    private List<Node> getValidSuccessors(Node _node) {
        return mapService.getSuccessors(_node)
                .stream()
                .filter(node -> !frontier.contains(node) && !explored.contains(node))
                .toList();
    }
}
