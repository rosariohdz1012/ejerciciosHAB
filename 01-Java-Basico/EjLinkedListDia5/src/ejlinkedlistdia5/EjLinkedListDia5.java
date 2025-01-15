package ejlinkedlistdia5;

import java.util.LinkedList;

public class EjLinkedListDia5 {

    public static void main(String[] args) {

        // Crear una LinkedList de tipo String
        LinkedList<String> listaFrutas = new LinkedList<String>();

        // Java agrega los elementos en el orden que yo especifique
        listaFrutas.add("Naranja");
        listaFrutas.add("Manzana");
        listaFrutas.add("Banana");
        listaFrutas.add("Fresa");

        // Agregar un elemento en una posición específica
        //Agrego el melon para que sea mi nodo cabecera (primer lugar)
        listaFrutas.add(0, "Melon");
        
        
        //para ver el tama;o de una lista
        int tamanio = listaFrutas.size();
        System.out.println("El tamano de la lista es: " + tamanio);
        
        //recorrer mi linked list
        for (String fruta : listaFrutas){
            System.out.println("La fruta guardada es: " + fruta);
                        }
        //eliminar elemneto por posicion
        System.out.println("===============");
        listaFrutas.remove(0);
        //recorrer mi linked list
        for (String fruta : listaFrutas){
            System.out.println("La fruta guardada es: " + fruta);
                        }
    }

}
