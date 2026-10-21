import javax.swing.*;

public class UsuarioEmail implements Observador {
    private final String email;

    public UsuarioEmail(String email) {
        this.email = email;
    }

    @Override
    public void actualizar(String nombreProducto, boolean enStock) {
        String textoNotificacion = "¡ADVERTENCIA: Se ha enviado un correo a " + email
                + " indicando que '" + nombreProducto + "' ya tiene stock!";

        System.out.println("[EMAIL] " + textoNotificacion);

        JOptionPane.showMessageDialog(
                null,
                textoNotificacion,
                "Aviso de Notificación Enviada",
                JOptionPane.WARNING_MESSAGE
        );
    }
}
