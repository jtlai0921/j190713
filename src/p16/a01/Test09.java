package p16.a01;
//定義一個介面，實現加减乘除

interface Calculator2 {

    static Calculator2 getInstance() {
        return new BasicCalculator2();
    }

    default int addThree(int first, int second, int Third) {
        return first + second + Third;
    }

    int add(int first, int second);

    int subtract(int first, int second);

    int divide(int first, int second);

    int multiply(int first, int second);
}

class BasicCalculator2 implements Calculator2 {

    @Override
    public int add(int first, int second) {
        return first + second;
    }

    @Override
    public int subtract(int first, int second) {
        return first - second;
    }

    @Override
    public int divide(int first, int second) {
        return first / second;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }
}

public class Test09 {

    public static void main(String[] args) {
        System.out.println(Calculator2.getInstance().add(10, 20));
        System.out.println(Calculator2.getInstance().addThree(10, 20, 30));
    }

}
