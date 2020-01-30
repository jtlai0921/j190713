package p16.a02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {

    public static void main(String[] args) {
        Comparator<String> p = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        List<String> list = Arrays.asList("bbb", "ccc", "xxx", "eee");
        Collections.sort(list, null);
        System.out.println(list);

//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(list);
    }

}
