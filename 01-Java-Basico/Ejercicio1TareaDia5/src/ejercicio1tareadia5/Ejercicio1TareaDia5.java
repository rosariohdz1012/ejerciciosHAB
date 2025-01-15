package ejercicio1tareadia5;

import java.util.ArrayList;
import logica.Auto;
import logica.Camioneta;
import logica.Moto;
import logica.Vehiculo;

public class Ejercicio1TareaDia5 {

    public static void main(String[] args) {

        ArrayList<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();

        agregarAutoElectrico(misVehiculos);
        agregarCamionetaConbustion(misVehiculos);
        agregarMotoConbustion(misVehiculos);
        imprimirInformacion(misVehiculos);

    }

    public static void agregarAutoElectrico(ArrayList<Vehiculo> misVehiculos) {
        misVehiculos.add(new Auto(1, "BC123", "Tesla", "Model 3",
                2018, 45.000f, 75000, 12));
        misVehiculos.add(new Auto(2, "XYZ789", "Nissan", "Leaf",
                2017, 30.000f, 62000, 10));

    }

    public static void agregarCamionetaConbustion(ArrayList<Vehiculo> misVehiculos) {
        misVehiculos.add(new Camioneta(3, "DEF456", "Ford", "F-150",
                2019, 50.000, 98, 14));
        misVehiculos.add(new Camioneta(4, " GHI789", "Toyota", "Tacoma",
                2020, 40.000, 80, 11));

    }

    public static void agregarMotoConbustion(ArrayList<Vehiculo> misVehiculos) {
        misVehiculos.add(new Moto(5, "JKL123", "Yamaha", "YZF-R3",
                2017, 5.000, 321, "Bicilíndrico en línea"));
        misVehiculos.add(new Moto(6, "MNO456", "Honda", "B500F",
                2016, 6.500, 471, "Bicilíndrico en línea"));

    }
    
    public static void imprimirInformacion(ArrayList<Vehiculo> misVehiculos){
        for(int i = 0;i<misVehiculos.size();i++){
            System.out.println(misVehiculos.get(i));
            System.out.println("=======================================");
        }
    }

}
