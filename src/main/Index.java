package main;

import userinterface.LoginUI;
import userinterface.StartUpUI;

public class Index {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            StartUpUI startUpUI = new StartUpUI();

            startUpUI.setOnLoadingCompleteCallback(() -> {
                LoginUI loginUI = new LoginUI();
                loginUI.setVisible(true);
                startUpUI.setVisible(false);
            });

            startUpUI.setVisible(true);
            startUpUI.startLoadingProcess();
        });
    }
}
