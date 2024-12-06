package userinterface;

public class LecturerPastAppointment extends javax.swing.JFrame {

    public LecturerPastAppointment() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        givefeedback_button = new javax.swing.JButton();
        viewfeedback_button = new javax.swing.JButton();
        top_text = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastlec_table = new javax.swing.JTable();
        back_button = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "Student ID", "Slot ID", "Status", "RescheduleSlot ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        givefeedback_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        givefeedback_button.setForeground(new java.awt.Color(102, 102, 102));
        givefeedback_button.setText("Feedback And Rating ");
        givefeedback_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                givefeedback_buttonActionPerformed(evt);
            }
        });

        viewfeedback_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        viewfeedback_button.setForeground(new java.awt.Color(102, 102, 102));
        viewfeedback_button.setText("View Student Feedback");
        viewfeedback_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfeedback_buttonActionPerformed(evt);
            }
        });

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("Past Appointment ");

        pastlec_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Appt ID", "Student Name", "Date", "Time", "Status", "Resched Date", "Resched Time"
            }
        ));
        pastlec_table.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                pastlec_tableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(pastlec_table);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(givefeedback_button)
                        .addGap(53, 53, 53)
                        .addComponent(viewfeedback_button)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_button)
                                .addGap(179, 179, 179)
                                .addComponent(top_text)))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top_text)
                    .addComponent(back_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(givefeedback_button)
                    .addComponent(viewfeedback_button))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void givefeedback_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_givefeedback_buttonActionPerformed
        LecturerFeedbackAndRatings lecturerFeedbackAndRatings = new LecturerFeedbackAndRatings();

        lecturerFeedbackAndRatings.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_givefeedback_buttonActionPerformed

    private void viewfeedback_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfeedback_buttonActionPerformed
        LecturerViewStudentFeedback lecturerViewStudentFeedback = new LecturerViewStudentFeedback();

        lecturerViewStudentFeedback.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_viewfeedback_buttonActionPerformed

    private void pastlec_tableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_pastlec_tableComponentShown
        // TODO add your handling code here: 
    }//GEN-LAST:event_pastlec_tableComponentShown

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LecturerDashboard lecturerDashboard = new LecturerDashboard();

        lecturerDashboard.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerPastAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new LecturerPastAppointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton givefeedback_button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable pastlec_table;
    private javax.swing.JLabel top_text;
    private javax.swing.JButton viewfeedback_button;
    // End of variables declaration//GEN-END:variables
}
