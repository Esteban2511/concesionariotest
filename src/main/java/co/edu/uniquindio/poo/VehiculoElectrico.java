package co.edu.uniquindio.poo;


public class VehiculoElectrico extends Vehiculo {
    private String autonomia, tiempoCarga;


    /**
     * Constructor de la clase VehiculoElectrico
     * @param marca
     * @param modelo
     * @param cambios
     * @param velocidadMax
     * @param cilindraje
     * @param unidadesDisponibles
     * @param estadoVehiculoInv
     * @param estadoVehiculo
     * @param tipoTransmision
     * @param autonomia
     * @param tiempoCarga
     */
    public VehiculoElectrico(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, String autonomia, String tiempoCarga) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    /**
     * Método para obtener la autonomia del vehiculo
     * @return
     */
    public String getAutonomia() {
        return autonomia;
    }

    /**
     * Método para modificar la autonomia del vehiculo
     * @param autonomia
     */
    public void setAutonomia(String autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * Método para obtener el tiempo de carga del vehiculo
     * @return
     */
    public String getTiempoCarga() {
        return tiempoCarga;
    }

    /**
     * Método para modificar el tiempo de carga del vehiculo
     * @param tiempoCarga
     */
    public void setTiempoCarga(String tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
        return "VehiculoElectrico [" + super.toString() + "autonomia=" + autonomia + ", tiempoCarga=" + tiempoCarga + "]";
    }

   

}
