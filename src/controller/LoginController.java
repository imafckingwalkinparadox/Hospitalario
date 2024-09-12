package src.controller;

import src.Login;

public class LoginController {
    private Login login;

    public LoginController(Login login) {
        this.login = login;
        this.login.addLoginListener(e -> controlDeLogin());
    }

    public void controlDeLogin(){
        System.out.println("Hola Login");
    }
}
