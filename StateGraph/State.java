package StateGraph;

import MapTraverse.Transport;

public class State {

    private final Order order;
    private final Transport transportMethod;

    public State(Order _order, Transport _transportMethod) {
        this.order = _order;
        this.transportMethod = _transportMethod;
    }

    public int getCost() {
        return transportMethod.getCost();
    }

    public Order getOrder() {
        return order;
    }

}
