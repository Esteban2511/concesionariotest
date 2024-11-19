package co.edu.uniquindio.poo;

public class Vehiculo {
    private String marca, modelo;
    private int cambios, cilindraje, unidadesDisponibles, codigo;
    private double velocidadMax;
    private boolean estadoVehiculoInv;
    EstadoVehiculo estadoVehiculo;
    TipoTransmision tipoTransmision;

    /**
     * Constructor de la clase Vehiculo
     * @param marca
     * @param modelo
     * @param cambios
     * @param velocidadMax
     * @param cilindraje
     * @param unidadesDisponibles
     * @param codigo
     * @param estadoVehiculoInv
     * @param estadoVehiculo
     * @param tipoTransmision
     */
    public Vehiculo(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMax = velocidadMax;
        this.cilindraje = cilindraje;
        this.unidadesDisponibles = unidadesDisponibles;
        this.codigo = codigo;
        this.estadoVehiculoInv = estadoVehiculoInv;
        this.estadoVehiculo = estadoVehiculo;
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * Método para obtener la marca del vehiculo
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para modificar la marca del vehiculo
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener el modelo del vehiculo
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método para modificar el modelo del vehiculo
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener el número de cambios del vehiculo
     * @return
     */
    public int getCambios() {
        return cambios;
    }

    /**
     * Método para modificar el número de cambios del vehiculo
     * @param cambios
     */
    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    /**
     * Método para obtener la velocidad máxima del vehiculo
     * @return
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }

    /**
     * Método para modificar la velocidad máxima del vehiculo
     * @param velocidadMax
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    /**
     * Método para obtener el cilindraje del vehiculo
     * @return
     */
    public int getCilindraje() {
        return cilindraje;
    }

    /**
     * Método para modificar el cilindraje del vehiculo
     * @param cilindraje
     */
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    /**
     * Método para obtener la cantidad de unidades disponibles del vehiculo
     * @return
     */
    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    /**
     * Método para modificar la cantidad de unidades disponibles del vehiculo
     * @param unidadesDisponibles
     */
    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    /**
     * Método para obtener si el estado del vehiculo está invertido
     * @return
     */
    public boolean isEstadoVehiculoInv() {
        return estadoVehiculoInv;
    }

    /**
     * Método para modificar si el estado del vehiculo está invertido
     * @param estadoVehiculoInv
     */
    public void setEstadoVehiculoInv(boolean estadoVehiculoInv) {
        this.estadoVehiculoInv = estadoVehiculoInv;
    }
    /**
     * Método para obtener el estado del vehiculo
     * @return
     */
    public EstadoVehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }

    /**
     * Método para modificar el estado del vehiculo
     * @param estadoVehiculo
     */
    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

    /**
     * Método para obtener el tipo de transmisión del vehiculo
     * @return
     */
    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    /**
     * Método para modificar el tipo de transmisión del vehiculo
     * @param tipoTransmision
     */
    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * Método para obtener el código del vehiculo
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Método para modificar el código del vehiculo
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", cambios=" + cambios + ", cilindraje=" + cilindraje
                + ", unidadesDisponibles=" + unidadesDisponibles + ", codigo=" + codigo + ", velocidadMax="
                + velocidadMax + ", estadoVehiculoInv=" + estadoVehiculoInv + ", estadoVehiculo=" + estadoVehiculo
                + ", tipoTransmision=" + tipoTransmision + "]";
    }

   

}
