package lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Lambda8 {
    public static void main(String[] args) {
        Function<Integer, Double> func = o -> (Double) Math.pow(o, 2.0);
        double out = func.apply(9);
        System.out.println(out);

        BinaryOperator<Double> operant = (integer, integer2) -> Math.sqrt(integer * integer + integer2 * integer2);
        double sqrt = operant.apply(12.0,9.0);
        System.out.println(sqrt);
    }
}
