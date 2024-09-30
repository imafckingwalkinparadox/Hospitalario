package src.controller;

import src.Login;
import src.backEnd.BackEnd;
import src.model.Paciente;
import src.view.DataPaciente;
import src.view.DoctorView;

import java.util.ArrayList;
import java.util.HashMap;

public class LoginController {
    private Login login;
    private BackEnd backEnd;

    public LoginController(Login login) {
        this.login = login;
        this.backEnd = new BackEnd();
        this.login.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion() {
        String cOrreo = login.getCOrreo();
        String contraseña = login.getContra();

        BackEnd consultaLogin = new BackEnd();
        HashMap<String, String> response = consultaLogin.validarDatos(cOrreo, contraseña);

        if (!response.containsKey("Error")) {
            System.out.println("Error: " + response.get("Error"));
        } else {
            String nombreDoctor = response.get("Nombre");
            String Especialidad = response.get("Especialidad");

            HashMap<String, String> doctorData = new HashMap<>();
            doctorData.put("Nombre", nombreDoctor);
            doctorData.put("Especialidad", Especialidad);

            login.dispose();

            ArrayList<Paciente> ListaPacientes = DataPaciente.listaPacientes();

            new DoctorView(response, ListaPacientes);
        }
    }
}