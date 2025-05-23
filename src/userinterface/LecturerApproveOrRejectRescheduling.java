package userinterface;

import datastorage.FileManager;
import datastorage.FileWriterAppender;
import entities.AppointmentStatus;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AppointmentManager;
import services.SessionManager;

public class LecturerApproveOrRejectRescheduling extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public LecturerApproveOrRejectRescheduling() {
        initComponents();
        initializeRescheduleAppointmentTable();
    }

    private void initializeRescheduleAppointmentTable() {
        String[] columns = {"Student Name", "Date", "Time", "Reschedule Date", "Reschedule Time"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        rescheduleAppointmentTable.setModel(tableModel);
        rescheduleAppointmentTable.getTableHeader().setReorderingAllowed(false);
        rescheduleAppointmentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        addRescheduleAppointmentToTable();
    }

    private void addRescheduleAppointmentToTable() {
        tableModel.setRowCount(0);

        for (String[] appointment : AppointmentManager.getUserRescheduleAppointments(SessionManager.getCurrentUser().getUserID())) {

            tableModel.addRow(appointment);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_text = new javax.swing.JLabel();
        reject_button = new javax.swing.JButton();
        approve_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        rescheduleAppointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("Confirmation Of Rescheduling");

        reject_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        reject_button.setForeground(new java.awt.Color(102, 102, 102));
        reject_button.setText("Reject Reschedule");
        reject_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reject_buttonActionPerformed(evt);
            }
        });

        approve_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        approve_button.setForeground(new java.awt.Color(102, 102, 102));
        approve_button.setText("Approve Reschedule");
        approve_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approve_buttonActionPerformed(evt);
            }
        });

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        rescheduleAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student Name", "Date", "Time", "Reschedule Date", "Reschedule Time"
            }
        ));
        jScrollPane4.setViewportView(rescheduleAppointmentTable);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(approve_button)
                        .addGap(89, 89, 89)
                        .addComponent(reject_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(top_text)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addGap(17, 17, 17)
                .addComponent(top_text)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reject_button)
                    .addComponent(approve_button))
                .addGap(67, 67, 67))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(114, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void reject_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reject_buttonActionPerformed
        int selectedRow = rescheduleAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String studentName = (String) tableModel.getValueAt(selectedRow, 0);
        String originalDate = (String) tableModel.getValueAt(selectedRow, 1);
        String originalTime = (String) tableModel.getValueAt(selectedRow, 2);
        String rescheduleDate = (String) tableModel.getValueAt(selectedRow, 3);
        String rescheduleTime = (String) tableModel.getValueAt(selectedRow, 4);

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to cancel this rescheduling?\n\n" +
                "Student: " + studentName + "\n"
                + "Original Slot: " + originalDate + " " + originalTime + "\n"
                + "Rescheduled Slot: " + rescheduleDate + " " + rescheduleTime,
                "Confirm Cancellation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            int appointmentID = FileManager.getAppointmentIDFromSlotID(FileManager.getSlotIDFromSlotDetails(
                    SessionManager.getCurrentUser().getUserID(),
                    LocalDate.parse(originalDate),
                    LocalTime.parse(originalTime)
            ));

            FileManager.getAppointment(appointmentID).setStatus(AppointmentStatus.SCHEDULED);
            FileManager.getAppointment(appointmentID).setRescheduleSlotID(-1);
            FileWriterAppender.writeAppointments();

            JOptionPane.showMessageDialog(null, "The rescheduling has been cancelled successfully", "Cancellation Successful", JOptionPane.INFORMATION_MESSAGE);

            addRescheduleAppointmentToTable();

            if (tableModel.getRowCount() == 0) {
                LecturerUpcomingAppointment lecturerUpcomingAppointment = new LecturerUpcomingAppointment();
                lecturerUpcomingAppointment.setVisible(true);
                this.dispose();
            }
        }    }//GEN-LAST:event_reject_buttonActionPerformed

    private void approve_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approve_buttonActionPerformed
        int selectedRow = rescheduleAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String studentName = (String) tableModel.getValueAt(selectedRow, 0);
        String originalDate = (String) tableModel.getValueAt(selectedRow, 1);
        String originalTime = (String) tableModel.getValueAt(selectedRow, 2);
        String rescheduleDate = (String) tableModel.getValueAt(selectedRow, 3);
        String rescheduleTime = (String) tableModel.getValueAt(selectedRow, 4);

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to approve this rescheduling?\n\n" +                
                "Student: " + studentName + "\n"
                + "Original Slot: " + originalDate + " " + originalTime + "\n"
                + "Rescheduled Slot: " + rescheduleDate + " " + rescheduleTime,
                "Confirm Approval",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            int appointmentID = FileManager.getAppointmentIDFromSlotID(FileManager.getSlotIDFromSlotDetails(
                    SessionManager.getCurrentUser().getUserID(),
                    LocalDate.parse(originalDate),
                    LocalTime.parse(originalTime)
            ));

            int rescheduleSlotID = FileManager.getSlotIDFromSlotDetails(
                    SessionManager.getCurrentUser().getUserID(),
                    LocalDate.parse(rescheduleDate),
                    LocalTime.parse(rescheduleTime)
            );

            FileManager.getAppointment(appointmentID).setSlotID(rescheduleSlotID);
            FileManager.getAppointment(appointmentID).setStatus(AppointmentStatus.SCHEDULED);
            FileManager.getAppointment(appointmentID).setRescheduleSlotID(-1);
            FileWriterAppender.writeAppointments();

            JOptionPane.showMessageDialog(null, "The rescheduling has been approved successfully", "Approval Successful", JOptionPane.INFORMATION_MESSAGE);

            addRescheduleAppointmentToTable();

            if (tableModel.getRowCount() == 0) {
                LecturerUpcomingAppointment lecturerUpcomingAppointment = new LecturerUpcomingAppointment();
                lecturerUpcomingAppointment.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_approve_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LecturerUpcomingAppointment lecturerUpcomingAppointment = new LecturerUpcomingAppointment();
        lecturerUpcomingAppointment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerApproveOrRejectRescheduling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approve_button;
    private javax.swing.JButton back_button;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton reject_button;
    private javax.swing.JTable rescheduleAppointmentTable;
    private javax.swing.JLabel top_text;
    // End of variables declaration//GEN-END:variables
}
