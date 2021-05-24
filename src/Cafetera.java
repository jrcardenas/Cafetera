
/**
 * Clase sobre una cafetera
 *
 * @author jose
 * @version 1.1
 *
 */
public class Cafetera implements InterfaceCafetera {

    private int capMaxima;
    private int cantActual;

    /**
     * Crea una instancia de la clase
     *
     * @param capacidadMaxima capacidad máxima de la cafetera
     * @param cantidadActual cantidad actual de la cafetera
     *
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        cantActual = cantidadActual;
        capMaxima = Math.max(capacidadMaxima, cantidadActual);
    }

    /**
     * Crea una instancia de la clase
     *
     * @param capacidadMaxima capacidad máxima de la cafetera
     *
     */
    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }

    /**
     * Crea una instancia de la clase con constructor vacio
     *
     */
    public Cafetera() {
        this(1000, 0);
    }

    /**
     * Método para llenar la cafetera
     *
     */
    @Override
    public void llenarCafetera() {
        setCantActual(getCapMaxima());
    }

    /**
     * Método para servir taza
     *
     * @param tamanoTaza
     * @throws Exception
     *
     */
    @Override
    public void servirTaza(int tamanoTaza) throws Exception {
        setCantActual(getCantActual() - tamanoTaza);
        if (getCantActual() < 0) {
            setCantActual(0);
            throw new Exception("No hay cafe");
        }
    }

    /**
     * Metodo para vaciar la cafetera
     *
     *
     *
     */
    @Override
    public void vaciarCafetera() {
        setCantActual(0);
    }

    /**
     * Metodo para agregar café a la cafetera
     *
     * @param cantidad
     * @throws Exception
     *
     *
     */
    @Override
    public void agregarCafe(int cantidad) throws Exception {
        setCantActual(getCantActual() + cantidad);
        if (getCantActual() > getCapMaxima()) {
            setCantActual(getCapMaxima());
            throw new Exception("Rebosa");
        }

    }

    /**
     * Conseguimos la capacidad Maxima
     *
     * @return the capMaxima
     */
    @Override
    public int getCapMaxima() {
        return capMaxima;
    }

    /**
     * Establecemos la capacidad Maxima
     *
     * @param capMaxima the capMaxima to set
     */
    @Override
    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    /**
     * Conseguimos la cantidad Actual
     *
     * @return the cantActual
     */
    @Override
    public int getCantActual() {
        return cantActual;
    }

    /**
     * Establecemos la cantidad Actual
     *
     * @param cantActual the cantActual to set
     */
    @Override
    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
}
