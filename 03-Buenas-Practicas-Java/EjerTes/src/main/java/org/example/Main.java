package org.example;

import org.example.logica.Calculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculadora calcu = new Calculadora ();
        System.out.println("El resultado es: " + calcu.sumar(1,2));
    }
}