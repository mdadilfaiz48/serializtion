import java.io.*;

public class Details implements Serializable {
    String name = "adil";
     transient String rollNo = "srk101";

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        String erollNo = "123"+rollNo;
        os.writeObject(erollNo);


    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        String erollNo = (String)is.readObject();
         rollNo = erollNo.substring(3);
    }

}
