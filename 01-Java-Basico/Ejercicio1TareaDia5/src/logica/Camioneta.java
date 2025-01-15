package logica;

import interfaces.ICombustion;

public class Camioneta extends Vehiculo implements ICombustion {

    private int capacidadTanque;
    private int consumoConbustible;

    public Camioneta() {
    }

    public Camioneta(int capacidadTanque, int consumoConbustible) {
        this.capacidadTanque = capacidadTanque;
        this.consumoConbustible = consumoConbustible;
    }

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double precio, int capacidadTanque, int consumoConbustible) {
        super(id, placa, marca, modelo, anio, precio);
        this.capacidadTanque = capacidadTanque;
        this.consumoConbustible = consumoConbustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoConbustible() {
        return consumoConbustible;
    }

    public void setConsumoConbustible(int consumoConbustible) {
        this.consumoConbustible = consumoConbustible;
    }

    @Override
    public double calcularAntiguedad() {
        return (2024 - getAnio());
    }

    @Override
    public String recargarCombustible() {
        return "Recargando gasolina";

    }

    @Override
    public String toString() {
        return "Camioneta"
                + "\n" + super.toString()
                + "\nLa capacidad del tanque es: " + capacidadTanque + " litros"
                + "\nEl consumo de Conbustible es: " + consumoConbustible + " litros"
                + "\nLa antiguedad es de: " + calcularAntiguedad() + " años"
                + "\nLa recarga de combustible es de: " + recargarCombustible();
    }

}
