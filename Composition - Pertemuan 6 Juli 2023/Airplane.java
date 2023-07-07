package composition;

public class Airplane {
    private Engine engine;

    public Airplane(String engineType) {
        this.engine = new Engine(engineType);
    }

    public void fly() {
        this.engine.start();
    }
}
