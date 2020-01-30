package p06;

public class Final1 {

    protected final void 習慣() {
        System.out.println("抽菸");
    }

    protected void abc() {
        System.out.println("abc");
    }
}

class Final2 extends Final1 {

//    @Override
//    protected void 習慣() {
//        System.out.println("喝酒");
//    }
    @Override
    protected void abc() {
        System.out.println("xyz");
    }
}

//////////////////////////////////////////////////////////////////////////
final class Final3 {

    protected final void 習慣() {
        System.out.println("抽菸");
    }

    protected void abc() {
        System.out.println("abc");
    }
}

//class Final4 extends Final3 {
//
//
//}
