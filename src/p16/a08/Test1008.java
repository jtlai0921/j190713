package p16.a08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test1008 {

    public static void main(String[] args) {
        //flatMap1();
        //flatMap2();
        //flatMap3();
    }

    public static void flatMap1() {
        Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(List::stream)
                .forEach(System.out::println);
                 
    }

    public static void flatMap2() {
        Stream.of(Arrays.asList("Tony", "Tom", "John"),
                Arrays.asList("Amy", "Emma", "Iris"))
                .flatMap(List::stream)
                .forEach(System.out::println);
              
    }

    public static void flatMap3() {
        List<String> list = Stream.of(Arrays.asList("Tony", "Tom", "John"),
                Arrays.asList("Amy", "Emma", "Iris"))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(list);
             
    }
}
