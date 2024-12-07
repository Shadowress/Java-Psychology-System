package userinterface;

import datastorage.FileManager;
import entities.AppointmentStatus;
import entities.Feedback;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AppointmentManager;
import services.SessionManager;

public class StudentPastAppointment extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public StudentPastAppointment() {
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

        tableModel.setRowCount(0);

        for (String[] appointment : AppointmentManager.getUserPastAppointments(SessionManager.getCurrentUser().getUserID())) {
            tableModel.addRow(appointment);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        feedback_button = new javax.swing.JButton();
        viewfeedback_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        pastAppointmentTable = new javax.swing.JTable();

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Cancel");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Past Appointment ");

        feedback_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        feedback_button.setForeground(new java.awt.Color(102, 102, 102));
        feedback_button.setText("Feedback And Rating ");
        feedback_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedback_buttonActionPerformed(evt);
            }
        });

        viewfeedback_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        viewfeedback_button.setForeground(new java.awt.Color(102, 102, 102));
        viewfeedback_button.setText("View Lecturer Feedback");
        viewfeedback_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewfeedback_buttonActionPerformed(evt);
            }
        });

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
                "Lecturer Name", "Date", "Time", "Status"
            }
        ));
        jScrollPane3.setViewportView(pastAppointmentTable);

        jScrollPane1.setViewportView(jScrollPane3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button)
                        .addGap(80, 80, 80)
                        .addComponent(feedback_button)
                        .addGap(67, 67, 67)
                        .addComponent(viewfeedback_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(feedback_button)
                    .addComponent(viewfeedback_button))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void feedback_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedback_buttonActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No past appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String lecturerName = (String) tableModel.getValueAt(selectedRow, 0);
        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (status.equalsIgnoreCase(AppointmentStatus.CANCELLED.toString())) {
            JOptionPane.showMessageDialog(null, "You cannot provide feedback to cancelled appointments", "Feedback Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Map<Integer, Feedback> feedbacks = FileManager.getFeedbacks();

        int slotID = FileManager.getSlotIDFromSlotDetails(FileManager.getUserIDFromUsername(lecturerName), date, time);
        int appointmentID = FileManager.getAppointmentIDFromSlotID(slotID);
        int feedbackID = FileManager.getFeedbackIDFromAppointmentID(appointmentID);

        if (feedbackID != 0 && feedbacks.get(feedbackID).getRating() != -1) {
            JOptionPane.showMessageDialog(null,
                    "Rating: " + feedbacks.get(feedbackID).getRating() + "\n"
                    + "Comment: " + feedbacks.get(feedbackID).getStudentComment(),
                    "Feedback View",
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        String[] appointmentDetails = new String[]{lecturerName, date.toString(), time.toString(), status};

        StudentFeedbackAndRatings studentFeedbackAndRatings = new StudentFeedbackAndRatings(appointmentID, appointmentDetails);
        studentFeedbackAndRatings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_feedback_buttonActionPerformed

    private void viewfeedback_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewfeedback_buttonActionPerformed
        int selectedRow = pastAppointmentTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No past appointment is selected", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String lecturerName = (String) tableModel.getValueAt(selectedRow, 0);
        LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 1));
        LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 2));
        String status = (String) tableModel.getValueAt(selectedRow, 3);

        if (status.equalsIgnoreCase(AppointmentStatus.CANCELLED.toString())) {
            JOptionPane.showMessageDialog(null, "There is no feedback for cancelled appointments", "Feedback Not Available", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Map<Integer, Feedback> feedbacks = FileManager.getFeedbacks();

        int slotID = FileManager.getSlotIDFromSlotDetails(FileManager.getUserIDFromUsername(lecturerName), date, time);
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

        JOptionPane.showMessageDialog(null, "The lecturer did not provide any comments", "No Comments", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_viewfeedback_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        StudentDashboard studentDashboard = new StudentDashboard();
        studentDashboard.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentPastAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton feedback_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable pastAppointmentTable;
    private javax.swing.JButton viewfeedback_button;
    // End of variables declaration//GEN-END:variables
}
