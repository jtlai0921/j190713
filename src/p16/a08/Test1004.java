package p16.a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1004 {

    public static void main(String[] args) {
//        map1();
//        map2();
//        map3();
        map4();
    }

    public static void map1() {
        List<String> list = Arrays.asList("tony", "tom", "john");
        List<String> names = new ArrayList<>();
        for (String name:list ) {
            String upperName = name.toUpperCase();
                names.add(upperName);
            }
        
        System.out.println(names);
    }


public static void map2() {
   List<String> list = Arrays.asList("tony", "tom", "john");
list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void map3() {
       List<String> list = Arrays.asList("tony", "tom", "john");
list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    public static void map4() {
    
    }
}
