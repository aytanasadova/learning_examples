package garbageCollector.islandOfIsolation;

import garbageCollector.islandOfIsolation.domain.Person;

public class Main {

    public static void main(String... args) {

        Person p1 = new Person();
        System.out.println("Person object 1 created");

        Person p2 = new Person();
        System.out.println("Person object 1 created");

        // Object of t1 gets a copy of t2
        p1.p = p2;

        // Object of t1 gets a copy of t2
        p2.p = p1;

        // No object is eligble for garbage collection
        p1 = null;


        // Both of them is eligble for garbage collection
        p2=null;

        System.gc();

    }


}
