package co.uniquindio.cineColombia;

public class Vendedor extends PersonalCine{

    public Vendedor(String nombre, String docIdentidad, String idTrabajador) {
        super(nombre, docIdentidad, idTrabajador);
    }

    public void generarTiquete(){

        int opcion;

        //Mostrar Menu

        System.out.print("Bienvenido a Cine Colombia \n");
        System.out.print("\n Por favor, seleccione una opcion\n");
        System.out.print("\n [1] Ver Cartelera General");
        System.out.print("\n [2] Comprar Tiquete");
        System.out.print("\n [3] Cancelar Tiquete");
        System.out.print("\n [4] Salir");



    }

}
