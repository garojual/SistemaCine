package co.uniquindio.cineColombia;
import java.util.Scanner;

public class Tiquete {

    private String nombreCliente;
    private String idCliente;
    private String idVendedor;
    private FuncionCine funciones;
    private Cliente cliente;
    private Scanner scanner;
    private int numPel;
    //private Vendedor vendedor;

    private int precio;

    public Tiquete(String idVendedor) {

        this.scanner = new Scanner(System.in);
        this.idVendedor = idVendedor;
        this.funciones = new FuncionCine();
        //this.vendedor = vendedor;
    }

    public void mostrarMenu(){
        //Mostrar Menu

        int opcion = 0;

        while (opcion!= 4) {

            System.out.print("##### Bienvenido a Cine Colombia ##### \n");
            System.out.print("\n Por favor, seleccione una opcion\n");
            System.out.print("\n [1] Ver Cartelera General");
            System.out.print("\n [2] Comprar Tiquete");
            System.out.print("\n [3] Ver Tiquete");
            System.out.print("\n [4] Salir \n");
            System.out.print("##### © 2022 Cine Colombia ##### \n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch(opcion){

                case 1:
                    System.out.print("\n##### Peliculas en Cartelera ##### \n");
                    funciones.getPeliculas();
                    System.out.print("\n#### Presione Enter Para Volver ##### \n");
                    scanner.nextLine();
                    break;
                case 2:
                    asignarPelicula();
                    asignarAsientos();
                    break;
                case 3:
                    generarBoletoString();
                    break;
                default:
                    System.out.print("Error: Opcion fuera de los parametros, volviendo al inicio...");
                    break;
            }

        }
    }

    public void asignarPelicula(){

        //Obtencion Informacion Cliente

        System.out.print("Por favor digite su nombre\n");
        this.nombreCliente = scanner.nextLine();

        System.out.print("Por favor digite su numero de documento de identidad\n");
        this.idCliente = scanner.nextLine();

        System.out.print("Por favor digite su edad\n");
        int edad = Integer.parseInt(scanner.nextLine());

        this.cliente = new Cliente(nombreCliente, idCliente, edad);

        //Elegir Pelicula
        System.out.print("\n##### Por favor, elija la pelicula que desea ver ##### \n");
        funciones.getPeliculas();
        this.numPel = Integer.parseInt(scanner.nextLine());

        String nombrePelElegida = funciones.getPeliculas(this.numPel);

        System.out.print("\n##### Horarios ##### \n");
        System.out.print("Por favor elija el numero de Sala \n");
        funciones.mostrarHorarioYSala(funciones.getHoraPelicula(nombrePelElegida));

    }

    public void asignarAsientos(){
        int numSala = 0;

        while (numSala < 1 || numSala > 4){
            numSala = Integer.parseInt(scanner.nextLine());
            if(!funciones.comprobarSala(numSala)){
                System.out.print("\n Escoja otra sala");
                numSala = 0;
            }
            else{
            }
        }
    }

    public void generarBoletoString(){
        System.out.print("\n##### Informacion Boleto ##### \n");
        System.out.print("Nombre del Cliente: " + this.nombreCliente + "         Documento Identidad: " + this.idCliente);
        System.out.print("Pelicula: " +  funciones.getPeliculas(this.numPel) );
    }


    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public FuncionCine getFunciones() {
        return funciones;
    }

    public void setFunciones(FuncionCine funciones) {
        this.funciones = funciones;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /*public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }*/

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
