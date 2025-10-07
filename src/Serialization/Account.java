package Serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

       String userName;
       transient String pinNo;
       int accountNo;

       Account(String userName,String pinNo,int accountNo){
           this.userName = userName;
           this.pinNo = pinNo;
           this.accountNo = accountNo;
       }
       private void writeObject(ObjectOutputStream os) throws IOException {
           os.defaultWriteObject();
           String epinNo = "123"+pinNo;
           os.writeObject(epinNo);

       }
       private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
           is.defaultReadObject();
           String epinNo = (String)is.readObject();
           pinNo = epinNo.substring(3);

       }

}
