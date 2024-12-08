package userinterface;

import datastorage.FileManager;
import datastorage.FileWriterAppender;
import entities.AppointmentStatus;
import entities.Feedback;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AppointmentManager;
import services.SessionManager;

public class LecturerPastAppointment extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public LecturerPastAppointment() {
        initComponents();
        initializePastAppointmentTable();
    }

    private void initializePastAppointmentTable() {
        String[] columns = {"Lecturer Name", "Date", "Time", "Status"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        pastAppointmentTable.setModel(tableModel);
        pastAppointmentTable.getTableHeader().setReorderingAllowed(false);
        pastAppointmentTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        addSlotsToTable();
    }

    private void addSlotsToTable() {
        tableModel.setRowCount(0);

        for (String[] appointment : AppointmentManager.getUserPastAppointments(SessionManager.getCurrentUser().getUserID())) {
            tableModel.addRow(appointment);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        pastAppointmentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        giveComments = new javax.swing.JButton();
        viewfeedback_button = new javax.swing.JButton();
        markCompleted = new javax.swing.JButton();
        markCancelled = new javax.swing.JButton();

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

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        pastAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Name", "Date", "Time", "Status"
            }
        ));
        jScrollPane4.setViewportView(pastAppointmentTable);

        jScrollPane3.setViewportView(jScrollPane4);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Past Appointment ");

        giveComments.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        giveComments.setForeground(new java.awt.Color(102, 102, 102));
        giveComments.setText("Give Comments");
        giveComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveCommentsActionPerformed(evt);
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

        markCompleted.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        markCompleted.setForeground(new java.awt.Color(102, 102, 102));
        markCompleted.setText("Mark As Completed");
        markCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markCompletedActionPerformed(evt);
            }
        });

        markCancelled.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        markCancelled.setForeground(new java.awt.Color(102, 102, 102));
        markCancelled.setText("Mark As Cancelled");
        markCancelled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markCancelledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(jLabel1)
                            .addGap(154, 154, 154))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewfeedback_button)
                        .addGap(76, 76, 76)
                        .addComponent(markCancelled)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(giveComments)
                        .addGap(91, 91, 91)
                        .addComponent(markCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giveComments)
                    .addComponent(markCompleted))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markCancelled)
                    .addComponent(viewfeedback_button))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LecturerDashboard lecturerDashboard = new LecturerDashboard();
        lecturerDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void giveCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveCommentsActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No past appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String studentName = (String) tableModel.getValueAt(selectedRow, 0);
        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (!status.equalsIgnoreCase(AppointmentStatus.COMPLETED.toString())) {
            JOptionPane.showMessageDialog(null, "You can only provide feedback to completed appointments", "Feedback Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Map<Integer, Feedback> feedbacks = FileManager.getFeedbacks();

        int slotID = FileManager.getSlotIDFromSlotDetails(SessionManager.getCurrentUser().getUserID(), date, time);
        int appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);
        int feedbackID = FileManager.getFeedbackIDFromAppointmentID(appointmentID);

        if (feedbackID != 0 && feedbacks.get(feedbackID).getLecturerComment() != null) {
            JOptionPane.showMessageDialog(null,
                    "Comment: " + feedbacks.get(feedbackID).getLecturerComment(),
                    "Feedback View",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        String[] appointmentDetails = new String[]{studentName, date.toString(), time.toString(), status};

        LecturerFeedback lecturerFeedback = new LecturerFeedback(appointmentID, appointmentDetails);
        lecturerFeedback.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_giveCommentsActionPerformed

    private void viewfeedback_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfeedback_buttonActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No past appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (!status.equalsIgnoreCase(AppointmentStatus.COMPLETED.toString())) {
            JOptionPane.showMessageDialog(null, "There can only be feedback for completed appointments", "Feedback Not Available", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Map<Integer, Feedback> feedbacks = FileManager.getFeedbacks();

        int slotID = FileManager.getSlotIDFromSlotDetails(SessionManager.getCurrentUser().getUserID(), date, time);
        int appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);
        int feedbackID = FileManager.getFeedbackIDFromAppointmentID(appointmentID);

        if (feedbackID != 0 && feedbacks.get(feedbackID).getStudentComment() != null) {
            JOptionPane.showMessageDialog(null,
                    "Rating: " + feedbacks.get(feedbackID).getRating() + "\n"
                    + "Comment: " + feedbacks.get(feedbackID).getStudentComment(),
                    "Feedback View",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        JOptionPane.showMessageDialog(null, "The student did not provide any comments", "No Comments", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_viewfeedback_buttonActionPerformed

    private void markCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markCompletedActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an appointment to mark as completed", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (status.equalsIgnoreCase(AppointmentStatus.COMPLETED.toString())) {
            JOptionPane.showMessageDialog(null, "This appointment is already marked as completed", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (status.equalsIgnoreCase(AppointmentStatus.CANCELLED.toString())) {
            JOptionPane.showMessageDialog(null, "Cancelled appointments cannot be marked as completed", "Action Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int slotID = FileManager.getSlotIDFromSlotDetails(SessionManager.getCurrentUser().getUserID(), date, time);
        int appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to mark this appointment as completed?",
                "Confirm Mark as Completed",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            FileManager.getAppointment(appointmentID).setStatus(AppointmentStatus.COMPLETED);
            FileWriterAppender.writeAppointments();
            JOptionPane.showMessageDialog(null, "Appointment has been successfully marked as completed", "Appointment Marked As Completed", JOptionPane.INFORMATION_MESSAGE);
        }

        addSlotsToTable();
    }//GEN-LAST:event_markCompletedActionPerformed

    private void markCancelledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markCancelledActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an appointment to mark as cancelled", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (status.equalsIgnoreCase(AppointmentStatus.CANCELLED.toString())) {
            JOptionPane.showMessageDialog(null, "This appointment is already marked as cancelled", "Information", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (status.equalsIgnoreCase(AppointmentStatus.COMPLETED.toString())) {
            JOptionPane.showMessageDialog(null, "Completed appointments cannot be marked as completed", "Action Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int slotID = FileManager.getSlotIDFromSlotDetails(SessionManager.getCurrentUser().getUserID(), date, time);
        int appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to mark this appointment as cancelled?",
                "Confirm Mark as Completed",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            FileManager.getAppointment(appointmentID).setStatus(AppointmentStatus.CANCELLED);
            FileWriterAppender.writeAppointments();
            JOptionPane.showMessageDialog(null, "Appointment has been successfully marked as cancelled", "Appointment Marked As Cancelled", JOptionPane.INFORMATION_MESSAGE);
        }

        addSlotsToTable();
    }//GEN-LAST:event_markCancelledActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerPastAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton giveComments;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton markCancelled;
    private javax.swing.JButton markCompleted;
    private javax.swing.JTable pastAppointmentTable;
    private javax.swing.JButton viewfeedback_button;
    // End of variables declaration//GEN-END:variables
}
