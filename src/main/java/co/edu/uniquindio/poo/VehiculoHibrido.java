package co.edu.uniquindio.poo;


public class VehiculoHibrido extends Vehiculo {
    private boolean enchufable, ligero, aireAcondicionado, camaraReversa, ABS;
    private int capacidadPasajeros, cantidadPuertas, bolsasAire;
    private double capacidadMaletero;
   

    /**
     * Constructor de la clase VehiculoHibrido
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
    public VehiculoHibrido(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision, boolean enchufable, boolean ligero, int capacidadPasajeros, int cantidadPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int bolsasAire, boolean ABS) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, estadoVehiculoInv, estadoVehiculo, tipoTransmision);
        this.enchufable = enchufable;
        this.ligero = ligero;
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.bolsasAire = bolsasAire;
        this.ABS = ABS;
    }

    /**
     * Método para obtener si el vehiculo es enchufable
     * @return
     */
    public boolean isEnchufable() {
        return enchufable;
    }

    /**
     * Método para modificar si el vehiculo es enchufable
     * @param enchufable
     */
    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    /**
     * Método para obtener si el vehiculo es ligero
     * @return
     */
    public boolean isLigero() {
        return ligero;
    }

    /**
     * Método para modificar si el vehiculo es ligero
     * @param ligero
     */
    public void setLigero(boolean ligero) {
        this.ligero = ligero;
    }

    /**
     * Método para obtener el número de pasajeros del vehiculo
     * @return
     */
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    /**
     * Método para modificar el número de pasajeros del vehiculo
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
     * Método para obtener si el vehiculo tiene ABS
     * @return
     */
    public boolean isABS() {
        return ABS;
    }

    /**
     * Método para modificar si el vehiculo tiene ABS
     * @param aBS
     */
    public void setABS(boolean aBS) {
        ABS = aBS;
    }

    @Override
    public String toString() {
        return "VehiculoHibrido [" + super.toString() +  "enchufable=" + enchufable + ", ligero=" + ligero + ", aireAcondicionado="
                + aireAcondicionado + ", camaraReversa=" + camaraReversa + ", ABS=" + ABS + ", capacidadPasajeros="
                + capacidadPasajeros + ", cantidadPuertas=" + cantidadPuertas + ", bolsasAire=" + bolsasAire
                + ", capacidadMaletero=" + capacidadMaletero + "]";
    }

   
    
    
    
}
