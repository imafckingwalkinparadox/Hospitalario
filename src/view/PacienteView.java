package src.view;

import javax.swing.*;
import src.model.Paciente;
import java.awt.*;
import java.util.ArrayList;


public class PacienteView {
    private ArrayList<Paciente> listaPacientes;

    public PacienteView(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;

    }

    public JPanel panelPaciente(ArrayList<Paciente> listaPacientes) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4));

        JLabel titulo = new JLabel("Listado de Pacientes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        panel.add(titulo);
        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};
        // Configurar el layout según la cantidad de pacientes

        // Crear un JLabel para cada paciente
        for (Paciente paciente : this.listaPacientes) {
            JLabel label = new JLabel(paciente.getNombre() + " - " + paciente.getMotivoVisita());
            panel.add(label);
        }

        for (String campo : campos) {
            JLabel label = new JLabel(campo, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 12));
            panel.add(label);
        }

        for (Paciente paciente : this.listaPacientes) {
            panel.add(new JLabel(paciente.getNombre(), SwingConstants.CENTER));
            panel.add(new JLabel(paciente.getFechaNacimiento(), SwingConstants.CENTER));
            panel.add(new JLabel(paciente.getHorarioCita(), SwingConstants.CENTER));
            panel.add(new JLabel(paciente.getMotivoVisita(), SwingConstants.CENTER));
        }

        return panel;
    }



}

