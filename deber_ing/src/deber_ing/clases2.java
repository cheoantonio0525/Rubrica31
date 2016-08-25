/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_ing;

/**
 *
 * @author admin
 */
public class clases2 {
    public class habitacion {
    private int numero;
    private int precio;
    private String tipohabitacion;
    private int piso;

    public habitacion() {
    }

    public habitacion(int numero, int precio, String tipohabitacion, int piso) {
        this.numero = numero;
        this.precio = precio;
        this.tipohabitacion = tipohabitacion;
        this.piso = piso;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the tipohabitacion
     */
    public String getTipohabitacion() {
        return tipohabitacion;
    }

    /**
     * @param tipohabitacion the tipohabitacion to set
     */
    public void setTipohabitacion(String tipohabitacion) {
        this.tipohabitacion = tipohabitacion;
    }

    /**
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    
}
