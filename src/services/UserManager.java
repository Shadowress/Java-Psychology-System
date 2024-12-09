package services;

import datastorage.FileManager;
import entities.UserType;
import entities.Users;
import javax.swing.JOptionPane;
import userinterface.LecturerDashboard;
import userinterface.LoginUI;
import userinterface.StudentDashboard;

public class UserManager {

    public static void registerUser(String username, String password, UserType userType) {
        for (Users user : FileManager.getUsers().values()) {
            if (username.equals(user.getUsername())) {
                JOptionPane.showMessageDialog(null, "The username is already in use. Please choose a different username.", "Username Unavailable", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        FileManager.addNewUser(username, password, userType);
        JOptionPane.showMessageDialog(null, "Your account has been successfully registered", "Register User Successful", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void login(LoginUI UI, String username, String password) {
        for (Users user : FileManager.getUsers().values()) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    SessionManager.setCurrentUser(user);

                    if (user.getUserType() == UserType.STUDENT) {
                        new StudentDashboard().setVisible(true);
                    } else if (user.getUserType() == UserType.LECTURER) {
                        new LecturerDashboard().setVisible(true);
                    }

                    UI.dispose();
                    return;

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect password. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Username not found. Please check and try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
    }
}
