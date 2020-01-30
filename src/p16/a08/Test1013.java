package p16.a08;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test1013 {

    public static void main(String[] args) {
//        max_min1();
//        max_min2();
    }

    public static void max_min1() {
        int max = Stream.of(120, 24, 59, 63, 11, 74)
                //.max(Comparator.comparing(n -> n))
                .max((n,m)->n.compareTo(m))
                .get();
        System.out.println("max: " + max); //max: 120

       
    }

    public static void max_min2() {
        String max = Stream.of("加利福尼亞州", "喬治亞州", "康涅狄格州")
                .max(Comparator.comparing(String::length))
                .get();
        System.out.println("max: " + max); //"加利福尼亞州"    
        
        
        
    }
}