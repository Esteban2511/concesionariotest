package co.edu.uniquindio.poo;

public interface IFuncionalidadesEmpleado {

    public void agregarVehiculo(Vehiculo vehiculo);

    public boolean verificarVehiculo(int codigo);

    public void eliminarVehiculo(Vehiculo vehiculo);

    public void agregarTransaccion(Transaccion transaccion);

    public boolean verificarTransaccion(int codigo);

    public void eliminarTransaccion(Transaccion transaccion);

    public void agregarCliente(Cliente cliente);

    public boolean verificarCliente(int codigo);

    public void eliminarCliente(Cliente cliente);
}