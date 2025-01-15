package ejercicio1tareadia4;

import logica.Animal;
import logica.Ave;
import logica.Mamifero;
import logica.Reptil;

public class Ejercicio1TareaDia4 {

    public static void main(String[] args) {

        Mamifero mamife = new Mamifero(4, "Vivíparo",
                "Amarillo dorado", "Sabana", 1, "Leon", 3, "Pelaje", "Carnivoro");
        mamife.saludar();
        Reptil repti = new Reptil(4.54f, "Queratinizadas",
                "Neurotóxico", "Praderas", 2, "Cobra Real", 2, "Escamosa", "Carnívoro");
        repti.saludar();
        Ave avi = new Ave(2.3f, "Planeador",
                "Marrón oscuro", "Ganchudo", 3, "Águila Real", 1, "Plumaje", "Carnívoro");
        avi.saludar();
        
        Animal animal;
        animal = mamife;
        animal.saludar();
        

    }

}
