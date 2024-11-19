package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Sucursal implements IFuncionalidadesEmpleado {
    private String nombre;
    private Departamento departamento;
    private Ciudad ciudad;
    private Collection<Usuario> usuarios;
    private Collection<Cliente> clientes;
    private Collection<Transaccion> transacciones;
    private Collection<Vehiculo> vehiculos;
    private Collection<Reporte> reportes;

    public Sucursal(String nombre, Departamento departamento, Ciudad ciudad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.usuarios = new LinkedList <>();
        this.clientes = new LinkedList <>();
        this.transacciones = new LinkedList <>();
        this.vehiculos = new LinkedList <>();
        this.reportes = new LinkedList <>();
    }

    /**
     * Método para agregar vehiculo
     * @param vehiculo
     */
    @Override
    public void agregarVehiculo(Vehiculo vehiculo) {
        if(!verificarVehiculo(vehiculo.getCodigo())){
            vehiculos.add(vehiculo);
            System.out.println("Se ha agregado el vehiculo " + vehiculo.getMarca() + "," + vehiculo.getModelo());
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
     * Método para agregar usuario
     * @param usuario
     */
    public void agregarUsuario(Usuario usuario) {
        if(!verificarUsuario(usuario.getCodigo())){
            usuarios.add(usuario);
        }
    }

    /**
     * Método para verificar si el usuario existe
     * @param nombre
     * @return
     */
    public boolean verificarUsuario(int codigo) {
        boolean centinela = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == (codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar usuario
     * @param usuario
     */
    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }



    /**
     * Método para obtener el nombre de la sucursal
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre de la sucursal
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el departamento de la sucursal
     * @return
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     *  Método para modificar el departamento de la sucursal
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Método para obtener la ciudad de la sucursal
     * @return
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * Método para modificar la ciudad de la sucursal
     * @param ciudades
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método para obtener la colección de usuarios de la sucursal
     * @return
     */
    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Método para modificar la colección de usuarios de la sucursal
     * @param usuarios
     */
    public void setUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Método para obtener la colección de clientes de la sucursal
     * @return
     */
    public Collection<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Método para modificar la colección de clientes de la sucursal
     * @param clientes
     */
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }

    /**
     * Método para obtener la colección de transacciones de la sucursal
     * @return
     */
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Método para modificar la colección de transacciones de la sucursal
     * @param transacciones
     */
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * Método para obtener la colección de vehiculos de la sucursal
     * @return
     */
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Método para modificar la colección de vehiculos de la sucursal
     * @param vehiculos
     */
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Método para obtener la colección de reportes de la sucursal
     * @return
     */
    public Collection<Reporte> getReportes() {
        return reportes;
    }

    /**
     * Método para modificar la colección de reportes de la sucursal
     * @param reportes
     */
    public void setReportes(Collection<Reporte> reportes) {
        this.reportes = reportes;
    }


    /**
     * Método para iniciar la sesión de un usuario
     * @param codigo
     * @param clave
     * @return
     */
    public boolean iniciarSesion(String email, String clave) {
        boolean bandera = false;
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getClave().equals(clave)) {
                bandera = true;
            }
        }
        return bandera;
    }
    
   

    @Override
    public String toString() {
        return "Sucursal [nombre=" + nombre + ", departamento=" + departamento + ", ciudad=" + ciudad + "]";
    }

    
    
}
    




