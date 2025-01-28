package ejer1consitiond1;
import java.util.Scanner;
import logica.TiendaOnline;


public class Ejer1ConsiTiOnD1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
    //DECLARACION DE ATRIBUTOS
   //Solicitud de lo dtOA
   String numeroTari = null;
   boolean numValido = false;
   
        while (numValido!=true) {
            try{
            System.out.println("Ingrese el numero de la tarjeta (16 numeros)");
            numeroTari = teclado.nextLine();
            //VALIDAR SI MI NUMERO DE TARJETA ES CORRECTO
           validarTarjeta(numeroTari);
           numValido = true;
            
        }
            catch(NumberFormatException e){
                System.out.println("Error. El numero de tarjeta es invalido");
            }
        }
        //Solicitud y validacion de monto
        double montoCompra=0.0;
        boolean montoValido =false;
        
        while(montoValido!=true){
            try {
                System.out.println("Ingrese el monto de la compra");
                montoCompra = Double.parseDouble(teclado.nextLine());
                
                //validar si monto es correcto
                validarMonto(montoCompra);
           numValido = true;
            } catch ( e) {
                  System.out.println("Error. El numero de tarjeta es invalido");
            }
                }
    
       
       
        
    }
    
    public static void validarTarjeta(String numeroTari){
        if(numeroTari.length()!=16||!numeroTari.matches("\\d{16}"))
            throw new NumberFormatException();
    }

    private static void validarMonto(double montoCompra) {
        if (montoCompra=<0) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
                                                                                                   