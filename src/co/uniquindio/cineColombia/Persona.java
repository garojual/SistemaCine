package co.uniquindio.cineColombia;

public class Persona {
    private String nombre;
    private String docIdentidad;

    public Persona(String nombre, String docIdentidad) {
        this.nombre = nombre;
        this.docIdentidad = docIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocIdentidad() {
        return docIdentidad;
    }

    public void setDocIdentidad(String docIdentidad) {
        this.docIdentidad = docIdentidad;
    }
}
