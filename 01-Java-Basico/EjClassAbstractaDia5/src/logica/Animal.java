package logica;

public abstract class Animal {

    String nombre;
    String color;

    //no suelen tener constructores
    // porque no se busca que se instancie la clase
    //solo se ocupa de pnatilla para sus hijos
    protected Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    //metodo implemetado
    public void holaAnimal() {
        System.out.println("Hola soy el animal" + nombre);
    }

    //metodos abstractos
    public abstract void comer();

    public abstract void hacerSonido();
}
