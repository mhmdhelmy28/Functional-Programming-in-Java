package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class GettingStarted {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,5,4,8,9,7);
        stream.filter(num -> num > 5).forEach(System.out::println);

        List<Integer> integerList = List.of(1,2,3,5,6,6,7,8,9);
        integerList.stream().filter(num -> num > 5).forEach(System.out::println);

        // if you know the map will deal with primitives ypu should use primitive flavour
        integerList.stream().mapToInt(num -> num * 5).forEach(System.out::println);

        // filter does not work with Stream of collections
        List<List<String>> list = List.of(Arrays.asList("a", "b", "c"),Arrays.asList("d","v","l"));
        list.stream().flatMap(Collection::stream).filter("a"::equals).forEach(System.out::println);

        String[] strings = new String[]{"a","b","c","d"};
        Arrays.stream(strings).map(String::toUpperCase).forEach(System.out::println);

        // distinct uses equals to accomplish this goal and returns a stream
        integerList.stream().distinct().forEach(System.out::println);

        integerList.stream().distinct().limit(3).forEach(System.out::println);

        integerList.stream().distinct().skip(3).forEach(System.out::println);

        // there is allMatch and nonMatch
        boolean res = integerList.stream().anyMatch(s -> s == 5 );


        integerList.stream().filter(num -> num == 6).findFirst().ifPresent(System.out::println);



    }
}
