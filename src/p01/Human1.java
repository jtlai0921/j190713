package p01;

public class Human1 {

    public String 名字;
    public int 身高;
    public int 體重;

    public void 吃(int x) {
        System.out.println("吃 " + x + "碗飯");
        System.out.println("");
    }

    public void 跑(int x) {
        System.out.println("跑 " + x + "公里");
    }
   // @Override
//     public String toString() {
//        return 名字 + " " + 身高 + " " + 體重;
//    }
}
