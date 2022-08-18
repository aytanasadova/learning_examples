package main.java.string;

public class Pool {

    public static void main(String[] args) {
        String s="mystring";
        s.intern();  //public native String intern();

    }

}
