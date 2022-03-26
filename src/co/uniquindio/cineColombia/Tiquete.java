package co.uniquindio.cineColombia;
import java.util.Scanner;

public class Tiquete {

    private String referencia;
    private String nombreCliente;
    private String idCliente;
    private String idVendedor;
    private FuncionCine funciones;
    private Cliente cliente;
    private Scanner scanner;
    //private Vendedor vendedor;

    private int precio;

    public Tiquete(String referencia, String idVendedor) {

        this.scanner = new Scanner(System.in);
        this.referencia = referencia;
        this.idVendedor = idVendedor;
        this.funciones = new FuncionCine();
        //this.vendedor = vendedor;
    }

    public void mostrarMenu(){
        //Mostrar Menu

        int opcion = 0;

        while (opcion!= 4) {

            System.out.print("Bienvenido a Cine Colombia \n");
            System.out.print("\n Por favor, seleccione una opcion\n");
            System.out.print("\n [1] Ver Cartelera General");
            System.out.print("\n [2] Comprar Tiquete");
            System.out.print("\n [3] Cancelar Tiquete");
            System.out.print("\n [4] Salir \n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch(opcion){

                case 1:
                    funciones.getPeliculas(1);
                    break;
                case 2:
                    asignarPelicula();
                    break;
                case 3:
                    //crear funcion
                    break;
                default:
                    //no hacer nada
                    break;
            }

        }
    }

    public void asignarPelicula(){

        //Obtencion Informacion Cliente

        System.out.print("Por favor digite su nombre");
        this.nombreCliente = scanner.nextLine();

        System.out.print("Por favor digite su numero de documento de identidad");
        this.idCliente = scanner.nextLine();

        System.out.print("Por favor digite su edad");
        int edad = Integer.parseInt(scanner.nextLine());

        this.cliente = new Cliente(nombreCliente, idCliente, edad);

        //Desplegar menu de pelicula


    }


    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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
