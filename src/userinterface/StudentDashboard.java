package userinterface;

import java.util.List;
import javax.swing.JOptionPane;
import services.AppointmentManager;
import services.SessionManager;

public class StudentDashboard extends javax.swing.JFrame {

    public StudentDashboard() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookconsultation_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pastappt_button = new javax.swing.JButton();
        upcomingappt_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pastappt_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bookconsultation_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(upcomingappt_button))
                        .addGap(44, 44, 44)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(bookconsultation_button)
                .addGap(18, 18, 18)
                .addComponent(upcomingappt_button)
                .addGap(18, 18, 18)
                .addComponent(pastappt_button)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bookconsultation_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookconsultation_buttonActionPerformed
        StudentBookConsultation studentBookConsultation = new StudentBookConsultation();
        studentBookConsultation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookconsultation_buttonActionPerformed

    private void pastappt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastappt_buttonActionPerformed
        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();
        studentPastAppointment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pastappt_buttonActionPerformed

    private void upcomingappt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upcomingappt_buttonActionPerformed
        List<String[]> upcomingAppointments = AppointmentManager.getUserUpcomingAppointments(SessionManager.getCurrentUser().getUserID());

        if (upcomingAppointments.isEmpty()) {
            JOptionPane.showMessageDialog(null, "You do not have any upcoming appointments.", "No Appointments", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String[] upcomingAppointmentDetails = upcomingAppointments.get(0);

        StudentUpcomingAppointment studentUpcomingAppointment = new StudentUpcomingAppointment(upcomingAppointmentDetails);
        studentUpcomingAppointment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_upcomingappt_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookconsultation_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pastappt_button;
    private javax.swing.JButton upcomingappt_button;
    // End of variables declaration//GEN-END:variables
}
