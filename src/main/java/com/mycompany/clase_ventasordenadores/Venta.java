/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase_ventasordenadores;

/**
 *
 * @author jojo
 */
public class Venta {
    private String nombreCliente;
    private String localidad;
    private String procesador;
    private String memoria;
    private String monitor;
    private String discoDuro;
    private boolean grabadoraDVD;
    private boolean wifi;
    private boolean sincronizadorTV;
    private boolean backUpRestore;

    
    //Constructor Venta


    public Venta(String nombreCliente, String localidad, String procesador, String memoria, String monitor, String discoDuro, boolean grabadoraDVD, boolean wifi, boolean sincronizadorTV, boolean backUpRestore) {
        this.nombreCliente = nombreCliente;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.monitor = monitor;
        this.discoDuro = discoDuro;
        this.grabadoraDVD = grabadoraDVD;
        this.wifi = wifi;
        this.sincronizadorTV = sincronizadorTV;
        this.backUpRestore = backUpRestore;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public boolean isGrabadoraDVD() {
        return grabadoraDVD;
    }

    public void setGrabadoraDVD(boolean grabadoraDVD) {
        this.grabadoraDVD = grabadoraDVD;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isSincronizadorTV() {
        return sincronizadorTV;
    }

    public void setSincronizadorTV(boolean sincronizadorTV) {
        this.sincronizadorTV = sincronizadorTV;
    }

    public boolean isBackUpRestore() {
        return backUpRestore;
    }

    public void setBackUpRestore(boolean backUpRestore) {
        this.backUpRestore = backUpRestore;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Ventas{" + "nombreCliente=" + nombreCliente + ", localidad=" + localidad + ", procesador=" + procesador + ", memoria=" + memoria + ", monitor=" + monitor + ", discoDuro=" + discoDuro + ", grabadoraDVD=" + grabadoraDVD + ", wifi=" + wifi + ", sincronizadorTV=" + sincronizadorTV + ", backUpRestore=" + backUpRestore + '}';
    }
    
    
    
    
    
}
