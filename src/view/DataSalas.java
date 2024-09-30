package src.view;
import src.model.Sala;

import java.util.ArrayList;

public class DataSalas {

    public static ArrayList<Sala> getSalas() {
        ArrayList<Sala> ListaSalas = new ArrayList<>();

        ListaSalas.add(new Sala("Sala 1", "En uso"));
        ListaSalas.add(new Sala("Sala 2", "Fuera de servicio"));
        ListaSalas.add(new Sala("Sala 3", "Disponible"));
        ListaSalas.add(new Sala("Sala 4", "En uso"));
        ListaSalas.add(new Sala("Sala 5", "Disponible"));
        ListaSalas.add(new Sala("Sala 6", "Fuera de servicio"));
        ListaSalas.add(new Sala("Sala 7", "En uso"));
        ListaSalas.add(new Sala("Sala 8", "Disponible"));
        ListaSalas.add(new Sala("Sala 9", "En uso"));
        ListaSalas.add(new Sala("Sala 10", "Disponible"));
        ListaSalas.add(new Sala("Sala 11", "Fuera de servicio"));
        ListaSalas.add(new Sala("Sala 12", "Disponible"));

        return ListaSalas;
    }
}
