package application.modul;

import application.models.UserData;
import application.models.UserState;
import application.database.DBEngine;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetAllDataOfUser {

    /**
     *
     * Get all information and datas of a user/admin/moderatot by name
     *
     * 					MySQL code:
     *
     * 							SELECT * FROM user_data WHERE user_name = '_____';
     * */


    public static List<UserData> run(String searchName) {
        String query = "SELECT * FROM user_data WHERE user_name = ?";

        List<UserData> result = new ArrayList<>();

        try {
            PreparedStatement ps = DBEngine.connection.prepareStatement(query);
            ps.setString(1,searchName);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String userName = resultSet.getString("user_name");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                String userStateDB = resultSet.getString("user_state").toUpperCase();
                UserState userState = UserState.valueOf(userStateDB);

                result.add(new UserData(id,userName,password,email,userState));
            }


        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error with command!");
        }
        return result;
    }
}
