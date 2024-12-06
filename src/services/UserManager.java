package services;

import datastorage.FileManager;
import entities.UserType;
import entities.Users;
import javax.swing.JOptionPane;
import userinterface.LecturerDashboard;
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
    }

    public static void login(String username, String password) {
        if (username == null || username.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a username", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (password == null || password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a password", "Login Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        for (Users user : FileManager.getUsers().values()) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    if (user.getUserType() == UserType.STUDENT) {
                        new StudentDashboard(user).setVisible(true);
                    } else if (user.getUserType() == UserType.LECTURER) {
                        new LecturerDashboard(user).setVisible(true);
                    }
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
