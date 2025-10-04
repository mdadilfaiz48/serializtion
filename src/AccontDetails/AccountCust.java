package AccontDetails;

import java.io.*;

public class AccountCust {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account1 a1 = new Account1();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);


        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account1 a2 = (Account1)ois.readObject();
        System.out.println(a2.name+"....................."+a2.password+"................"+a2.pinNo);

    }
}
