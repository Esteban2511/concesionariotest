package co.edu.uniquindio.poo;



public class Vann extends VehiculoHibrido {

    /**
     * Constructor de la clase Vann
     * @param marca
     * @param modelo
     * @param cambios
     * @param velocidadMax
     * @param cilindraje
     * @param unidadesDisponibles
     * @param estadoVehiculoInv
     * @param estadoVehiculo
     * @param tipoTransmision
     * @param enchufable
     * @param ligero
     * @param capacidadPasajeros
     * @param cantidadPuertas
     * @param capacidadMaletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param bolsasAire
     * @param ABS
     */
    public Vann(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean enchufable, boolean ligero, int capacidadPasajeros, int cantidadPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int bolsasAire, boolean ABS) {        
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, enchufable, ligero, capacidadPasajeros, cantidadPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, bolsasAire, ABS);
    }

    @Override
    public String toString() {
        return "Vann [" + super.toString() + "]";
    }

   
    
}
