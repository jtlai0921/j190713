package p16.a02;

public class Test02 {

    public static void main(String[] args) {
//        Runnable a = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 10; i += 2) {
//                    System.out.print(i + " ");
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        };
//        new Thread(a).start();
//        Runnable b = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 2; i <= 10; i += 2) {
//                    System.out.print(i + " ");
//
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        };
//        new Thread(b).start();

        Runnable c = () -> {
            for (int i = 1; i <= 10; i += 2) {
                System.out.print(i + " ");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            };
        };
        new Thread(c).start();
        
        Runnable d = () -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.print(i + " ");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            };
        };
        new Thread(d).start();
    }

}
