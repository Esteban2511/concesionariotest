package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Transaccion {
    private LocalDate fechaDevolucion;
    private double costo;


    /**
     * Metodo constructor de la calse Alquiler
     * @param codigo
     * @param fechaAlquiler
     * @param fechaDevolucion
     */
    public Alquiler(int codigo, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
        super(codigo, fechaAlquiler, empleado, vehiculo, cliente);
        this.fechaDevolucion = fechaDevolucion;
        this.costo = calcularCosto();
    }
    
    @Override
    public double calcularCosto() {
        double valorDia = 20000;
        long diasPrestamo = ChronoUnit.DAYS.between(this.fechaTransaccion, this.fechaDevolucion);
        double valorTotal = valorDia *diasPrestamo;
        return valorTotal;
    }

    /**
     * Método para obtener la fecha de devolución
     * @return
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Método para modificar la fecha de devolución
     * @param fechaDevolucion
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Método para obtener el costo del alquiler 
     * @return
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Método para modificar el costo del alquiler 
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }


    @Override
    public String toString() {
        return "Alquiler [fechaDevolucion=" + fechaDevolucion + "]";
    }

    

   
    
}
