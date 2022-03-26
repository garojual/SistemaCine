package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class FuncionCine {

    private Pelicula pelicula1 = new Pelicula("Metal Gear Solid 4", 2, TipoCategoria.P18);
    private Pelicula pelicula2 = new Pelicula("Bonnie and Clyde", 2, TipoCategoria.P18);
    private Pelicula pelicula3 = new Pelicula("Spiderman",  2, TipoCategoria.P15);
    private Pelicula pelicula4 = new Pelicula("Encanto",  2, TipoCategoria.P10);

    SalaCine sala1 = new SalaCine();
    SalaCine sala2 = new SalaCine();
    SalaCine sala3 = new SalaCine();
    SalaCine sala4 = new SalaCine();

    Funcion funcion1;
    Funcion funcion2;
    Funcion funcion3;
    Funcion funcion4;

    Date horaApertura;


    public FuncionCine() {

        funcion1 = new Funcion(sala1, horaApertura, pelicula1, pelicula2, pelicula3, pelicula4);
        funcion2 = new Funcion(sala2, horaApertura, pelicula4, pelicula2, pelicula3, pelicula1);
        funcion3 = new Funcion(sala3, horaApertura, pelicula1, pelicula3, pelicula4, pelicula2);
        funcion4 = new Funcion(sala4, horaApertura, pelicula2, pelicula4, pelicula1, pelicula3);

    }

    public String getPeliculas(int numFuncion) {

        String listaPeliculas = new String();

        switch(numFuncion){
            case 1:
                System.out.print(funcion1.getListaPeliculasToString());
                listaPeliculas = funcion1.getListaPeliculasToString();
                break;

            case 2:
                listaPeliculas =funcion2.getListaPeliculasToString();
                break;

            case 3:
                listaPeliculas = funcion3.getListaPeliculasToString();
                break;

            case 4:
                listaPeliculas = funcion4.getListaPeliculasToString();
                break;

        }
        return listaPeliculas;
    }

}
