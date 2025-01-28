package logica;

public class Cliente {

    private String numTarjeta;
    private double monto;
    private String nombre;

    public Cliente() {
    }

    public Cliente(String numTarjeta, double monto, String nombre) {
        this.numTarjeta = numTarjeta;
        this.monto = monto;
        this.nombre = nombre;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n=*=*=*Datos del Cliente=*=*=*"
                + "\nEl numero de la Tarjeta es: " + numTarjeta
                + "\nEl nombre del cliente es: " + nombre
                + "\nEl monto a depositar es: " + monto;
    }

}
