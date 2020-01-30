package p16.a08;

import java.util.function.UnaryOperator;

public class Test05 {

    public static void main(String[] args) {
    
    }
public static void UnaryOperator1(){
    UnaryOperator<String>a=new UnaryOperator<String>(){
        @Override
        public String apply(String t) {
            String t1 = null;
            return t1+"==="+"123";
        }
        };
    System.out.println(a.apply("123"));
    UnaryOperator<String>b=(t1)->t1+"==="+"123";
    System.out.println(b.apply(""));
    };
}
