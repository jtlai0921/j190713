package p09;

public class MyDefClass1 extends RuntimeException {

    public MyDefClass1() {
        //自動有 super();
    }

    public MyDefClass1(String msg) {
        super(msg);  //呼叫父類別的建構子
    }

    public String getMessage() {
        return "例外訊息:" + super.getMessage();
    }
}
