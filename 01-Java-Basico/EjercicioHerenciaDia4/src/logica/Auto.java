/**/
package logica;

public class Auto extends ejercicioherenciadia4.Vehiculo {

    private int cantidadPuertas;

    public Auto() {
    }

    public Auto(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public Auto(int cantidadPuertas, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Auto ");
        sb.append("La cantidad de Puertas es: ").append(cantidadPuertas);
        return sb.toString();
    }

    @Override
    public void acelerar() {
        System.out.println("El Auto esta acelerando");

    }
}
