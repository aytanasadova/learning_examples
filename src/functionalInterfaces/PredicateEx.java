package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {

        Predicate<Integer> p=(a)->a.equals(13);
        System.out.println(p.test(13));
    }
}
