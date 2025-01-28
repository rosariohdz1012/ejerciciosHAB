package logica;

public class Vuelo {

    private byte totalAsientos;

    public Vuelo() {
        this.totalAsientos = 10;
    }

    public Vuelo(byte totalAsientos) {

        this.totalAsientos = totalAsientos;
    }

    public byte getTotalAsientos() {
        return totalAsientos;
    }

    public void setTotalAsientos(byte totalAsientos) {
        this.totalAsientos = totalAsientos;
    }

    public void asientosReservados(int asientos) {
        this.totalAsientos -= asientos;
    }

    @Override
    public String toString() {
        return "" + this.totalAsientos;
    }

//  "El total de asientos despues de la Reservacion es: " +
//                totalAsientos + "\n"; 
}
