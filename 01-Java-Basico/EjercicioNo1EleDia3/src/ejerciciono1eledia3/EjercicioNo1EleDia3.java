/*Crea una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos:
bacalao, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:

b) Crea 1 objeto de la clase Electrodomestico sin parámetros.

d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene? se obtiene null
 */
package ejerciciono1eledia3;

import logica.Electrodomestico;

public class EjercicioNo1EleDia3 {

    public static void main(String[] args) {
        
//        a) Crea 3 objetos de la clase Electrodoméstico utilizando parámetros.
        Electrodomestico electro1 = new Electrodomestico("38262", "samsung", "Side-by-Side", "200", "Rojo");
        Electrodomestico electro2 = new Electrodomestico("23260", "LGg", "French Door", "120", "Negro");
        Electrodomestico electro3 = new Electrodomestico("12462", "Whirlpool", "Bottom Freezer", "180", "Gris");
//Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico electro4 = new Electrodomestico();

//        c) Marca, modelo y consumo energético 
        System.out.println("Electrodoméstico 1: Marca: " + electro1.getMarca() + ", Modelo: " + electro1.getModelo() + ", Consumo: " + electro1.getConsumo());
        System.out.println("Electrodoméstico 2: Marca: " + electro2.getMarca() + ", Modelo: " + electro2.getModelo() + ", Consumo: " + electro2.getConsumo());
        System.out.println("Electrodoméstico 3: Marca: " + electro3.getMarca() + ", Modelo: " + electro3.getModelo() + ", Consumo: " + electro3.getConsumo());

//    d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene? valor NULL
        System.out.println("Electrodoméstico 4: Marca: " + electro4.getMarca());
    }

}
