package p08;

public class ConstrDemo5 {

    public int x = 1;
    public int y = 1;
    public static int z = 1;

    public ConstrDemo5() {
        x = 9;
        y = 9;
    }

    public ConstrDemo5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static {
        z = 2;
    }

    {
        x = 2;
        y = 2;
    }

    public static void main(String[] args) {
        印1();
        new ConstrDemo5().印2();
    }

    {
        x = 3;
        y = 3;
    }

    static {
        z = 3;
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
}
