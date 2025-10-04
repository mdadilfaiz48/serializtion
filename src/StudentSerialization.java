import java.io.*;

public class StudentSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Details s1 = new Details();
        System.out.println(s1.name+"................."+s1.rollNo);
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Details s2 = (Details) ois.readObject();
        System.out.println(s2.name+"................."+s2.rollNo);
    }
}
