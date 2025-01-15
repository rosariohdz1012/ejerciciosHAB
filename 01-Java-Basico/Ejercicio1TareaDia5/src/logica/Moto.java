package logica;

import interfaces.ICombustion;

public class Moto extends Vehiculo implements ICombustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto() {
    }

    public Moto(int cilindrada, String tipoMotor) {
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Moto(int id, String placa, String marca, String modelo, int anio, double precio, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public double calcularAntiguedad() {
        return (2024 - getAnio());
    }

    public String recargarCombustible() {
        return "Recargando gasolina";

    }

    @Override
    public String toString() {
        return "Moto"
                + "\n" + super.toString()
                + "\ncilindrada " + cilindrada + " cc"
                + "\nEl tipo de Motor es: " + tipoMotor
                + "\nLa antiguedad es de: " + calcularAntiguedad() + " años"
                + "\nLa recarga de combustible es de: " + recargarCombustible();
    }

}
