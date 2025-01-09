package userinterface;

import datastorage.FileManager;
import entities.Slot;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import services.SessionManager;
import services.SlotManager;

public class LecturerSetConsultationSlot extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    public LecturerSetConsultationSlot() {
        initComponents();
        initializeSlotTable();
        initializeTimeSlots();
    }

    private void initializeSlotTable() {
        String[] columns = {"Date", "Time"};

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        slotTable.setModel(tableModel);
        slotTable.getTableHeader().setReorderingAllowed(false);
        slotTable.setRowSelectionAllowed(false);
        slotTable.setColumnSelectionAllowed(false);
        slotTable.setCellSelectionEnabled(false);
        slotTable.setFocusable(false);

        addSlotsToTable();
    }

    private void addSlotsToTable() {
        tableModel.setRowCount(0);

        for (Slot slot : FileManager.getSlots().values()) {
            if (slot.getLecturerID() == SessionManager.getCurrentUser().getUserID()) {
                LocalDateTime slotDateTime = LocalDateTime.of(slot.getDate(), slot.getTime());

                if (slotDateTime.isAfter(LocalDateTime.now())) {
                    String[] row = {slot.getDate().toString(), slot.getTime().toString()};
                    tableModel.addRow(row);
                }
            }
        }
    }

    private void initializeTimeSlots() {
        for (int hour = 8; hour <= 18; hour++) {
            String amPm = hour < 12 ? "AM" : "PM";
            int formattedHour = (hour == 0 || hour == 12) ? 12 : hour % 12;

            timeSelection.addItem(String.format("%02d:00 %s", formattedHour, amPm));

            if (hour < 18) {
                timeSelection.addItem(String.format("%02d:30 %s", formattedHour, amPm));
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        top_text = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        Confirm_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        slotTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        dateSelection = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        timeSelection = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 200));

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("Set Consultation Slot");
        top_text.setIconTextGap(5);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        Confirm_button.setText("Add Slot");
        Confirm_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_buttonActionPerformed(evt);
            }
        });

        slotTable.setForeground(new java.awt.Color(51, 153, 255));
        slotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Time"
            }
        ));
        jScrollPane2.setViewportView(slotTable);

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Time: ");

        dateSelection.setDateFormatString("dd-MM-yyyy");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Date: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button)
                        .addGap(79, 79, 79)
                        .addComponent(top_text))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(timeSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Confirm_button)
                                .addGap(21, 21, 21)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_button)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(top_text)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(timeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Confirm_button)))
                        .addGap(29, 29, 29))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LecturerDashboard lecturerDashboard = new LecturerDashboard();
        lecturerDashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_buttonActionPerformed

    private void Confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_buttonActionPerformed
        if (dateSelection.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select a date", "Selection Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate date = dateSelection.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalTime time = LocalTime.parse((String) timeSelection.getSelectedItem(), DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH));

        if (!date.isAfter(currentDate.plusDays(2))) {
            JOptionPane.showMessageDialog(null, "The selected date must be at least 3 days after today", "Invalid Date Selection", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (SlotManager.isSlotAlreadySet(SessionManager.getCurrentUser().getUserID(), date, time)) {
            JOptionPane.showMessageDialog(null, "The selected date and time have already been set", "Slot Already Set", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to add the selected consultation slot?\nDate: " + date + "\nTime: " + time,
                "Confirm Slot Addition",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirmation == JOptionPane.YES_OPTION) {
            FileManager.addNewSlot(SessionManager.getCurrentUser().getUserID(), date, time);
            JOptionPane.showMessageDialog(null, "The consultation slot has been added successfully", "Slot Added", JOptionPane.INFORMATION_MESSAGE);
            addSlotsToTable();
        }
    }//GEN-LAST:event_Confirm_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerSetConsultationSlot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirm_button;
    private javax.swing.JButton back_button;
    private com.toedter.calendar.JDateChooser dateSelection;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable slotTable;
    private javax.swing.JComboBox<String> timeSelection;
    private javax.swing.JLabel top_text;
    // End of variables declaration//GEN-END:variables
}
