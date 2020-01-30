package p16.a08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test08 {

    public static void main(String[] args) {
    Comparator1();
    }
    public static void Comparator1(){
        List<String>users=Arrays.asList("1","2","3");
        System.out.println("b");
        System.out.println(users);
        Collections.sort(users,(t1,t2)->t2.compareTo(t1));
        System.out.println("\nA");
        System.out.println(users);
    }

}
