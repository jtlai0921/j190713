package p08;

public class Super02 {

    public int var1;

    public Super02() {
        super();
        System.out.println("我是父親 Super02");
    }

    public Super02(int var1) {
        super();
        this.var1 = var1;
        System.out.println("我是父親 Super02(int) ");
    }

}

class Sub02 extends Super02 {

    public int var2;

    public Sub02() {      
        super();
        System.out.println("我是小孩 Sub02 ");
    }

    public Sub02(int var2) { 
        super(999);
        this.var2 = var2;
        System.out.println("我是父親 Sub02(int) ");
    }
}
