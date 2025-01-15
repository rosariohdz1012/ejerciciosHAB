/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Benjamin
 */
public class Moto extends ejercicioherenciadia4.Vehiculo {

    private double cilindrada;

    public Moto() {
    }

    public Moto(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(double cilindrada, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Moto ");
        sb.append("cilindrada ").append(cilindrada);
        return sb.toString();
    }

    @Override
    public void acelerar() {
        System.out.println("La moto esta acelerando");
    }

}
