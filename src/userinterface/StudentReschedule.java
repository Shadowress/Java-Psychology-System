package userinterface;

import datastorage.FileManager;
import datastorage.FileWriterAppender;
import entities.Appointment;
import entities.AppointmentStatus;
import entities.Slot;
import entities.Users;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.SlotManager;

public class StudentReschedule extends javax.swing.JFrame {

    private DefaultTableModel tableModel;
    private int lecturerID;
    private final int appointmentID;
    private int rescheduleSlotID;

    public StudentReschedule(int appointmentID, String lecturerName) {
        initComponents();
        initializeSlotTable(lecturerName);

        jLabel5.setText("Lecturer Name: " + lecturerName);

        this.appointmentID = appointmentID;
    }

    private void initializeSlotTable(String lecturerName) {
        String[] columns = {"Date", "Time"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        slotTable.setModel(tableModel);
        slotTable.getTableHeader().setReorderingAllowed(false);
        slotTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lecturerID = FileManager.getUserIDFromUsername(lecturerName);

        for (String[] slot : SlotManager.getAvailableLecturerSlots(lecturerID)) {
            tableModel.addRow(slot);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        change_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        slotTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("24-Hour Time");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Reschedule");

        change_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        change_button.setForeground(new java.awt.Color(102, 102, 102));
        change_button.setText("Confirm reschedule");
        change_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_buttonActionPerformed(evt);
            }
        });

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        slotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(slotTable);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Lecturer Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(change_button)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(back_button)
                            .addGap(112, 112, 112)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(change_button)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void change_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_buttonActionPerformed
        int selectedRow = slotTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "No slot is selected!", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to reschedule the appointment to the selected slot?", "Confirm Reschedule", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            LocalDate date = LocalDate.parse((String) tableModel.getValueAt(selectedRow, 0));
            LocalTime time = LocalTime.parse((String) tableModel.getValueAt(selectedRow, 1));

            rescheduleSlotID = FileManager.getSlotIDFromSlotDetails(lecturerID, date, time);

            FileManager.getAppointment(appointmentID).setStatus(AppointmentStatus.RESCHEDULE_PENDING);
            FileManager.getAppointment(appointmentID).setRescheduleSlotID(rescheduleSlotID);
            FileWriterAppender.writeAppointments();
            JOptionPane.showMessageDialog(null, "Your reschedule request has been successfully submitted", "Reschedule Request Submitted", JOptionPane.INFORMATION_MESSAGE);

            Map<Integer, Users> users = FileManager.getUsers();
            Map<Integer, Appointment> appointments = FileManager.getAppointments();
            Map<Integer, Slot> slots = FileManager.getSlots();

            int slotID = appointments.get(appointmentID).getSlotID();

            String lecturerName = users.get(slots.get(slotID).getLecturerID()).getUsername();
            String slotDate = FileManager.getSlot(slotID).getDate().toString();
            String slotTime = FileManager.getSlot(slotID).getTime().toString();
            String status = FileManager.getAppointment(appointmentID).getStatus().toString().toLowerCase().replace("_", " ");

            StudentUpcomingAppointment studentUpcomingAppointment = new StudentUpcomingAppointment(new String[]{lecturerName, slotDate, slotTime, status});
            studentUpcomingAppointment.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_change_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        Map<Integer, Users> users = FileManager.getUsers();
        Map<Integer, Appointment> appointments = FileManager.getAppointments();
        Map<Integer, Slot> slots = FileManager.getSlots();

        int slotID = appointments.get(appointmentID).getSlotID();

        String lecturerName = users.get(slots.get(slotID).getLecturerID()).getUsername();
        String slotDate = FileManager.getSlot(slotID).getDate().toString();
        String slotTime = FileManager.getSlot(slotID).getTime().toString();
        String status = FileManager.getAppointment(appointmentID).getStatus().toString().toLowerCase().replace("_", " ");

        StudentUpcomingAppointment studentUpcomingAppointment = new StudentUpcomingAppointment(new String[]{lecturerName, slotDate, slotTime, status});
        studentUpcomingAppointment.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentReschedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton change_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTable slotTable;
    // End of variables declaration//GEN-END:variables
}
