package src.view;
import src.model.Sala;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SalasView extends JPanel {

    public SalasView(ArrayList<Sala> salas) {
        this.setLayout(new GridLayout(3, 4, 10, 10));

        for (Sala sala : salas) {
            add(createPanel(sala.getNombre(), sala.getEstado()));
        }
    }

    private JPanel createPanel(String nombre, String estado) {

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 100));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        switch (estado) {
            case "En uso":
                panel.setBackground(Color.RED);
                break;
            case "Fuera de servicio":
                panel.setBackground(Color.YELLOW);
                break;
            case "Disponible":
                panel.setBackground(Color.GREEN);
                break;
        }

        JLabel label = new JLabel(nombre, SwingConstants.CENTER);
        panel.add(label);

        return panel;
    }
}
