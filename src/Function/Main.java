package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // global variable not allowed
        // if an argument changes after defining function it will not compile

        // function parameters should be static or local or instance
        // and should be final or effectively final


        //When a local variable is used in a lambda expression, the lambda makes a copy of that variable. This occurs because the scope of a lambda expression is only until the method is in the stack. If the lambda does not make a copy of the variable, then the variable is lost after the method is removed from the stack.
        //
        //Now, if the variable is not final or effectively final, it is possible that the value of the variable is changed after using it in the lambda as shown below.
        Function<Integer, Integer> add = p -> p + 10;
        add.apply(5);

        Function<Integer,Integer> multiply = p -> p * 10;
// multiplication first
        add.compose(multiply).apply(5);
        add.andThen(multiply).apply(4);


        BiFunction<Integer,Integer,Integer> bigFunction = (x,z) -> x + z;
        bigFunction.apply(5,4);

    }
}
