package src.view;
import java.util.HashMap;
import javax.swing.*;
import java.awt.*;

public class DoctorView extends JFrame {

    private int[] pantalla = {1300, 800};

    public DoctorView(HashMap<String, String> doctorData) {
        super("Perfil de Doctor");

        this.setSize(pantalla[0], pantalla[1]);
        this.setLayout(new BorderLayout());

        //Panel 1
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);
        headerPanel.setLayout(new BorderLayout());

        // Jlabel 1
        JLabel hospitalLabel = new JLabel("Hôpital Pitié Salpêtrière");
        hospitalLabel.setForeground(Color.WHITE);
        hospitalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        headerPanel.add(hospitalLabel, BorderLayout.WEST);

        // Panel 2
        JPanel doctorInfoPanel = new JPanel();
        doctorInfoPanel.setLayout(new BorderLayout());
        doctorInfoPanel.setOpaque(false);

        //Panel Logo
        JPanel logoPanel = new JPanel();
        logoPanel.setBackground(Color.RED);
        logoPanel.setPreferredSize(new Dimension(60, 60));
        doctorInfoPanel.add(logoPanel, BorderLayout.WEST);

        //Panel texto
        JPanel doctorTextPanel = new JPanel();
        doctorTextPanel.setLayout(new BoxLayout(doctorTextPanel, BoxLayout.Y_AXIS));
        doctorTextPanel.setOpaque(false);

        String Nombre = doctorData.get("Nombre");
        String Especialidad = doctorData.get("Especialidad");

        // Jlabel nameDoctor
        JLabel nameDoctorLabel = new JLabel(Nombre);
        nameDoctorLabel.setForeground(Color.WHITE);
        nameDoctorLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // JLabel especialidad
        JLabel ParaEspecialidad = new JLabel(Especialidad);
        ParaEspecialidad.setForeground(Color.WHITE);
        ParaEspecialidad.setFont(new Font("Arial", Font.PLAIN, 14));

        doctorInfoPanel.add(Box.createHorizontalStrut(20), BorderLayout.CENTER);
        doctorInfoPanel.add(doctorTextPanel, BorderLayout.EAST);
        headerPanel.add(doctorInfoPanel, BorderLayout.EAST);
        doctorInfoPanel.add(nameDoctorLabel);
        doctorInfoPanel.add(ParaEspecialidad);


        this.add(headerPanel, BorderLayout.NORTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

