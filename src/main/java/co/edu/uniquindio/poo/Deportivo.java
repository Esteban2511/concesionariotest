package co.edu.uniquindio.poo;

public class Deportivo extends VehiculoElectrico {
    
    private int capacidadPasajeros, cantidadPuertas, bolsasAire, caballosFuerza;
    private String tiempoLlegar100Km;

    /**
     * Constructor de la clase Deportivo
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
     * @param capacidadPasajeros
     * @param cantidadPuertas
     * @param bolsasAire
     * @param caballosFuerza
     * @param tiempoLlegar100Km
     */
    public Deportivo(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, String autonomia, String tiempoCarga, int capacidadPasajeros, int cantidadPuertas, int bolsasAire, int caballosFuerza, String tiempoLlegar100Km) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, autonomia, tiempoCarga);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoLlegar100Km = tiempoLlegar100Km;
    }

    /**
     * Método para obtener la capacidad de pasajeros del vehiculo
     * @return
     */
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    /**
     * Método para modificar la capacidad de pasajeros del vehiculo
     * @param capacidadPasajeros
     */
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    /**
     * Método para obtener la cantidad de puertas del vehiculo
     * @return
     */
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    /**
     * Método para modificar la cantidad de puertas del vehiculo
     * @param cantidadPuertas
     */
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    /**
     * Método para obtener la cantidad de bolsas de aire del vehiculo
     * @return
     */
    public int getBolsasAire() {
        return bolsasAire;
    }

    /**
     * Método para modificar la cantidad de bolsas de aire del vehiculo
     * @param bolsasAire
     */
    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }

    /**
     * Método para obtener el número de caballos de fuerza del vehiculo
     * @return
     */
    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * Método para modificar el número de caballos de fuerza del vehiculo
     * @param caballosFuerza
     */
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    /**
     * Método para obtener el tiempo de llegar a 100 km del vehiculo
     * @return
     */
    public String getTiempoLlegar100Km() {
        return tiempoLlegar100Km;
    }

    /**
     * Método para modificar el tiempo de llegar a 100 km del vehiculo
     * @param tiempoLlegar100Km
     */
    public void setTiempoLlegar100Km(String tiempoLlegar100Km) {
        this.tiempoLlegar100Km = tiempoLlegar100Km;
    }

    @Override
    public String toString() {
        return "Deportivo [" + super.toString() + "capacidadPasajeros=" + capacidadPasajeros + ", cantidadPuertas=" + cantidadPuertas + ", bolsasAire=" + bolsasAire + ", caballosFuerza=" + caballosFuerza + ", tiempoLlegar100Km=" + tiempoLlegar100Km + "]"
                + ", bolsasAire=" + bolsasAire + ", caballosFuerza=" + caballosFuerza + ", tiempoLlegar100Km="
                + tiempoLlegar100Km + "]";
    }

    
}
