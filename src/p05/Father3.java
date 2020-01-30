package p05;

public abstract class Father3 {

    public void 麵店() {
        System.out.println("牛肉麵");
    }

    public abstract void 自助餐();
}
///////////////////////////////////

class Mother3 {

    public void 咖啡廳() {

    }

    public void 超市() {

    }
}

class Friend3 {

    public void 美容院() {
    }
}

class Son3 extends Father3 {

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
}
