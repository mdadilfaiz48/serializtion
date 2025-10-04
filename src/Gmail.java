import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Gmail implements Serializable {
    String userName = "adil_faiz";
  transient  String password = "adil101@123";

    private void writeObject(ObjectOutputStream  os) throws IOException {
        os.defaultWriteObject();
        String epassword = "123"+"adil101@123";
        os.writeObject(epassword);
    }

    private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
        is.defaultReadObject();
        String epassword = (String)is.readObject();
         password = epassword.substring(3) ;
    }
}
