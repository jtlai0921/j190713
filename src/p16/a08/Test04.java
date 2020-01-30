package p16.a08;

import java.util.function.BinaryOperator;

public class Test04 {
    public static void main(String[] args) {
        BinaryOperator1();
    }
    public static void BinaryOperator1() {
        BinaryOperator<String> a = new BinaryOperator<String>() {
            @Override
            public String apply(String t1, String t2) {
                return t1 + "===" + t2;
            }
        };
        System.out.println(a.apply("123", "456"));
        BinaryOperator<String> b = (t1, t2) -> t1 + "=== " + t2;
        System.out.println(b.apply("123", "456"));
    }
}
