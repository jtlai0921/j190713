package p11;

public abstract class OverDemo3P {

    public int x;
    private int y;  //子類別看不到

    void abc(int x, float y) {
    }

    final void xyz() {//子類別無法覆蓋
    }

    public static int m1() {//子類別也要 static
        return 1;
    }

    public abstract void m2();

    protected void m3(float z) {

    }

    private void m4(int x) {//子類別看不到
    }

    private final void m5() {//子類別看不到

    }
}

class OverDemo3C extends OverDemo3P {

    public double x;
    private int y;

    @Override
    protected void abc(int x, float y) {

    }
//    final void xyz() {
//    }

    public static int m1() {//子類別也要 static
        return 1;
    }

    public void m2() {

    }

    protected final void m3(float z) {

    }

    private void m4(int x) {
    }

    private final void m5() {//子類別看不到

    }
}
