package org.example.patterns.singleton.serializable.problem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MultiThreadingClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DBConnection dbConnection1 = DBConnection.getConnection();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("dbObjectSer.ser")));
        oos.writeObject(dbConnection1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("dbObjectSer.ser")));
        DBConnection dbConnection2 = (DBConnection) ois.readObject();

        oos.close();
        ois.close();

        System.out.println(dbConnection1 == dbConnection2);
    }
}
