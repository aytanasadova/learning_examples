package collextions.list;

import java.util.ArrayList;
import java.util.List;

public class ArraylistEx {


    public static void main(String[] args) {

        List<Integer> l=new ArrayList<>();

        l.add(3);
        l.add(5);
        l.add(9);

        l.iterator().forEachRemaining(System.out::println);
        l.listIterator().forEachRemaining(System.out::println);
    }
}
