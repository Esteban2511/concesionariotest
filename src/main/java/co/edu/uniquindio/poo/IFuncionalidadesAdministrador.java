package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.List;



public interface IFuncionalidadesAdministrador {

    public boolean verificarEmpleado(int codigo);

    public void agregarEmpleado(List <Usuario> usuarios, Empleado empleado);

    public void actualizarEmpleado(int codigo, Empleado empleadoNuevo);

    public boolean bloquearEmpleado(String nombre, String clave);

    public void mostarReportes(int codigo, LocalDate fechaInicio, LocalDate fechaFin);

}
