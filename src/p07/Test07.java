package p07;

public class Test07 {

    public static void 加1_傳值() {
        int x = 4;
        int y = 5;
        System.out.println("before x=" + x + " y=" + y);
        傳值(x, y);
        System.out.println("after x=" + x + " y=" + y);
        
    }

    public static void 傳值(int x, int y) {
        x = x + 1;
        y = y + 1;
    }

    ///////////////////////////////////////////
    public static void 加1_傳址() {
        TwoNum a = new TwoNum();
        a.x = 4;
        a.y = 5;
        System.out.println("before p.x=" + a.x + " p.y=" + a.y);
        傳址(a);
        System.out.println("after p.x=" + a.x + " p.y=" + a.y);
    }

    public static void 傳址(TwoNum a) {
        a.x = a.x + 1;
        a.y = a.y + 1;
    }
    ///////////////////////////////////////////////////////////////////////////////

    public static void 傳址_變數() {
        TwoNum a = new TwoNum();  //a.x  a.y
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y);  //4 ,5

        TwoNum b;
        b = a;
        //  b = new TwoNum();
        System.out.println("b.x=" + b.x + " b.y=" + b.y);  //4 ,5
    }

/////////////////////////////////////////////////////////////////////////////
    public static void 傳址_參數() {
        TwoNum a = new TwoNum();
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y); //4,5
        接收址(a);
    }

    public static void 接收址(TwoNum b) {
        b = new TwoNum();
        System.out.println("b.x=" + b.x + " b.y=" + b.y); //4,5
    }

/////////////////////////////////////////////////////////////////////////////
    public static void 傳址_不同的變數() {
        TwoNum a = new TwoNum();  //a.x  a.y
        a.x = 4;
        a.y = 5;
        System.out.println("a.x=" + a.x + " a.y=" + a.y);  //4 ,5

        TwoNum b;
        b = a;

        b.x = 10;
        b.y = 20;
        System.out.println("a.x=" + a.x + " a.y=" + a.y); //10,20
    }

    public static void 傳址_多型1() {

        Dog7 狗 = new Dog7();
        Cat7 貓 = new Cat7();
        Bird7 鳥 = new Bird7();
        接收址1(狗);
        接收址1(貓);
        接收址1(鳥);
    }

    public static void 接收址1(Dog7 a) {
        a.叫();
    }

    public static void 接收址1(Cat7 a) {
        a.叫();
    }

    public static void 接收址1(Bird7 a) {
        a.叫();
    }

////////////////////////////////////////////////////////////////
    public static void 傳址_多型2() {
        Call7 狗 = new Dog7();
        Call7 貓 = new Cat7();
        Call7 鳥 = new Bird7();
        接收址2(狗);
        接收址2(貓);
        接收址2(鳥);
    }

    public static void 接收址2(Call7 a) {
        a.叫();
    }
///////////////////////////////////////////////////////////////

    public static void 回傳1() {
        //回傳 值
        int sum;
        int x = 4;
        int y = 5;
        sum = 回傳1_值(x, y);
        System.out.println("sum=" + sum);
        //回傳 址
        TwoNum a = null;
        a = 回傳1_址();
        System.out.println("a.x=" + a.x + " a.y=" + a.y);
    }

    public static int 回傳1_值(int x, int y) {
        return x + y;
    }

    public static TwoNum 回傳1_址() {
        TwoNum a = new TwoNum();
        a.x = 10;
        a.y = 20;
        return a;
    }

    public static void 工廠函數() {
        //1
        A001 a = new A001();
        //2
        A001 b = A001.getA001Instance();
        //3
        A001 c = ClassManager.getA001Instance();
        //4
        ClassManager p = new ClassManager();
        A001 d = p.createA001Instance();
        //5
        A001 e = new ClassManager().createA001Instance();
    }

    public static void 回傳2_址() {
        Call7 ani;
        ani = GetCall7.getDog7Instance();
        ani.叫();
        ani = GetCall7.getCat7Instance();
        ani.叫();
        ani = GetCall7.getBird7Instance();
        ani.叫();
    }
    ///////////////////////////////////////////////////////////////////////////////
    public static void 傳陣列_一維() {
        int[] ar1 = {1, 2, 3, 4, 5};
        接收陣列_一維(ar1);
        for (int x : ar1) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void 接收陣列_一維(int[] ar1) {
        for (int i = 0; i < ar1.length; i++) {
            ar1[i]++;
        }
    }
 public static void 接收陣列_一維() {
        int[] ar1;
        ar1 = 回傳陣列_一維();
        for (int x : ar1) {
            System.out.print(x + " ");
        }
    }

    public static int[] 回傳陣列_一維() {
        int[] ar1 = {1, 2, 3, 4, 5};
        return ar1;
    }
    public static void 傳字串1() {
        StringBuilder str = new StringBuilder("abc");
        System.out.println("呼叫前 str=" + str);
        接收字串1(str);
        System.out.println("呼叫後 str=" + str);
    }

    public static void 接收字串1(StringBuilder str) {
        str.append("xyz");
    }

    public static void 傳字串2() {
        String str = "a";
        接收字串2(str);
        str = "null";
        接收字串2(str);
        str = "A";
        接收字串2(str);
        str = null;
        接收字串2(str);
    }

    public static void 接收字串2(String str) {
        switch (str) {
            case "a":
                System.out.println("a");
                break;
            case "null":
                System.out.println("null");
                break;
            case "A":
                System.out.println("A");
            default:
                System.out.println("other");
        }
    }
}
