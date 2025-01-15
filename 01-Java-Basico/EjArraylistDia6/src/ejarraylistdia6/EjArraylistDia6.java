package ejarraylistdia6;

import java.util.ArrayList;
import logica.Fruta;

public class EjArraylistDia6 {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();

        Fruta fruta = new Fruta("Manzana", "Rojo", "Todo el anio");
        listaFrutas.add(fruta);
        listaFrutas.add(new Fruta("Naranja", "Anaranjado", "Todo el anio"));
        listaFrutas.add(new Fruta("Banana", "Amarrillo", "Todo el anio"));
        listaFrutas.add(new Fruta("Sandia", "Verde", "Verano"));

        //Trer elemento de un indice en particular
        Fruta frut = listaFrutas.get(3);

        //Eliminar un elemento
        listaFrutas.add(new Fruta("Melon", "Azul", "Verano"));
        listaFrutas.remove(4);

        //   Obtener tamanio
        int tamanio = listaFrutas.size();

        //recorrido mediante indices
        for (int i = 0; i < listaFrutas.size(); i++) {
            System.out.println("Fruta" + listaFrutas.get(i).getNombre());

          //recorre con el for each
          for(Fruta fru:listaFrutas){
              System.out.println("Fruta " + fru.getNombre());
          }
          
          //recorrido mas lento linkedList y ocupa mas memoria
          //recorrido mas rapido arraylist posiciones en memoria que no se utilizan (vacios)
            
        }

    }

}
