/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p04;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author BG-307
 */
public class Window04 extends javax.swing.JFrame {

    public ImageIcon[] ic = new ImageIcon[3];
    public JCheckBox[] chk;
    public JLabel[] lbl;

    public Window04() {
        initComponents();

        ic[0] = new ImageIcon(getClass().getResource("/pic/ani1.jpg"));
        ic[1] = new ImageIcon(getClass().getResource("/pic/ani2.jpg"));
        ic[2] = new ImageIcon(getClass().getResource("/pic/ani3.jpg"));

        chk = new JCheckBox[]{chk企鵝, chk小貓, chk小狗};
        lbl = new JLabel[]{lbl企鵝, lbl小貓, lbl小狗};

        for (int i = 0; i < lbl.length; i++) {
            lbl[i].setIcon(ic[i]);
            lbl[i].setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        chk我愛你 = new javax.swing.JCheckBox();
        chk我恨你 = new javax.swing.JCheckBox();
        chk我喜歡你 = new javax.swing.JCheckBox();
        lbl答案 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl圖片 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rdo企鵝 = new javax.swing.JRadioButton();
        rdo小貓 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lbl企鵝 = new javax.swing.JLabel();
        lbl小貓 = new javax.swing.JLabel();
        lbl小狗 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        chk企鵝 = new javax.swing.JCheckBox();
        chk小貓 = new javax.swing.JCheckBox();
        chk小狗 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chk我愛你.setText("我愛你");
        chk我愛你.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框事件(evt);
            }
        });

        chk我恨你.setText("我恨你");
        chk我恨你.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框事件(evt);
            }
        });

        chk我喜歡你.setText("我喜歡你");
        chk我喜歡你.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框事件(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk我喜歡你)
                    .addComponent(chk我恨你)
                    .addComponent(chk我愛你))
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(chk我愛你)
                .addGap(18, 18, 18)
                .addComponent(chk我恨你)
                .addGap(18, 18, 18)
                .addComponent(chk我喜歡你)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        lbl答案.setBackground(new java.awt.Color(153, 255, 51));
        lbl答案.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("核取框", jPanel1);

        lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani1.jpg"))); // NOI18N
        lbl圖片.setText("jLabel1");

        buttonGroup1.add(rdo企鵝);
        rdo企鵝.setText("企鵝");
        rdo企鵝.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        buttonGroup1.add(rdo小貓);
        rdo小貓.setText("小貓");
        rdo小貓.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("小狗");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                選項鈕選圖片(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdo企鵝, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rdo小貓, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rdo企鵝)
                .addGap(18, 18, 18)
                .addComponent(rdo小貓)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jRadioButton3))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lbl圖片, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbl圖片)
                .addGap(34, 34, 34)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("圖片1", jPanel2);

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));
        jPanel7.add(lbl企鵝);
        jPanel7.add(lbl小貓);
        jPanel7.add(lbl小狗);

        chk企鵝.setText("企鵝");
        chk企鵝.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        chk小貓.setText("小貓");
        chk小貓.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        chk小狗.setText("小狗");
        chk小狗.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                核取框選圖片(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chk小狗)
                    .addComponent(chk小貓)
                    .addComponent(chk企鵝))
                .addGap(24, 24, 24))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(chk企鵝)
                .addGap(18, 18, 18)
                .addComponent(chk小貓)
                .addGap(18, 18, 18)
                .addComponent(chk小狗)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("圖片2", jPanel3);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                數字(evt);
            }
        });

        btndelete.setText("刪除<--");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                刪除(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndelete)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn2)
                        .addGap(18, 18, 18)
                        .addComponent(btn3))
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3))
                .addGap(43, 43, 43)
                .addComponent(btndelete)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("打字", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void 核取框事件(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_核取框事件
        StringBuilder str = new StringBuilder("");
        int[] ar1 = {10, 20, 30};
        int sum = 0;

        JCheckBox[] chk = {chk我愛你, chk我恨你, chk我喜歡你};

        for (int i = 0; i < chk.length; i++) {
            if (chk[i].isSelected()) {
                str.append(chk[i].getText()).append(" ");
                sum = sum + ar1[0];
            }
        }

//        if (chk我愛你.isSelected()) {
//            str.append(chk我愛你.getText()).append(" ");
//            sum = sum + ar1[0];
//        }
//        if (chk我恨你.isSelected()) {
//            str.append(chk我恨你.getText()).append(" ");
//            sum = sum + ar1[1];
//        }
//        if (chk我喜歡你.isSelected()) {
//            str.append(chk我喜歡你.getText()).append(" ");
//            sum = sum + ar1[2];
//        }
        lbl答案.setText(str.toString() + "==> 共 " + sum + " 元 ");
    }//GEN-LAST:event_核取框事件

    private void 選項鈕選圖片(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_選項鈕選圖片
        if (rdo企鵝.isSelected()) {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani1.jpg"))); // NOI18N
        } else if (rdo小貓.isSelected()) {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani2.jpg"))); // NOI18N
        } else {
            lbl圖片.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/ani3.jpg"))); // NOI18N
        }
    }//GEN-LAST:event_選項鈕選圖片

    private void 核取框選圖片(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_核取框選圖片
        for (int i = 0; i < chk.length; i++) {
            if (chk[i].isSelected()) {
                lbl[i].setVisible(true);
            } else {
                lbl[i].setVisible(false);
            }
        }
    }//GEN-LAST:event_核取框選圖片

    private void 數字(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_數字
        JButton btn = (JButton) evt.getSource();

        if (txtInput.getText().equals("0")) {
            txtInput.setText("");
        }

        txtInput.setText(txtInput.getText() + btn.getText());
    }//GEN-LAST:event_數字

    private void 刪除(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_刪除
        int len;
        len = txtInput.getText().length();

        if (len != 0) {
            String str = txtInput.getText().substring(0, len - 1);
            txtInput.setText(str);
            if (txtInput.getText().length() == 0) {
                txtInput.setText("0");
            }
        }
    }//GEN-LAST:event_刪除

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btndelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chk企鵝;
    private javax.swing.JCheckBox chk小狗;
    private javax.swing.JCheckBox chk小貓;
    private javax.swing.JCheckBox chk我喜歡你;
    private javax.swing.JCheckBox chk我恨你;
    private javax.swing.JCheckBox chk我愛你;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl企鵝;
    private javax.swing.JLabel lbl圖片;
    private javax.swing.JLabel lbl小狗;
    private javax.swing.JLabel lbl小貓;
    private javax.swing.JLabel lbl答案;
    private javax.swing.JRadioButton rdo企鵝;
    private javax.swing.JRadioButton rdo小貓;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
