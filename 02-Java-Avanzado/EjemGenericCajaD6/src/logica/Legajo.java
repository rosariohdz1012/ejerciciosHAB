/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author IngRosario
 */
public class Legajo {
    private int NumLegajo;
    private String nombre;

    public Legajo() {
    }

    public Legajo(int NumLegajo, String nombre) {
        this.NumLegajo = NumLegajo;
        this.nombre = nombre;
    }

    public int getNumLegajo() {
        return NumLegajo;
    }

    public void setNumLegajo(int NumLegajo) {
        this.NumLegajo = NumLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    
}
