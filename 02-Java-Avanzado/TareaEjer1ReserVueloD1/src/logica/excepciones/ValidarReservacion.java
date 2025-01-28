package logica.excepciones;

public class ValidarReservacion {

    public void validar(String texto) throws ReservacionExcepcion {
        if (texto == null || texto.equals("".trim())) {
            throw new ReservacionExcepcion("El campo no puede estar vacio");
        }
        if (existeNumero(texto)) {
            throw new ReservacionExcepcion("El campo no acepta valores numericos ");
        }
    }

    public void validarAsientos(int asientoSolicitados, int asientosDisponibles)
            throws ReservacionExcepcion {
        if (asientoSolicitados > asientosDisponibles) {
            throw new ReservacionExcepcion("No contamos con asientos solicitados");
        }
    }

    public boolean existeNumero(String dato) {
        return dato.chars().anyMatch(Character::isDigit);
    }
}
