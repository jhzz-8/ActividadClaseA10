import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductoObserverTest {

    private Producto laptop;
    private ObservadorPrueba observadorEmail1;
    private ObservadorPrueba observadorEmail2;
    private ObservadorPrueba observadorInventario;

    @BeforeEach
    void setUp() {

        laptop = new Producto("MacBook Pro");
        observadorEmail1 = new ObservadorPrueba("juan@email.com");
        observadorEmail2 = new ObservadorPrueba("maria@email.com");
        observadorInventario = new ObservadorPrueba("Sistema Inventario");
    }

    @Test
    @DisplayName("Debe notificar a todos los observadores suscriptos cuando cambia el stock a true")
    void testNotificarASuscriptores() {

    }
        laptop.suscribir(observadorEmail1);
        laptop.suscribir(observadorEmail2);
        laptop.suscribir(observadorInventario);

        laptop.setEnStock(true);

        assertEquals(1, observadorEmail1.notificacionesRecibidas);
        assertEquals(1, observadorEmail2.notificacionesRecibidas);
        assertEquals(1, observadorInventario.notificacionesRecibidas);

        assertEquals("MacBook Pro", observadorEmail1.ultimoProducto);
        assertTrue(observadorEmail1.ultimoEstado);
    }