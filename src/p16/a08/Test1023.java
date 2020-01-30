package p16.a08;

import java.util.Arrays;
import java.util.List;

public class Test1023 {

    public static void main(String[] args) {
        parallelStream1();
    }
    public static void parallelStream1() {
        //結果 658374921
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEach(System.out::print);
    }    
}
