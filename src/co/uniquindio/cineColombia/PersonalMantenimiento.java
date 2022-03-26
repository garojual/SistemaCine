package co.uniquindio.cineColombia;

public class PersonalMantenimiento  extends PersonalCine{

    private double tiempoMantenimiento;

    public PersonalMantenimiento(String nombre, String docIdentidad, String idTrabajador, double tiempoMantenimiento) {
        super(nombre, docIdentidad, idTrabajador);
        this.tiempoMantenimiento = tiempoMantenimiento;
    }

    public double getTiempoMantenimiento() {
        return tiempoMantenimiento;
    }

    public void setTiempoMantenimiento(double tiempoMantenimiento) {
        this.tiempoMantenimiento = tiempoMantenimiento;
    }
}
