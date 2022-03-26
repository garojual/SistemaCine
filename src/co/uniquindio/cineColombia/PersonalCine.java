package co.uniquindio.cineColombia;

public class PersonalCine extends Persona{

    private String idTrabajador;

    public PersonalCine(String nombre, String docIdentidad, String idTrabajador) {
        super(nombre, docIdentidad);
        this.idTrabajador = idTrabajador;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
}
