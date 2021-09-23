package application.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBEngine {

    private Connection connection;

    public DBEngine() {
        connection = connect();
    }


    // check if connection works
    public boolean isConnected() {
        return (connection != null);
    }

    //method for making a connection to database
    private Connection connect() {
        String url = "jdbc:mysql://127.0.0.1:3306/blog_application_DB" +
                "?useUnicode=yes&characterEncoding=UTF-8";

        // as hostname I can insert - localhost - too if I do the connection in my own computer
        // else - 127.0.0.1 is my hostname

        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "password");


        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }
}
