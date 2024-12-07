package userinterface;

import entities.UserType;
import javax.swing.JOptionPane;
import services.UserManager;

public class RegisterUI extends javax.swing.JFrame {

    public RegisterUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_text = new javax.swing.JLabel();
        user_text = new javax.swing.JLabel();
        password_text = new javax.swing.JLabel();
        username_enter = new javax.swing.JTextField();
        signup_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        password_enter = new javax.swing.JTextField();
        combo_box_rule = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("Register");
        top_text.setIconTextGap(10);

        user_text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        user_text.setForeground(new java.awt.Color(102, 102, 102));
        user_text.setText("User Name:");

        password_text.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        password_text.setForeground(new java.awt.Color(102, 102, 102));
        password_text.setText("Password:");

        signup_button.setText("Sign up");
        signup_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup_buttonActionPerformed(evt);
            }
        });

        back_button.setText("<");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        combo_box_rule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Lecturer" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_button)
                        .addGap(180, 180, 180)
                        .addComponent(top_text)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(password_text)
                                        .addGap(18, 18, 18)
                                        .addComponent(password_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(user_text)
                                        .addGap(18, 18, 18)
                                        .addComponent(username_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(combo_box_rule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(signup_button)
                                .addGap(213, 213, 213))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(top_text)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_text)
                    .addComponent(combo_box_rule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_text)
                    .addComponent(password_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(signup_button)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signup_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup_buttonActionPerformed
        String username = username_enter.getText().trim();
        String password = password_enter.getText().trim();
        String selectedValue = (String) combo_box_rule.getSelectedItem();

        if (username == null || username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a password", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if ("Student".equals(selectedValue)) {
            UserManager.registerUser(username, password, UserType.STUDENT);
        } else if ("Lecturer".equals(selectedValue)) {
            UserManager.registerUser(username, password, UserType.LECTURER);
        }

        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signup_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
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
            java.util.logging.Logger.getLogger(RegisterUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JComboBox<String> combo_box_rule;
    private javax.swing.JTextField password_enter;
    private javax.swing.JLabel password_text;
    private javax.swing.JButton signup_button;
    private javax.swing.JLabel top_text;
    private javax.swing.JLabel user_text;
    private javax.swing.JTextField username_enter;
    // End of variables declaration//GEN-END:variables
}
