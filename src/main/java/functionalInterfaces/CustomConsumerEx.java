package main.java.functionalInterfaces;

public class CustomConsumerEx {

    public static void main(String[] args) {

        CustomConsumerInterfaceEx<String> r=(value)->System.out.println(value);

        r.process("test");
    }

}
