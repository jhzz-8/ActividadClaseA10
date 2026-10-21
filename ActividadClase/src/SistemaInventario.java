import javax.swing.*;

public class SistemaInventario implements Observador {
    @Override
    public void actualizar(String nombreProducto, boolean enStock) {
        String textoNotificacion = "¡ADVERTENCIA DE SISTEMA: El inventario de '"
                + nombreProducto + "' fue actualizado a DISPONIBLE!";

        System.out.println("[INVENTARIO] " + textoNotificacion);

        JOptionPane.showMessageDialog(
                null,
                textoNotificacion,
                "Alerta de Inventario",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
