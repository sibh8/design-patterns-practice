package org.example.patterns.singleton.serializable.solution;

import java.io.Serializable;

public class DBConnection implements Serializable{

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

    protected Object readResolve(){
        return dbConnection;
    }
}
