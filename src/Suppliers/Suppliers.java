package Suppliers;

import GettingStarted.Person;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("aaa", 5);
        System.out.println(supplier.get().getName());

        IntSupplier intSupplier = () -> (int) (Math.random() + 5);
        DoubleSupplier doubleSupplier = () -> (Math.random());

    }
}
