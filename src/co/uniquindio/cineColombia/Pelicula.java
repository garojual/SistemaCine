package co.uniquindio.cineColombia;

public class Pelicula {
    private String nombre;
    private int duracion;
    private TipoCategoria categoria;

    public Pelicula(String nombre, int duracion, TipoCategoria categoria) {
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

    public int getDuracion() {
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
}
