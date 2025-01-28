package org.example;

import org.example.logica.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    Calculadora calcu = new Calculadora ();

    @Test
    public void testearSuma() {

        //caso de prueba 1 - sumar dos números positivos
        assertEquals(5,calcu.sumar(2,3));

        //caso de prueba 2 - sumar dos números negativos
        assertEquals(-7,calcu.sumar(-5,-2));

        //caso de prueba 3 -
        assertEquals(-3,calcu.sumar(-5,2));

        //caso de prueba 4 -
        assertEquals(3,calcu.sumar(5,-2));
    }
}
