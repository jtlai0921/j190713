package p05;

import sun.net.www.content.audio.x_aiff;

public class Static03 extends Static01 {

    public int a; //物 , 死
    public static int b; //類 ,活

    public void n1() { //物 , 死
        //用自己
        a = 123;
        b = 456;
        n3();
        n4();
        //用Static01父
        x = 123;
        super.x = 123;
        
        Static01.y = 456;
        Static03.y = 456;
        y = 456;
        
        super.m3();
        m4();
    }

    public static void n2() { //類 , 活
        //用自己
        // a = 123;
        b = 456;
        // n3();
        n4();

        Static03 p = new Static03();
        p.a = 123;
        p.n3();
        //用Static01父
        // x=123;
        y = 456;
        // m3();
        m4();
        p.x = 123;
        p.m3();
    }

    public void n3() { //物 , 死

    }

    public static void n4() { //類 , 活

    }
}
