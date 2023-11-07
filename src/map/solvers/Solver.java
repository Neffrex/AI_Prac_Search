package src.map.solvers;

import src.map.data.Node;
import src.map.data.Path;

public interface Solver {
    Path<Node> search();
}
