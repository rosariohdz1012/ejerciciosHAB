
package logica2;

public class Animal {
    //atributos
        String nombre;
        String especie;
        String color;
        //metodos
        //contrcturores

    public Animal() {
    }

    public Animal( String nombre, String especie, String color) {
         this.nombre = nombre;
        this.especie = especie;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", especie=" + especie + ", color=" + color + '}';
    }
  
    
}
