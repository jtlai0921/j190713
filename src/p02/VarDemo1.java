package p02;

import p01.Human1;

public class VarDemo1 {

    public Human1 p1 = new Human1();
    public int[] a1 = new int[5];
    public String s1 = new String("abc");
    public int x1;
    public double y1;
    public final int z1 = 123;
    // z1=10 ; //全域的常數 , 要馬上設定初始值

    public void s1(int p) {

        Human1 p2 = new Human1();
        int[] a2 = new int[5];
        String s2 = new String("abc");
        int x2;
        double y2;
        final int z2;
        z2 = 10;
        if (z2 > 123) {
            Human1 p3 = new Human1();
            int[] a3 = new int[5];
            String s3 = new String("abc");
            int x3;
            double y3;
            final int z3;
            z3 = 10;
            // System.out.println("x3=" + x3); 
            System.out.println(a1[0]); //0
            System.out.println(a2[0]); //0 
            System.out.println(a3[0]); //0
        }
        System.out.println("x1=" + x1); //0
        // System.out.println("x2=" + x2); 
        //  System.out.println("x3=" + x3); 
    }
}
