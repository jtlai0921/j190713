package p05;

public abstract class Father4 {

    public void 麵店() {
        System.out.println("牛肉麵");
    }

    public abstract void 自助餐();
}
///////////////////////////////////

interface Mother4 {

    void 咖啡廳();

    void 超市();
}

interface Friend4 {

    void 美容院();

}

class Son4 extends Father4 implements Mother4, Friend4 {

    public void 飲料店() {
        System.out.println("紅茶");
    }

    @Override
    public void 麵店() {
        System.out.println("義大利麵");
    }

    @Override
    public void 自助餐() {
        System.out.println("自助餐");
    }

    @Override
    public void 咖啡廳() {

    }

    @Override
    public void 超市() {

    }

    @Override
    public void 美容院() {

    }

}
