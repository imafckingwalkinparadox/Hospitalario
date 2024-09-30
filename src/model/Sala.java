package src.model;

public class Sala {
    private String Nombre;
    private String Estado;

    public Sala(String nombre, String estado) {
        this.Nombre = nombre;
        this.Estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEstado() {
        return Estado;
    }
}
