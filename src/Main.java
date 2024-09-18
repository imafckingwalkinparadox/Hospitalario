package src;

import src.controller.LoginController;
import src.view.DoctorView;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        Login login = new Login();
        LoginController controlLogin = new LoginController(login);
        DoctorView doctorView = new DoctorView();




    }
}