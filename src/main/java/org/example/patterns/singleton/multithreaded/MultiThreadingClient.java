package org.example.patterns.singleton.multithreaded;

public class MultiThreadingClient {

    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getConnection();
        System.out.println("dbConnection: "+dbConnection);
        DBConnection dbConnection1 = DBConnection.getConnection();
        System.out.println("dbConnection1: "+dbConnection1);
    }
}
