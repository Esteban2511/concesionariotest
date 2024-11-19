package co.edu.uniquindio.poo;


public class VehiculoCombustible extends Vehiculo {
    private boolean aireAcondicionado,  ABS;

    /**
     * Constructor de la clase VehiculoCombustible
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
     * @param aireAcondicionado
     * @param ABS
     */
    public VehiculoCombustible(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean aireAcondicionado, boolean ABS) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision);
        this.aireAcondicionado = aireAcondicionado;
        this.ABS = ABS;
    }

    /**
     * Método para obtener si el aire está acondicionado
     * @return
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * Método para modificar si el aire está acondicionado
     * @param aireAcondicionado
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * Método para obtener si el vehiculo tiene ABS
     * @return
     */
    public boolean isABS() {
        return ABS;
    }

    /**
     * Método para modificar si el vehiculo tiene ABS
     * @param ABS
     */
    public void setABS(boolean ABS) {
        this.ABS = ABS;
    }

    @Override
    public String toString() {
        return "VehiculoCombustible [" + super.toString() + "aireAcondicionado=" + aireAcondicionado + ", ABS=" + ABS + "]";
    }

    
}
