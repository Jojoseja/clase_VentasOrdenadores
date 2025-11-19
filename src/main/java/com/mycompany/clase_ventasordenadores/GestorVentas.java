/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase_ventasordenadores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 *
 * @author jojo
 */
public class GestorVentas {
    Path pathRecursos = Path.of("src", "main", "java", "com", "mycompany", "clase_ventasordenadores", "recursos");
    File carpetaRecursos = new File(String.valueOf(pathRecursos));
    
    public static void main(String[] args) {
        GestorVentas gv = new GestorVentas();
        
        Venta ven1 = new Venta("nombre1", "algo", "pro", "mem", "mon", "dd", true, true, false, false);
        Venta ven2 = new Venta("nombre2", "algo", "pro", "mem", "mon", "dd", true, true, false, false);
        
        ArrayList<Venta> lista = new ArrayList<>();
        
        lista.add(ven1);
        lista.add(ven2);
        
        gv.escribirVentas(lista);
        
        ArrayList<Venta> listaAux = gv.leerVentas();
        System.out.println(listaAux.size());
        
        for (Venta ven : listaAux){
            System.out.println(ven.toString());
        }
        
    }
    
    
    //Obtener ArrayList<Venta> del archivo.dat
    public ArrayList<Venta> leerVentas(){
        ArrayList<Venta> listaVentas = new ArrayList<>();
        
        if (!carpetaRecursos.exists()){
            System.out.println("Creando carpetas y archivos...");
            carpetaRecursos.mkdirs();
        }
        
        Path pathArchivoDat = Path.of(String.valueOf(pathRecursos), "archivo.dat");
        File archivoDat = new File(String.valueOf(pathArchivoDat));
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoDat))) {
            while(true){
                Venta aux = (Venta) ois.readObject();
                System.out.println(aux);
                listaVentas.add(aux);
            }
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        return listaVentas;
    }
    
    
    public void escribirVentas(ArrayList<Venta> listaVentas){
        
        //ToDo: Agregar las listas ya existentes
        if (!carpetaRecursos.exists()){
            System.out.println("Creando carpetas y archivos...");
            carpetaRecursos.mkdirs();
        } else {
            ArrayList<Venta> ventaArchivos = this.leerVentas();
            listaVentas.addAll(0, ventaArchivos);
        }
        
        Path pathArchivoDat = Path.of(String.valueOf(pathRecursos), "archivo.dat");
        File archivoDat = new File(String.valueOf(pathArchivoDat));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoDat))) {
            for (Venta ven : listaVentas){
                oos.writeObject(ven);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());}
        
    } 
    
    public void borrarDatos(){
        Path pathArchivoDat = Path.of(String.valueOf(pathRecursos), "archivo.dat");
        File archivoDat = new File(String.valueOf(pathArchivoDat));
        try (BufferedWriter bfw = new BufferedWriter(new FileWriter(archivoDat))) {
            bfw.write("");
        } catch (Exception e) {System.out.println(e.getMessage());}
    }
    
    public boolean fileRead(){
        Path pathArchivoDat = Path.of(String.valueOf(pathRecursos), "archivo.dat");
        File archivoDat = new File(String.valueOf(pathArchivoDat));
        return !(archivoDat.length() == 0);
    }
}
