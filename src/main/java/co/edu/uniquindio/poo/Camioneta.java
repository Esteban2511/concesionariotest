package co.edu.uniquindio.poo;

public class Camioneta extends VehiculoHibrido {
    private boolean velocidadCrucero, sensoresColicion, sensoresTraficoCruzado, asistenteConduccion;

    /**
     * Constructor de la clase Camioneta
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
     * @param enchufable
     * @param ligero
     * @param capacidadPasajeros
     * @param cantidadPuertas
     * @param capacidadMaletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param bolsasAire
     * @param ABS
     * @param velocidadCrucero
     * @param sensoresColicion
     * @param sensoresTraficoCruzado
     * @param asistenteConduccion
     */
    public Camioneta(String marca, String modelo, int cambios, double velocidadMax, int cilindraje, int unidadesDisponibles, int codigo, boolean estadoVehiculoInv, EstadoVehiculo estadoVehiculo, TipoTransmision tipoTransmision , boolean enchufable, boolean ligero, int capacidadPasajeros, int cantidadPuertas, double capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int bolsasAire, boolean ABS, boolean velocidadCrucero, boolean sensoresColicion, boolean sensoresTraficoCruzado, boolean asistenteConduccion) {
        super(marca, modelo, cambios, velocidadMax, cilindraje, unidadesDisponibles, codigo, asistenteConduccion, estadoVehiculo, tipoTransmision, enchufable, ligero, capacidadPasajeros, cantidadPuertas, capacidadMaletero, aireAcondicionado, camaraReversa, bolsasAire, ABS);
        this.velocidadCrucero = velocidadCrucero;
        this.sensoresColicion = sensoresColicion;
        this.sensoresTraficoCruzado = sensoresTraficoCruzado;
        this.asistenteConduccion = asistenteConduccion;
    }

    /**
     * Método para obtener si la velocidad del crucero está activada
     * @return
     */
    public boolean isVelocidadCrucero() {
        return velocidadCrucero;
    }

    /**
     * Método para modificar si la velocidad del crucero está activada
     * @param velocidadCrucero
     */
    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    /**
     * Método para obtener si los sensores de colisión están activados
     * @return
     */
    public boolean isSensoresColicion() {
        return sensoresColicion;
    }

    /**
     * Método para modificar si los sensores de colisión están activados
     * @param sensoresColicion
     */
    public void setSensoresColicion(boolean sensoresColicion) {
        this.sensoresColicion = sensoresColicion;
    }

    /**
     * Método para obtener si los sensores de tráfico cruzado están activados
     * @return
     */
    public boolean isSensoresTraficoCruzado() {
        return sensoresTraficoCruzado;
    }

    /**
     * Método para modificar si los sensores de tráfico cruzado están activados
     * @param sensoresTraficoCruzado
     */
    public void setSensoresTraficoCruzado(boolean sensoresTraficoCruzado) {
        this.sensoresTraficoCruzado = sensoresTraficoCruzado;
    }

    /**
     * Método para obtener si el asistente de conducción está activado
     * @return
     */
    public boolean isAsistenteConduccion() {
        return asistenteConduccion;
    }

    /**
     *  Método para modificar si el asistente de conducción está activado
     * @param asistenteConduccion
     */
    public void setAsistenteConduccion(boolean asistenteConduccion) {
        this.asistenteConduccion = asistenteConduccion;
    }

    @Override
    public String toString() {
        return "Camioneta [" + super.toString() + "velocidadCrucero=" + velocidadCrucero + ", sensoresColicion=" + sensoresColicion
                + ", sensoresTraficoCruzado=" + sensoresTraficoCruzado + ", asistenteConduccion=" + asistenteConduccion
                + "]";
    }

   
    
    
}
