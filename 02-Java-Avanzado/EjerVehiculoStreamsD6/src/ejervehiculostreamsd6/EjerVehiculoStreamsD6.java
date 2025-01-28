package ejervehiculostreamsd6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.Vehiculo;

public class EjerVehiculoStreamsD6 {

    public static void main(String[] args) {

        List<Vehiculo> carros = new ArrayList<>();
        carros.add(new Vehiculo("Vado", "Fiesta", 1000));
        carros.add(new Vehiculo("Vado", "Enfocar", 1200));
        carros.add(new Vehiculo("Vado", "Explorador", 2500));
        carros.add(new Vehiculo("Fiat", "Uno", 500));
        carros.add(new Vehiculo("Fiat", "Cronos", 1000));
        carros.add(new Vehiculo("Fiat", "Turín", 1250));
        carros.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        carros.add(new Vehiculo("Chevrolet", "Girar", 2500));
        carros.add(new Vehiculo("Toyota", "Corola", 1200));
        carros.add(new Vehiculo("Toyota", "Fortuna", 3000));
        carros.add(new Vehiculo("Renault", "Logan", 950));

        /*3. Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtiene
     una lista de vehículos ordenados por precio de menor a mayor, imprime por pantalla el resultado.*/
        List<Vehiculo> ordenadosPrecioMenorMayor = carros.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))//Double para ser mas preciso O .sorted(Comparator.comparing(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.print("  <-_->!~_~!<-_-> Vehiculos ordenados por precio de menor a mayor  <-_->!~_~!<-_->  ");
        ordenadosPrecioMenorMayor.forEach(System.out::print);
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        
        

        /*4. De la misma forma anterior imprime una lista ordenada por marca ya su vez por precio.*/
        List<Vehiculo> ordenadosMarcaPrecio = carros.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                        .thenComparing(Vehiculo::getCosto))
                .collect(Collectors.toList());
        System.out.println(" <-_->!~_~!<-_-> lista ordenada por marca y a su vez por precio <-_->!~_~!<-_-> ");
        ordenadosMarcaPrecio.forEach(System.out::print);
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        

        /*5. Se desea extraer una lista de vehículos con precio no mayor a 1000,*/
        List<Vehiculo> ordenadosMenor1000 = carros.stream()
                .filter(vehi -> vehi.getCosto() < 1000)
                .collect(Collectors.toList());
        System.out.println(" <-_->!~_~!<-_-> Vehiculos con precio no mayor a 1000 <-_->!~_~!<-_-> ");
        ordenadosMenor1000.forEach(System.out::print);
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        
        
        
        //luego otra con precios mayor o igual 1000 
        List<Vehiculo> ordenadosMayorIgual1000 = carros.stream()
                .filter(vehi -> vehi.getCosto() >= 1000)
                .collect(Collectors.toList());
        System.out.println(" <-_->!~_~!<-_-> Vehiculos con precio mayor o igual 1000 <-_->!~_~!<-_-> ");
        ordenadosMayorIgual1000.forEach(System.out::print);
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        
        
// y por último, obtenga el promedio total de precios de toda la lista de vehículos.
        double promedioPrecios = carros.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()//average -- promedio
                .orElse(0);
        System.out.println(" <-_->!~_~!<-_-> El promedio de precio es: " + promedioPrecios + " <-_->!~_~!<-_-> ");
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        

        //6. Haz un filtro que muestre únicamente los autos de Marca Chevrolet y Fiat.
        List<Vehiculo> chevroletFiat = carros.stream()
                .filter(carro -> carro.getMarca().equals("Chevrolet")
                        || carro.getMarca().equals("Fiat"))
                .collect(Collectors.toList());
        System.out.println(" <-_->!~_~!<-_-> Se mestran los autos de Marca Chevrolet y Fiat <-_->!~_~!<-_-> ");
        chevroletFiat.forEach(System.out::print);
 System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
 
 
//Muestra todos los autos cuyo modelo contiene al menos una letra c.
        List<Vehiculo> letraC = carros.stream()
                .filter(carro -> carro.getModelo().toLowerCase().contains("c"))//contains -- contiene c
                .collect(Collectors.toList());
        System.out.println(" <-_->!~_~!<-_-> autos cuyo modelo contiene al menos una letra c <-_->!~_~!<-_-> ");
        letraC.forEach(System.out::print);
         System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");


    }

}
