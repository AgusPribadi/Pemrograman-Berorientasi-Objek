package dependency.constructor;

public class APIService {
    private Logger logger;

    public APIService(Logger logger) {
        this.logger = logger;
    }

    public void getAPI() {
        this.logger.log();
    }
}
