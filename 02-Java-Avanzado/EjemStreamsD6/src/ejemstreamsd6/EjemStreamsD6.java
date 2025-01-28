package ejemstreamsd6;

import java.util.Arrays;
import java.util.List;

public class EjemStreamsD6 {

    public static void main(String[] args) {

        //Lista de paises
        List<String> paises = Arrays.asList(
                "España", "México", "Argentina", "Francia", "Italia",
                "Alemania", "Portugal", "Chile", "Colombia", "Peru");

        //Filtrar los paises con qtengan una letra "a"
        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("peru"))
                .forEach(System.out::println);

    }

}
