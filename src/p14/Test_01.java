package p14;

public class Test_01 {

    public static void main(String[] args) {
        test01();
        test02();
        test03();
        
    }
    public static void test11() {
        A001 a;
        a = new A001<Double>();
        a.setx(123.5656);
        a.setx(null);
        double b = (Integer) a.getx();
    }
     public static void test10() {
        A001<? super Number> a;
       // a = new A001<Double>();
        //a.setx(123.5656);
        //a.setx(null);
       // double b = (Integer) a.getx();
    }
    public static void test09() {
        A001<? > a;
        a = new A001<Double>();
        //a.setx(123.5656);
        a.setx(null);
        double b = (Integer) a.getx();
    }
    public static void test08() {
        A001<? extends Number> a;
        a = new A001<Double>();
        //a.setx(123.5656);
        a.setx(null);
        double b = (Integer) a.getx();
    }
       public static void test07() {
        A001<? extends Number> a;
        a = new A001<Integer>();

        //a.setx(123);
        a.setx(null);
        Integer b = (Integer) a.getx();
    }
     public static void test06() {
        A001<Integer> a = new A001<>();
        a.setx(123);
        a.setx(null);
        Integer b = a.getx();
    }
      public static void test05() {
        B001<Integer> a = new B001<>();
        B001<Double> b = new B001<>();
       // B001<String> c = new B001<>();
    }

     public static void test03(){
        A001<String>a=new A001<>();
        a.setx("abc");
        String b=a.getx();
        System.err.println(b);
    
    }
      public static void test02(){
        A001<Double>a=new A001<>();
        a.setx(123.111);
        double b=a.getx();
        System.err.println(b);
    
    }
    public static void test01(){
        A001<Integer>a=new A001<>();
        a.setx(123);
        Integer b=a.getx();
        System.err.println(b);
    
    }

}
