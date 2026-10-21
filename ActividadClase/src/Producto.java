import java.util.ArrayList;
import java.util.List;

public class Producto implements Sujeto {
    private final String nombre;
    private boolean enStock;
    private final List<Observador> observadores = new ArrayList<>();

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void setEnStock(boolean enStock) {
        this.enStock = enStock;
        if (enStock) {
            notificarObservadores();
        }
    }

    @Override
    public void suscribir(Observador o) {
        observadores.add(o);
    }

    @Override
    public void desuscribir(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(nombre, enStock);
        }
    }
}
