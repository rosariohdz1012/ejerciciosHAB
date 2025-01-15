package logica;

import interfaces.IElectrico;

public class Auto extends Vehiculo implements IElectrico {

    private int capacidadBateria;
    private int autonomia;

    public Auto() {
    }

    public Auto(int capacidadBateria, int autonomia) {
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto(int id, String placa, String marca, String modelo, int anio, double precio, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, precio);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public double calcularAntiguedad() {
        return (2024 - getAnio());
    }

    public String cargarEnergia() {
        return "Cargando de forma electrica";

    }

    @Override
    public String toString() {
        return "Auto"
                + "\n" + super.toString()
                + "\nLa capacidad de Bateria es de: " + capacidadBateria + " mAh"
                + "\nLa autonomia es de: " + autonomia + " horas"
                + "\nLa antiguedad es de: " + calcularAntiguedad() + " años"
                + "\nLa carga de energia es de: " + cargarEnergia();
    }

}
