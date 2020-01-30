package p06;

public class New1 {

    public void 使用New2() {
        New2 a = new New2();
        a.x=123;
        a.y=123;
        a.s1();
        //a.s2();
        
    }

    public void 使用New3() {
       p06.pack2.New3 a = new p06.pack2.New3();
        a.x=123;
       // a.y=123;
       // a.s1();
       // a.s2();
    }
}
