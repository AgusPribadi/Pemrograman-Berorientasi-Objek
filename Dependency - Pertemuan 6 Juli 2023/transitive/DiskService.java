package dependency.transitive;

public class DiskService {
    private DBConnector connector;

    public DiskService (DBConnector connector){
        this.connector = connector;
    }

    public void writeToDisk(){
        this.connector.connect();
    }
}
