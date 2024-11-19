package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Empleado extends Usuario implements IFuncionalidadesEmpleado {
    private Collection<Transaccion> transacciones;
    private Collection<Cliente> clientes;
    private Collection<Vehiculo> vehiculos;
    private Collection<Alquiler> alquileres;
    private Collection<Compra> compras;
    private Collection<Venta> ventas;
    private boolean bloqueado;
    private Sucursal sucursal;


    /**
     * Constructor de la clase Empleado
     * @param nombre
     * @param clave
     * @param preguntaSeguridad
     * @param respuestaSeguridad
     * @param codigo
     */
    public Empleado(String nombre, int codigo, String clave, String preguntaSeguridad, String respuestaSeguridad, String email) {
        super(nombre, codigo, clave, preguntaSeguridad, respuestaSeguridad, email);
        this.bloqueado = false;
        this.transacciones = new LinkedList <>();
        this.clientes = new LinkedList <>();
        this.vehiculos = new LinkedList <>();
        this.alquileres = new LinkedList <>();
        this.compras = new LinkedList <>();
        this.ventas = new LinkedList <>();

    }

    /**
     * Método para agregar vehiculo
     * @param vehiculo
     */
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        if(verificarVehiculo(vehiculo.getCodigo())){
            vehiculos.add(vehiculo);
            
        }
    }

    /**
     * Método para verificar si el vehículo existe
     * @param marca
     * @param modelo
     * @return
     */
    @Override
    public boolean verificarVehiculo(int codigo) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodigo() == codigo) {
                if (vehiculo.getUnidadesDisponibles() > 0) {
                    centinela = true;
                }
            }
        }
        return centinela;
    }

    /**
     * Metodo para modificar la cantidad de unidades disponibles del vehiculo
     * @param vehiculo
     * @param cantidad
     * @return
     */
    public boolean modificarCantidad(Vehiculo vehiculo, int cantidad){
        boolean bandera = false;
        if(verificarVehiculo(vehiculo.getCodigo())){
            if (vehiculo.getUnidadesDisponibles()> cantidad){
    
                vehiculo.setUnidadesDisponibles(vehiculo.getUnidadesDisponibles() - cantidad);
                bandera = true;
            }
    
            else if(vehiculo.getUnidadesDisponibles() == cantidad){
                vehiculo.setEstadoVehiculoInv(false);
                vehiculo.setUnidadesDisponibles(vehiculo.getUnidadesDisponibles() - cantidad);
                bandera = true;
            }
    
            else{
                System.out.println("Las unidades disponibles no son suficientes para realizar el prestamo");
            }
        }
        else{
            System.out.println("El estado del libro actualmente esta en -no disponible-");
        }
        return bandera;
    }
    

    /**
     * Método para eliminar vehiculo
     * @param vehiculo
     */
    @Override
    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    /**
     * Método para agregar transaccion
     * @param transaccion
     */
    @Override
    public void agregarTransaccion(Transaccion transaccion) {
        if (!verificarTransaccion(transaccion.getCodigo())) {
            transacciones.add(transaccion);
        }
    }

    /**
     * Método para verificar si la transacción existe
     * @param codigo
     * @return
     */
    @Override
    public boolean verificarTransaccion(int codigo) {
        boolean centinela = false;
        for (Transaccion transaccion : transacciones) {
            if (transaccion.getCodigo()==codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar transacción
     * @param transaccion
     */
    @Override
    public void eliminarTransaccion(Transaccion transaccion) {
        transacciones.remove(transaccion);
    }

    /**
     * Método para agregar cliente
     * @param cliente
     */
    @Override
    public void agregarCliente(Cliente cliente) {
        if (!verificarCliente(cliente.getCodigo())) {
            clientes.add(cliente);
        }
    }

    /**
     * Método para verificar si el cliente existe
     * @param codigo
     * @return
     */
    @Override
    public boolean verificarCliente(int codigo) {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo()==(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar cliente
     * @param cliente
     */
    @Override
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    

    /**
     *  Método para agregar alquiler vehiculo
     * @param alquiler
     */
    public void agregarAlquilerVehiculo(Alquiler alquiler) {
        if (!verificarEdad()&&!verificaralquilerVehiculo(alquiler.getCodigo())) {
            alquileres.add(alquiler);
        }
    }

    /**
     * Método para verificar si el cliente tiene edad mayor a 18
     * @return
     */
    public boolean verificarEdad() {
        boolean centinela = false;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo()>=18) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para verificar si el alquiler ya existe
     * @param codigo
     * @return
     */
    public boolean verificaralquilerVehiculo(int codigo) {
        boolean centinela = false;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getCodigo()==codigo) {
                centinela = true;
            }
            
        }
        return centinela;
    }  

    /**
     * Método para eliminar un alquiler
     * @param alquiler
     */
    public void eliminarAlquilerVehiculo(Alquiler alquiler) {
        alquileres.remove(alquiler);

    }

    /**
     * Método para agregar compra vehiculo
     * @param compra
     */
    public void agregarcomprarVehiculo(Compra compra) {
        if (!verificarCompraVehiculo(compra.getCodigo())) {
            compras.add(compra);
        }
    }

    /**
     * Método para verificar si ya existe la compra
     * @param codigo
     * @return
     */
    private boolean verificarCompraVehiculo(int codigo) {
        boolean centinela = false;
        for (Compra compra : compras) {
            if (compra.getCodigo()==codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar la compra
     * @param compra
     */
    public void eliminarCompraVehiculo(Compra compra) {
        compras.remove(compra);
    }

    /**
     * Método para agregar venta vehiculo
     * @param venta
     */
    public void agregarVentaVehiculo(Venta venta) {
        if (!verificarVentaVehiculo(venta.getCodigo())) {
            ventas.add(venta);
        }
    }

    /**
     * Método para verificar si ya existe la venta
     * @param codigo
     * @return
     */
    private boolean verificarVentaVehiculo(int codigo) {
        boolean centinela = false;
        for (Venta venta : ventas) {
            if (venta.getCodigo()==codigo) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar la venta
     * @param venta
     */
    public void eliminarVentaVehiculo(Venta venta) {
        ventas.remove(venta);
    }

    /**
     * Método para obtener la colección de transacciones de la empresa
     * @return
     */
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Método para modificar la colección de transacciones de la empresa
     * @param transacciones
     */
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Método para obtener la colección de clientes de la empresa
     * @return
     */
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Método para modificar la colección de clientes de la empresa
     * @param clientes
     */
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Método para obtener la colección de vehiculos de la empresa
     * @return
     */
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Método para modificar la colección de vehiculos de la empresa
     * @param vehiculos
     */
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Método para obtener la colección de alquileres de la empresa
     * @return
     */
    public Collection<Alquiler> getAlquileres() {
        return alquileres;
    }

    /**
     * Método para modificar la colección de alquileres de la empresa
     * @param alquileres
     */
    public void setAlquileres(Collection<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    /**
     * Método para obtener la colección de compras de la empresa
     * @return
     */
    public Collection<Compra> getCompras() {
        return compras;
    }

    /**
     * Método para modificar la colección de compras de la empresa
     * @param compras
     */
    public void setCompras(Collection<Compra> compras) {
        this.compras = compras;
    }

    /**
     * Método para obtener la colección de ventas de la empresa
     * @return
     */
    public Collection<Venta> getVentas() {
        return ventas;
    }

    /**
     * Método para modificar la colección de ventas de la empresa
     * @param ventas
     */
    public void setVentas(Collection<Venta> ventas) {
        this.ventas = ventas;
    }

    /**
     * Método para obtener si el empleado está bloqueado
     * @return
     */
    public boolean isBloqueado() {
        return bloqueado;
    }

    /**
     * Método para bloquear el empleado
     */
    public void bloquear() {
        this.bloqueado = true;
    }

    /**
     * Método para desbloquear el empleado
     */
    public void desbloquear() {
        this.bloqueado = false;
    }

    /** 
     * Método para obtener la sucursal del empleado
     * @return
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /** 
     * Método para modificar la sucursal del empleado
     * @param sucursal
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Empleado [" + super.toString() + "transacciones=" + transacciones + ", clientes=" + clientes + ", vehiculos=" + vehiculos
                + ", alquileres=" + alquileres + ", compras=" + compras + ", ventas=" + ventas + ", bloqueado="
                + bloqueado + "]";
    }

    

   
}


