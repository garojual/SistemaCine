package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class Funcion {
    private Zona zonaGeneral;
    private Zona zonaPreferencial;
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



    /*public Zona getZonaAsignada() {
        return zonaAsignada;
    }
    public void setZonaAsignada(Zona zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }*/

    /*public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }
    public String getListaPeliculasToString(){
        String listaPeliculasStr = "";
        for(int i = 0; i < 4; i++){
            listaPeliculasStr = listaPeliculasStr + "["+i+"]" + listaPeliculas.get(i).getNombre() +"\n";
        }
        return listaPeliculasStr;
    }
    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }*/

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