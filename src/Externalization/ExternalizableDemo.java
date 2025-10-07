package Externalization;

import java.io.*;

public class ExternalizableDemo implements Externalizable {

     String name;
     int age;
     String rollNo;
     public ExternalizableDemo(){
          System.out.println("no argument constructors ");
     }
     public ExternalizableDemo(String name,int age,String rollNo){
         this.name = name;
         this.age = age;
         this.rollNo = rollNo;
     }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
         out.writeObject(name);
         out.writeObject(rollNo);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
           name = (String)in.readObject();
           rollNo = (String)in.readObject();

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
         ExternalizableDemo d1 = new ExternalizableDemo("adil",24,"@101");
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo d2 = (ExternalizableDemo)ois.readObject();
        System.out.println(d2.name+"..........."+d2.rollNo+"................"+d2.age);


    }
}
