package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {


        Concesionario concesionario = new Concesionario("concesionario");
        Departamento departamento11 = new Departamento("Quindio");
        Ciudad ciudad11 = new Ciudad("Armenia");
        
        Sucursal sucursal = new Sucursal("bala", departamento11, ciudad11);

        // Creación de usuarios
        Empleado empleado1 = new Empleado("memincho", 0001, "zxc", "cumpleaños", "noviembre", "memincho321@gmail.com");
        Empleado empleado2 = new Empleado("valentina", 0001, "edf", "edad", "25", "valentina.gomez@ejemplo.com");
        Empleado empleado3 = new Empleado("raul",  1548, "asdfg", "no", "invente", "raul.lopez@ejemplo.com");
        Administrador administrador1 = new Administrador("Esteban", 123456, "evb", "mascota", "gato", "esteban.rodriguez@ejemplo.com");
        
        
       
        // Creación de clientes
        Cliente cliente1 = new Cliente("juan", "calle", 254131, 1548, 25);
        Cliente cliente2 = new Cliente("vanesa", "barrio", 2544581, 18648, 25);
        Cliente cliente3 = new Cliente("luis", "avenida", 3254845, 12458, 27);
         
        // Creación de vehiculos
        Vehiculo moto1 = new Moto("yamaha", "mt09", 5, 180, 899, 5, 15847, true, EstadoVehiculo.NUEVO, TipoTransmision.MANUAL, "6 horas", "10 horas");
        Vehiculo sedan1 = new Sedan("mercedes", "aventure", 6, 140, 3200, 7, 13598, true, EstadoVehiculo.NUEVO, TipoTransmision.AUTOMATICA, true, false, 5, 5, 4.5, false, true, 2, false, false, false, false, false);
        Vehiculo bus1 = new Bus("ford", "xtr", 6, 150, 6500, 2, 65498, true, EstadoVehiculo.NUEVO, TipoTransmision.MANUAL, true, false, 20, 3, 1, 16, 1, 15.5, false);
        Vehiculo bus2 = new Bus("ford", "xtr", 6, 150, 6500, 2, 65498, true, EstadoVehiculo.NUEVO, TipoTransmision.MANUAL, true, false, 20, 3, 1, 16, 1, 15.5, false);
        

        // Creación de Transacciones 
        Transaccion alquiler1 = new Alquiler(211548, LocalDate.of(2024, 10, 20), LocalDate.of(2024, 11, 10), (Empleado) empleado1, bus1, cliente2);
        Transaccion compra1 = new Compra(15486, LocalDate.of(2024, 10, 25), (Empleado) empleado2, sedan1, cliente2);
        Transaccion venta1 = new Venta(15486652, LocalDate.of(2024, 10, 23), (Empleado) empleado3, moto1, cliente1);
        Transaccion venta2 = new Venta(15486152, LocalDate.of(2024, 10, 22), (Empleado) empleado3, moto1, cliente3);
        DetallesCompra detallesCompra1 = new DetallesCompra(5, (Compra) compra1, sedan1);
        DetallesCompra detallesCompra2 = new DetallesCompra(3, (Compra) compra1, moto1);


        // Agregación de usuarios a la sucursal
        sucursal.agregarUsuario(empleado1);
        sucursal.agregarUsuario(empleado2);
        sucursal.agregarUsuario(empleado3);
        sucursal.agregarUsuario(administrador1);

        // Agregación de vehiculos a la sucursal
        
        sucursal.agregarVehiculo(bus1);
        sucursal.agregarVehiculo(sedan1);
        sucursal.agregarVehiculo(moto1);

        concesionario.agregarDepartamento(departamento11);
        departamento11.agregarCiudad(ciudad11);
        

        // Agregación de transacciones a la sucursal
        sucursal.agregarTransaccion(venta2);
        sucursal.agregarTransaccion(compra1);
        sucursal.agregarTransaccion(alquiler1);
        sucursal.agregarTransaccion(venta1);

        // Agregacion de vehiculos a los empleados
        empleado1.agregarVehiculo(bus1);
        empleado1.agregarVehiculo(sedan1);
        empleado1.agregarVehiculo(moto1);
        empleado1.agregarVehiculo(bus2);

        List<Empleado> empleados = new LinkedList <>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        sucursal.agregarCliente(cliente3);
        sucursal.agregarCliente(cliente2);
        sucursal.agregarCliente(cliente1);

        empleado1.agregarCliente(cliente3);
        empleado1.agregarCliente(cliente2);
        empleado1.agregarCliente(cliente1);

        LocalDate fechaInicio = LocalDate.of(2024, 10, 20);
        LocalDate fechaFin = LocalDate.of(2024, 11, 10);

        // Agregación de alquileres a la sucursal
        empleado1.agregarTransaccion(alquiler1);

        // Agregación de compras a la sucursal
        empleado2.agregarTransaccion(compra1);

        // Agregación de ventas a la sucursal
        empleado3.agregarTransaccion(venta1);
        empleado3.agregarTransaccion(venta2);

        administrador1.setEmpleados(empleados);

        ((Compra) compra1).agregarDetallesCompra(detallesCompra1);
        ((Compra) compra1).agregarDetallesCompra(detallesCompra2);


        // Bloqueo de empleados
        System.out.println("\nBloqueo de empleado:");
        administrador1.bloquearEmpleado("esteban", "zxc");

        System.out.println("\nMostrar los reportes en un tiempo determindo:");
        administrador1.mostarReportes(25, fechaInicio, fechaFin);

        System.out.println("\nVehículos en la sucursal:");
        System.out.println(sucursal.getVehiculos());

        System.out.println("\nUsuarios en la sucursal:");
        System.out.println(sucursal.getUsuarios());

        System.out.println("\nClientes en la sucursal:");
        System.out.println(sucursal.getClientes());

        System.out.println("\nSucursal:");
        System.out.println(sucursal.toString());

        System.out.println("\nClientes que agrega el empleado:");
        System.out.println(empleado1.getClientes());

        System.out.println("\nVehiculos que agrega el empleado:");
        System.out.println(empleado1.getVehiculos());

        System.out.println("\nDetalles de compra:");
        System.out.println(detallesCompra1.toString());

        System.out.println("\nCompra:");
        System.out.println("el costo de la compra es: " + compra1.calcularCosto());
        System.out.println(compra1.toString());

        System.out.println("\nVenta:");
        System.out.println("el valor de la venta es: " + venta1.calcularCosto());
        System.out.println(venta1.toString());

        System.out.println("\nAlquiler:");
        System.out.println("el costo de la alquiler es: " + alquiler1.calcularCosto());
        System.out.println(alquiler1.toString());


        /* 
        //dejar de ultima linea
        sucursal.recuperarContraseña(0001, "zxjdjc");
    */
        
        
    }
}
