package aggregation;

public class Truck {
    private Engine engine;

    public Truck (Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}
