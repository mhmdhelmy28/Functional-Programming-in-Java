package Function.Unary;

import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = x -> x + 10;
        intUnaryOperator.applyAsInt(10);
    }
}
