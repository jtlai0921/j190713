package p05;

public class Static01 {

    public int x; //物 , 死
    public static int y; //類 ,活

    public void m1() { //物 , 死
        x = 123;
        y = 456;
        m3();
        m4();
    }

    public static void m2() { //類 , 活
        // x = 123;
        y = 456;
        // m3();
        m4();
        
        Static01 p=new Static01();
        p.x=123;
        p.m3();
        
    }

    public void m3() { //物 , 死
        x = 123;
        this.x = 123;
        y = 123;
        Static01.y = 123;
        m1();
        this.m1();
        m2();
        Static01.m2();
    }

    public static void m4() { //類 , 活
        // x = 123;
        //  this.x = 123;
        y = 123;
        Static01.y = 123;
        // m1();
        // this.m1();
        m2();
        Static01.m2();
    }
}
