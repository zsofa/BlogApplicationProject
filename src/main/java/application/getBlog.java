package application;

import application.models.UserData;
import application.modul.GetAllDataOfUser;
import application.database.DBEngine;

import java.util.List;

public class getBlog {
    public static void main(String[] args) {

       DBEngine engine = new DBEngine();
        System.out.println(engine.isConnected());
/*
        if (engine.isConnected()) {
            *//*List<UserData> userData = GetUsersByState.run("admin");
            System.out.println(userData);*//*
            List<UserData> userData1 = GetAllDataOfUser.run("Babushka");
            System.out.println(userData1);
        } else {
            System.out.println("Error in connection!");
        }*/

        //System.out.println(System.getenv("DB_USER"));
    }
}
