package p11;

import java.util.Scanner;

public class Test11 {

    public static void 多載() {
        OverDemo2 cyh = new OverDemo2();
        cyh.sayGoodbye();
        cyh.sayGoodbye(2);
        cyh.sayGoodbye("告辭了！", 2);

        byte b = 3;
        //傳入 byte 也可，會自動轉型為 int(放寬)
        cyh.sayGoodbye(b);
    }

    public static void 參數串1() {
        args1(1);
        args1(1, 2);
        args1(1, 2, 3);
    }

    public static void args1(int... a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n===========");
    }

    public static void 參數串4() {
        args4(5.5, 6.6, 1, 2, 3);
    }

    //注意==>不固定的參數串只能放最右邊 , 只能一個
    public static void args4(double a, double b, int... c) {
        System.out.println("\n===========標準");
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i : c) {
            System.out.print(i + " ");
        }
    }

    //最正確
    public static void args4(double... a) {
        System.out.println("\n===========參數串");
        for (double i : a) {
            System.out.print(i + " ");
        }
    }

    public static void 參數串6() {
        args6(true, 123, 456, 'a', 'b', 'c', 'd');
    }

    public static void args6(boolean a, int b, int c, char... d) {

    }

    public static void 參數串5() {
        int[] ar1 = {1, 3, 5};
        int[] ar2 = {2, 4, 6};
        args5(ar1, ar2);
    }

    public static void args5(int[] a, int[] b) { //標準==>優先選擇
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n===========");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println("\n===========");
    }

    public static void args5(int[]... a) { //參數串

        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("\n===========");
        }
    }

    public static void 包型類別1() {
        //數值變成字串
        String s1 = Integer.toString(123); //"123"
        String s2 = String.valueOf(123);

        //字串剖析成數值
        int i1 = Integer.parseInt("123");  //123     

        //數值包成物件
        Integer I1 = new Integer(123); //1.4
        Integer I2 = 123; //5.0版 以後 會自動包

        //物件拆解成數值
        int i2 = I1.intValue();  //1.4    
        int i3 = I1;  //5.0版 以後會 自動拆解

        //字串包成物件
        Integer I3 = new Integer("123"); //失去字串特性
        Integer I4 = Integer.valueOf("123"); //失去字串特性

        int i4 = I3;  //5.0 拆解 變 數字

    }

    public static void 指派1() {

        動物 ani = new 動物();
        狗 dog = new 狗();
        貓 cat = new 貓();
        植物 plant = new 植物();
        String s = "abc";

        ani = dog;        //子轉父 
        ani = cat;        //子轉父 

        dog = (狗) ani;  //父轉子 要轉型
        cat = (貓) ani;  //父轉子 要轉型

        //彼此之間沒有關係不能轉型
        //plant = (植物) ani;
        //s = (String) ani;
        //兄弟關係 不行
        //dog = (狗) cat;
        //cat = (貓) dog;
    }

    public static void 指派2() {
        動物 ani = new 動物(); //父
        動物 dog = new 狗(); //子1
        動物 cat = new 貓(); //子2
    }

    public static void 指派3() {
        動物 ani; //父
        ani = new 動物();
        ani = new 狗();
        ani = new 貓();
    }

    public static void 覆蓋() {
        Poly01P a = new Poly01P();
        a.習慣();
        Poly01C b = new Poly01C();
        b.習慣();
        Poly02C c = new Poly02C();
        c.習慣();
    }

    public static void 多型1() {
        Poly01P a = new Poly01P();
        a.習慣();
        Poly01P b = new Poly01C();
        b.習慣();
        Poly01P c = new Poly02C();
        c.習慣();
    }

    public static void 多型2() {
        Poly01P a;
        a = new Poly01P();
        a.習慣();
        a = new Poly01C();
        a.習慣();
        a = new Poly02C();
        a.習慣();
    }

    public static void 多型應用_動態繫結1() {
        Scanner scanner = new Scanner(System.in);
        int input;
        Poly01P r;
        while (true) {
            System.out.print("請問要 :  1.抽煙 2.吃檳榔 3.喝酒 4.其它. 離開 :");
            input = scanner.nextInt();

            if (input == 1) {
                r = new Poly01P();
            } else if (input == 2) {
                r = new Poly01C();
            } else if (input == 3) {
                r = new Poly02C();
            } else {
                break;
            }
            r.習慣();
            System.out.println();
        }
        System.out.println();
    }

    public static void 多型應用_動態繫結2() {
        Scanner scanner = new Scanner(System.in);
        int input;

        Traffic1 r;
        Car1 mycar = new Car1();
        Airplane1 myAirplane = new Airplane1();

        while (true) {
            System.out.print("請問要駕駛 : 1.車子 2.飛機 3.其它. 離開 :");
            input = scanner.nextInt();

            if (input == 1) {
                r = mycar;
            } else if (input == 2) {
                r = myAirplane;
            } else {
                break;
            }
            r.speedUp();
            System.out.println();
        }
        System.out.println();
    }

    public static void 多型應用3() {

        int[] theGrades = {46, 58, 52, 76, 49, 67, 74, 81};
        Grade stud = new Grade();
        stud.setGrades(theGrades);
        System.out.println("(原始)平均 = " + stud.average());

        stud = new Grade2();
        stud.setGrades(theGrades);
        System.out.println("(加分)平均 = " + stud.average());
    }

    public static void 多型注意1() {
        Poly01P a;
        //父自己------------------------------------------------
        System.out.println("Poly01P自己");
        a = new Poly01P();
        System.out.println("a.x=" + a.x);
        System.out.println("a.y=" + a.y);
        a.習慣();
        a.喜愛();
        a.畫線();
        //子自己------------------------------------------------
        System.out.println("Poly01C自己");
        Poly01C b = new Poly01C();
        System.out.println("b.x=" + b.x);
        System.out.println("b.y=" + b.y);
        b.習慣();
        b.喜愛();
        b.畫線();
        //多型----------------------------------------------
        System.out.println("多型子1-Poly01C");
        a = new Poly01C();
        System.out.println("a.x=" + a.x);
        System.out.println("a.y=" + a.y);
        a.習慣();
        a.喜愛();
        a.畫線();
        //多型---------------------------------------------
        System.out.println("多型子2-Poly02C");
        a = new Poly02C();
        System.out.println("a.x=" + a.x);
        System.out.println("a.y=" + a.y);
        a.習慣();
        a.喜愛();
        a.畫線();
    }

    public static void 多型注意2() {
        //子自己------------------------------------------------
        System.out.println("Poly01C自己");
        Poly01C b = new Poly01C();
        System.out.println("b.x=" + b.x);
        System.out.println("b.y=" + b.y);
        b.習慣();
        b.喜愛();
        b.畫線();
    }

    public static void 多型注意3() {
        //子自己------------------------------------------------
        System.out.println("Poly01C自己");
        Poly01C b = new Poly01C();
        System.out.println("b.x=" + ((Poly01P) b).x);
        System.out.println("b.y=" + ((Poly01P) b).y);
        ((Poly01P) b).習慣();
        ((Poly01P) b).喜愛();
        ((Poly01P) b).畫線();
    }

    /////////////////////////////////////////////////////////////////////////
    public static void 多型compiler_錯() {
        Poly01P a = new Poly01C();
        a.習慣();
        //a.討厭(); //Compiler 檢查時 父類別沒提供 討厭()
        ((Poly01C) a).討厭();
    }
