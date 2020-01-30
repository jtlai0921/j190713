package p02;

import java.util.Scanner;
import javax.swing.JOptionPane;
import p01.Human1;

public class Test02 {

    public static void 變數宣告() {
        int a;
        int x, y, z;
        int r = 1;
        int e = 1, p = 2, w = 3;
    }

    public static void 變數命名() {
        int a123;
        int $123;
        int _123;
        int 金額;
        int tom;
        int Tom;

//        int 123;  
//        int #123;
//        int ~123;
//        int goto;
    }

    public static void 兩數交換() {
        int var1 = 100, var2 = 200, var3 = 300, var4 = 400;
        int tmp;

        System.out.println("交換前 var1 = " + var1 + "  var2 = " + var2);
        tmp = var1;
        var1 = var2;
        var2 = tmp;
        System.out.println("交換後 var1 = " + var1 + "  var2 = " + var2);

        System.out.println("交換前 var3 = " + var3 + "  var4 = " + var4);
        tmp = var3;
        var3 = var4;
        var4 = tmp;
        System.out.println("交換後 var3 = " + var3 + "  var4 = " + var4);
    }

    public static void 基本型態() {
        byte a1 = 127;
        short a2 = 32767;
        int a3 = 2147483647;
        //long a4 = 2147483648;
        long a5 = 2147483648L;
        float a6 = 123;
        float a7 = 123.45f;
        double a8 = 123.45;
        double a9 = 123.45D;
        char a10 = 'A';
        char a11 = 66;
        System.out.println(a11);
        // char a12 = 65535;
        // char a13 = -123;
        boolean a14 = false;
    }

    public static void 八個包裝類別() {

        int a1 = Integer.parseInt("123"); //123
        double a2 = Double.parseDouble("123.456"); //123.456

        String b1 = Integer.toString(123); //"123"
        String b2 = Double.toString(123.456); //"123.456"

        char c1 = Character.toUpperCase('a'); //'A'
        char c2 = Character.toLowerCase('A'); //'a'
    }

    public static void 字串類別() {
        String str1 = new String("abc");
        //或
        String str2 = "abc";
        str2.concat("xyz");
        System.out.println("str2=" + str2); //abc

        str2 = str2.concat("xyz");
        System.out.println("str2=" + str2); //abcxyz

        StringBuffer str3 = new StringBuffer("abc");
        str3.append("xyz");
        System.out.println("str3=" + str3); //abcxyz

        StringBuilder str4 = new StringBuilder("abc");
        str4.append("xyz");
        System.out.println("str4=" + str4); //abcxyz

    }

    public static void 其他類別_系統提供() {
        Scanner s = new Scanner("ab,cd").useDelimiter(",");
        System.out.println(s.next()); //ab
        System.out.println(s.next()); //cd
    }

    public static void 其他類別_使用者自訂() {
        Human1 人1 = new Human1();
        人1.名字 = "AAA";
        人1.身高 = 162;
        人1.體重 = 50;
        System.out.println("人1.名字=" + 人1.名字.toString());  //String
        System.out.println("人1.身高=" + 人1.身高); //int 
        System.out.println("人1=" + 人1.toString()); //Human1
    }

    public static void 列舉型別() {
        boolean x = true;
        System.out.println(x);

        ColorX color = ColorX.ORANGE;
        System.out.println(color);
    }

    public static void 變數分類二() {
        int x1 = 123;
        char x2 = 'a';
        String x3 = "abc";
        boolean x4 = true;
        ///
        int y1 = 123;
        y1 = 456;
        y1 = 789;
        ///
        final double PI = 3.14159;
        // PI=3.5;
        final int Y;
        Y = 123;
        //Y=456;
    }

    public static void 變數分類三() {
        int x1 = 123;
        char x2 = 'a';
        double x3 = 1.23;
        boolean x4 = true;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        //////
        int[] ar1 = new int[5];
        ar1[0] = 10;
        System.out.println(ar1);
        Integer a1 = new Integer(123);
        System.out.println(a1);
        Double a2 = new Double(123.45);
        System.out.println(a2);
        ////
        String b1 = "abc";
        StringBuffer b2 = new StringBuffer("abc");
        StringBuilder b3 = new StringBuilder("abc");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Human1 人1 = new Human1();
        人1.名字 = "AAA";
        人1.身高 = 162;
        人1.體重 = 50;
        System.out.println("人1.名字=" + 人1.名字.toString());  //String
        System.out.println("人1.身高=" + 人1.身高); //int 
        System.out.println("人1=" + 人1.toString()); //Human1
    }

    public static void 數字表示法() {
        int x = 0b0100_0110;
        int y = 0b01000110;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        int a = 070;
        int b = 0x100;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        double m = 123.45_678;
        double n = 123.45678;
        System.out.println("m=" + m);
        System.out.println("n=" + n);
    }

