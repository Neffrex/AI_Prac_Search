package src.map.data;

import java.util.Stack;

public class Map {

    State[][] map;
    private StateID initialState;
    private StateID[] finalStates;

    public Map(String _filePath) {
        map = load(_filePath);
    }

    private State[][] load(String filePath) {
        // TODO: Load map from file
        initialState = null;
        finalStates = null;
        return null;
    }

    public State getState(StateID _state) {
        return map[_state.x()][_state.y()];
    }

    public StateID getInitialStateID() {
        return initialState;
    }

    public StateID[] getFinalStatesID() {
        return finalStates;
    }

    public StateID[] getSuccessors(StateID stateID) {
        Stack<StateID> successors = new Stack<>();

        for (int x = -1; x < 1; x++) {
            for (int y = -1; y < 1; y++) {
                successors.push(new StateID(stateID.x()+x,stateID.y()+y));
            }
        }

        return successors.toArray(new StateID[0]);
    }

    public int rows() {
        return map.length;
    }

    public int columns() {
        return (map[0]!=null) ? map[0].length : 0;
    }
}
