package Function.Binary;

import GettingStarted.Person;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Person> binaryOperator = (p1, p2) ->{
            p1.setAge(p2.getAge());
            return p1;
        };
    }
}
