import java.io.*;

public class Sender {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Adil a1 = new Adil();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

    }
}
