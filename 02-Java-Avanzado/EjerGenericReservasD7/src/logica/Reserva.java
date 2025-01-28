package logica;

public class Reserva<T, U> {

    private T tipo;
    private U reserva;

    public Reserva() {
    }

    public Reserva(T tipo, U reserva) {
        this.tipo = tipo;
        this.reserva = reserva;
    }

    public T getTipo() {
        return tipo;
    }

    public void setTipo(T tipo) {
        this.tipo = tipo;
    }

    public U getReserva() {
        return reserva;
    }

    public void setReserva(U reserva) {
        this.reserva = reserva;
    }

    public void registraReserva() {
        System.out.println("Los datos de la Reserva son:  "
                + "\nTipo de Vehiculo: " + tipo
                + "\nModo: " + reserva
                + "\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

    }

}
