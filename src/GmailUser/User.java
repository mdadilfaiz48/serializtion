package GmailUser;

import java.io.*;

public class User {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Gmail g1 = new Gmail();
        System.out.println(g1.userName+"...................."+g1.password);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(g1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Gmail g2 = (Gmail)ois.readObject();
        System.out.println(g2.userName+"..................."+g2.password);
    }
}
