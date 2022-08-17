package functionalInterfaces;

import java.util.function.Consumer;

public class ConsumerEx {

    public static void main(String[] args) {

        Integer value=7;

        Consumer<Integer> c = (r)-> System.out.println(r);
        c.accept(value);

        int iarray[] = {1, 2, 3};

        Consumer<Integer> c2=(r)->System.out.println((r*r));

        for (Integer elem:iarray ) {
          c2.accept(elem);
        }

    }
}
