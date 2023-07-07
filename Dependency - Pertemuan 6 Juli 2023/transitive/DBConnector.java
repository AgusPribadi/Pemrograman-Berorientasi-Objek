package dependency.transitive;

import dependency.direct.Logger;

public class DBConnector {
    private Logger logger;
    public DBConnector(Logger logger) {
        this.logger = logger;
    }

    public void connect() {
        this.logger.log();
    }
}