    public static void 底線限制() {
//        int a1 = _123;
//        int a2 = 123_;
//        double a3 = 123_.45;
//        double a4 = 123._45;
//        long a5 = 123_L;
//        long a6 = 123L_;
//        int a7 = 0_x123;
//        int a8 = 0x_123;
//        int a9 = _0x123;
        int a10 = 0_123;
    }

    public static void 修飾字() {
        long a1 = 2147483647;
        // long a2 = 2147483648;
        long a3 = 2147483648L;
        long a4 = 0L;
        float b1 = 123;
        float b2 = 1.23F;
        double c1 = 123.45;
        double c2 = 123.45d;

        float d1 = 10.0f;
        int d2 = 3;
        float d3 = d1 / d2;
        System.out.println("d3=" + d3);
    }

    public static void 基本轉基本_轉型() {
        int a1 = 123;
        long a2 = 2147483648L;
        int a3 = 123;  //2147483647
        long a4 = 2147483649L;
        a2 = a1;       //自然轉型
        a3 = (int) a4;  // 強迫轉型
        System.out.println(a3);
        //---------------------------------
        long b1 = 2147483648L;
        float b2 = 4.5f;
        long b3 = 2147483648L;
        float b4 = 4.5f;
        b2 = b1;        //自然轉型       
        b3 = (long) b4;//強迫轉型
        System.out.println(b3);// 得到 4 , 小數會被捨掉
        //----------------------------------
        byte c1 = 4;
        char c2 = 'A';
        byte c3 = 4;
        char c4 = 'A';
        c1 = (byte) c2;  //byte 與 char 要 互相轉型
        c4 = (char) c3;  //byte 與 char 要 互相轉型
        //----------------------------------        
        byte d1 = 127;   //特權
        short d2 = 5;  //特權
        short d9 = 123;  //特權
        char d3 = 6;   //特權
        //  short d4 = 123L; //沒特權
        //  short d5 = d2 + d9; //沒特權 ==>只要是整數全都當成 int==>是班長      
        //-----------------------------------
        int e1;
        e1 = (int) (4 + 5.5F + 6.8D);  //運算時會轉成型態裡面最大的那一個
    }

    public static void 參考轉參考_轉型() {
        VarDemo6 a = new VarDemo6();
        VarDemo6 b = new VarDemo6();
        a = b;
        ///////////
        VarDemo6 c1 = new VarDemo6();  //父
        VarDemo7 d1 = new VarDemo7();  //子
        c1 = d1;
        VarDemo6 c2 = new VarDemo6();  //父
        VarDemo7 d2 = new VarDemo7();  //子
        d2 = (VarDemo7) c2;
        ///////////////////////////////////////////        
        String s1 = "abc";
        String s2 = "xyz";
        StringBuffer s3 = new StringBuffer("abc");
        s1 = s2;
        // s1 = s3;  //不同型態 , 又沒有繼承關係    
        int[] ar1 = new int[5];
        int[][] ar2 = new int[2][3];
        // ar1 = ar2;  //一維對二維不行
        // ar2 = ar1;  //一維對二維不行
        ar1 = ar2[0];  //址
        ar1[0] = ar2[0][0];  //值
    }

    public static void 字串轉數字() {

        int a1 = Integer.parseInt("2100");  //String 轉成 int   
        double a2 = Double.parseDouble("88.8");  //String 轉成 double

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }

    public static void 數字轉字串() {
        String str1, str2, str3, str4;

        str1 = Integer.toString(1000); // int 轉成 String
        str2 = Character.toString('k'); // char 轉成 String
        str3 = Double.toString(199.77); // double 轉成 String
        str4 = Boolean.toString(false); // boolean 轉成 String

        str1 = String.valueOf(1000); // int 轉成 String
        str2 = String.valueOf('k');  // char 轉成 String
        str3 = String.valueOf(199.77); // double 轉成 String
        str4 = String.valueOf(false); // boolean 轉成 String
    }

    public static void Scanner1() {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.print("x=");
        x = s.nextInt();
        System.out.println("---->x=" + x);
    }

    public static void Scanner2() {
        Scanner s = new Scanner(System.in, "big5");
        String x;
        System.out.print("x=");
        x = s.next();
        System.out.println("---->x=" + x);
    }

    public static void 輸入框1() {

        String x;
        // x=JOptionPane.showInputDialog(null,"輸入x","我是表頭",JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, x + " 早安");
        Object[] possibleValues = {"First", "Second", "Third"};
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
    }
      public static void 輸入框2() {

        int x;
         x=Integer.parseInt(JOptionPane.showInputDialog(null,"輸入x","我是表頭",JOptionPane.WARNING_MESSAGE));
         JOptionPane.showMessageDialog(null, x + " 早安");
      }
}
