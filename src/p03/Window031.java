/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p03;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author BG-307
 */
public class Window031 extends javax.swing.JFrame {

    /**
     * Creates new form Window031
     */
    public Window031() {

        initComponents();
        txt使用者.requestFocus();
        btn檢核.setVisible(false);
        btn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        userid = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btn檢核 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl通過 = new javax.swing.JTextArea();
        txt使用者 = new javax.swing.JTextField();
        txt密碼 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt分數 = new javax.swing.JTextField();
        lbl分數等級 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rdo加 = new javax.swing.JRadioButton();
        rdo減 = new javax.swing.JRadioButton();
        rdo乘 = new javax.swing.JRadioButton();
        rdo除 = new javax.swing.JRadioButton();
        txta1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        btn = new javax.swing.JButton();
        lbl答案 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        userid.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        userid.setText("user");

        password.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        password.setText("pass");

        btn檢核.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        btn檢核.setText("put");
        btn檢核.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn檢核ActionPerformed(evt);
            }
        });

        lbl通過.setBackground(new java.awt.Color(255, 255, 51));
        lbl通過.setColumns(20);
        lbl通過.setRows(5);
        jScrollPane1.setViewportView(lbl通過);

        txt使用者.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt使用者FocusGained(evt);
            }
        });
        txt使用者.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt使用者ActionPerformed(evt);
            }
        });

        txt密碼.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt密碼FocusGained(evt);
            }
        });
        txt密碼.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt密碼ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn檢核, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt密碼))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(txt使用者, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt使用者, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt密碼, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn檢核, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("密碼", jPanel1);

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        jLabel1.setText("輸入分數");

        txt分數.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        txt分數.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt分數ActionPerformed(evt);
            }
        });

        lbl分數等級.setBackground(new java.awt.Color(153, 255, 51));
        lbl分數等級.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        lbl分數等級.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt分數, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(lbl分數等級, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txt分數, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbl分數等級, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("分數等級", jPanel2);

        jPanel4.setBackground(new java.awt.Color(102, 204, 0));
        jPanel4.setLayout(new java.awt.GridLayout(0, 1, 20, 10));

        buttonGroup1.add(rdo加);
        rdo加.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        rdo加.setText("加");
        rdo加.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                加減乘除共用事件(evt);
            }
        });
        jPanel4.add(rdo加);

        buttonGroup1.add(rdo減);
        rdo減.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        rdo減.setText("減");
        rdo減.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                加減乘除共用事件(evt);
            }
        });
        jPanel4.add(rdo減);

        buttonGroup1.add(rdo乘);
        rdo乘.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        rdo乘.setText("乘");
        rdo乘.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                加減乘除共用事件(evt);
            }
        });
        jPanel4.add(rdo乘);

        buttonGroup1.add(rdo除);
        rdo除.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        rdo除.setText("除");
        rdo除.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                加減乘除共用事件(evt);
            }
        });
        jPanel4.add(rdo除);

        txta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txta1ActionPerformed(evt);
            }
        });

        btn.setFont(new java.awt.Font("新細明體", 0, 48)); // NOI18N
        btn.setText("=");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        lbl答案.setBackground(new java.awt.Color(204, 51, 255));
        lbl答案.setFont(new java.awt.Font("新細明體", 0, 36)); // NOI18N
        lbl答案.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txta1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl答案, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(txta1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(72, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl答案, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("4則運算", jPanel3);

        jTabbedPane1.setSelectedIndex(2);

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

    private void btn檢核ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn檢核ActionPerformed
        String id, pass;
        final String user = "100", pas = "100";

        id = txt使用者.getText();

        pass = txt密碼.getText();
        if (id.equals(user) && pass.equals(pas)) {
            lbl通過.setText("OK");
        } else {
            lbl通過.setText("NO");
        }
    }//GEN-LAST:event_btn檢核ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        txt密碼.requestFocus();
        txt分數.requestFocus(); // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void txt密碼ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt密碼ActionPerformed
        if (txt密碼.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "不可空白");
            return;
        }
        btn檢核ActionPerformed(evt);
    }//GEN-LAST:event_txt密碼ActionPerformed

    private void txt使用者FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt使用者FocusGained
        txt使用者.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_txt使用者FocusGained

    private void txt密碼FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt密碼FocusGained
        txt密碼.selectAll();        // TODO add your handling code here:
    }//GEN-LAST:event_txt密碼FocusGained

    private void txt使用者ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt使用者ActionPerformed
        if (txt使用者.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "不可空白");
            return;
        }
        txt密碼.requestFocus();
    }//GEN-LAST:event_txt使用者ActionPerformed

    private void txt分數ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt分數ActionPerformed
        int grade;

        grade = Integer.parseInt(txt分數.getText());
        if (grade < 0 || grade > 100) {
            lbl分數等級.setText("error");
            return;
        }
        switch (grade / 10) {
            case 10:
            case 9:
                lbl分數等級.setText("成績:優等");
                break;
            case 8:
                lbl分數等級.setText("成績甲等");
                break;
            case 7:
                lbl分數等級.setText("成績:乙等");
                break;
            case 6:
                lbl分數等級.setText("成績:丙等");
                break;
            default:
                lbl分數等級.setText("成績:丁等");
                break;
        }
    }//GEN-LAST:event_txt分數ActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        int x = Integer.parseInt(txta1.getText());
        int y = Integer.parseInt(txt2.getText());
        int sum = 0;
        if (rdo加.isSelected()) {
            sum = 四則運算(x, y, Count.加);
        }
        if (rdo減.isSelected()) {
            sum = 四則運算(x, y, Count.減);
        }
        if (rdo乘.isSelected()) {
            sum = 四則運算(x, y, Count.乘);
        }
        if (rdo除.isSelected()) {
            sum = 四則運算(x, y, Count.除);
        }
        lbl答案.setText(String.valueOf(sum));

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void txta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txta1ActionPerformed
       
         int x = Integer.parseInt(txta1.getText());
        int y = Integer.parseInt(txt2.getText());
        int sum = 0;



//txt2.requestFocus();        // TODO add your handling code here:
        JRadioButton tmp=(JRadioButton)evt.getSource();
        if (tmp==rdo加) {
            sum = 四則運算(x, y, Count.加);
        }
        if (tmp==rdo減) {
            sum = 四則運算(x, y, Count.減);
        }
        if (tmp==rdo乘) {
            sum = 四則運算(x, y, Count.乘);
        }
        if (tmp==rdo除) {
            sum = 四則運算(x, y, Count.除);
        }
        lbl答案.setText(String.valueOf(sum));
    }//GEN-LAST:event_txta1ActionPerformed

    private void 加減乘除共用事件(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_加減乘除共用事件
       btnActionPerformed( evt); // TODO add your handling code here:
    }//GEN-LAST:event_加減乘除共用事件
    public static int 四則運算(int x, int y, Count op) {

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
                System.out.println("運算子錯誤");
                return 0;
        }
    }

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
            java.util.logging.Logger.getLogger(Window031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window031.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window031().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btn檢核;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl分數等級;
    private javax.swing.JLabel lbl答案;
    private javax.swing.JTextArea lbl通過;
    private javax.swing.JLabel password;
    private javax.swing.JRadioButton rdo乘;
    private javax.swing.JRadioButton rdo加;
    private javax.swing.JRadioButton rdo減;
    private javax.swing.JRadioButton rdo除;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txta1;
    private javax.swing.JTextField txt使用者;
    private javax.swing.JTextField txt分數;
    private javax.swing.JTextField txt密碼;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables
}
