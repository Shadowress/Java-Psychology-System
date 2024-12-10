package userinterface;

import entities.AppointmentStatus;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.AppointmentManager;
import services.SessionManager;

public class LecturerUpcomingAppointment extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public LecturerUpcomingAppointment() {
        initComponents();
        initializeUpcomingAppointmentTable();
    }

    private void initializeUpcomingAppointmentTable() {
        String[] columns = {"Lecturer Name", "Date", "Time", "Status"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        upcomingAppointmentTable.setModel(tableModel);
        upcomingAppointmentTable.getTableHeader().setReorderingAllowed(false);
        upcomingAppointmentTable.setRowSelectionAllowed(false);
        upcomingAppointmentTable.setColumnSelectionAllowed(false);
        upcomingAppointmentTable.setCellSelectionEnabled(false);
        upcomingAppointmentTable.setFocusable(false);

        tableModel.setRowCount(0);

        for (String[] appointment : AppointmentManager.getUserUpcomingAppointments(SessionManager.getCurrentUser().getUserID())) {
            if (!appointment[3].equalsIgnoreCase(AppointmentStatus.CANCELLED.toString())) {
                tableModel.addRow(appointment);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_text = new javax.swing.JLabel();
        viewReschedule = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        upcomingAppointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("Upcoming Appointment ");

        viewReschedule.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        viewReschedule.setForeground(new java.awt.Color(102, 102, 102));
        viewReschedule.setText("View Reschedule Request");
        viewReschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRescheduleActionPerformed(evt);
            }
        });

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        upcomingAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(upcomingAppointmentTable);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewReschedule)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(back_button)
                            .addGap(160, 160, 160)
                            .addComponent(top_text))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_button)
                    .addComponent(top_text, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(viewReschedule)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewRescheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRescheduleActionPerformed
        if (AppointmentManager.getUserRescheduleAppointments(SessionManager.getCurrentUser().getUserID()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "There are no rescheduled appointments", "No Rescheduled Appointments", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        LecturerApproveOrRejectRescheduling lecturerApproveOrRejectRescheduling = new LecturerApproveOrRejectRescheduling();
        lecturerApproveOrRejectRescheduling.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewRescheduleActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LecturerDashboard lecturerDashboard = new LecturerDashboard();
        lecturerDashboard.setVisible(true);
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
            java.util.logging.Logger.getLogger(LecturerUpcomingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel top_text;
    private javax.swing.JTable upcomingAppointmentTable;
    private javax.swing.JButton viewReschedule;
    // End of variables declaration//GEN-END:variables
}
