class NotificacionSMS implements Observador {
    private final String telefono;

    public NotificacionSMS(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void actualizar(String nombreProducto, boolean enStock) {
        System.out.println("[SMS] Enviado a " + telefono + ": ¡Stock disponible para '" + nombreProducto + "'!");
    }
}