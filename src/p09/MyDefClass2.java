package p09;

public class MyDefClass2 extends Exception {

    public MyDefClass2() {
        //自動有 super();
    }

    public MyDefClass2(String msg) {
        super(msg);  //呼叫父類別的建構子
    }

    public String getMessage() {
        return "例外訊息:" + super.getMessage();
    }
}
