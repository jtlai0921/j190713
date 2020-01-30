package p08;

class SuperSuper01 {

    public SuperSuper01() {
        super();
        System.out.println("我是阿公 SuperSuper01 ");
    }
}

public class Super01 extends SuperSuper01{

    public Super01() {
        super();
        System.out.println("我是父親 Super01 ");
    }

}

class Sub01 extends Super01 {

    public Sub01() {
        super();
        System.out.println("我是小孩 Sub01 ");
    }

}
