package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class FuncionCine {

    private Pelicula pelicula1 = new Pelicula("Metal Gear Solid 4", 2, TipoCategoria.P18);
    private Pelicula pelicula2 = new Pelicula("Bonnie and Clyde", 2, TipoCategoria.P18);
    private Pelicula pelicula3 = new Pelicula("Spiderman",  2, TipoCategoria.P15);
    private Pelicula pelicula4 = new Pelicula("Encanto",  2, TipoCategoria.P10);

    private ArrayList<Funcion> listaFuncionesSala1=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala2=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala3=new ArrayList<>();
    private ArrayList<Funcion> listaFuncionesSala4=new ArrayList<>();
    private ArrayList<SalaCine> salasCines=new ArrayList<>();


    SalaCine sala1 = new SalaCine();
    SalaCine sala2 = new SalaCine();
    SalaCine sala3 = new SalaCine();
    SalaCine sala4 = new SalaCine();

    Funcion funcion1;
    Funcion funcion2;
    Funcion funcion3;
    Funcion funcion4;

    int horaApertura;

    public void getPeliculas(){

        for(int i=0; i < listaFuncionesSala1.size(); i++){
            int aux = i+1;
            System.out.print("["+aux+"]"+listaFuncionesSala1.get(i).getPelicula().getNombre()+"\n");
        }

    }

    public FuncionCine() {

        funcion1 = new Funcion(sala1, 17, pelicula1);
        funcion2 = new Funcion(sala1, 20, pelicula2);
        funcion3 = new Funcion(sala1, 12, pelicula3);
        funcion4 = new Funcion(sala1, 21, pelicula4);
        listaFuncionesSala1.add(funcion1);
        listaFuncionesSala1.add(funcion2);
        listaFuncionesSala1.add(funcion3);
        listaFuncionesSala1.add(funcion4);
        sala1.setFunciones(listaFuncionesSala1);

        funcion1 = new Funcion(sala2, 9, pelicula1);
        funcion2 = new Funcion(sala2, 15, pelicula2);
        funcion3 = new Funcion(sala2, 18, pelicula3);
        funcion4 = new Funcion(sala2, 22, pelicula4);
        listaFuncionesSala2.add(funcion1);
        listaFuncionesSala2.add(funcion2);
        listaFuncionesSala2.add(funcion3);
        listaFuncionesSala2.add(funcion4);
        sala2.setFunciones(listaFuncionesSala2);

        funcion1 = new Funcion(sala3, 14, pelicula1);
        funcion2 = new Funcion(sala3, 11, pelicula2);
        funcion3 = new Funcion(sala3, 5, pelicula3);
        funcion4 = new Funcion(sala3, 6, pelicula4);
        listaFuncionesSala3.add(funcion1);
        listaFuncionesSala3.add(funcion2);
        listaFuncionesSala3.add(funcion3);
        listaFuncionesSala3.add(funcion4);
        sala3.setFunciones(listaFuncionesSala3);

        funcion1 = new Funcion(sala4, 16, pelicula1);
        funcion2 = new Funcion(sala4, 10, pelicula2);
        funcion3 = new Funcion(sala4, 23, pelicula3);
        funcion4 = new Funcion(sala4, 10, pelicula4);
        listaFuncionesSala4.add(funcion1);
        listaFuncionesSala4.add(funcion2);
        listaFuncionesSala4.add(funcion3);
        listaFuncionesSala4.add(funcion4);
        sala4.setFunciones(listaFuncionesSala4);

        salasCines.add(sala1);
        salasCines.add(sala2);
        salasCines.add(sala3);
        salasCines.add(sala4);
    }



    public ArrayList<Integer> getHoraPelicula (String pelicula) {
        ArrayList<Integer> horaPelicula= new ArrayList<>();

        for (int j = 0; j < listaFuncionesSala1.size(); j++) {
            if (listaFuncionesSala1.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala1.get(j).getHorarioInicio());
            }
        }
        for (int j = 0; j < listaFuncionesSala2.size(); j++) {
            if (listaFuncionesSala2.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala2.get(j).getHorarioInicio());
            }
        }
        for (int j = 0; j < listaFuncionesSala3.size(); j++) {
            if (listaFuncionesSala3.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala3.get(j).getHorarioInicio());
            }
        }
        for (int j = 0; j < listaFuncionesSala4.size(); j++) {
            if (listaFuncionesSala4.get(j).getPelicula().getNombre().equals(pelicula)){
                horaPelicula.add(listaFuncionesSala4.get(j).getHorarioInicio());
            }
        }
        //System.out.print(pelicula + " : " + horaPelicula + "[Formato 24 Horas]");
        return horaPelicula;

    }

    public void mostrarHorarioYSala(ArrayList<Integer> horaPelicula){

        for(int i = 0; i < horaPelicula.size(); i++){
            int aux = i+1;
            System.out.print("Sala "+ aux +" : " + horaPelicula.get(i) + ":00 \n");
        }

    }

    public String getPeliculas(int num) {
        String listaPeliculas;
        switch(num){
            case 1:
                return listaPeliculas = pelicula1.getNombre();
            case 2:
                return listaPeliculas = pelicula2.getNombre();
            case 3:
                return listaPeliculas = pelicula3.getNombre();
            case 4:
                return listaPeliculas = pelicula4.getNombre();
            default:
                return null;
        }

    }

}


