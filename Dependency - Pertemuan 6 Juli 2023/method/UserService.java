package dependency.method;

public class UserService {
    private Logger logger;

    public UserService() {
        this.logger = new Logger();
    }

    public void startService(Logger logger) {
        this.logger.log();
    }
}
