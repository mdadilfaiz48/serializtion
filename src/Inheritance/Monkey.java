package Inheritance;

import java.io.Serializable;

public class Monkey extends Animal implements Serializable {
    int j = 20;

    Monkey(){
        super(10);
        System.out.println("Monkey constructor called");
    }
}
