package org.example.patterns.singleton.eagerloading;

public class EagerLoadingClient {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getConnection();
        System.out.println("dbConnection: "+dbConnection);
        DBConnection dbConnection1 = DBConnection.getConnection();
        System.out.println("dbConnection1: "+dbConnection1);
    }
}
