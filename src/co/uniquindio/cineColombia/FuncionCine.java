package co.uniquindio.cineColombia;

import java.util.ArrayList;
import java.util.Date;

public class FuncionCine {

    private Pelicula pelicula1 = new Pelicula("Metal Gear Solid 4", 2, TipoCategoria.P18);
    private Pelicula pelicula2 = new Pelicula("Bonnie and Clyde", 2, TipoCategoria.P18);
    private Pelicula pelicula3 = new Pelicula("Spiderman",  2, TipoCategoria.P15);
    private Pelicula pelicula4 = new Pelicula("Encanto",  2, TipoCategoria.P10);

    public FuncionCine(Zona zonaAsignada, Date horarioInicio, SalaCine sala, int duracion, Pelicula pelicula1, Pelicula pelicula2, Pelicula pelicula3, Pelicula pelicula4) {

        Funcion funcion1 = new Funcion(zonaAsignada,horarioInicio,sala, duracion, pelicula1, pelicula2, pelicula3, pelicula4);
        Funcion funcion2 = new Funcion(zonaAsignada,horarioInicio,sala, duracion, pelicula4, pelicula2, pelicula3, pelicula1);
        Funcion funcion3 = new Funcion(zonaAsignada, horarioInicio, sala, duracion, pelicula1, pelicula3, pelicula4, pelicula2);
        Funcion funcion4 = new Funcion(zonaAsignada, horarioInicio, sala, duracion, pelicula2, pelicula4, pelicula1, pelicula3);

       System.out.println(funcion1.getListaPeliculas());

    }


}
