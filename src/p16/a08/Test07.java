package p16.a08;

import java.util.function.Consumer;

public class Test07 {

    public static void main(String[] args) {
Consumer1();
    }

    public static void Consumer1() {
        Consumer<String> a = new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println(t);
            }
        };
        a.accept("123");
        Consumer<String>b=t->System.err.println(t);
        b.accept("123");
    }
}
