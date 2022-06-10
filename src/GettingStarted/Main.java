package GettingStarted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> allPersons = new ArrayList<Person>();
        for (int i = 0; i < 10; i++){
            allPersons.add(new Person("person"+i, i));
        }

        Collections.sort(allPersons, ( p1, p2) -> p1.getName().compareTo(p2.getName()));


    }
}
