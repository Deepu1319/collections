class DBConnection {

    static DBConnection redisConnection;

    int port;
    String database;

    public DBConnection() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.port = 8010;
        this.database = "Redis";
    }

    static DBConnection getInstance() {
        if (redisConnection == null) {
            redisConnection = new DBConnection();
        }
        return redisConnection;
    }

    @Override
    public String toString() {
        return "DBConnection{" +
                "port=" + port +
                ", database='" + database + '\'' +
                '}';
    }
}

public class Singleton {

    public static void main(String[] args) {
        System.out.println(DBConnection.getInstance());
        System.out.println(DBConnection.getInstance());
    }
}
