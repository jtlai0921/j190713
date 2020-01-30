package p10;

public class Test10 {

    public static void 實作介面() {
        Interface1 p = new Sub1();
        p.abc(); //"abc"
        System.out.println(p.xyz()); //123
        p.sub1(); //我是預設方法
        System.out.println(Interface1.fun1()); // 我是工廠函數
    }
     public static void 普通類別() {
      InterfaceDemo1P p=new InterfaceDemo1P();
    }

    public static void 抽象類別() {
     // InterfaceDemo2P p=new InterfaceDemo2P();
      InterfaceDemo2P p=new InterfaceDemo2C();
    }

    public static void 介面() {
    //  InterfaceDemo3P p=new InterfaceDemo3P();
       InterfaceDemo3P p=new InterfaceDemo3C();
    }
}
