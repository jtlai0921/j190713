package p08;

public class Super03 {
    
    public int var1;
    
    public Super03() {
        this(123);
        
    }
    
    public Super03(int var1) {
        super();
        this.var1 = var1;
        System.out.println("我是父親 Super03(int) ");
    }
    
}

class Sub03 extends Super03 {
    
    public int var2;
    
    public Sub03() {
        this(999);
    }
    
    public Sub03(int var2) {
        super(999);
        this.var2 = var2;
        System.out.println("我是父親 Sub03(int) ");
    }
}
