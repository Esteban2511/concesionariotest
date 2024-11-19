package co.edu.uniquindio.poo;

public class Ciudad {
    private String nombre;
    private Departamento departamento;

    /**
     * Constructor de la clase Ciudad
     * @param nombre
     */
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el nombre de la ciudad
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre de la ciudad
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el departamento de la ciudad
     * @return
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Método para modificar el departamento de la ciudad
     * @param departamento
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Ciudad [nombre=" + nombre + "]";
    }

    

    
    
}
