package Consumer;

import GettingStarted.Person;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main {

    public static void main(String[] args) {
        Consumer<Person> personConsumer = p -> System.out.println(p.getName());

        IntConsumer intConsumer = x -> System.out.println(x);

        intConsumer.accept(5);
    }
}
