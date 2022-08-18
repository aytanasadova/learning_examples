package main.java.OOP;

public class SingletonClass {

    public static SingletonClass SINGLETON_INSTANCE;


    private SingletonClass() {


    }

    private SingletonClass Singleton() {

        return new SingletonClass();
    }


}
