
package com.hackaboss.ejer1tormured4.logica;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Torneo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public Torneo(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }     

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Torneo{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

   
}
