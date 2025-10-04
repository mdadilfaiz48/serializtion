package Inheritance;

import java.io.*;

public class IheritanceExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Monkey m1 = new Monkey();
        m1.i = 888;
        m1.j = 444;

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(m1);

      System.out.println("de-serialization started");
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Monkey m2 = (Monkey)ois.readObject();
        System.out.println(m2.i+"................."+m2.j);
    }
}
