/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;




/**
 * Unit test for simple App.
 */
public class AppTest {
    private Concesionario concesionario;
    private Departamento departamento;
    private Departamento departamento2;
    private Departamento departamento3;
    private Departamento departamento4;
    private Departamento departamento5;
    private Ciudad ciudad1;
    private Ciudad ciudad2;
    private Ciudad ciudad3;
    private Ciudad ciudad4;
    private Ciudad ciudad5;
    private Sucursal sucursal;
    private Administrador administrador;
    private Usuario empleado1;
    private Empleado empleado2;
    private Usuario empleado3;
    private Usuario empleadoNuevo;
    private Transaccion venta1;
    private Transaccion venta2;
    private Transaccion compra1;
    private Alquiler alquiler1;
    private DetallesCompra detallesCompra1;
    private Vehiculo sedan1;
    private Vehiculo moto1;
    private Cliente cliente1;
    private Cliente cliente2;
    private Cliente cliente3;
    
  
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @BeforeEach
    public void setUp() {
        concesionario = new Concesionario("concesionario");
        sucursal = new Sucursal("bala", departamento, ciudad1);
        empleado1 = new Empleado("santiago", 0001, "zxc", "cumpleaños", "noviembre", "santiago.perez@ejemplo.com");
        empleado2 = new Empleado("valentina", 0001, "edf", "edad", "25", "valentina.gomez@ejemplo.com");
        empleado3 = new Empleado("raul",  1548, "asd", "no", "invente", "raul.lopez@ejemplo.com");
        empleadoNuevo = new Empleado("brayan", 1548, "cuchillo", "pasatiempo", "apuñalar", "brayan.diaz@ejemplo.com");
        administrador = new Administrador("Esteban", 123456, "evb", "mascota", "gato", "esteban.rodriguez@ejemplo.com");
        cliente1 = new Cliente("juan", "calle", 254131, 1548, 25);
        cliente2 = new Cliente("vanesa", "barrio", 2544581, 18648, 25);
        cliente3 = new Cliente("luis", "avenida", 3254845, 12458, 27);
        departamento = new Departamento("Quindio");
        departamento2 = new Departamento("Risaralda");
        departamento3 = new Departamento("antioquia");
        departamento4 = new Departamento("caldas");
        departamento5 = new Departamento("Quindio");
        ciudad1 = new Ciudad("Armenia");
        ciudad2 = new Ciudad("pereira");
        ciudad3 = new Ciudad("Armenia");
        ciudad4 = new Ciudad("argelia");
        ciudad5 = new Ciudad("Armenia");
        sedan1 = new Sedan("mercedes", "aventure", 6, 140, 3200, 7, 13598, true, EstadoVehiculo.NUEVO, TipoTransmision.AUTOMATICA, true, false, 5, 5, 4.5, false, true, 2, false, false, false, false, false);
        moto1 = new Moto("yamaha", "mt09", 5, 180, 899, 5, 15847, true, EstadoVehiculo.NUEVO, TipoTransmision.MANUAL, "6 horas", "10 horas");
        venta1 = new Venta(15486652, LocalDate.of(2024, 10, 23), (Empleado) empleado3, moto1, cliente1);
        venta2 = new Venta(15486152, LocalDate.of(2024, 10, 22), (Empleado) empleado3, moto1, cliente3);
        compra1 = new Compra(15486, LocalDate.of(2024, 10, 25), (Empleado) empleado2, sedan1, cliente2);
        detallesCompra1 = new DetallesCompra(10, (Compra) compra1, sedan1);
        alquiler1 = new Alquiler(2584, LocalDate.of(2024, 10, 25), LocalDate.of(2024, 11, 28), empleado2, moto1, cliente1);





    }

// Pruebas de Departamento 
    @Test
    public void testCrearDepartamento() {
        LOG.info("Iniciado test de crear y verificar departamento");
        concesionario.agregarDepartamento(departamento);
        concesionario.agregarDepartamento(departamento2);
        concesionario.agregarDepartamento(departamento3);
        concesionario.agregarDepartamento(departamento4);
        concesionario.agregarDepartamento(departamento5);

        assertEquals(4, concesionario.getDepartamentos().size());
        
    }

