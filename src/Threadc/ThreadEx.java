package Threadc;

public class ThreadEx {




    public static void main(String[] args) {
        Thread t1=new Thread(new RunnableImpl());


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("dfdsf");
            };
        });

        t1.run();
    }

}
