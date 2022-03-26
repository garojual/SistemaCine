package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class Zona {
    private ArrayList<Integer> sillasOcupadas;
    private ArrayList<Integer> sillasTotales; //Si es constante, considerar usar una lista normal

    public Zona() {
        this.sillasOcupadas = new ArrayList<>();
        this.sillasTotales = new ArrayList<>();
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