    @Test
    public void testEliminarDepartamento(){
        concesionario.agregarDepartamento(departamento);
        concesionario.agregarDepartamento(departamento2);
        concesionario.agregarDepartamento(departamento3);
        concesionario.agregarDepartamento(departamento4);

        concesionario.eliminarDepartamento(departamento);

        assertEquals(3, concesionario.getDepartamentos().size());
    }


    // Pruebas de Ciudad
    @Test
    public void testCrearCiudad(){
        LOG.info("Iniciado test de crear y verificar ciudad ciudad");
        departamento.agregarCiudad(ciudad1);
        departamento.agregarCiudad(ciudad2);
        departamento.agregarCiudad(ciudad3);
        departamento.agregarCiudad(ciudad5);

        List<Ciudad> ciudadesEsperadas = List.of(
                ciudad1,
                ciudad2
        );
        assertIterableEquals(ciudadesEsperadas, departamento.getCiudades());

    }

    @Test 
    public void tesEliminarCiudad(){
        LOG.info("Iniciado test de eliminar ciudad");
        departamento.agregarCiudad(ciudad1);
        departamento.agregarCiudad(ciudad2);
        departamento.agregarCiudad(ciudad3);
        departamento.agregarCiudad(ciudad4);

        departamento.eliminarCiudad(ciudad2);

        assertEquals(2, departamento.getCiudades().size());
    }


    // Pruebas de Usuario
    @Test
    public void testAgregarUsuario() {
        LOG.info("Iniciado test de agregar y verificar usuario");
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado2);
        sucursal.agregarUsuario(empleado3);


        assertEquals(2, sucursal.getUsuarios().size());
        
    }

  
    @Test
    public void testEliminarUsuario() {
        LOG.info("Iniciado test de eliminar usuario");
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado3);

        sucursal.eliminarUsuario(empleado1);
        
        assertEquals(1, sucursal.getUsuarios().size());

    }

    @Test
    public void testActualizarEmpleado() {
        LOG.info("Iniciado test de actualizar empleado");
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado2);
        sucursal.agregarUsuario(empleado3);
        
        administrador.actualizarEmpleado(empleado1.getCodigo(), (Empleado) empleadoNuevo);
        
    }

    @Test
    public void testBloquearEmpleado() {
        LOG.info("Iniciado test de bloquear empleado");
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado2);
        sucursal.agregarUsuario(empleado3);
        
        administrador.bloquearEmpleado("esteban", "zxc");  

    }
    

    @Test
    public void testMostrarReportes() {
        LOG.info("Iniciado test de mostrar reportes");
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado2);
        sucursal.agregarUsuario(empleado3);

        sucursal.agregarTransaccion(venta1);
        sucursal.agregarTransaccion(venta2);
        sucursal.agregarTransaccion(compra1);

        LocalDate fechaInicio = LocalDate.of(2024, 10, 20);
        LocalDate fechaFin = LocalDate.of(2024, 11, 10);

        administrador.mostarReportes(25, fechaInicio, fechaFin);
    
    }

    @Test
    public void testCalcularCostoCompra(){
        LOG.info("Iniciado test de calcular el costo de compra");
        ((Compra) compra1).agregarDetallesCompra(detallesCompra1);

        compra1.calcularCosto();

        assertEquals(1000000, ((Compra) compra1).getCosto());

    }

    @Test
    public void testCalcularCostoVenta(){
        LOG.info("Iniciado test de calcular el costo de venta");
        venta1.calcularCosto();

        assertEquals(130000, ((Venta) venta1).getCosto());


    }

    @Test
    public void testCalcularCostoAlquiler(){
        LOG.info("Iniciado test de calcular el costo de venta");
        alquiler1.calcularCosto();

        assertEquals(680000, ((Alquiler)alquiler1).getCosto());

    }


     
}
