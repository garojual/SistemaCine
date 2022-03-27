package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class SalaCine {
    private boolean isLlena;
    private Zona zonaPref;
    private Zona zonaNormal;


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

    public void elegirSillaPorZona(int num, int numSilla){

        switch (num){
            case 1:
                if(zonaNormal.comprobarDisponibilidad(numSilla)){
                    zonaNormal.llenarSillas(numSilla);
                    System.out.print("Silla " + numSilla + " Registrada Correctamente");
                    break;
                }
                else{
                    System.out.print("Silla Ocupada");
                    break;
                }
            case 2:
                if(zonaPref.comprobarDisponibilidad(numSilla)){
                    zonaPref.llenarSillas(numSilla);
                    System.out.print("Silla " + numSilla + " Registrada Correctamente");
                    break;
                }
                else{
                    System.out.print("Silla Ocupada");
                    break;
                }
        }

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
}
