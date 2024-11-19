package co.edu.uniquindio.poo;


public class Camion extends VehiculoCombustible {
    private int capacidadCarga, ejes;
    private boolean frenosAire;
    TipoCamion tipoCamion;

    /**
     * Constructor de la clase Camion
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
     * @param capacidadCarga
     * @param ejes
     * @param frenosAire
     * @param tipoCamion
     */
    public Camion(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean aireAcondicionado, boolean ABS, int capacidadCarga, int ejes, boolean frenosAire, TipoCamion tipoCamion) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, aireAcondicionado, ABS);
        this.capacidadCarga = capacidadCarga;
        this.ejes = ejes;
        this.frenosAire = frenosAire;
        this.tipoCamion = tipoCamion;
    }

    /**
     * Método para obtener la capacidad de carga del vehiculo
     * @return
     */
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * Método para modificar la capacidad de carga del vehiculo
     * @param capacidadCarga
     */
    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * Método para obtener el número de ejes del vehiculo
     * @return
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * Método para modificar el número de ejes del vehiculo
     * @param ejes
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    /**
     * Método para obtener si el frenos está acondicionado
     * @return
     */
    public boolean isFrenosAire() {
        return frenosAire;
    }

    /**
     * Método para modificar si el frenos está acondicionado
     * @param frenosAire
     */
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    /**
     * Método para obtener el tipo de camión del vehiculo
     * @return
     */
    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    /**
     * Método para modificar el tipo de camión del vehiculo
     * @param tipoCamion
     */
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    @Override
    public String toString() {
        return "Camion [" + super.toString() + "capacidadCarga=" + capacidadCarga + ", ejes=" + ejes + ", frenosAire=" + frenosAire
                + ", tipoCamion=" + tipoCamion + "]";
    }

    
}
