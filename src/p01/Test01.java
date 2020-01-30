package p01;

public class Test01 {

    public static void 呼叫程式() {
        sub1();

        int x = fun1();
        System.out.println("fun1---x=" + x);

        System.out.println("fun2---x=" + fun1());
    }

    public static void sub1() {
        int x = 123;
        System.out.println("sub---x=" + x);
    }

    public static int fun1() {
        int x = 123;
        return x;
    }

    /////////////////////////////////////////////////////////////////////
    public static void 參數傳遞() {
        int sum;
        int x = 123;
        int y = 456;
        int z = 789;

        sub2(x, y, z);

        sum = fun2(x, y, z);
        System.out.println("1. sum=" + sum);
        System.out.println("2. sum=" + fun2(x, y, z));
    }

    public static void sub2(int a, int b, int c) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
    }

    public static int fun2(int a, int b, int c) {
        return a + b + c;
    }

    ///////////////////////////////////////////////////////
    public static void 副程式的種類() {
        int x = 4;
        int y = 5;
        int sum;
        sumxy(x, y);
        sum = sumab(x, y);
        System.out.println("1. fun---sum=" + sum);
        System.out.println("2. fun---sum=" + sumab(x, y));
    }

    public static void sumxy(int x, int y) {
        int sum;
        sum = x + y;
        System.out.println("sub---sum=" + sum);
    }

    public static int sumab(int a, int b) {
        int sum;
        sum = a + b;
        return sum;
    }
    ///////////////////////////////////////////////////

    public static void 結構化程式1() {
        System.out.println("OOOaaaXXX");
        System.out.println("OOObbbXXX");
        System.out.println("OOOcccXXX");
    }

    ///////////////////////////////////////////////////////
    public static void 結構化程式2() {
        印字1();
        印字2();
        印字3();
    }

    public static void 印字1() {
        System.out.println("OOOaaaXXX");
    }

    public static void 印字2() {
        System.out.println("OOObbbXXX");
    }

    public static void 印字3() {
        System.out.println("OOOcccXXX");
    }
    ////////////////////////////////////////////////////////////////////////////

    public static void 結構化程式3() {
        印字("aaa");
        印字("bbb");
        印字("ccc");
    }

    public static void 結構化程式4() {
        String x = "aaa";
        String y = "bbb";
        String z = "ccc";
        印字(x);
        印字(y);
        印字(z);
    }

    public static void 印字(String x) {
        System.out.println("000" + x + "XXX");
    }

    ///////////////////////////////////////////////////////
    public static void 傳統程式() {
        int 長;
        int 寬;

        長 = 10;
        寬 = 5;

        長方形面積(長, 寬);
        長方形周長(長, 寬);
    }

    public static void 長方形面積(int 長, int 寬) {
        int 面積;
        面積 = 長 * 寬;
        System.out.println("面積=" + 面積);
    }

    public static void 長方形周長(int 長, int 寬) {
        int 周長;
        周長 = (長 + 寬) * 2;
        System.out.println("周長=" + 周長);
    }

    ///////////////////////////////////////////////////////////////
    public static void 物件導向程式1() {
        Rectangle1 長方形1 = new Rectangle1();
        長方形1.長 = 10;
        長方形1.寬 = 5;
        長方形1.長方形面積();
        長方形1.長方形周長();

        System.out.println();

        Rectangle1 長方形2 = new Rectangle1();
        長方形2.長 = 20;
        長方形2.寬 = 10;
        長方形2.長方形面積();
        長方形2.長方形周長();
    }

    public static void 物件導向程式2() {
        Rectangle2 長方形1 = new Rectangle2();
        //  長方形1.長 = 10;
        //  長方形1.寬 = 5;
        長方形1.set長寬(10, 5);
        長方形1.長方形面積();
        長方形1.長方形周長();

        System.out.println();

        Rectangle2 長方形2 = new Rectangle2();
        //長方形2.長 = 20;
        //長方形2.寬 = 10;
        長方形2.set長寬(20, 10);
        長方形2.長方形面積();
        長方形2.長方形周長();
    }

    public static void 由類別產生物件1() {
        Human1 人1 = new Human1();
        人1.名字 = "AAA";
        人1.身高 = 162;
        人1.體重 = 50;
        System.out.println("人1.名字" + 人1.名字);
        System.out.println("人1.身高" + 人1.身高);
        System.out.println("人1.體重" + 人1.體重);
        人1.吃(10);
        人1.跑(5);

        Human1 人2 = new Human1();
        人2.名字 = "BBB";
        人2.身高 = 170;
        人2.體重 = 60;
        System.out.println("人2.名字" + 人2.名字);
        System.out.println("人2.身高" + 人2.身高);
        System.out.println("人2.體重" + 人2.體重);

        人2.吃(10);
        人2.跑(5);
    }

    public static void 由類別產生物件2() {
        Human2 人1 = new Human2();
        人1.setdata("AAA", 162, 50);
        人1.getdata();
        人1.吃(10);
        人1.跑(5);

        Human2 人2 = new Human2();
        人2.setdata("BBB", 170, 60);
        人2.getdata();
        人2.吃(10);
        人2.跑(5);        
    }            
}
  