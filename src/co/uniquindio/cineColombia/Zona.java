package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class Zona {
    private ArrayList<Integer> sillasOcupadas;
    private ArrayList<Integer> sillasTotales;

    public Zona(ArrayList<Integer> sillasOcupadas, ArrayList<Integer> sillasTotales) {
        this.sillasOcupadas = sillasOcupadas;
        this.sillasTotales = sillasTotales;
    }

    public void  llenarSillas (int numSilla){

        for(int i = 0; i < sillasTotales.size(); i++){
            if(sillasTotales.get(i) == numSilla){
                sillasOcupadas.add(numSilla);
            }
        }
    }


    public ArrayList<Integer> getSillasOcupadas() {
        return sillasOcupadas;
    }

    public void setSillasOcupadas(ArrayList<Integer> sillasOcupadas) {
        this.sillasOcupadas = sillasOcupadas;
    }

    public ArrayList<Integer> getSillasTotales() {
        return sillasTotales;
    }

    public void setSillasTotales(ArrayList<Integer> sillasTotales) {
        this.sillasTotales = sillasTotales;
    }
}
