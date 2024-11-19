package co.edu.uniquindio.poo;


public class Bus extends VehiculoCombustible {
    private int capacidadPasajeros, cantidadPuertas, bolsasAire, ejes, salidasEmergeencia;
    private double capacidadMaletero;
    private boolean camaraReversa;

    /**
     * Constructor de la clase Bus
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
     * @param capacidadPasajeros
     * @param cantidadPuertas
     * @param bolsasAire
     * @param ejes
     * @param salidasEmergeencia
     * @param capacidadMaletero
     * @param camaraReversa
     */
    public Bus(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean aireAcondicionado, boolean ABS, int capacidadPasajeros, int cantidadPuertas, int bolsasAire, int ejes, int salidasEmergeencia, double capacidadMaletero, boolean camaraReversa) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, aireAcondicionado, ABS);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.bolsasAire = bolsasAire;
        this.ejes = ejes;
        this.salidasEmergeencia = salidasEmergeencia;
        this.capacidadMaletero = capacidadMaletero;
        this.camaraReversa = camaraReversa;
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
     * Método para obtener el número de puertas del vehiculo
     * @return
     */
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    /**
     * Método para modificar el número de puertas del vehiculo
     * @param cantidadPuertas
     */
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    /**
     * Método para obtener el número de bolsas de aire del vehiculo
     * @return
     */
    public int getBolsasAire() {
        return bolsasAire;
    }

    /**
     * Método para modificar el número de bolsas de aire del vehiculo
     * @param bolsasAire
     */
    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
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
     * Método para obtener el número de salidas emergencias del vehiculo
     * @return
     */
    public int getSalidasEmergeencia() {
        return salidasEmergeencia;
    }

    /**
     * Método para modificar el número de salidas emergencias del vehiculo
     * @param salidasEmergeencia
     */
    public void setSalidasEmergeencia(int salidasEmergeencia) {
        this.salidasEmergeencia = salidasEmergeencia;
    }

    /**
     * Método para obtener la capacidad de maletero del vehiculo
     * @return
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    /**
     * Método para modificar la capacidad de maletero del vehiculo
     * @param capacidadMaletero
     */
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    /**
     * Método para obtener si la camara está invertida
     * @return
     */
    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    /**
     * Método para modificar si la camara está invertida
     * @param camaraReversa
     */
    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    @Override
    public String toString() {
        return "Bus [" + super.toString() + "capacidadPasajeros=" + capacidadPasajeros + ", cantidadPuertas=" + cantidadPuertas
                + ", bolsasAire=" + bolsasAire + ", ejes=" + ejes + ", salidasEmergeencia=" + salidasEmergeencia
                + ", capacidadMaletero=" + capacidadMaletero + ", camaraReversa=" + camaraReversa + "]";
    }

   
    
}
