package p05;

import java.util.Date;
import p05.pack1.Import1;
//import static  p05.pack1.Import4.x;
//import static p05.pack1.Import4.s1;
import static p05.pack1.Import4.*;

public class Test05 {

    public static void 接力賽() {
        Run 爸1 = new Run();
        爸1.跑("爸爸1", 10);
        Run 哥1 = new Run();
        哥1.跑("哥哥1", 20);
        Run 弟1 = new Run();
        弟1.跑("弟弟1", 30);

        Run.清除總公里數();
        System.out.println("=========================");

        Run 爸2 = new Run();
        爸2.跑("爸爸2", 30);
        Run 哥2 = new Run();
        哥2.跑("哥哥2", 40);
        Run 弟2 = new Run();
        弟2.跑("弟弟2", 90);

        Run.清除總公里數();
    }

    public static void import的用法() {
        //1.
        Import1 a = new Import1();
        a.x = 123;
        a.s1();
        //2
        p05.pack1.Import2 b = new p05.pack1.Import2();
        b.x = 123;
        b.s1();
        p05.pack2.Import2 c = new p05.pack2.Import2();
        c.x = 123;
        c.s1();
        //複
        p05.pack1.Import3.x = 123;
        p05.pack1.Import3.s1();
        //3.
        x = 123;
        s1();
    }

    public static void 連接資料庫_程式設計師1() {
        p05.pack3.Conn1 a;
        a = new p05.pack3.MsSQL();
        a.conn();
        //
        a = new p05.pack3.Oracle();
        a.conn();
        //
        a = new p05.pack3.MySql();
        a.conn();
        //////////////////////////
        p05.pack3.Conn1 b = new p05.pack3.MsSQL();
        b.conn();
        p05.pack3.Conn1 c = new p05.pack3.Oracle();
        c.conn();
        p05.pack3.Conn1 d = new p05.pack3.MySql();
        d.conn();
    }

    public static void 連接資料庫_程式設計師2() {
        p05.pack4.Conn2 a;
        a = new p05.pack4.MsSQL();
        a.conn();
        //
        a = new p05.pack4.Oracle();
        a.conn();
        //
        a = new p05.pack4.MySql();
        a.conn();
        //////////////////////////
        p05.pack4.Conn2 b = new p05.pack4.MsSQL();
        b.conn();
        p05.pack4.Conn2 c = new p05.pack4.Oracle();
        c.conn();
        p05.pack4.Conn2 d = new p05.pack4.MySql();
        d.conn();
    }

    public static void 類別之間的關係() {
        Son2 p = new Son2();
        p.麵店();
    }

    public static void 由類別產生物件1() {
        Person1 人1 = new Person1();
        人1.名字 = "AAA";
        人1.身高 = 160;
        人1.體重 = 50;
        Person1.人數++;
        人1.秀名字身高體重人數();
        Person1.我愛你();
        System.out.println(人1 instanceof Person1);
        System.out.println(人1.getClass().getName());
        /////
        Person1 人2 = new Person1();
        人2.名字 = "BBB";
        人2.身高 = 170;
        人2.體重 = 60;
        Person1.人數++;
        人2.秀名字身高體重人數();
        Person1.我愛你();
        System.out.println(人2 instanceof Person1);
        System.out.println(人2.getClass().getName());
    }

    public static void 由類別產生物件2() {
        Person2 人1 = new Person2("AAA", 162, 50);
        人1.秀名字身高體重人數();
        Person2.我愛你();
        System.out.println(人1 instanceof Person2);
        System.out.println(人1.getClass().getName());
        /////
        Person2 人2 = new Person2("BBB", 170, 80);
        人2.秀名字身高體重人數();
        Person2.我愛你();
        System.out.println(人2 instanceof Person2);
        System.out.println(人2.getClass().getName());
        /////
        Person2 人3 = new Person2();
        人3.秀名字身高體重人數();
        Person2.我愛你();
        System.out.println(人2 instanceof Person2);
        System.out.println(人2.getClass().getName());
    }

    public static void 由類別產生物件4() {
        Person4 人1 = new Person4();
        人1.名字 = "AAA";
        人1.身高 = 160;
        人1.體重 = 50;
        人1.頭.眼睛 = "很藍";
        人1.頭.鼻子 = "很挺";
        人1.頭.嘴巴 = "很大";
        // 人1.秀名字身高體重人數();

        System.out.println(人1);

        Person4.說.我愛你();
        Person4.說.我恨你();

    }

    public static void 物件的內容() {

        Person2 人1 = new Person2("賴玉珊", 162, 50);   //自訂類別     
        int[] ar1 = new int[5]; //陣列

        StringBuffer str1 = new StringBuffer("abc");  //StringBuffer
        StringBuilder str2 = new StringBuilder("xyz"); //StringBuilder
        Integer num1 = new Integer(123);  //八個包裝類別
        Double num2 = new Double(456.78);
        Date d1 = new Date(); //日期
        System.out.println("人1=" + 人1);
        System.out.println("ar1=" + ar1);
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        System.out.println("d1=" + d1);
    }

    public static void 繼承1() {
        Plane 飛機1 = new Plane();
        飛機1.起飛();

        Airplane 客機1 = new Airplane();
        客機1.起飛();

        Aircraft 太空船1 = new Aircraft();
        太空船1.超光速飛行();
        太空船1.起飛();
    }

    public static void 繼承2() {
        Plane 飛機1 = new Plane();
        飛機1.起飛();

        Plane 客機1 = new Airplane();
        客機1.起飛();

        Plane 太空船1 = new Aircraft();
        // 太空船1.超光速飛行();
        太空船1.起飛();
    }

    public static void 繼承3() {
        Plane 飛機1;

        飛機1 = new Plane();
        飛機1.起飛();

        飛機1 = new Airplane();
        飛機1.起飛();

        飛機1 = new Aircraft();
        飛機1.起飛();
    }

    public static void 繼承4() {
        Plane[] 飛機 = {new Plane(), new Airplane(), new Aircraft()};

        for (Plane x : 飛機) {
            x.起飛();
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    public static void instance的關係1() {
        //Animal1 是父類別 , Dog1 是子類別
        Dog5 p = new Dog5();
        System.out.println("p instanceof Dog5 =" + (p instanceof Dog5));  //兒子 - true
        System.out.println("p instanceof Animal5 =" + (p instanceof Animal5));  //父親 - true        
       // System.out.println("p instanceof Cat5 =" + (p instanceof Cat5)); //沒有任何關係 , 所以錯誤
    }

    public static void instance的關係2() {
        //Animal1 是父類別 , Dog1 是子類別
        Dog5 p = new Dog5();
        呼叫instance的關係(p);
    }

    //Compiler 時 會認為 p 是 Object 的型態 與 Cat5 有繼承關係
    //run 時才會挖出 p 真正的內容是 Dog5     
    public static void 呼叫instance的關係(Object p) {
        System.out.println("p instanceof Dog5 =" + (p instanceof Dog5));  //兒子 - true
        System.out.println("p instanceof Animal5 =" + (p instanceof Animal5));  //父親 - true        
        System.out.println("p instanceof Cat5 =" + (p instanceof Cat5)); //不相關 -false
    }
}
