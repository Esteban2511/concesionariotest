package co.edu.uniquindio.poo;

public class DetallesCompra {
    
    private int cantidad;
    private Compra compra;
    private Vehiculo vehiculo;
    private double SubTotal;

    public DetallesCompra(int cantidad, Compra compra, Vehiculo vehiculo) {
        this.cantidad = cantidad;
        this.compra = compra;
        this.vehiculo = vehiculo;
        SubTotal = calcularSubTotal();
    }


     /**
     * Método para calcular el subtotal
     * @return
     */
    public double calcularSubTotal() {
        double valorVehiculo = 100000 * this.cantidad;
        return valorVehiculo;

    }

    
    /**
     * Método para obtener el número de cantidad
     * @return
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Método para modificar el número de cantidad
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método para obtener la compra
     * @return
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * Método para modificar la compra
     * @param compra
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
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
     * Método para obtener el subtotal
     * @return
     */
    public double getSubTotal() {
        return SubTotal;
    }

    /**
     * Método para modificar el subtotal
     * @param calcularSubTotal
     */
    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

   

    @Override
    public String toString() {
        return "DetallesCompra [cantidad=" + cantidad + ", compra=" + compra.getCodigo() + ", vehiculo=" + vehiculo.getMarca() + " " + vehiculo.getModelo() + ", SubTotal="
                + SubTotal + "]";
    }

    
}
