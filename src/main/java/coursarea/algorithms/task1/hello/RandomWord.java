package coursarea.algorithms.task1.hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;


public class RandomWord {
    public static void main(String[] args) {
        int index = 1;

        while (!StdIn.isEmpty()) {
            String inputString = StdIn.readString();
//            if (StdRandom.bernoulli(1 / index)){
                System.out.println(StdRandom.bernoulli(1 / index));
                System.out.println(inputString);
//            }
            index++;
        }
    }
}
