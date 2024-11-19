package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Reporte {

    private int codigo;
    private LocalDate fechaInicio, fechaFin;
    private Empleado empleado;
    private Collection<Transaccion> transacciones;

    /**
     * Constructor de la clase Reporte
     * @param codigo
     * @param fechaInicio
     * @param fechaFin
     * @param empleado
     * @param transaccion
     */
    public Reporte(int codigo, LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.empleado = empleado;
        transacciones = new LinkedList <>();
    }

    /**
     * Método para obtener el código del reporte
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el código del reporte
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la fecha de inicio del reporte
     * @return
     */
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    /**
     *  Método para modificar la fecha de inicio del reporte
     * @param fechaInicio
     */
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     *  Método para obtener la fecha de fin del reporte
     * @return
     */
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    /**
     * Método para modificar la fecha de fin del reporte
     * @param fechaFin
     */
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Método para obtener el empleado
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
     * Método para obtener la colección de transacciones
     * @return
     */
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }

    /**
     * Método para modificar la colección de transacciones
     * @param transacciones
     */
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }



    public static Reporte generarReporte(LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
        Collection<Reporte> reportes = new LinkedList <>();
        for (Transaccion transaccion : empleado.getTransacciones()) {
            if (transaccion.getFechaTransaccion().isEqual(fechaInicio)||transaccion.getFechaTransaccion().isAfter(fechaInicio) && transaccion.getFechaTransaccion().isEqual(fechaFin) || transaccion.getFechaTransaccion().isBefore(fechaFin)) {
                Reporte reporte = new Reporte(transaccion.getCodigo(), transaccion.getFechaTransaccion(), fechaFin, empleado);
                reportes.add(reporte);
            }
            
        }
        return (Reporte) reportes;            
    }

    
}
