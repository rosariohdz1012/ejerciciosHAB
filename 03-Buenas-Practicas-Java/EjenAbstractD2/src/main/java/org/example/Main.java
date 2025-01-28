package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //crear la fabrica de vehiculos gasolna
        VehiculoFactory gasolina = new GasolinaFactory();
        Carro carroGasolina = gasolina.crearCarro();
        Moto motoGasolina = gasolina.crearMoto();

        carroGasolina.conducir();
        motoGasolina.conducir();

        //Crear la fabrica de electricos
        VehiculoFactory electrico = new ElectricoFactory();
        Carro carroElectrico = electrico.crearCarro();
        Moto motoElectrica = electrico.crearMoto();

        carroElectrico.conducir();
        motoElectrica.conducir();

    }
}