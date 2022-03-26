package co.uniquindio.cineColombia;
import java.util.Scanner;

public class Tiquete {

    private String referencia;
    private String nombreCliente;
    private String idCliente;
    private String idVendedor;
    private FuncionCine funciones;
    private Cliente cliente;
    //private Vendedor vendedor;

    private int precio;

    public Tiquete(String referencia, String nombreCliente, String idCliente, String idVendedor, Funcion funciones, Cliente cliente, Vendedor vendedor, int precio) {

        this.referencia = referencia;
        this.idVendedor = idVendedor;
        this.funciones = new FuncionCine();
        //this.vendedor = vendedor;
    }

    public void asignarPelicula(){

        //Obtencion Informacion Cliente
        Scanner scanner = new Scanner(System.in);

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
