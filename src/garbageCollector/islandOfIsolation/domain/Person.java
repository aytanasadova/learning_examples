package garbageCollector.islandOfIsolation.domain;

public class Person {

    public  Person p;


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Finalize method runs");
    }
}
