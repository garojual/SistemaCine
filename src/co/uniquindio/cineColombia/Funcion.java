package co.uniquindio.cineColombia;



public class Funcion {

    private Pelicula pelicula;
    private int horarioInicio;
    private SalaCine sala;


    public Funcion(SalaCine salaAsignada, int horarioInicio, Pelicula pelicula) {
        this.sala = salaAsignada;
        this.horarioInicio = horarioInicio;
        this.pelicula= pelicula;

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }


    public int getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }
}