/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 *@date May 24, 2021
 *@time 5:19:30 PM
 *@encoding UTF-8
 *@name InterfaceCafetera
 */
public interface InterfaceCafetera {

    void agregarCafe(int cantidad) throws Exception;

    /**
     * @return the cantActual
     */
    int getCantActual();

    /**
     * @return the capMaxima
     */
    int getCapMaxima();

    void llenarCafetera();

    void servirTaza(int tamanoTaza) throws Exception;

    /**
     * @param cantActual the cantActual to set
     */
    void setCantActual(int cantActual);

    /**
     * @param capMaxima the capMaxima to set
     */
    void setCapMaxima(int capMaxima);

    void vaciarCafetera();
    
}
