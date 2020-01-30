package p16.a08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1020 {

    public static void main(String[] args) {
      //  parallel1();
        parallel2();
    }
    //是一樣的意思
    public static void parallel1() {
        Stream.of("John", "Mike", "Ryan", "Donald", "Matthew")
               .parallel()
                .forEach(System.out::println);
    }
    public static void parallel2() {
        List<String> list = Arrays.asList("John", "Mike", "Ryan", "Donald", "Matthew");
       list.parallelStream()
                .forEach(System.out::println);
    }
}
