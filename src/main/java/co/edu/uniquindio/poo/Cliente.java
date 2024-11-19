package co.edu.uniquindio.poo;

public class Cliente {
    private String nombre, direccion;
    private int codigo, edad, telefono;

    /**
     * Constructor de la clase Cliente
     * @param nombre
     * @param direccion
     * @param telefono
     * @param codigo
     * @param edad
     */
    public Cliente(String nombre, String direccion, int telefono, int codigo, int edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo = codigo;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del cliente
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del cliente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la dirección del cliente
     * @return
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Método para modificar la dirección del cliente
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Método para obtener el telefono del cliente
     * @return
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Método para modificar el telefono del cliente
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener el codigo del cliente
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el codigo del cliente
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener la edad del cliente
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para modificar la edad del cliente
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", direccion=" + direccion + ", codigo=" + codigo + ", edad=" + edad
                + ", telefono=" + telefono + "]";
    }

    
}
