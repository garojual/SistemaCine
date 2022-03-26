package co.uniquindio.cineColombia;

import java.sql.Time;
import java.util.ArrayList;

public class Funcion {
    //private Zona zonaAsignada;
    private ArrayList<Pelicula> listaPeliculas;
    private Time horarioInicio;
    private SalaCine sala;
    private int duracion; //Examinar a fondo la necesodad de este dato

    public Funcion(SalaCine salaAsignada, Time horarioInicio, Pelicula pel1, Pelicula pel2, Pelicula pel3 , Pelicula pel4) {
        this.sala = salaAsignada;
        crearListaPeliculas(pel1, pel2, pel3, pel4);
        this.horarioInicio = horarioInicio;
        this.sala = sala;

    }

    public void crearListaPeliculas(Pelicula pel1, Pelicula pel2, Pelicula pel3, Pelicula pel4) {
        listaPeliculas = new ArrayList<>();

        listaPeliculas.add(pel1);
        listaPeliculas.add(pel2);
        listaPeliculas.add(pel3);
        listaPeliculas.add(pel4);
    }

    public boolean buscarEnLista(Pelicula pelicula){

        boolean isPeliculainLista = false;

        for(int i = 0; i < listaPeliculas.size(); i++){
            if(pelicula == listaPeliculas.get(i)){
                isPeliculainLista = true;
            }
        }
        return isPeliculainLista;
    }

    /*public Zona getZonaAsignada() {
        return zonaAsignada;
    }

    public void setZonaAsignada(Zona zonaAsignada) {
        this.zonaAsignada = zonaAsignada;
    }*/

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public String getListaPeliculasToString(){
        String listaPeliculasStr = "";

        for(int i = 0; i < listaPeliculas.size(); i++){
            int aux = i +1;
            listaPeliculasStr = listaPeliculasStr + "["+aux+"]" + listaPeliculas.get(i).getNombre() +"\n";
        }
        return listaPeliculasStr;
    }

    public int getIndexPeliculaEnLista(Pelicula pelicula){
        int aux = -1;
        for(int i = 0; i < listaPeliculas.size() && aux == -1; i++) {
            if (pelicula == listaPeliculas.get(i)) {
                aux = i;
            }
        }
        return aux;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public Time getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Time horarioInicio) {
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
