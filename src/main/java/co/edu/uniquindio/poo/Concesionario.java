package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private Collection<Sucursal> sucursales;
    private Collection<Departamento> departamentos;

    /**
     * Constructor de la clase Concesionario
     * @param nombre
     */
    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.sucursales = new LinkedList <>();
        this.departamentos = new LinkedList <>();
    }

    /**
     * Método para agregar un departamento
     * @param departamento
     */
    public void agregarDepartamento(Departamento departamento) {
        if (!verificarDepartamento(departamento.getNombre())) {
            departamentos.add(departamento);
        }
    }

    /**
     * Método para verificar si el departamento existe
     * @param nombre
     * @return
     */
    public boolean verificarDepartamento(String nombre) {
        boolean centinela = false;
        for (Departamento departamento : departamentos) {
            if (departamento.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Método para eliminar un departamento
     * @param departamento
     */
    public void eliminarDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }
     
    /**
     * Método para agregar una sucursal
     * @param sucursal
     */
    public void agregarSucursal(Sucursal sucursal) {
        if (!verificarSucursal(sucursal.getNombre())) {
            sucursales.add(sucursal);
        }
    }

    /**
     * Método para verificar si la sucursal existe
     * @param nombre
     * @return
     */
    public boolean verificarSucursal(String nombre) {
        boolean centinela = false;
        for (Sucursal sucursal : sucursales) {
            if (sucursal.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }
   

    /**
     * Método para eliminar una sucursal
     * @param sucursal
     */
    public void eliminarSucursal(Sucursal sucursal) {
        sucursales.remove(sucursal);
    }


    /**
     * Método para obtener el nombre del concesionario
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del concesionario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la colección de sucursales del concesionario
     * @return
     */
    public Collection<Sucursal> getSucursales() {
        return sucursales;
    }

    /**
     * Método para modificar la colección de sucursales del concesionario
     * @param sucursales
     */
    public void setSucursales(Collection<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    /**
     * Método para obtener la colección de departamentos del concesionario
     * @return
     */
    public Collection<Departamento> getDepartamentos() {
        return departamentos;
    }

    /**
     * Método para modificar la colección de departamentos del concesionario
     * @param departamentos
     */
    public void setDepartamentos(Collection<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Concesionario [nombre=" + nombre + ", sucursales=" + sucursales + ", departamentos=" + departamentos
                + "]";
    }

    
}
