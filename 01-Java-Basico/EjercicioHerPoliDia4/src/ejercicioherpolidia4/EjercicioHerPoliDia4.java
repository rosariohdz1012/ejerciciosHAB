/**/
package ejercicioherpolidia4;

import logica.Empleado;
import logica.EmpleadoDependencia;
import logica.EmpleadoPorHora;

public class EjercicioHerPoliDia4 {

    public static void main(String[] args) {
        // TODO code application logic here

        Empleado empleados[] = new Empleado[5];

        empleados[0] = new EmpleadoPorHora(10, 17, "Rosario", 200);
        empleados[1] = new EmpleadoPorHora(8, 17, "mary", 200);
        empleados[2] = new EmpleadoDependencia(150, "manu", 250);
        empleados[3] = new EmpleadoDependencia(179, "lao", 200);
        empleados[4] = new EmpleadoDependencia(1300, "man", 200);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getDescripcion());
        }

    }

}
