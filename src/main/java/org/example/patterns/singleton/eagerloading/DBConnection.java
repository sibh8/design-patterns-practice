package org.example.patterns.singleton.eagerloading;

public class DBConnection {

    private static DBConnection dbConnection = new DBConnection();
    private DBConnection(){}

    public static DBConnection getConnection(){
        return dbConnection;
    }
}
