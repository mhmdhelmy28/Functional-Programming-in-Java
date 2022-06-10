package Predicates;

import GettingStarted.Person;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

    public static boolean test(Person person, Predicate predicate){
       return predicate.test(person);
    }

    public static boolean testPredicate(int x, IntPredicate predicate){
        // negates predicate's condition
        return predicate.negate().test(x);
    }

    public static void main(String[] args) {
        Predicate<Person> personPredicate = p -> p.getName().equals("Ahmed");

        IntPredicate predicate = (x) -> x > 10;
        IntPredicate intPredicate = predicate.or(x -> x < 10);

        Predicate predicate1 = Predicate.isEqual("welcome");
        predicate1.test("Welcome");

        BiPredicate<Person,Integer> bigPredicate = (p, x) -> p.getAge() > x;



    }
}
