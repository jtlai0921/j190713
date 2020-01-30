package p16.a01;
//定義一個介面，實現加减乘除

interface Calculator1 {

    default int addThree(int first, int second, int Third) {
        return first + second + Third;
    }

    int add(int first, int second);

    int subtract(int first, int second);

    int divide(int first, int second);

    int multiply(int first, int second);
}

class BasicCalculator1 implements Calculator1 {

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
//加减乘除的工廠另外定義

class CalculatorFactory {

    public static Calculator1 getInstance() {
        return new BasicCalculator1();
    }
}

public class Test08 {

    public static void main(String[] args) {
        System.out.println(CalculatorFactory.getInstance().add(10, 20));
        System.out.println(CalculatorFactory.getInstance().addThree(10, 20, 30));
    }

}
