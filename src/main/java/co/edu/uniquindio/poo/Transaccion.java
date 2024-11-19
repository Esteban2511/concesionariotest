package co.edu.uniquindio.poo;

import java.time.LocalDate;

public abstract class Transaccion {
    private int codigo;
    protected LocalDate fechaTransaccion;
    private Empleado empleado;
    private Vehiculo vehiculo;
    private Cliente cliente;

    /**
     * Constructor de la clase Transaccion
     * @param codigo
     */
    public Transaccion(int codigo, LocalDate fechaTransaccion, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
        this.codigo = codigo;
        this.fechaTransaccion = fechaTransaccion;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    /**
     * Método para obtener el codigo de la transacción
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el codigo de la transacción
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la fecha de la transacción
     * @return
     */
    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Método para modificar la fecha de la transacción
     * @param fechaTransaccion
     */
    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    /**
     *  Método para obtener el empleado
     * @return
     */
    public Empleado getEmpleado() {
        return empleado;
    }

    /**
     * Método para modificar el empleado
     * @param empleado
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Método para obtener el vehiculo
     * @return
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Método para modificar el vehiculo
     * @param vehiculo
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Método para obtener el cliente
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Método para modificar el cliente
     * @param cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract double calcularCosto();


   
}
