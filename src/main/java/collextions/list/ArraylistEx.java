package collextions.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistEx {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();

        l.add(3);
        l.add(5);
        l.add(9);

//      l.iterator().forEachRemaining(System.out::println);
        System.out.println("Original of array");
        l.listIterator().forEachRemaining(System.out::println);

        List<Integer> lCopy;

        lCopy=  new ArrayList<>(l);

        System.out.println("Copy of array");
        lCopy.listIterator().forEachRemaining(System.out::println);

        lCopy.set(1,6);

        System.out.println("Copy of array  after modify  ");
        lCopy.listIterator().forEachRemaining(System.out::println);


        System.out.println("Original of array after modify copy version");
        l.listIterator().forEachRemaining(System.out::println);


    }
}
