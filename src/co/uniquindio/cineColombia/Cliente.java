package co.uniquindio.cineColombia;

public class Cliente  extends Persona{

    private int edad;

    public Cliente(String nombre, String docIdentidad, int edad) {
        super(nombre, docIdentidad);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void validarCategoria(){

    }
}
