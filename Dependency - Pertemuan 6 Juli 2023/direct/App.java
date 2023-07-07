package dependency.direct;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        NetworkService service = new NetworkService(logger);
        service.writeLog();
    }
}
