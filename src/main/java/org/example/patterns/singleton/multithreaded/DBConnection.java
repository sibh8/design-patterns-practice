package org.example.patterns.singleton.multithreaded;

public class DBConnection {

    private static DBConnection dbConnection;
    private DBConnection(){}

    public static DBConnection getConnection(){
        if(dbConnection == null){
            synchronized(DBConnection.class){
                if(dbConnection == null){
                    dbConnection = new DBConnection();
                }
           }
        }
        return dbConnection;
    }
}
