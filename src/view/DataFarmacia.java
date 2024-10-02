package src.view;
import src.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class DataFarmacia {
    private List<Medicamento> listaMedicamentos;

    public DataFarmacia() {
        listaMedicamentos = new ArrayList<>();
        agregarMedicamentos();
    }

    private void agregarMedicamentos() {
        listaMedicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol",
                LocalDate.of(2025, 6, 30), "Lote001", 5.99, "Para el dolor y fiebre", "No usar con alcohol"));
        listaMedicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "400mg", "Ibuprofeno",
                LocalDate.of(2024, 8, 15), "Lote002", 7.49, "Anti-inflamatorio", "Problemas gástricos"));
        listaMedicamentos.add(new Medicamento("Amoxicilina", "Tableta", "500mg", "Amoxicilina",
                LocalDate.of(2024, 12, 1), "Lote003", 12.99, "Antibiótico", "No usar en alérgicos a penicilinas"));
        listaMedicamentos.add(new Medicamento("Lorazepam", "Tableta", "1mg", "Lorazepam",
                LocalDate.of(2026, 4, 20), "Lote004", 25.99, "Ansiolítico", "Somnolencia y dependencia"));
        listaMedicamentos.add(new Medicamento("Aspirina", "Tableta", "100mg", "Ácido Acetilsalicílico",
                LocalDate.of(2023, 11, 30), "Lote005", 3.99, "Analgésico y antipirético", "Hemorragias y úlceras"));
        listaMedicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina",
                LocalDate.of(2025, 2, 28), "Lote006", 9.50, "Para la diabetes tipo 2", "Acidosis láctica"));
        listaMedicamentos.add(new Medicamento("Loratadina", "Tableta", "10mg", "Loratadina",
                LocalDate.of(2024, 9, 1), "Lote007", 4.50, "Antihistamínico", "Somnolencia en algunos casos"));
        listaMedicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol",
                LocalDate.of(2025, 7, 10), "Lote008", 8.99, "Inhibidor de ácido gástrico", "Interacciones con otros fármacos"));
        listaMedicamentos.add(new Medicamento("Ciprofloxacino", "Tableta", "500mg", "Ciprofloxacino",
                LocalDate.of(2024, 10, 25), "Lote009", 15.99, "Antibiótico", "No recomendado en niños"));
        listaMedicamentos.add(new Medicamento("Clorfenamina", "Tableta", "4mg", "Clorfenamina",
                LocalDate.of(2023, 12, 10), "Lote010", 3.20, "Antialérgico", "Somnolencia"));
        listaMedicamentos.add(new Medicamento("Prednisona", "Tableta", "20mg", "Prednisona",
                LocalDate.of(2025, 3, 1), "Lote011", 7.99, "Antiinflamatorio esteroide", "Aumenta el riesgo de infecciones"));
        listaMedicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida",
                LocalDate.of(2026, 1, 15), "Lote012", 4.80, "Diurético", "Deshidratación"));
        listaMedicamentos.add(new Medicamento("Diclofenaco", "Tableta", "50mg", "Diclofenaco",
                LocalDate.of(2024, 7, 20), "Lote013", 5.75, "Antiinflamatorio no esteroide", "Irritación gástrica"));
        listaMedicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril",
                LocalDate.of(2025, 8, 5), "Lote014", 6.99, "Para la hipertensión", "Tos seca"));
        listaMedicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina",
                LocalDate.of(2024, 3, 12), "Lote015", 5.30, "Reductor del ácido gástrico", "Puede causar confusión en ancianos"));

    }

    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    public void mostrarMedicamentos() {
        for (Medicamento medicamento : listaMedicamentos) {
            System.out.println(medicamento);
        }
    }
}

