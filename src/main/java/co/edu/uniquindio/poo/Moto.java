package co.edu.uniquindio.poo;


public class Moto extends VehiculoElectrico {

    /**
     * Constructor de la clase Moto
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
    public Moto(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, String autonomia, String tiempoCarga) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, autonomia, tiempoCarga);
    }

    @Override
    public String toString() {
        return "Moto [" + super.toString() + "]";
    }

   
    
}
