package co.uniquindio.cineColombia;

import java.util.ArrayList;

public class Zona {
    private ArrayList<Integer> sillasOcupadas;
    private ArrayList<Integer> sillasTotales; //Si es constante, considerar usar una lista normal


    public Zona(int numSillas) {
        sillasTotales = new ArrayList<>();
        sillasOcupadas = new ArrayList<>();


        for(int i = 0; i < numSillas; i++){
            sillasTotales.add(i+1);
        }
    }

    public boolean comprobarDisponibilidad(int numSilla){
        boolean disponible = true;

        for(int i = 0; i < sillasOcupadas.size(); i++){
            if(numSilla == sillasOcupadas.get(i)){
                disponible = false;
                System.out.print("Ocupado");
            }
        }
        System.out.print(disponible);
        return disponible;
    }

    public void  llenarSillas (int numSilla){
        for(int i = 0; i < sillasTotales.size(); i++){
            if(sillasTotales.get(i) == numSilla){
                sillasOcupadas.add(numSilla);
            }
        }
    }

    public boolean comprobarLlenas(){
        boolean aux = false;
        if(sillasTotales.size() == sillasOcupadas.size()){
            aux = true;
        }
        return aux;
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
