package p16.a04;

@FunctionalInterface
interface Super02<F, T> {

    T convert(F from);
}

public class Test02 {

    public static void main(String[] args) {
        //匿名類別 從 String 轉成 Integer
        Super02<String, Integer> a = new Super02<String, Integer>() {
            public Integer convert(String from) {
                return Integer.valueOf(from);
            }
        };
        System.out.println(a.convert("123")); // @123@
        ///////////////////////////////////////////////////////////////////
        //Lambda 從 String 轉成 Integer
        Super02<String, Integer> b = from -> Integer.valueOf(from);
        System.out.println(b.convert("123")); // @123@  
        //3
        Super02<String, Integer> c = Integer::valueOf;
        System.out.println(c.convert("123")); // @123@  
    }

}
