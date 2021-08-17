package GeneratingPatterns.Singleton;

import java.util.Random;

public class DBSingleton {

    private static DBSingleton dbSingleton = null;
    private int port;

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        if (dbSingleton == null) {
            dbSingleton = new DBSingleton();
            dbSingleton.port = new Random().nextInt(9000) + 1000;
        }
        return dbSingleton;
    }

    public int getPort() {
        return port;
    }

    public void getConnection() {
        System.out.println("Connected!!! Your port is : " + this.getPort());
    }
}
