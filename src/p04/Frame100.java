package p04;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame100 extends JFrame {

    public JButton[] B = new JButton[5];
    public Container ContentPane; //內容桌布

    public Frame100() {

        ContentPane = this.getContentPane(); //取得內容桌布
        GridLayout layout = new GridLayout(2, 3);//取得版面配置
        ContentPane.setLayout(layout);//內容桌布設定版面配置

        JButton[] B = new JButton[5]; //每一個都是 null
        for (int i = 0; i < B.length; i++) {
            B[i] = new JButton(String.valueOf(i+1));
            ContentPane.add(B[i]);//加入內容桌布
        }    

        this.setBounds(200, 100, 250, 180);
        this.setTitle("控制項陣列");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Frame100();
    }
}
