package co.uniquindio.cineColombia;

public class Pelicula {
    private String nombre;
    private double duracion;
    private TipoCategoria categoria;
    private int horaInicio;
    private int horafin;

    public Pelicula(String nombre, double duracion, TipoCategoria categoria) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public TipoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoCategoria categoria) {
        this.categoria = categoria;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHorafin() {
        return horafin;
    }
}