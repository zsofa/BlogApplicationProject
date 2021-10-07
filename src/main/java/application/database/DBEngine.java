package application.database;

import application.models.UserData;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
        String url = "jdbc:mysql://" + System.getenv("DB_HOSTNAME") + ":" +
                System.getenv("DB_PORT")+ "/" + System.getenv("DB_NAME") +
                "?useUnicode=yes&characterEncoding=UTF-8";

        // as hostname I can insert - localhost - too if I do the connection in my own computer
        // else - 127.0.0.1 is my hostname

        Properties properties = new Properties();
        properties.put("user", System.getenv("DB_USER"));
        properties.put("password", System.getenv("DB_PASSWORD"));


        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            return null;
        }
    }

    /*
    *
    * */

    public List<UserData> lisAllUsers() {
        String query = "SELECT * FROM user_data;";

        List<UserData> userData = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                    resultSet.getLong("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        return userData;
    }
}
