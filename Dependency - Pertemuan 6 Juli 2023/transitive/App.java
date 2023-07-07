package dependency.transitive;

import dependency.direct.Logger;

public class App {
    public static void main(String[] args) {
        Logger logger = new Logger();
        DBConnector connector = new DBConnector(logger);
        DiskService service = new DiskService(connector);
        service.writeToDisk();
    }
}
