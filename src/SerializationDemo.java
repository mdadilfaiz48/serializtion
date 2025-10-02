import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream("abc.ser");// send java object in file (convert java object to serializable object)
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);


        FileInputStream fis = new FileInputStream("abc.ser"); // give file object from file (convert serializable object to java object)
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();

        System.out.println(d2.i+"........................"+d2.j);

    }
}
