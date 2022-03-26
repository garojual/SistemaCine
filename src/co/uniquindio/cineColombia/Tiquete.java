package co.uniquindio.cineColombia;

public class Tiquete {

    private String referencia;
    private String nombreCliente;
    private String idCliente;
    private String idVendedor;
    private Funcion funciones;
    private Cliente cliente;
    private Vendedor vendedor;

    private int precio;

    public Tiquete(String referencia, String nombreCliente, String idCliente, String idVendedor, Funcion funciones, Cliente cliente, Vendedor vendedor, int precio) {
        this.referencia = referencia;
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.idVendedor = idVendedor;
        this.funciones = funciones;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.precio = precio;
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

    public Funcion getFunciones() {
        return funciones;
    }

    public void setFunciones(Funcion funciones) {
        this.funciones = funciones;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
