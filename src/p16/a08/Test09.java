package p16.a08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Test09 {

    class MyEntity {

        int id;
        String name;

        String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Optional1();
    }

    public static void Optional1() {
        MyEntity myEntity = null;
        //System.out.println(myEntity.getName()); //當掉 , 大魔王
        if (myEntity != null) {
            System.out.println(myEntity.getName());
        } else {
            System.out.println("ERROR");
        }
    }

    public static void Optional2() {
        String name = "123";
        Optional<String> a = Optional.of(name);
        System.out.println(a.get());
    }

    public static void Optional3() {
        String name = null;
        Optional<String> a = Optional.of(name);
        System.out.println(a.get());
    }

    public static void Optional4() {
        String name = "123";
        Optional<String> a = Optional.of(name);
        System.out.println(a.get());
    }

public static void Optional5() {
   String name=null;
   Optional<String>a=Optional.of(name);
    if (a.isPresent()) {
        System.err.println(a.get());
    }
     System.out.println("null");
    }

public static void Optional6() {
   String name=null;
   Optional<String>a=Optional.of(name);
     System.out.println(a.orElse("null"));
    }

public static void Optional7() {
   String name="123";
   Optional<String>a;
    if (name==null) {
        
    }
           }
public static void Optional8() {
   String name="123";
   Optional<String>a=Optional.of(name);
     System.out.println(a.get());
    }
 //使用 OrElseThrow 丟出例外
    public static void Optional9() {
        class MyException extends Exception {

            public MyException(String message) {
                super(message);
            }
        }
        String name = null;
        Optional<String> a = Optional.ofNullable(name);
        try {
            System.out.println(a.orElseThrow(() -> new MyException("WHAT! NULL!")));
        } catch (MyException e) {
            System.out.println("My Exception! " + e.getMessage());//"WHAT! NULL!"
        }
    }

    public static void Optional10() {
        Integer value1 = null;
        Integer value2 = 123;
        Optional<Integer> a = Optional.ofNullable(value1);
        Optional<Integer> b = Optional.of(value2);
        System.out.println("第一個參數值存在: " + a.isPresent()); //false  
        System.out.println("第二個參數值存在: " + b.isPresent()); //true 
    }
 public static void Optional11() {

        List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + " : ");
            return result;
        };
        str.stream()
                .filter(test)
                .findFirst()
                .ifPresent(System.out::print);
    }
}

