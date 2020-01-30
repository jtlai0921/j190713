package p13;

public class MyThread extends Thread {

    @Override

    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在執行。。。");
    }
}

