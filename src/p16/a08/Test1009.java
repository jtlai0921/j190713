package p16.a08;

import java.util.stream.Stream;

public class Test1009 {

    public static void main(String[] args) {
        // distinct1();
    }

    public static void distinct1() {
        Stream.of(1, 2, 3, 4, 2, 3, 1)
                .distinct()
                .forEach(System.out::println);
           
    }
}

