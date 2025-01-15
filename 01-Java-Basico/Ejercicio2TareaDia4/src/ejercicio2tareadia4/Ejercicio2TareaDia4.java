package ejercicio2tareadia4;

import java.util.ArrayList;
import logica.*;

public class Ejercicio2TareaDia4 {

    public static void main(String[] args) {

        ArrayList<Vestimenta> misVestimentas = new ArrayList<Vestimenta>();

        agregarZapatos(misVestimentas);
        agregarPantalones(misVestimentas);
        agregarCamisetas(misVestimentas);
        agregarSombreros(misVestimentas);
        imprimirVestimenta(misVestimentas);

    }

    public static void agregarZapatos(ArrayList<Vestimenta> misVestimentas) {
        misVestimentas.add(new Zapato(1, "Deportivo Runner", 2.013f, "SpeedX",
                24, "Azul", "Malla transpirable", "Cordones"));

        misVestimentas.add(new Zapato(2, "Casual Comfort", 1.610f, "UrbanWalk",
                0, "Negro", "Cuero", " Velcro"));

        misVestimentas.add(new Zapato(3, "Elegante Classic", 2.617f, "LuxStyle",
                0, "Marrón", "Gamuza", "Hebilla"));
    }

    public static void agregarPantalones(ArrayList<Vestimenta> misVestimentas) {
        misVestimentas.add(new Pantalon(1, "Pantalón Slim Fit", 800f, "TrendWear",
                32, "Azul Marino", "Casual", "Algodón elástico"));
        misVestimentas.add(new Pantalon(2, "Pantalón Chino", 900, "UrbanStyle",
                34, "Beige", "Formal", "Algodón"));
        misVestimentas.add(new Pantalon(3, "Pantalón Jogger", 750, "SportFlex",
                28, "Gris", "Deportivo", "Poliéster"));
    }

    public static void agregarCamisetas(ArrayList<Vestimenta> misVestimentas) {
        misVestimentas.add(new Camiseta(1, "Camiseta Básica", 300f, "SimpleWear",
                40, "Blanco", "Corta", "Redondo"));
        misVestimentas.add(new Camiseta(2, "Camiseta Deportiva", 500f, "ActiveFit",
                14, "Negro", "Larga", "Redondo"));
    }

    public static void agregarSombreros(ArrayList<Vestimenta> misVestimentas) {
        misVestimentas.add(new Sombrero(1, "Sombrero Fedora", 450, "HatMaster",
                16, "Negro", " Ala ancha", 58));
    }

    public static void imprimirVestimenta(ArrayList<Vestimenta> misVestimentas) {
        for (int i = 0; i < misVestimentas.size(); i++) {

            misVestimentas.get(i).mostrarMarca();
        }
    }

}
