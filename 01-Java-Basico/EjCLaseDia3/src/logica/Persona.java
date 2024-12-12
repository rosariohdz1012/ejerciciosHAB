package logica;

import java.time.LocalDate;

public class Persona {

    //por ahora se puede tener acceso a la clase
    //atributos
    int id_persona;
    String nombre;
    String apellido;
    LocalDate fecha_nac;
    String direccion;

    //metodos
    //contrcturores
    public Persona() {
    }

    public Persona(int id_persona, String nombre, String apellido, LocalDate fecha_nac, String direccion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.direccion = direccion;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
