package userinterface;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import services.FeedbackManager;

public class StudentFeedbackAndRatings extends javax.swing.JFrame {

    private int selectedRating = 0;
    private JButton selectedButton = null;
    private final int appointmentID;

    public StudentFeedbackAndRatings(int appointmentID, String[] appointmentDetails) {
        initComponents();

        this.appointmentID = appointmentID;

        if (appointmentDetails != null && appointmentDetails.length == 4) {
            jLabel5.setText("Lecturer Name: " + appointmentDetails[0]);
            jLabel7.setText("Date: " + appointmentDetails[1]);
            jLabel6.setText("Time: " + appointmentDetails[2]);
            jLabel8.setText("Status: " + appointmentDetails[3]);
        }

        initStarButtons();
    }

    private void initStarButtons() {
        onestar_button.addActionListener(evt -> onStarButtonClicked(onestar_button));
        twostar_button.addActionListener(evt -> onStarButtonClicked(twostar_button));
        threestar_button.addActionListener(evt -> onStarButtonClicked(threestar_button));
        fourstar_button.addActionListener(evt -> onStarButtonClicked(fourstar_button));
        fivestar_button.addActionListener(evt -> onStarButtonClicked(fivestar_button));
    }

    private void onStarButtonClicked(JButton clickedButton) {
        if (selectedButton != null) {
            selectedButton.setBackground(null);
            selectedButton.setForeground(Color.BLACK);
        }

        clickedButton.setBackground(Color.DARK_GRAY);
        clickedButton.setForeground(Color.WHITE);

        selectedButton = clickedButton;

        selectedRating = Integer.parseInt(clickedButton.getText());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        fivestar_button = new javax.swing.JButton();
        fourstar_button = new javax.swing.JButton();
        threestar_button = new javax.swing.JButton();
        twostar_button = new javax.swing.JButton();
        onestar_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fivestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fivestar_button.setForeground(new java.awt.Color(102, 102, 102));
        fivestar_button.setText("5");
        fivestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fivestar_buttonActionPerformed(evt);
            }
        });

        fourstar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        fourstar_button.setForeground(new java.awt.Color(102, 102, 102));
        fourstar_button.setText("4");
        fourstar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourstar_buttonActionPerformed(evt);
            }
        });

        threestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        threestar_button.setForeground(new java.awt.Color(102, 102, 102));
        threestar_button.setText("3");
        threestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threestar_buttonActionPerformed(evt);
            }
        });

        twostar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        twostar_button.setForeground(new java.awt.Color(102, 102, 102));
        twostar_button.setText("2");
        twostar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twostar_buttonActionPerformed(evt);
            }
        });

        onestar_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        onestar_button.setForeground(new java.awt.Color(102, 102, 102));
        onestar_button.setText("1");
        onestar_button.setActionCommand("1 Star");
        onestar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onestar_buttonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ratings:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Comment:");

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Feedback");

        submit_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        submit_button.setForeground(new java.awt.Color(102, 102, 102));
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Lecturer Name: ");

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Time: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Date: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Status: ");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_button)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit_button)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(onestar_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(twostar_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(threestar_button)
                                        .addGap(18, 18, 18)
                                        .addComponent(fourstar_button)))
                                .addGap(18, 18, 18)
                                .addComponent(fivestar_button)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(onestar_button)
                    .addComponent(twostar_button)
                    .addComponent(threestar_button)
                    .addComponent(fourstar_button)
                    .addComponent(fivestar_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submit_button)
                .addGap(8, 8, 8))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void onestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onestar_buttonActionPerformed
        selectedRating = 1;
    }//GEN-LAST:event_onestar_buttonActionPerformed

    private void fourstar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourstar_buttonActionPerformed
        selectedRating = 4;
    }//GEN-LAST:event_fourstar_buttonActionPerformed

    private void twostar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twostar_buttonActionPerformed
        selectedRating = 2;
    }//GEN-LAST:event_twostar_buttonActionPerformed

    private void threestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threestar_buttonActionPerformed
        selectedRating = 3;
    }//GEN-LAST:event_threestar_buttonActionPerformed

    private void fivestar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fivestar_buttonActionPerformed
        selectedRating = 5;
    }//GEN-LAST:event_fivestar_buttonActionPerformed

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        if (selectedRating == 0) {
            JOptionPane.showMessageDialog(null, "Please select a rating", "Rating Missing", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (jTextArea2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide a comment", "Comment Missing", JOptionPane.WARNING_MESSAGE);
            return;
        }

        /* Note: for addStudentFeedback check if there are any existing feedback of the appointment that has a lecturer feedback in it
                 update the existing feedback if there is
                 else call FileManager.addNewFeedback(appointmentID, rating, studentComment, lecturerComment) and put lecturerComment as null
         */
        // FeedbackManager.addStudentFeedback(appointmentID, selectedRating, jTextArea2.getText().trim());
        JOptionPane.showMessageDialog(null, "Thank you for your feedback!", "Feedback Submitted", JOptionPane.INFORMATION_MESSAGE);

        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();
        studentPastAppointment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        StudentPastAppointment studentPastAppointment = new StudentPastAppointment();
        studentPastAppointment.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentFeedbackAndRatings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JButton fivestar_button;
    private javax.swing.JButton fourstar_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton onestar_button;
    private javax.swing.JButton submit_button;
    private javax.swing.JButton threestar_button;
    private javax.swing.JButton twostar_button;
    // End of variables declaration//GEN-END:variables
}
