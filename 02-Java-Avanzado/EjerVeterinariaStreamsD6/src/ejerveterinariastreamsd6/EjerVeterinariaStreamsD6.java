package ejerveterinariastreamsd6;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.ServicioVeterinario;

public class EjerVeterinariaStreamsD6 {

    public static void main(String[] args) {

        List<ServicioVeterinario> servicios = new ArrayList<>();
        servicios.add(new ServicioVeterinario("Consulta general", 500));
        servicios.add(new ServicioVeterinario("Vacunación", 300));
        servicios.add(new ServicioVeterinario("Desparasitación", 200));
        servicios.add(new ServicioVeterinario("Cirugía menor", 1500));
        servicios.add(new ServicioVeterinario("Consulta general", 400));
        servicios.add(new ServicioVeterinario("Emergencia", 2000));
        servicios.add(new ServicioVeterinario("Vacunación", 250));
        servicios.add(new ServicioVeterinario("Desparasitación", 180));
        servicios.add(new ServicioVeterinario("Consulta general", 350));

        //1.Ordenar por costo de menor a mayor
        List<ServicioVeterinario> ordenadosPorCosto = servicios.stream()
                .sorted(Comparator.comparingDouble(ServicioVeterinario::getCosto))
                .collect(Collectors.toList());
        System.out.println(" <-_->   <-_-> Servicios ordenados por costo de menor a mayor <-_->   <-_-> ");
        ordenadosPorCosto.forEach(System.out::println);
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");
        
        
        //2.Ordenar por tipo de servicio y luego por costo en cada caso de servicio repetido
        List<ServicioVeterinario> ordenadosPorServicio = servicios.stream()
                .sorted(Comparator.comparing(ServicioVeterinario::getTipo)
                        .thenComparing(ServicioVeterinario::getCosto))
                .collect(Collectors.toList());
        System.out.println(" <-_->   <-_-> Servicios ordenador por tipo y costo <-_->   <-_-> ");
        ordenadosPorCosto.forEach(System.out::println);
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");


        //3. Lista de servicios que valen menos de 500
        List<ServicioVeterinario> ServiciosMenores500 = servicios.stream()
                .filter(serv -> serv.getCosto() < 500)
                .collect(Collectors.toList());
        System.out.println(" <-_->   <-_-> Servicios con costo menor a 500 <-_->   <-_-> ");
        ServiciosMenores500.forEach(System.out::println);
                System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");


        //4. Lista de servicios que valen mas de 500
        List<ServicioVeterinario> ServiciosMayores500 = servicios.stream()
                .filter(serv -> serv.getCosto() >= 500)
                .collect(Collectors.toList());
        System.out.println(" <-_->   <-_-> Servicios con costo mayor o igual a 500 <-_->   <-_-> ");
        ServiciosMayores500.forEach(System.out::println);
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");

        
        //5. Promedio de costos de todos los servicios
        double promedioCostos = servicios.stream()
                .mapToDouble(ServicioVeterinario::getCosto)
                .average()
                .orElse(0);
        System.out.println(" <-_->   <-_-> El promedio de costoss es: " + promedioCostos  + " <-_->   <-_-> ");
        System.out.println("\n*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*\n");

    }

}
