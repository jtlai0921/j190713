package p03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import p02.ColorX;

public class Test03 {

    public static void 算數1() {
        int x = 10;
        int y = 3;
        double z;
        z = (double) x / y;
        System.out.println("z=" + z);
    }

    public static void 輸入() {
        Scanner s = new Scanner(System.in);
        int x, y, z;

        System.out.print("x=");
        x = s.nextInt();
        System.out.print("y=");
        y = s.nextInt();
        System.out.print("z=");
        z = s.nextInt();

        System.out.println("---->x=" + x);
        System.out.println("---->y=" + y);
        System.out.println("---->z=" + z);
    }

    public static void 換錢1() {
        Scanner s = new Scanner(System.in);
        int money;
        int totoal;
        int spend;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

        System.out.print("totoal=");
        totoal = s.nextInt();
        System.out.print("spend=");
        spend = s.nextInt();

        money = totoal - spend;

        m100 = money / 100;
        m50 = (money % 100) / 50;
        m10 = (money % 50) / 10;
        m5 = (money % 10) / 5;
        m1 = (money % 5) / 1;

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 算術指派1() {
        short x = 123;
        int y = 456;
        // x = (short)(x + y);
        x += y;
    }

    public static void 算術指派2() {
        int sum = 0;
        sum = sum + 10;
        sum = sum + 20;
        sum = sum + 30;
        sum = sum + 40;
        System.out.println("sum=" + sum);
    }

    public static void 算術指派3() {
        int sum = 0;
        sum += 10;
        sum += 20;
        sum += 30;
        sum += 40;
        System.out.println("sum=" + sum);
    }

    public static void 遞增遞減運算子5() {

        char[] str = {'a', 'b', 'c', 'd', 'e', 'f'};
        int length;
        length = str.length;
        int i = 0, j = length;

        do {
            // System.out.print(str[i++] + " ");
            System.out.print(str[i] + " ");
            i = i + 1;

        } while (i < length);

        System.out.println("\n================");

        do {
            // System.out.print(str[--j] + " ");
            j = j - 1;
            System.out.print(str[j] + " ");

        } while (j > 0);

        System.out.println("\n================");
    }

    public static void 比較1() {
        int a = 123;
        int b = 456;
        System.out.println(a != b);
    }

    public static void 比較2() {
        if (!true) {
            System.out.println("條件成立");
        } else {
            System.out.println("條件不成立");
        }
    }

    public static void 比較3() {
        int i = 1;
        while (true) {
            System.out.println("條件成立" + i);
            i = i + 1;
        }
    }

    public static void 邏輯1() {
        System.out.println(true && true && true && false);
        System.out.println(false || false || false || true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(!true);
    }

    public static void 邏輯2() {
        int grade = 95;
        if (grade >= 90 && grade <= 100) {
            System.out.println("優");
        }
    }

    public static void 位元() {
        System.out.println(12 & 38);
        System.out.println(12 | 38);
        System.out.println(12 ^ 38);
        System.out.println(12 << 2);
        System.out.println(12 >> 2);
        System.out.println(~12);
    }

    public static void 三元運算子() {

        int a = 10, b = 20, c;

        c = a > b ? 100 : 200;
        System.out.println("c=" + c);
    }

    public static void 流程1() {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        //1
        if (a > b) {

        }
        //2
        if (a > b) {

        } else {

        }
        //3
        if (a > b) {

        } else if (b > c) {

        } else if (c > d) {

        } else {

        }
        //4
        if (a > b) {
            if (b > c) {

            } else if (c > d) {

            } else {

            }
        } else {
            if (d > a) {

            } else {

            }
        }
    }

    public static void 流程2() {
        int a = 3;
        if (a >= 1) {
            System.out.println("a>=1");
        } else if (a >= 2) {
            System.out.println("a>=2");
        } else if (a >= 3) {
            System.out.println("a>=3");
        } else if (a >= 4) {
            System.out.println("a>=4");
        } else if (a >= 5) {
            System.out.println("a>=5");
        } else if (a >= 6) {
            System.out.println("a>=6");
        }
    }

    public static void 流程3() {
        int a = 3;
        if (a >= 1) {
            System.out.println("a>=1");
        }
        if (a >= 2) {
            System.out.println("a>=2");
        }
        if (a >= 3) {
            System.out.println("a>=3");
        }
        if (a >= 4) {
            System.out.println("a>=4");
        }
        if (a >= 5) {
            System.out.println("a>=5");
        }
        if (a >= 6) {
            System.out.println("a>=6");
        }
    }

    public static void 輸入帳號密碼1() {
        String userid, password;
        final String user = "sun2000", pass = "1234";
        Scanner s = new Scanner(System.in);

        System.out.print("輸入帳號:");
        userid = s.next();
        System.out.print("輸入密碼:");
        password = s.next();

        if (userid.equals(user) && password.equals(pass)) {
            System.out.println("Pass");
        } else {
            System.out.println("No Pass");
        }
    }

    public static void if分數等級1() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("優");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("甲");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("乙");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("丙");
        } else if (grade >= 0 && grade <= 59) {
            System.out.println("丁");
        } else {
            System.out.println("error");
        }
    }

