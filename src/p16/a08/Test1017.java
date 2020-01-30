package p16.a08;

import java.util.stream.Stream;

public class Test1017 {

     public static void main(String[] args) {
     anyMatch1();
    }
  

    public static void anyMatch1() {
        System.out.println(Stream.of(1, 2, 3).noneMatch(t ->t>2)); 
        System.out.println(Stream.of(1, 2, 3).noneMatch(t ->t>3)); 
    }

}
