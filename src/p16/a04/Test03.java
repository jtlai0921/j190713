package p16.a04;

interface Super03<T1, T2> {

    boolean test(T1 x, T2 y);
}

public class Test03 {

    public static void main(String[] args) {
        //1.
        Super03<String, String> a = new Super03<String, String>() {
            @Override
            public boolean test(String x, String y) {
                return x.equals(y);
            }
        };
        System.out.println(a.test("abc", "abc"));
        //2.
        Super03<String, String> b = (x, y) -> x.equals(y);
        System.out.println(b.test("abc", "abc"));
        //3.
        Super03<String, String> c = String::equals;
        System.out.println(c.test("abc", "abc"));

    }

}
