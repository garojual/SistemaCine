package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class SalaCine {
    private boolean isLlena;
    private Zona zonaPref;
    private Zona zonaNormal;
    private ArrayList<Funcion> funciones;


    public SalaCine() {

        this.zonaPref = new Zona(20);
        this.zonaNormal = new Zona(30);

    }

    public boolean isSalaLlena (){
        boolean isLlena= false;
        if (zonaPref.comprobarLlenas() && zonaNormal.comprobarLlenas()) {
            isLlena = true;
        }
        return isLlena;
    }



    public boolean isLlena() {

        return isLlena;
    }

    public void setLlena(boolean llena) {

        isLlena = llena;
    }

    public Zona getZonaPref() {

        return zonaPref;
    }

    public void setZonaPref(Zona zonaPref) {

        this.zonaPref = zonaPref;
    }

    public Zona getZonaNormal() {
        return zonaNormal;
    }

    public void setZonaNormal(Zona zonaNormal) {
        this.zonaNormal = zonaNormal;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }
}