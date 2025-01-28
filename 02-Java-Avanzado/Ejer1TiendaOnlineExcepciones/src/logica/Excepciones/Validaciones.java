package logica.Excepciones;

public class Validaciones {

    public void validadNumTarjeta(String numTarjeta) {//no se utiliza el throws proque esta dentro de try
        if (numTarjeta.length() != 16 || numTarjeta.matches("\\d[16]")) {
            throw new NumberFormatException("El numero de la tarjeta es invalido"
                    + "\nEs necesario ingresar 16 digitos numericos.\"");
        }

    }
    /*Monto negativo o cero: Si el monto ingresado es menor o igual a 0, se debe lanzar una excepción personalizada llamada MontoInvalidoException.*/

     public void montoNegativoCero(double montoTar) throws MontoInvalidoException{
         if(montoTar<=0){
             throw new MontoInvalidoException("El monto es invalido\nDigite un numero mayor a 0");
         }
     }
/*Nombre vacío: Si el nombre ingresado está vacío o solo contiene espacios, se debe lanzar una excepción IllegalArgumentException.*/

     public void nombreVacio(String nombTarjeta){
         if(nombTarjeta==null || nombTarjeta.isEmpty()){
             throw new IllegalArgumentException("El nombre ingresado esta vacio");
         }
     }
}
