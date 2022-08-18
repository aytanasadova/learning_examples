package main.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(3);
        l.add(5);
        l.add(9);

        System.out.println(l.stream().reduce((a, b) -> a + b));

        l.stream().filter(e -> e.equals(3)).forEach(System.out::println);


        List<String> s = new ArrayList<>();

        s.add("dfdf");
        s.add("fdgfg");
        s.add("dfgfdg");

        s.stream().filter(e->e.startsWith("d")).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
