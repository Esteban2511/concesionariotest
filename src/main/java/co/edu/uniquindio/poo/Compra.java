package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Compra extends Transaccion {
    

 
    private Collection<DetallesCompra> detallesCompras;
    private double costo;
    
        /**
         * Constructor de la clase Compra
         * @param codigo
         * @param fechaTransaccion
         */
        public Compra(int codigo, LocalDate fechaTransaccion, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
            super(codigo, fechaTransaccion, empleado, vehiculo, cliente);
         
            this.detallesCompras = new LinkedList <>();
            this.costo = calcularCosto();
    }

    @Override
    public double calcularCosto() {
        double total = 0;
        for (DetallesCompra detallesCompra : detallesCompras) {
            total += detallesCompra.getSubTotal();
        }
        this.costo = total;
        return costo;
        
    }

    public void agregarDetallesCompra(DetallesCompra detallesCompra) {
        detallesCompras.add(detallesCompra);
    }

    
    /**
     * Método para obtener el costo de la compra
     * @return
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Método para modificar el costo de la compra
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Método para obtener la colección de detalles de la compra
     * @return
     */
    public Collection<DetallesCompra> getDetallesCompras() {
        return detallesCompras;
    }

    /**
     * Método para modificar la colección de detalles de la compra
     * @param detallesCompras
     */
    public void setDetallesCompras(Collection<DetallesCompra> detallesCompras) {
        this.detallesCompras = detallesCompras;
    }


    @Override
    public String toString() {
        return "Compra [detallesCompras=" + detallesCompras.size() + ", costo=" + costo + "]";
    }



}