    public static void if分數等級2() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade >= 90) {
            System.out.println("優");
        } else if (grade >= 80) {
            System.out.println("甲");
        } else if (grade >= 70) {
            System.out.println("乙");
        } else if (grade >= 60) {
            System.out.println("丙");
        } else {
            System.out.println("丁");
        }
    }

    public static void if分數等級3() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade >= 0 && grade <= 100) {
            if (grade >= 90) {
                System.out.println("優");
            } else if (grade >= 80) {
                System.out.println("甲");
            } else if (grade >= 70) {
                System.out.println("乙");
            } else if (grade >= 60) {
                System.out.println("丙");
            } else {
                System.out.println("丁");
            }
        } else {
            System.out.println("error");
        }

    }

    public static void if分數等級4() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("error");
        } else {
            if (grade >= 90) {
                System.out.println("優");
            } else if (grade >= 80) {
                System.out.println("甲");
            } else if (grade >= 70) {
                System.out.println("乙");
            } else if (grade >= 60) {
                System.out.println("丙");
            } else {
                System.out.println("丁");
            }
        }

    }

    public static void if分數等級() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade < 0 || grade > 100) {
            System.out.println("error");
            return;
        }

        if (grade >= 90) {
            System.out.println("優");
        } else if (grade >= 80) {
            System.out.println("甲");
        } else if (grade >= 70) {
            System.out.println("乙");
        } else if (grade >= 60) {
            System.out.println("丙");
        } else {
            System.out.println("丁");
        }

    }

    public static void switch1() {
        int a = 66;
        final int B = 66;
        switch (a) {
            case 65:
                System.out.println("A");
            case B:
                System.out.println("B");
            case 'C':
                System.out.println("C");
            case 68:
            case 69:
                System.out.println("D OR E");
            default:
                System.out.println("NOTHING");
        }
    }

    public static void switch2() {
        int a = 66;
        final int B = 66;
        switch (a) {
            case 65:
                System.out.println("A");
                break;
            case B:
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 68:
            case 69:
                System.out.println("D OR E");
                break;
            default:
                System.out.println("NOTHING");
                break;
        }
    }

    public static void switch3() {
        String a = "a";

        switch (a) {
            case "ABC":
                System.out.println("ABC");
                break;
            case "abc":
                System.out.println("abc");
                break;
            case "a":
                System.out.println("a");
                break;
            default:
                System.out.println("NOTHING");
                break;
        }
    }

    public static void switch4() {
        ColorX a = ColorX.ORANGE;

        switch (a) {
            case ORANGE:
                System.out.println("ORANGE");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
            case RED:
                System.out.println("RED");
                break;
            default:
                System.out.println("NOTHING");
                break;
        }
    }

    public static void switch分數等級() {
        int grade;
        Scanner s = new Scanner(System.in);
        System.out.print("請輸入分數 = ");
        grade = s.nextInt();

        if (grade > 100 || grade < 0) {
            System.out.println("你的分數輸入錯誤");
            return;
        }
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("成績：優等");
                break;
            case 8:
                System.out.println("成績：甲等");
                break;
            case 7:
                System.out.println("成績：乙等");
                break;
            case 6:
                System.out.println("成績：丙等");
                break;
            default:
                System.out.println("成績：丁等");
        }
    }

    public static void switch站別() {
        String station;
        StringBuilder passStat = new StringBuilder("");
        Scanner s = new Scanner(System.in);

        System.out.print("A=台北\nB=板橋\nC=中壢\nD=新竹\n輸入起站 :");
        station = s.next();

        station = station.toUpperCase();

        switch (station) {
            case "A":
                passStat.append("台北->");
                System.out.println("台北開車");
            case "B":
                passStat.append("板橋->");
                System.out.println("板橋到了");
            case "C":
                passStat.append("中壢->");
                System.out.println("中壢到了");
            case "D":
                passStat.append("新竹");
                System.out.println("終站新竹");
                break;
            default:
                System.out.println("選項錯誤");
        }
        System.out.println("你的旅程是：\n" + passStat);
    }

    public static void switch三元運算子() {

        int cartype, money = 0, money2 = 0, money3 = 0, money4 = 0, sum = 0;
        String cdplayer, sunroof, autotrans;

        Scanner s = new Scanner(System.in);

        System.out.print("請選擇:(1)跑車 (2)轎車(豪華型) (3)轎車(經濟型) : ");
        cartype = s.nextInt();
        System.out.println();

        System.out.print("是否加裝CD音響?(y/n) : ");
        cdplayer = s.next();

        System.out.print("是否加裝天窗?(y/n) : ");
        sunroof = s.next();

        System.out.print("是否該裝成自動排檔?(y/n) : ");
        autotrans = s.next();

        switch (cartype) {
            case 1:
                money = 800000;
                break;
            case 2:
                money = 650000;
                break;
            case 3:
                money = 450000;
                break;
            default:
                System.out.println("謝謝惠顧!\n");
        }

        money2 = (cdplayer.equals("y")) ? 4000 : 0;
        money3 = (sunroof.equals("y")) ? 5000 : 0;
        money4 = (autotrans.equals("y")) ? 3000 : 0;

        sum = money + money2 + money3 + money4;
        System.out.printf("總價格為:%d\n", sum);
        System.out.println("謝謝惠顧!\n");
    }

    public static void 算術運算1() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("輸入數字1=");
        x = s.nextInt();
        System.out.print("輸入數字2=");
        y = s.nextInt();

        sum = 四則運算1(x, y, '+');
        System.out.println("x+y=" + sum);
        sum = 四則運算1(x, y, '-');
        System.out.println("x-y=" + sum);
        sum = 四則運算1(x, y, '*');
        System.out.println("x*y=" + sum);
        sum = 四則運算1(x, y, '/');
        System.out.println("x/y=" + sum);
        sum = 四則運算1(x, y, '#');
        System.out.println("x#y=" + sum);
    }

    public static int 四則運算1(int x, int y, char op) {

        switch (op) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
            case 'X':
            case 'x':
                return x * y;
            case '/':
                return x / y;
            default:
                System.out.println("運算子錯誤");
                return 0;
        }
    }

    public static void 算術運算2() {
        int x, y;
        int sum;
        Scanner s = new Scanner(System.in);

        System.out.print("輸入數字1=");
        x = s.nextInt();
        System.out.print("輸入數字2=");
        y = s.nextInt();

        sum = 四則運算2(x, y, Count.加);
        System.out.println("x+y=" + sum);
        sum = 四則運算2(x, y, Count.減);
        System.out.println("x-y=" + sum);
        sum = 四則運算2(x, y, Count.乘);
        System.out.println("x*y=" + sum);
        sum = 四則運算2(x, y, Count.除);
        System.out.println("x/y=" + sum);
    }

    public static int 四則運算2(int x, int y, Count op) {

        switch (op) {
            case 加:
                return x + y;
            case 減:
                return x - y;
            case 乘:
                return x * y;
            case 除:
                return x / y;
            default:
                return 0;
        }
    }

    public static void loop1() {
        int i = 1;
//        for(;;){
//            System.out.println("我愛你");
//        }
//        for (; true;) {
//            System.out.println("我愛你" + i);
//            i++;
//        }
        for (; i <= 10;) {
            System.out.println("我愛你" + i);
            i++;
        }
    }

    public static void loop2() {
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.println("for 我愛你" + i + "次");
        }
        System.out.println("i=" + i);

        i = 1;
        while (i <= 10) {
            System.out.println("while 我愛你" + i + "次");
            i++;
        }

        i = 1;
        do {
            System.out.println("do while 我愛你" + i + "次");
            i++;
        } while (i <= 10);
    }

    public static void loop3() {
        int i;

        for (i = 10; i >= 1; i--) {
            System.out.println("for 我愛你" + i + "次");
        }
        System.out.println("i=" + i);

        i = 5;
        while (i <= 100) {
            System.out.println("while 我愛你" + i + "次");
            i += 5;
        }

        i = 1000;
        do {
            System.out.println("do while 我愛你" + i + "次");
            i -= 100;
        } while (i >= 0);
    }

    public static void 輸入_loop() {
        Scanner s = new Scanner(System.in);
        int x;
        int sum = 0;
        double average;

        for (int i = 1; i <= 3; i++) {
            System.out.print("x" + i + "=");
            x = s.nextInt();

            if (x < 0 || x > 100) {
                System.out.println("error");
                i--;
                continue;
            }

            sum = sum + x;
        }
        average = (double) sum / 3;

        System.out.println("---->sum=" + sum);
        System.out.println("---->average=" + average);

    }

    public static void loop4() {
        int i;
        int sum = 0;
        for (i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println("for i=" + i + " sum=" + sum);
        }
        System.out.println("i=" + i);

        i = 1;
        sum = 0;
        while (i <= 10) {
            sum = sum + i;
            System.out.println("while i=" + i + " sum=" + sum);
            i++;
        }

        i = 1;
        sum = 0;
        do {
            sum = sum + i;
            System.out.println("do while i=" + i + " sum=" + sum);
            i++;
        } while (i <= 10);
    }

    public static void loop5() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("O");
            for (int j = 1; j <= 3; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void loop6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void loop7() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" i=" + i + " j=");

            for (int j = 1; j <= 10; j++) {

//                if (j < 10) {
//                    System.out.print(j + " , ");
//                } else {
//                    System.out.print(j);
//                }
                System.out.print(j < 10 ? j + "," : j);

            }
            System.out.println();
        }
    }

    public static void 九九乘法1() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
                if (i * j < 10) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void 九九乘法2() {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void 處理例外() {
        int a = 10;
        int b = 0;
        int c = 0;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("除以 0--->");
        }

        System.out.println("c=" + c);
    }

    public static void 寫檔案() {

        try {
            FileWriter fw = new FileWriter("file1.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("AAA");
            pw.println("BBB");

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案() {
        try {
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 寫檔案_九九乘法() {
        try {
            FileWriter fw = new FileWriter("九九乘法表.txt", false);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= 9; j++) {
                    pw.printf("%d*%d=%2d ", i, j, i * j);
                }
                pw.println();
            }
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void 讀檔案_九九乘法() {
        try {
            FileReader fr = new FileReader("九九乘法表.txt");
            BufferedReader br = new BufferedReader(fr);

            String data;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
        }
    }

    public static void 主() {
        副();
        System.out.println("主");
    }

    public static void 副() {
        if (false) {
            return;
        }
        System.out.println("副");
    }

    ////////////////////////
    public static void break1() {
        AA:
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "--->");
            for (int j = 1; j <= 10; j++) {
                if (j > 6) {
                    break AA;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void continue1() {
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void switch分數等級_loop() {
        int grade;
        Scanner s = new Scanner(System.in);
        String ans = "y";

        do {
            System.out.print("請輸入分數 = ");
            grade = s.nextInt();

            if (grade > 100 || grade < 0) {
                System.out.println("你的分數輸入錯誤");
                continue;
            }
            switch (grade / 10) {
                case 10:
                case 9:
                    System.out.println("成績：優等");
                    break;
                case 8:
                    System.out.println("成績：甲等");
                    break;
                case 7:
                    System.out.println("成績：乙等");
                    break;
                case 6:
                    System.out.println("成績：丙等");
                    break;
                default:
                    System.out.println("成績：丁等");
            }

            System.out.print("Continue<y/n>");
            ans = s.next();
        } while (ans.equals("Y") || ans.equals("y"));
    }

    public static void 輸入帳號密碼2() {
        String str1 = null;
        boolean ok = false;
        final String password = "ymca";

        Scanner s1 = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("請輸入密碼 : ");
            str1 = s1.next();

            if (str1.equals(password)) {
                ok = true;
                break;
            }

            System.out.println("密碼錯誤,無法進入");
            System.out.println();
        }
        if (ok) {
            System.out.println("Login成功,歡迎進入");
        } else {
            System.out.println("非法進入");
        }
    }

    public static void 迴圈變形() {
        int sum = 0;
        for (int i = 1, j = 1, k = 1; i <= 10; sum = sum + i, System.out.println("sum=" + sum), i++);
    }

    public static void 換錢2() {

        Scanner s = new Scanner(System.in);
        int money;
        int m100 = 0, m50 = 0, m10 = 0, m5 = 0, m1 = 0;

//        System.out.print("Input money ( < 1000 ) : ");
//        money = s.nextInt();
//        while (money >= 1000) {
//            System.out.println("money eror");
//            System.out.print("Input money ( < 1000 ) : ");
//            money = s.nextInt();
//        }      

        while (true) {
            System.out.printf("Input money ( < 1000 ) : ");
            money = s.nextInt();

            if (money < 1000) {
                break;
            }
            System.out.println("Error , mony >=1000");
        }

        for (; money >= 100; money -= 100, m100++);
        for (; money >= 50; money -= 50, m50++);
        for (; money >= 10; money -= 10, m10++);
        for (; money >= 5; money -= 5, m5++);
        for (; money >= 1; money -= 1, m1++);

        System.out.println("100 元 : " + m100);
        System.out.println("50 元 : " + m50);
        System.out.println("10 元 : " + m10);
        System.out.println("5 元 : " + m5);
        System.out.println("1 元 : " + m1);
    }

    public static void 亂數() {
        //亂數種子的值 會分佈在 >=0  and <1 之間 

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(     (int) ( Math.random() * 49  )        + 1    );
        System.out.println((int) (Math.random() * 49) + 1);
        System.out.println((int) (Math.random() * 49) + 1);
        System.out.println((int) (Math.random() * 49) + 1);
        System.out.println((int) (Math.random() * 49) + 1);
        System.out.println((int) (Math.random() * 49) + 1);
    }
     public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void firstWeekDayOfYear(int year) {
        long day = year * 365;
        for (int i = 1; i < year; i++) {
            if (isLeapYear(i)) {
                day += 1;
            }
        }
        System.out.println(day % 7);
    
    }

}
