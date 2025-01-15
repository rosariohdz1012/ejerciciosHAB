/*Ejercicio Herencia + Polimorfismo
Crea un sistema de empleados para una empresa utilizando herencia y polimorfismo.
La clase base será Empleado, y las clases hijas serán EmpleadoDependencia y EmpleadoPorHora.
Crea la clase base Empleado con los siguientes atributos protegidos:
	nombre: nombre del empleado (String).
	salarioBase: salario base del empleado (double).
En la clase Empleado, crea los siguientes métodos públicos:
	- Constructores
	- getters y setters
	- método calcularSalario() que emita un mensaje "Debe elegir el tipo de
	  empleado para calcular salario"
	- getDescripción(): método que devuelve una descripción básica del puesto
	  del empleado y sus responsabilidades.
	 
Crea la clase EmpleadoDependencia que herede de Empleado y agrega:
	- Un atributo propio privado llamado bono (double).
	- Constructores que inicialicen los atributos heredados y propio/s.
	- Sobreescribe el método calcularSalario() para que devuelva el salario base más el bono.
	- Sobrecarga/sobrescribe (decidir qué creen mejor) el método getDescripcion() para que, además de explica el rol del empleado, muestre el bono que cobra por ser empleado en relac de dependencia
	
Crea la clase EmpleadoPorHora que herede de Empleado y agrega:
	- Atributos privados propios llamados horasTrabajadas (int) y tarifaPorHora (double).
	- Constructores que inicialicen los atributos heredados, las horas trabajadas y la tarifa por hora.
	- Sobreescribe el método calcularSalario() para que devuelva el total calculado como horasTrabajadas * tarifaPorHora.
En una clase principal, crea un vector de tipo Empleado[] con 5 posiciones y almacena objetos de tipo EmpleadoTiempoCompleto y EmpleadoPorHora.
Luego, recorre el vector y muestra el nombre de cada empleado, su salario y su descripción...
¿Es posible reutilizar los mismos métodos para cada objeto? (editado) */
package logica;

public class Empleado {

    protected String name;
    protected double salarioBase;

    public Empleado() {
    }

    public Empleado(String name, double salarioBase) {
        this.name = name;
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        System.out.println("Debe elegir el tipo de empleado para calcular salario");
        return salarioBase;
    }

    public String getDescripcion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("name=").append(name);
        sb.append(", salarioBase=").append(salarioBase);
        sb.append('}');
        return sb.toString();
    }

}
