package dependency.method;

public class App {
    public static void main(String[] args) {
        UserService service = new UserService();
        service.startService(new Logger());
    }
}
