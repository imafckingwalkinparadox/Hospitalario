package src;

import src.backEnd.BackEnd;
import src.controller.LoginController;
import src.view.DoctorView;

import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Login login = new Login();
        LoginController controlLogin = new LoginController(login);




    }
}