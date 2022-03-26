package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class Funcion {
    private Zona zonaAsignada;
    private ArrayList<Pelicula> listaPeliculas;

    private Date horarioInicio;
    private SalaCine sala;
    private int duracion;

    public Funcion(Zona zonaAsignada, Date horarioInicio, SalaCine sala, int duracion, Pelicula pel1, Pelicula pel2, Pelicula pel3 , Pelicula pel4) {
        this.zonaAsignada = zonaAsignada;
        crearListaPeliculas(pel1, pel2, pel3, pel4);
        this.horarioInicio = horarioInicio;
        this.sala = sala;
        this.duracion = duracion;

    }

    public void crearListaPeliculas(Pelicula pel1, Pelicula pel2, Pelicula pel3, Pelicula pel4) {
        listaPeliculas = new ArrayList<>();

        listaPeliculas.add(pel1);
        listaPeliculas.add(pel2);
        listaPeliculas.add(pel3);
        listaPeliculas.add(pel4);

    }

    public Zona getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(Zona zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public SalaCine getSala() {
        return sala;
    }

    public void setSala(SalaCine sala) {
        this.sala = sala;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
