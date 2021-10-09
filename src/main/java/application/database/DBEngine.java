package application.database;

import java.sql.*;
import java.util.Properties;

public class DBEngine {

    public static Connection connection;

    public DBEngine() {
        connection = connect();
    }

    public boolean isConnected() {
        return (connection != null);
    }

    private Connection connect() {
        String url = "jdbc:mysql://" + System.getenv("DB_HOSTNAME") + ":" +
                System.getenv("DB_PORT")+ "/" + System.getenv("DB_NAME") +
                "?useUnicode=yes&characterEncoding=UTF-8";

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));


        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        } catch (NullPointerException e) {
           e.printStackTrace();
        }

        return null;
    }

}
