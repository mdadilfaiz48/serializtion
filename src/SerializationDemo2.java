import java.io.*;

public class SerializationDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog1 d1 = new Dog1();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(d1);

           FileInputStream fis = new FileInputStream("abc.ser");
           ObjectInputStream ois = new ObjectInputStream(fis);
         Dog1 d2 = (Dog1)ois.readObject();
         System.out.println(d2.c.r.i);
    }
}
