import java.io.*;

public class Account implements Serializable {
    String name = "durga";
   transient String pwd = "adil";

   private void writeObject(ObjectOutputStream os) throws IOException {
       os.defaultWriteObject();
       String epwd = "123"+pwd;
       os.writeObject(epwd);

   }
   private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
       is.defaultReadObject();
       String epwd = (String)is.readObject();
      String  pwd = epwd.substring(3);
   }
}
