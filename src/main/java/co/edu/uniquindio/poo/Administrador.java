package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario implements IFuncionalidadesAdministrador {

    private Collection<Empleado> empleados;
    private Sucursal sucursal;
    /**
     * Constructor de la clase Administrador
     * @param nombre
     * @param clave
     * @param preguntaSeguridad
     * @param respuestaSeguridad
     * @param codigo
     */
    public Administrador(String nombre, int codigo, String clave, String preguntaSeguridad, String respuestaSeguridad, String email) {
        super(nombre, codigo, clave, preguntaSeguridad, respuestaSeguridad, email);
        this.empleados = new LinkedList <>();
        
    }


    @Override
    public void actualizarEmpleado(int codigo, Empleado empleadoNuevo) {
        if (verificarEmpleado(codigo)){
            for (Empleado empleado : empleados) {
                if (empleado.getCodigo() == (codigo)) {
                    empleado.setNombre(empleadoNuevo.getNombre());
                    empleado.setClave(empleadoNuevo.getClave());
                    empleado.setPreguntaSeguridad(empleadoNuevo.getPreguntaSeguridad());
                    empleado.setRespuestaSeguridad(empleadoNuevo.getRespuestaSeguridad());
                }
            }
        } 
        else {
            System.out.println("El empleado no existe");
        }
    }

    @Override
    public void agregarEmpleado(List <Usuario> usuarios, Empleado empleado) {
        for (Usuario usuario : usuarios) {
            if(usuario instanceof Empleado){
                if(!verificarEmpleado(empleado.getCodigo())){
                    empleados.add(empleado);
                }
                else{
                    System.out.println("El usuario ya existe");
                }
            }
        }
    }

    @Override
    public boolean verificarEmpleado(int codigo) {
        boolean bandera = false;
        for (Empleado empleado : empleados) {
            if (empleado.getCodigo() == (codigo)) {
                bandera = true;
            }
        }
        return bandera;
    }
    

    @Override
    public boolean bloquearEmpleado(String nombre, String clave) { 
        for (Empleado empleado : empleados) {
            if (empleado != null && empleado.getClave().equals(clave)) { 
                    empleado.bloquear(); 
                    System.out.println("El empleado " + nombre + " ha sido bloqueado");
                    return true; 
                
            }
            
        }
        return false;
    }

    @Override
    public void mostarReportes( int codigo, LocalDate fechaInicio, LocalDate fechaFin) {
            for (Empleado empleado2 : empleados) {
            List<Reporte> reportes = (generarReporte(fechaInicio, fechaFin, empleado2));
            
            System.out.println("Empleado: " + empleado2.getNombre());
            for (Reporte reporte : reportes) {
                System.out.println("-Transaccion: " + reporte.getCodigo());
            }
        }
    }
        
    
    public static List<Reporte> generarReporte(LocalDate fechaInicio, LocalDate fechaFin, Empleado empleado) {
        List<Reporte> reportes = new LinkedList<>();
        for (Transaccion transaccion : empleado.getTransacciones()) {
            if ((transaccion.getFechaTransaccion().isEqual(fechaInicio) || transaccion.getFechaTransaccion().isAfter(fechaInicio)) &&(transaccion.getFechaTransaccion().isEqual(fechaFin) || transaccion.getFechaTransaccion().isBefore(fechaFin))) {
                Reporte reporte = new Reporte(transaccion.getCodigo(), transaccion.getFechaTransaccion(), fechaFin, empleado);
                reportes.add(reporte);
            }
        }
        return reportes;
    }

    

    /**
     * Método para obtener la colección de empleados del administrador
     * @return
     */
    public Collection<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Método para modificar la colección de empleados del administrador
     * @param empleados
     */
    public void setEmpleados(Collection<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**  
     * Método para obtener la sucursal del administrador
     * @return
    */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**  
     * Método para modificar la sucursal del administrador
     * @param sucursal
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    @Override
    public String toString() {
        return "Administrador [" + super.toString() + ", sucursal=" + sucursal + "]";
    }

    

    

  
    
    
}
