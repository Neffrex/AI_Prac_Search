package MapTraverse;

public enum Transport {
    TRAIN(1), BUS(3), SHIP(5), WALK(10);

    private final int cost;

    Transport(int _cost){
        cost = _cost;
    }

    public int getCost() {
        return cost;
    }
}
