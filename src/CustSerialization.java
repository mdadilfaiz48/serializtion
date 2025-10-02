import java.io.*;

public class CustSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a1 = new Account();
        System.out.println(a1.name+"............"+ a1.pwd);

        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
          Account a2 = (Account)ois.readObject();
          System.out.println(a2.name+"......................."+a2.pwd);


    }
}
