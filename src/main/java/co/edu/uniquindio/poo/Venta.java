package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Venta extends Transaccion{
   
    
    private double costo;

    /**
     * Constructor de la clase Venta
     * @param codigo
     * @param fechaTransaccion
     */
    public Venta(int codigo, LocalDate fechaTransaccion, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
        super(codigo, fechaTransaccion, empleado, vehiculo, cliente);
        this.costo = calcularCosto();
    }

    @Override
    public double calcularCosto() {
        double valorVenta = 100000 * 1.3;
        return valorVenta;
    }


    /**
     * Método para obtener el costo de la venta
     * @return
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Método para modificar el costo de la venta
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

   
    @Override
    public String toString() {
        return "Venta [" + super.toString() + "]";
    }

}
