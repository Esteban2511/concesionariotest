package co.edu.uniquindio.poo;


public class PickUp extends VehiculoCombustible {
    private int capacidadPasajeros, cantidadPuertas, bolsasAire;
    private boolean camaraReversa, c4x4;
    private String capacidadCajaCarga;

    /**
     * Constructor de la clase PickUp
     * @param marca
     * @param modelo
     * @param cambios
     * @param velocidadMax
     * @param cilindraje
     * @param unidadesDisponibles
     * @param estadoVehiculoInv
     * @param estadoVehiculo
     * @param tipoTransmision
     * @param aireAcondicionado
     * @param ABS
     * @param capacidadPasajeros
     * @param cantidadPuertas
     * @param bolsasAire
     * @param camaraReversa
     * @param c4x4
     * @param capacidadCajaCarga
     */
    public PickUp(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean aireAcondicionado, boolean ABS, int capacidadPasajeros, int cantidadPuertas, int bolsasAire, boolean camaraReversa, boolean c4x4, String capacidadCajaCarga) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision, aireAcondicionado, ABS);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.bolsasAire = bolsasAire;
        this.camaraReversa = camaraReversa;
        this.c4x4 = c4x4;
        this.capacidadCajaCarga = capacidadCajaCarga;
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

    /**
     * Método para obtener si el c4x4 está activado
     * @return
     */
    public boolean isC4x4() {
        return c4x4;
    }

    /**
     * Método para modificar si el c4x4 está activado
     * @param c4x4
     */
    public void setC4x4(boolean c4x4) {
        this.c4x4 = c4x4;
    }

    /**
     * Método para obtener la capacidad de carga del vehiculo
     * @return
     */
    public String getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    /**
     * Método para modificar la capacidad de carga del vehiculo
     * @param capacidadCajaCarga
     */
    public void setCapacidadCajaCarga(String capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    @Override
    public String toString() {
        return "PickUp [" + super.toString() + "capacidadPasajeros=" + capacidadPasajeros + ", cantidadPuertas=" + cantidadPuertas + ", bolsasAire=" + bolsasAire + ", camaraReversa=" + camaraReversa + ", c4x4=" + c4x4 + ", capacidadCajaCarga=" + capacidadCajaCarga + "]"
                + ", bolsasAire=" + bolsasAire + ", camaraReversa=" + camaraReversa + ", c4x4=" + c4x4
                + ", capacidadCajaCarga=" + capacidadCajaCarga + "]";
    }

   
}
