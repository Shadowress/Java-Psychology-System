package userinterface;

public class LecturerDashboard extends javax.swing.JFrame {

    public LecturerDashboard() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pastappointment_button = new javax.swing.JButton();
        upcomingappointment_button = new javax.swing.JButton();
        setconsultationslots_button = new javax.swing.JButton();
        nothing = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pastappointment_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        pastappointment_button.setForeground(new java.awt.Color(102, 102, 102));
        pastappointment_button.setText("Past appointment");
        pastappointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastappointment_buttonActionPerformed(evt);
            }
        });

        upcomingappointment_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        upcomingappointment_button.setForeground(new java.awt.Color(102, 102, 102));
        upcomingappointment_button.setText("Upcoming appointment");
        upcomingappointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upcomingappointment_buttonActionPerformed(evt);
            }
        });

        setconsultationslots_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        setconsultationslots_button.setForeground(new java.awt.Color(102, 102, 102));
        setconsultationslots_button.setText("Set consultation slots");
        setconsultationslots_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setconsultationslots_buttonActionPerformed(evt);
            }
        });

        nothing.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        nothing.setForeground(new java.awt.Color(51, 153, 255));
        nothing.setText("APU Psychology Consultation ");
        nothing.setIconTextGap(5);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nothing, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pastappointment_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upcomingappointment_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(setconsultationslots_button, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(16, 16, 16)
                .addComponent(nothing)
                .addGap(34, 34, 34)
                .addComponent(setconsultationslots_button)
                .addGap(18, 18, 18)
                .addComponent(upcomingappointment_button)
                .addGap(18, 18, 18)
                .addComponent(pastappointment_button)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pastappointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastappointment_buttonActionPerformed
        LecturerPastAppointment lecturerPastAppointment = new LecturerPastAppointment();

        lecturerPastAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_pastappointment_buttonActionPerformed

    private void upcomingappointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcomingappointment_buttonActionPerformed
        LecturerUpcomingAppointment lecturerUpcomingAppointment = new LecturerUpcomingAppointment();

        lecturerUpcomingAppointment.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_upcomingappointment_buttonActionPerformed

    private void setconsultationslots_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setconsultationslots_buttonActionPerformed
        LecturerSetConsultationSlot lecturerSetConsultationSlot = new LecturerSetConsultationSlot();

        lecturerSetConsultationSlot.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_setconsultationslots_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new LecturerDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel nothing;
    private javax.swing.JButton pastappointment_button;
    private javax.swing.JButton setconsultationslots_button;
    private javax.swing.JButton upcomingappointment_button;
    // End of variables declaration//GEN-END:variables
}
