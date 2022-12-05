package coursarea.algorithms.task1.hello;

public class HelloGoodbye {

    public static void main(String[] args) {
        if (args!=null && args.length>=2) {
            System.out.println("Hello " + args[0] + " and " + args[1]);
            System.out.println("Goodbye " + args[0] + " and " + args[1]);
        }
    }
}
