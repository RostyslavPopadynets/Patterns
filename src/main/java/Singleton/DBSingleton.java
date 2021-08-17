package Singleton;

import java.util.Random;

public class DBSingleton {

    private static DBSingleton _dbSingleton = null;
    private int port;

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        if (_dbSingleton == null) {
            _dbSingleton = new DBSingleton();
            _dbSingleton.port = new Random().nextInt(9000) + 1000;
        }
        return _dbSingleton;
    }

    public int getPort() {
        return port;
    }

    public void getConnection() {
        System.out.println("Connected!!! Your port is : " + this.getPort());
    }
}
