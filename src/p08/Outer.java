package p08;

public class Outer {

    public static void main(String[] args) {
        new Outer().abc();
    }

    public void abc() {

        Super p = new Super() {
            public int x;
            public int y;

            {

                x = 99;
                y = 99;
            }

            public void show() {
                System.out.println("x=" + x);
                System.out.println("y=" + y);
            }

        };
        p.show();

    }

    class Inner extends Super {//子類別

        public int x;
        public int y;

        public Inner() {

            x = 88;
            y = 88;
        }

        public void show() {
            System.out.println("x=" + x);
            System.out.println("y=" + y);
        }
    }

}

//////////////////////////////////////////////
abstract class Super { //父類別

    public abstract void show();
}

class Inner extends Super {//子類別

    public int x;
    public int y;

    public Inner() {

        x = 10;
        y = 20;
    }

    public void show() {
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
