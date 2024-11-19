package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Departamento {
    private String nombre;
    private Collection<Ciudad> ciudades;

    /**
     * Constructor de la clase Departamento
     * @param nombre
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.ciudades = new LinkedList <>();
    }

    /**
     *  Método para agregar una ciudad a un departamento
     * @param ciudad
     */
    public void agregarCiudad(Ciudad ciudad) {
        if (!verificarCiudad(ciudad.getNombre())) {
            ciudades.add(ciudad);
        }
    }

    /**
     * Método para verificar si una ciudad existe en el departamento
     * @param nombre
     * @return
     */
    public boolean verificarCiudad(String nombre) {
        boolean centinela = false;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }
    /**
     * Método para eliminar ciudad
     * @param ciudad
     */
    public void eliminarCiudad(Ciudad ciudad){
        ciudades.remove(ciudad);
    }

    /**
     * Método para obtener el nombre del departamento
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *  Método para modificar el nombre del departamento
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la colección de ciudades del departamento
     * @return
     */
    public Collection<Ciudad> getCiudades() {
        return ciudades;
    }

    /**
     * Método para modificar la colección de ciudades del departamento
     * @param ciudades
     */
    public void setCiudades(Collection<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Departamento [nombre=" + nombre + "]";
    }

}
