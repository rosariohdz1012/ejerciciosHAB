package ejergenericreservasd7;

import logica.Auto;
import logica.Bicicleta;
import logica.Moto;
import logica.Online;
import logica.Presencial;
import logica.Reserva;

public class EjerGenericReservasD7 {

    public static void main(String[] args) {
        Reserva<Auto, Presencial> reservAuto = new Reserva<>(new Auto(), new Presencial());
        Reserva<Moto, Online> reservMoto = new Reserva<>(new Moto(), new Online());
        Reserva<Bicicleta, Presencial> reservBici = new Reserva<>(new Bicicleta(), new Presencial());

        reservAuto.registraReserva();
        reservMoto.registraReserva();
        reservBici.registraReserva();

    }

}
