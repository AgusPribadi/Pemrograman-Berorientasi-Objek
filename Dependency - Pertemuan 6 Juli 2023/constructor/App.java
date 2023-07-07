package dependency.constructor;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        APIService service = new APIService(logger);
        service.getAPI();
    }
}
