package userinterface;

import javax.swing.JOptionPane;
import services.UserManager;

public class LoginUI extends javax.swing.JFrame {

    public LoginUI() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_text = new javax.swing.JLabel();
        username_enter = new javax.swing.JTextField();
        Nothing = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        password_text = new javax.swing.JLabel();
        password_enter = new javax.swing.JPasswordField();
        register_button = new javax.swing.JButton();
        username_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        top_text.setFont(new java.awt.Font("Bernard MT Condensed", 0, 24)); // NOI18N
        top_text.setForeground(new java.awt.Color(51, 153, 255));
        top_text.setText("APU Psychology Consultation ");
        top_text.setIconTextGap(5);

        Nothing.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        Nothing.setForeground(new java.awt.Color(102, 102, 102));
        Nothing.setText("Dont have an account ?");

        login_button.setFont(new java.awt.Font("Bernard MT Condensed", 0, 18)); // NOI18N
        login_button.setForeground(new java.awt.Color(102, 102, 102));
        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        password_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        password_text.setForeground(new java.awt.Color(102, 102, 102));
        password_text.setText("Password:");

        register_button.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        register_button.setForeground(new java.awt.Color(102, 102, 102));
        register_button.setText("Register here");
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });

        username_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        username_text.setForeground(new java.awt.Color(102, 102, 102));
        username_text.setText("Username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(login_button)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(top_text)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(password_text)
                                        .addGap(18, 18, 18)
                                        .addComponent(password_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(username_text)
                                        .addGap(18, 18, 18)
                                        .addComponent(username_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Nothing)
                                        .addGap(18, 18, 18)
                                        .addComponent(register_button)))
                                .addGap(24, 24, 24)))
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(top_text)
                .addGap(26, 26, 26)
                .addComponent(login_button)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_text))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password_enter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password_text))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_button)
                    .addComponent(Nothing))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
        RegisterUI registerUI = new RegisterUI();
        registerUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_register_buttonActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        String username = username_enter.getText().trim();
        String password = password_enter.getText().trim();

        if (username == null || username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a password", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        UserManager.login(this, username, password);
    }//GEN-LAST:event_login_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nothing;
    private javax.swing.JButton login_button;
    private javax.swing.JPasswordField password_enter;
    private javax.swing.JLabel password_text;
    private javax.swing.JButton register_button;
    private javax.swing.JLabel top_text;
    private javax.swing.JTextField username_enter;
    private javax.swing.JLabel username_text;
    // End of variables declaration//GEN-END:variables
}
