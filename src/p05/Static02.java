package p05;

public class Static02 {

    public int a; //物 , 死
    public static int b; //類 ,活

    public void n1() { //物 , 死
        //用自己        
        a = 123;
        b = 456;
        n3();
        n4();
        //用Static01
        Static01.y = 123;
        Static01.m4();
        Static01 q = new Static01();
        q.x = 123;
        q.m3();
    }

    public static void n2() { //類 , 活
        //用自己   
        // a = 123;
        b = 456;
        // n3();
        n4();

        Static02 p = new Static02();
        p.a = 123;
        p.n3();
        //用Static01
        Static01.y = 123;
        Static01.m4();
        Static01 q = new Static01();
        q.x = 123;
        q.m3();

    }

    public void n3() { //物 , 死

    }

    public static void n4() { //類 , 活

    }
}
