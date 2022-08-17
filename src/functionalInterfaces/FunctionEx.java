package functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionEx {

    public static void main(String[] args) {
        // in and out with different types
        Function<Integer,Integer> f=(g)->{return g*3;};
        Integer k=f.apply(4);
        System.out.println(k);

        // in and out with the same type
        UnaryOperator<Integer>u=(g)->{return 5;};
        u.apply(4);



//        public interface BinaryOperator<T> extends BiFunction<T,T,T>
//        public interface UnaryOperator<T> extends Function<T, T>
    }
}
