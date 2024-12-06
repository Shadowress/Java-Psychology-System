package userinterface;

public class StudentDashboard extends javax.swing.JFrame {

    public StudentDashboard() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookconsultation_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        pastappt_button = new javax.swing.JButton();
        upcomingappt_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bookconsultation_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        bookconsultation_button.setForeground(new java.awt.Color(102, 102, 102));
        bookconsultation_button.setText("Book consultation");
        bookconsultation_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookconsultation_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("APU Psychology Consultation ");
        jLabel1.setIconTextGap(5);

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        pastappt_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        pastappt_button.setForeground(new java.awt.Color(102, 102, 102));
        pastappt_button.setText("Past appointment");
        pastappt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastappt_buttonActionPerformed(evt);
            }
        });

        upcomingappt_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        upcomingappt_button.setForeground(new java.awt.Color(102, 102, 102));
        upcomingappt_button.setText("Upcoming appointment");
        upcomingappt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upcomingappt_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(back_button)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addContainerGap(61, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pastappt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookconsultation_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upcomingappt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button)))
                .addGap(33, 33, 33)
                .addComponent(bookconsultation_button)
                .addGap(18, 18, 18)
                .addComponent(upcomingappt_button)
                .addGap(18, 18, 18)
                .addComponent(pastappt_button)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookconsultation_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookconsultation_buttonActionPerformed
        StudentBookConsultation studentBookConsultation = new StudentBookConsultation();

        studentBookConsultation.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_bookconsultation_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LoginUI loginUI = new LoginUI();

        loginUI.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void pastappt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastappt_buttonActionPerformed
        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();

        studentPastAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_pastappt_buttonActionPerformed

    private void upcomingappt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcomingappt_buttonActionPerformed
        StudentUpcomingAppointment studentUpcomingAppointment = new StudentUpcomingAppointment();

        studentUpcomingAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_upcomingappt_buttonActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(() -> {
            new StudentDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton bookconsultation_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pastappt_button;
    private javax.swing.JButton upcomingappt_button;
    // End of variables declaration//GEN-END:variables
}
