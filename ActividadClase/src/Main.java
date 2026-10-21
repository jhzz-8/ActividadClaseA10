
public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("MacBook Pro");

        UsuarioEmail cliente1 = new UsuarioEmail("juan@email.com");
        UsuarioEmail cliente2 = new UsuarioEmail("maria@email.com");
        NotificacionSMS clienteSMS = new NotificacionSMS("+573001234567");
        SistemaInventario inventario = new SistemaInventario();

        laptop.suscribir(cliente1);
        laptop.suscribir(cliente2);
        laptop.suscribir(clienteSMS);
        laptop.suscribir(inventario);

        System.out.println("--- Cambiando estado de stock a true ---");
        laptop.setEnStock(true);
    }
}