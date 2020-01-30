package p16.a08;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1012 {

    public static void main(String[] args) {
        //collect1();
        //collect2();      
    }

    public static void collect1() {
        List<String> name1 = Stream.of("Tony", "Tony", "Tony", "Tom", "Jonn")
          .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(name1);
    }

    public static void collect2() {
        Set<String> names3 = Stream.of("Tony", "Tony", "Tony", "Tom", "Jonn")
        
          .map(String::toUpperCase)
                .collect(Collectors.toSet());
        boolean name3 = false;
        System.out.println(name3);  
    }
}
