package logica;

public class Reserva {
    
    public double realizarReserva(double precioOriginal,PrecioReserva descu){//metodo implementado
        double precioFinal = descu.calcularPrecio(precioOriginal);
        System.out.println("El precio final es de: " + precioFinal);
       return descu.calcularPrecio(precioFinal);
    }
    
}
