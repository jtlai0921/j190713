package p16.a08;

import java.util.function.Supplier;

public class Test06 {

    public static void main(String[] args) {}
    public static void Supplier1(){
        Supplier<String>a=new Supplier<String>(){
            @Override
            public String get() {
            return "123";
            }
    };
        System.out.println(a.get());
        Supplier<String>b=()->"123";
        System.out.println(b.get());
    }

}
