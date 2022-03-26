package co.uniquindio.cineColombia;
import java.sql.Time;
import java.util.ArrayList;

public class FuncionCine {

    private Pelicula pelicula1 = new Pelicula("Metal Gear Solid 4", 3, TipoCategoria.P18);
    private Pelicula pelicula2 = new Pelicula("Bonnie and Clyde", 2.5, TipoCategoria.P18);
    private Pelicula pelicula3 = new Pelicula("Spiderman",  2.5, TipoCategoria.P15);
    private Pelicula pelicula4 = new Pelicula("Encanto",  2, TipoCategoria.P10);
    private ArrayList<Funcion> funciones;

    SalaCine sala1 = new SalaCine();
    SalaCine sala2 = new SalaCine();
    SalaCine sala3 = new SalaCine();
    SalaCine sala4 = new SalaCine();

    Funcion funcion1;
    Funcion funcion2;
    Funcion funcion3;
    Funcion funcion4;

    Time horaApertura;
    double horarioApertura = 12.00;


    public FuncionCine() {

        funciones = new ArrayList<>();
        funcion1 = new Funcion(sala1, horaApertura, pelicula1, pelicula2, pelicula3, pelicula4);
        funciones.add(funcion1);
        funcion2 = new Funcion(sala2, horaApertura, pelicula4, pelicula2, pelicula3, pelicula3);
        funciones.add(funcion2);
        funcion3 = new Funcion(sala3, horaApertura, pelicula1, pelicula3, pelicula4, pelicula2);
        funciones.add(funcion3);
        funcion4 = new Funcion(sala4, horaApertura, pelicula2, pelicula4, pelicula1, pelicula3);
        funciones.add(funcion4);
    }

    public void configurarHoras(){

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

            default:
                System.out.print("Error: Opcion fuera de los parametros, volviendo al inicio...");
                break;

        }
        return listaPeliculas;
    }

    public String mostrarSalasPorPelicula(Pelicula pelicula){
        String lista = "";

        for(int i= 0; i < funciones.size(); i++){
            int aux = i+1;
            int j = 1;
            if (funciones.get(i).buscarEnLista(pelicula)){
                funciones.get(i).getIndexPeliculaEnLista(pelicula);//con el index se podria automaticamente calcula la fecha
                System.out.print("[Sala " + aux + "] " + pelicula.getNombre() + " \n");
                j++;
            }
        }

        return lista;
    }

    public Pelicula getPeliculaPorNum(int num) {
        switch (num){
            case 1:
                return pelicula1;
            case 2:
                return pelicula2;
            case 3:
                return pelicula3;
            case 4:
                return pelicula4;
            default:
                System.out.print("Error: Opcion fuera de los parametros, volviendo al inicio...");
                return null;
        }
    }

    public boolean comprobarDisponibilidad(int numSala){
        boolean disponible = true;
        funciones.get(numSala-1);
        return disponible;
    }
}
