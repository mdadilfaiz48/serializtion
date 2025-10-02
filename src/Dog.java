import java.io.Serializable;

public class Dog implements Serializable {
    transient int i = 10;
    transient final int j = 20;

}
