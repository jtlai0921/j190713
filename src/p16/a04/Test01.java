package p16.a04;

@FunctionalInterface
interface Super01<T> {

    void accept(T t);
}

//Info類中的show方法實現了相同的功能
class Info<T> {

    public void show(T t) {
        if (t != null) {
            System.out.println(t);
        } else {
            System.out.println("t 為空");
        }
    }
}

public class Test01 {

    public static void main(String[] args) {
        //1
        Super01<String> a = new Super01<String>() {
            @Override
            public void accept(String t) {
                if (t != null) {
                    System.out.println(t);
                } else {
                    System.out.println("t 為空");
                }
            }
        };
        a.accept("abc");
        a.accept(null);
        //2
        Super01<String> b = t -> {
            if (t != null) {
                System.out.println(t);
            } else {
                System.out.println("t 為空");
            }
        };
        b.accept("abc");
        b.accept(null);
        ///
        Info<String> info = new Info<>();
        Super01<String> c = info::show;
        c.accept("abc");
        c.accept(null);

    }

}
