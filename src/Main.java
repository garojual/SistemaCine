import co.uniquindio.cineColombia.Tiquete;
import co.uniquindio.cineColombia.Vendedor;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Miller", "6834821007", "VEND-942");

        Tiquete tiquete = new Tiquete(vendedor);

    }
}
