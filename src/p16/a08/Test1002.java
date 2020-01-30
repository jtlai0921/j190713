package p16.a08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static p05.pack1.Import3.x;

public class Test1002 {

    public static void main(String[] args) {

    }

    public static void filter1() {
        List<String> list = Arrays.asList("nanjing", "beijing", "nantong", "haimen", "shangrao");
        List<String> names = new ArrayList<>();
        for (String name: list) {
            if (name.length() > 7) {
                names.add(name);
            }
        }
        System.out.println(names);
    }

    //Stream
    public static void filter2() {
        List<String> list = Arrays.asList("nanjing", "beijing", "nantong", "haimen", "shangrao");
        list.stream().filter(x -> x.length() > 7).forEach(System.out::println);
    }


}
