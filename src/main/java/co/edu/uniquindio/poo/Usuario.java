package co.edu.uniquindio.poo;

public class Usuario {
    private String nombre, clave, preguntaSeguridad, respuestaSeguridad, email;
    private int codigo;
    private Sucursal sucursal;
    /**
     * Constructor de la clase Usuario
     * @param nombre
     * @param codigo
     * @param clave
     * @param preguntaSeguridad
     * @param respuestaSeguridad
     * @param email
     */
    public Usuario(String nombre, int codigo,String clave, String preguntaSeguridad, String respuestaSeguridad, String email) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.clave = clave;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.email = email;
        
    }

    /**
     * Método para obtener el nombre del usuario
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para modificar el nombre del usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener la clave del usuario
     * @return
     */
    public String getClave() {
        return clave;
    }

    /**
     *  Método para modificar la clave del usuario
     * @param clave
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Método para obtener la pregunta de seguridad del usuario
     * @return
     */
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    /**
     * Método para modificar la pregunta de seguridad del usuario
     * @param preguntaSeguridad
     */
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    /**
     * Método para obtener la respuesta de seguridad del usuario
     * @return
     */
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    /**
     * Método para modificar la respuesta de seguridad del usuario
     * @param respuestaSeguridad
     */
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    /**
     * Método para obtener la sucursal del usuario
     * @return
     */
    public Sucursal getSucursal() {
        return sucursal;
    }

    /**
     * Método para modificar la sucursal del usuario
     * @param sucursal
     */
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    /**
     * Método para obtener el código del usuario
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el código del usuario
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Método para obtener el email del usuario
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para modificar el email del usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", clave=" + clave + ", preguntaSeguridad=" + preguntaSeguridad
                + ", respuestaSeguridad=" + respuestaSeguridad + ", email=" + email + ", codigo=" + codigo
                + ", sucursal=" + sucursal + "]";
    }


}
