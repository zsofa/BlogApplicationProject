package application;

import application.database.DBEngine;

public class getBlog {
    public static void main(String[] args) {
        DBEngine engine = new DBEngine();
        System.out.println(engine.isConnected());
    }
}
