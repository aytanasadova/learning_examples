package main.java.Threadc;


public class RunnableEx {

    public static void main(String[] args) {
        // 1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run method");
            }

            ;
        };

        //2
        Runnable r2 = new RunnableImpl();
        r2.run();


    }


}
