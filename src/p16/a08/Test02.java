package p16.a08;

import java.util.function.Function;

public class Test02 {

    public static void Function1() {
        Function<String, Integer> a = new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                return Integer.valueOf(t);
            }
        };
        System.out.println(a.apply("123"));
        Function<String, Integer> b = t -> Integer.valueOf(t);
        System.out.println(b.apply("123"));
        
    }

    public static void main(String[] args) {

    }

}
