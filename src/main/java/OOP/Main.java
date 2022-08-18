package main.java.OOP;

import java.util.ArrayList;
import java.util.List;



public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Object o=new Object();

        Person p1=new Person();
        Person p2=(Person) p1.clone();

        List<Person> p3=new ArrayList<>();
        p3.sort( new ComporatorEx());


    }
}
