/* Ejercicio Herencia
Crea un sistema de vehículos utilizando herencia. Debes tener una clase base llamada Vehiculo y dos clases hijas llamadas Auto y Moto.
Requisitos:
- Crea la clase base Vehiculo con los siguientes atributos protegidos:
	marca: marca del vehículo (String).
	modelo: modelo del vehículo (String).
	anio: año de fabricación del vehículo (int).
	
- En la clase Vehiculo, crea los siguientes métodos públicos:
	- Constructores
	- getters y setters
	- acelerar(): método que imprime "El vehículo está acelerando"
	
Crea la clase Auto que herede de Vehiculo y agrega:
- Un atributo privado propio de auto que sea cantidadPuertas (int).
- Constructores vacio y por parámetros (que inicialice los atributos  heredados y el número de puertas).
- Crea el propio método acelerar() y que imprima "El auto está acelerando".
Crea la clase Moto que herede de Vehiculo y agrega:
- Un atributo privado propio llamado cilindrada (double).
- Constructores vacío y por parámetros que inicialice los atributos heredados y la cilindrada.
- Crear el propio método acelerar() para que imprima "La moto está acelerando".
Luego, en una clase principal, crea un objeto de cada tipo (Auto y Moto),  y utiliza sus métodos para mostrar la información y simular que están acelerando.
¿Qué sucede al tener ambas clases un método con el mismo nombre? Al heredar de la misma clase madre... ¿Muestran resultados diferentes o iguales?*/
package ejercicioherenciadia4;

import logica.Auto;
import logica.Moto;

public class Vehiculo {

    public static void main(String[] args) {
        // TODO code application logic here

        Vehiculo vehi = new Vehiculo("toyota", "Toyota Corolla", 2020);
        Auto aut = new Auto(4, "Tesla 3", "Model 3", 2015);
        Moto mot = new Moto(8, "Harley-Davidson", "Harley-Davidson Sportster S", 2010);

        System.out.println("*****Datos del Vehiculo*****"
                + "\nMarca: " + aut.getMarca()
                + "\nModelo: " + aut.getModelo()
                + "\nAño: " + aut.getAnio()
                + "\n" + aut.toString()
        );
        aut.acelerar();
        System.out.println("*****Datos de la Moto*****"
                + "\nMarca: " + mot.getMarca()
                + "\nModelo: " + mot.getModelo()
                + "\nAño: " + mot.getAnio()
                + "\n" + mot.toString());

        mot.acelerar();
    }

    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

}
