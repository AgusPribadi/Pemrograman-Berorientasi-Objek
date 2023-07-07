package aggregation;

public class App {
    public static void main(String[] args) {
        Engine diesel = new Engine();
        Truck hino = new Truck(diesel);
        hino.start();
    }
}
