package p01;

public class Human2 {

    private String 名字;
    private int 身高;
    private int 體重;

    public void 吃(int x) {
        System.out.println("吃 " + x + "碗飯");
    }

    public void 跑(int x) {
        System.out.println("跑 " + x + "公里");
    }
    
    public void setdata(String n,int h,int w){
        名字=n;
        身高=h;
        體重=w;
    }
    public void getdata(){
        System.out.println("名字" + 名字);
        System.out.println("身高" + 身高);
        System.out.println("體重" + 體重);
    }
    
}
