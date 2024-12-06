/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;

/**
 *
 * @author James
 */
public class StudentFeedbackAndRatings extends javax.swing.JFrame {

    /**
     * Creates new form StudentFeedbackAndRatings
     */
    public StudentFeedbackAndRatings() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fivestar_button = new javax.swing.JButton();
        fourstar_button = new javax.swing.JButton();
        threestar_button = new javax.swing.JButton();
        twostar_button = new javax.swing.JButton();
        onestar_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apptid_enter = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmt_enter = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fivestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fivestar_button.setForeground(new java.awt.Color(102, 102, 102));
        fivestar_button.setText("5 Star");
        fivestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivestar_buttonActionPerformed(evt);
            }
        });

        fourstar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fourstar_button.setForeground(new java.awt.Color(102, 102, 102));
        fourstar_button.setText("4 Star");
        fourstar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourstar_buttonActionPerformed(evt);
            }
        });

        threestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        threestar_button.setForeground(new java.awt.Color(102, 102, 102));
        threestar_button.setText("3 Star");
        threestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threestar_buttonActionPerformed(evt);
            }
        });

        twostar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        twostar_button.setForeground(new java.awt.Color(102, 102, 102));
        twostar_button.setText("2 Star");
        twostar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twostar_buttonActionPerformed(evt);
            }
        });

        onestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        onestar_button.setForeground(new java.awt.Color(102, 102, 102));
        onestar_button.setText("1Star");
        onestar_button.setActionCommand("1 Star");
        onestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onestar_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ratings:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Comment:");

        apptid_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptid_enterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Feedback");

        cmt_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmt_enterActionPerformed(evt);
            }
        });

        submit_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        submit_button.setForeground(new java.awt.Color(102, 102, 102));
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Enter Appoinment ID:");

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submit_button))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fourstar_button)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(onestar_button)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(twostar_button)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(threestar_button))
                                    .addComponent(fivestar_button))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apptid_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_button)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(apptid_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(onestar_button)
                    .addComponent(twostar_button)
                    .addComponent(threestar_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fourstar_button)
                    .addComponent(fivestar_button))
                .addGap(18, 18, 18)
                .addComponent(submit_button)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onestar_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_onestar_buttonActionPerformed

    private void fourstar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourstar_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourstar_buttonActionPerformed

    private void apptid_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptid_enterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apptid_enterActionPerformed

    private void cmt_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmt_enterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmt_enterActionPerformed

    private void twostar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twostar_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twostar_buttonActionPerformed

    private void threestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threestar_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threestar_buttonActionPerformed

    private void fivestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivestar_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fivestar_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();

        studentPastAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();

        studentPastAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFeedbackAndRatings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFeedbackAndRatings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFeedbackAndRatings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFeedbackAndRatings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFeedbackAndRatings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apptid_enter;
    private javax.swing.JButton back_button;
    private javax.swing.JTextField cmt_enter;
    private javax.swing.JButton fivestar_button;
    private javax.swing.JButton fourstar_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton onestar_button;
    private javax.swing.JButton submit_button;
    private javax.swing.JButton threestar_button;
    private javax.swing.JButton twostar_button;
    // End of variables declaration//GEN-END:variables
}
