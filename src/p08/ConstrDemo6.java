package p08;

public class ConstrDemo6 {

    public int x = 1;
    public int y = 1;
    public static int z = 1;
    public final int a;
    public static final int b;

    public ConstrDemo6() {
        this(9, 9);
        //a = 888;
    }

    public ConstrDemo6(int x, int y) {
        this.x = x;
        this.y = y;
        a = 999;
    }

    static {
        z = 2;
        b=123;
    }

    {
        x = 2;
        y = 2;
    }

    public static void main(String[] args) {
        印1();
        new ConstrDemo6().印2();
    }

    {
        x = 3;
        y = 3;
    }

    static {
        z = 3;
         // b=456;
    }

    public static void 印1() {
        System.out.println("z=" + z);
    }

    public void 印2() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }

    static {
        z = 4;
    }

    {
        x = 4;
        y = 4;
    }

    public void abc() {
        //  a=777;
    }
}
