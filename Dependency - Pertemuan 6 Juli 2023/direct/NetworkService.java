package dependency.direct;

public class NetworkService {
    private Logger logger;

    public NetworkService(Logger logger) {
        this.logger = logger;
    }

    public void writeLog() {
        this.logger.log();
    }
}
