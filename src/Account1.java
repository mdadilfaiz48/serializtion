import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account1 implements Serializable {

    String name = "adil";
  transient   String password = "123adil";
  transient   int pinNo = 1235;

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        String epassword = "456"+password;
        int epinNo = 4444+ pinNo ;
        os.writeObject(epassword);
        os.writeInt(epinNo);

    }
    private void readObject(ObjectInputStream ois ) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String epassword = (String)ois.readObject();
           password = epassword.substring(3);
           int epinNo = ois.readInt();
           pinNo = epinNo - 4444;

    }
}