/////////////////////////////////////////////////////////////////////////

    public static void 多型run不同型態轉換_當() {
        動物 ani = new 貓();
        狗 dog;
        dog = (狗) ani;
    }

    public static void 多型run不同型態轉換_Compiler錯() {
        動物 ani = new 貓();
        植物 plant;
        //plant = (植物) ani;
    }

    public static void 多型run向下轉型_當() {
        動物 ani = new 動物();
        狗 dog;
        dog = (狗) ani;
    }

    public static void 多型run向下轉型_ok() {
        動物 ani = new 狗();
        狗 dog;
        dog = (狗) ani;
    }

    public static void 多型run向上轉型_ok() {
        吉娃娃 minidog = new 吉娃娃();
        動物 ani = (狗) minidog;
    }

    public static void 主人與客人1() {
        OverDemo5 a = new OverDemo5(10);
        OverDemo5 b = new OverDemo5(20);
        System.out.println("a.x+b.x=" + (a.x + b.x));

        System.out.println("a.sum(b)=" + a.sum(b));
        System.out.println("b.sum(a)=" + b.sum(a));

        System.out.println("a.compareto(b)=" + a.compareto(b));
        System.out.println("b.compareto(a)=" + b.compareto(a));

        System.out.println("a.compare(a,b)=" + a.compare(a, b));
        System.out.println("b.compare(a,b)=" + b.compare(a, b));
    }

    public static void 主人與客人2() {
        OverDemo6 a = new OverDemo6(10);
        OverDemo6 b = new OverDemo6(10);
        // OverDemo6 b = null;
        Integer c = 10;

        System.out.println("a.sum(b)=" + a.sum(b));

        System.out.println("a.compareto(b)=" + a.compareto(b));
        System.out.println("a.equals(b)=" + a.equals(b));
         System.out.println("a.equals(c)=" + a.equals(c));
        System.out.println("a.compare(a,b)=" + a.compare(a, b));

    }
}
