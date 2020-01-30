package p16.a08;

import java.util.stream.Stream;

public class Test1011 {

    public static void main(String[] args) {
        // reduce1();
        // reduce2();       
    }

    public static void reduce1() {
        //有初始值
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, (sum, item) -> sum + item)); //20
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, Integer::sum));
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, (min, item) -> Math.min(min, item)));
        System.out.println(Stream.of(1, 2, 3, 4)
                .reduce(10, Integer::min));

    }

    public static void reduce2() {
        Stream.of(1, 2, 3, 4)
                .reduce((sum, item) -> sum + item)
                .ifPresent(System.out::println);
        Stream.of(1, 2, 3, 4)
                .reduce(Integer::sum).orElse(0);
        
          Stream.of(1, 2, 3, 4)
                .reduce(Integer::min).orElse(0);
        Stream.of(1, 2, 3, 4)
                .reduce(Integer::max).orElse(0);
    }
}
