package p16.a08;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test03 {

   public static void BiFunction2() {
        BiFunction<String, String, String> a = (t1, t2) -> t1 + "===" + t2;
        //調用者是 a , 參數是 b
        //先執行調用者 a 再執行參數 b
        //andThen表示將在apply方法後面執行
        Function<String, String> b = t -> t + " c";
        System.out.println(a.andThen(b).apply("a ", " b")); //a===b c
    }
}
