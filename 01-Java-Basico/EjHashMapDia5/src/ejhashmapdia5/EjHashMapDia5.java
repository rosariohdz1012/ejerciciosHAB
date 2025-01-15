package ejhashmapdia5;

import java.util.HashMap;
import java.util.Map;

public class EjHashMapDia5 {

    public static void main(String[] args) {
        // TODO code application logic here

        // Crear un Map 
        Map<Integer, Double> estaturas = new HashMap<>();
        //PRIMITIVO`        clase especial
        //INT               Integer
        //double            Double
        //boolean           Boolean
        //                  String

        // Agregar valores al Map
        estaturas.put(1, 1.79);
        estaturas.put(2, 1.67);
        estaturas.put(3, 1.58);
        estaturas.put(4, 1.95);
       
        //Busqueda obtener un dato que se que esta
        double estatura = estaturas.get(3);
        //Busqueda por key
        boolean estaOno = estaturas.containsValue("1.54");
                
        
        System.out.println(estaturas);
    }

}
