/*Ejercicio Encapsulamiento
Crea una clase llamada CuentaBancaria que modele el comportamiento de una cuenta bancaria. 
La clase debe cumplir con los principios de encapsulamiento, es decir, debe proteger los datos sensibles utilizando 
modificadores de acceso.
Requisitos:
La clase CuentaBancaria debe tener los siguientes atributos privados:
-titular: nombre del titular de la cuenta (String).
-saldo: cantidad de dinero en la cuenta (double).
-numeroCuenta: número de cuenta (int).
Implementa los siguientes métodos públicos:
-Constructor para inicializar el titular, el saldo y el número de cuenta.
-getters y setters
A partir de esto realizar las siguientes pruebas:
- Crear un objeto CuentaBancaria en el método main. Acceder al método get de cada atributo y
mostrar los valores por pantalla.
- Cambiar el método de acceso del método getSaldo por "private"
- Intentar acceder al método getSaldo desde el main para mostrarlo por pantalla... ¿Es posible hacerlo?¿Qué ocurre?
¿Se puede acceder sin problema alguno? */

package ejercicioencapdia4;

import login.CuentaBancaria;

public class EjercicioEncapDia4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria  cuentaB = new CuentaBancaria("Rosario" , 3.134 ,768);
        System.out.println("El titular es: "+cuentaB.getTitular()+
               "\nEl saldo es: "+ cuentaB.getSaldo()+
               "\nEl numero de cuenta es: "+ cuentaB.getNumCuenta());
        
    }
    
}
