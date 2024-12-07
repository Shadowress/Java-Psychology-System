package userinterface;

import datastorage.FileManager;
import entities.Appointment;
import entities.AppointmentStatus;
import entities.Slot;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import javax.swing.JOptionPane;

public class StudentUpcomingAppointment extends javax.swing.JFrame {

    private final String lecturerName;
    private final String status;
    private int appointmentID = 0;
    private int slotID = 0;

    public StudentUpcomingAppointment(String[] appointmentDetails) {
        initComponents();

        lecturerName = appointmentDetails[0];
        LocalDate date = LocalDate.parse(appointmentDetails[1]);
        LocalTime time = LocalTime.parse(appointmentDetails[2]);
        status = appointmentDetails[3];
        String rescheduleDateTime = "";

        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();
        
        slotID = FileManager.getSlotIDFromSlotDetails(FileManager.getUserIDFromUsername(lecturerName), date, time);
        appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);

        if (status.equalsIgnoreCase(AppointmentStatus.RESCHEDULE_PENDING.toString().replace("_", " "))) {
            int rescheduleSlotID = appointments.get(appointmentID).getRescheduleSlotID();
            rescheduleDateTime = "Rescheduled DateTime: " + slots.get(rescheduleSlotID).getDate() + " " + slots.get(rescheduleSlotID).getTime();
        }

        jLabel5.setText("Lecturer Name: " + lecturerName);
        jLabel7.setText("Date: " + date);
        jLabel6.setText("Time: " + time);
        jLabel8.setText("Status: " + status);
        jLabel9.setText(rescheduleDateTime);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        resched_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Upcoming Appointment ");

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        cancel_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        cancel_button.setForeground(new java.awt.Color(102, 102, 102));
        cancel_button.setText("Cancel Appointment");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        resched_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        resched_button.setForeground(new java.awt.Color(102, 102, 102));
        resched_button.setText("Reschedule Appointment");
        resched_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resched_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Lecturer Name: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Date: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Time: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Status: ");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Rescheduled DateTime: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(cancel_button)
                .addGap(69, 69, 69)
                .addComponent(resched_button)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_button)
                                .addGap(323, 323, 323))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(jLabel7))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(235, 235, 235)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_button)
                    .addComponent(resched_button))
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this appointment?", "Confirm Cancellation", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            // Note: Remember to change reschedule_slot_id to -1 as well in cases where the cancelled appointment is requested for rescheduling
            // AppointmentManager.cancelAppointment(appointmentID);
            JOptionPane.showMessageDialog(null, "The appointment has been successfully canceled", "Cancellation Successful", JOptionPane.INFORMATION_MESSAGE);

            StudentDashboard studentDashboard = new StudentDashboard();
            studentDashboard.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void resched_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resched_buttonActionPerformed
        if (status.equalsIgnoreCase(AppointmentStatus.RESCHEDULE_PENDING.toString().replace("_", " "))) {
            JOptionPane.showMessageDialog(null, "Reschedule has already been requested", "Action Not Allowed", JOptionPane.WARNING_MESSAGE);
            return;
        }

        StudentReschedule studentReschedule = new StudentReschedule(appointmentID, lecturerName);
        studentReschedule.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resched_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUpcomingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton resched_button;
    // End of variables declaration//GEN-END:variables
}
