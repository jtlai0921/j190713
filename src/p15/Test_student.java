package p15;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test_student {

    public static void main(String[] args) {
        //test01();
        // test02();
        //test03();
        //test04();
        //  test05();
        //test06();
        //test07();
        //test08();
        // test09();
        // test10();
        //test11();
        test19();
    }

    public static void test19() {

        Comparator<String> p = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        List<String> list = Arrays.asList("bbb", "ccc", "xxx", "eee");
        Collections.sort(list, null);
        System.out.println(list);

        Collections.sort(list, p);
        System.out.println(list);
    }

    public static void test18() {

        Comparator<String> p = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        String[] ar1 = {"bbb", "aaa", "xxx", "ccc"};

        Arrays.sort(ar1);
        for (String o : ar1) {
            System.out.print(o + " ");
        }
        System.out.println();

//        Arrays.sort(ar1, p);
//        for (String o : ar1) {
//            System.out.print(o + " ");
//        }
//        System.out.println();
        Arrays.sort(ar1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for (String o : ar1) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void test17() {
        List<String> a = new LinkedList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("dddd");
        //1
        System.out.println(a);

        //2
        for (String o : a) {
            System.out.println(o);
        }
        //3
        for (Object o : a.toArray()) {
            System.out.println(o);
        }
    }

    public static void test16() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Set entryset = a.entrySet();
        Iterator it = entryset.iterator();

        while (it.hasNext()) {
            Map.Entry o = (Map.Entry) it.next();
            System.out.println(o.getKey() + " " + o.getValue());
        }
        System.out.println();

    }

    public static void test15() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Collection value = a.values();
        Iterator it = value.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    public static void test14() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);

        Set set = a.keySet();

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

    }

    public static void test13() {
        List<String> a = new LinkedList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);

        Iterator it = a.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void test12() {
        Map<String, String> a = new LinkedHashMap<>();
        a.putIfAbsent("bbbb", "A1");
        a.putIfAbsent("aaaa", "A2");
        a.putIfAbsent("cccc", "A3");
        a.putIfAbsent("cccc", "A4");
        a.putIfAbsent("cccc", "A5");
        a.putIfAbsent("dddd", "A6");
        System.out.println(a);
    }

    public static void test11() {
        Map<String, String> a = new LinkedHashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test10() {
        Map<String, String> a = new TreeMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test09() {
        Map<String, String> a = new HashMap<>();
        a.put("bbbb", "A1");
        a.put("aaaa", "A2");
        a.put("cccc", "A3");
        a.put("cccc", "A4");
        a.put("cccc", "A5");
        a.put("dddd", "A6");
        System.out.println(a);
    }

    public static void test08() {
        Set<String> a = new LinkedHashSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test07() {
        Set<String> a = new TreeSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test06() {
        Set<String> a = new HashSet<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("cccc");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

    public static void test05() {
        Queue<String> a = new LinkedList<>();
        a.offer("3.cccc");
        a.offer("4.dddd");
        a.offer("1.bbbb");
        a.offer("2.aaaa");

        System.out.println(a);

        while (a.peek() != null) {
            System.out.println(a.poll());
        }
    }

    public static void test04() {
        Queue<String> a = new PriorityQueue<>();
        a.offer("3.cccc");
        a.offer("4.dddd");
        a.offer("1.bbbb");
        a.offer("2.aaaa");

        System.out.println(a);

        while (a.peek() != null) {
            System.out.println(a.poll());
        }
    }

    public static void test03() {
        Stack<String> a = new Stack<>();
        a.push("1.bbbb");
        a.push("2.aaaa");
        a.push("3.cccc");
        a.push("4.dddd");

        //  System.out.println(a);
        while (!a.isEmpty()) {
            System.out.println(a.pop());
        }
    }

    public static void test02() {
        List<String> a = new ArrayList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add(2, "xxxx");
        a.add("cccc");
        // a.add(6, "xxxx");
        a.remove(3);
        a.add("dddd");
        a.add("bbbb");
        a.remove("bbbb");
        System.out.println(a);
    }

    public static void test01() {
        List<String> a = new LinkedList<>();
        a.add("bbbb");
        a.add("aaaa");
        a.add("cccc");
        a.add("dddd");
        System.out.println(a);
    }

}
