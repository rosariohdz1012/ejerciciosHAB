package ejerrefmetodoinstanciad6;

import logica.Persona;

public class EjerRefMetodoInstanciaD6 {

    public static void main(String[] args) {

        Persona pers = new Persona();
        pers.setNombre("Luisina");
        
        //usar la referencia a metodos
        //nececita usar una interfaz funciona;
        Runnable saludo = pers::saludar;
        saludo.run();
        
        //forma norma
        pers.saludar();
        

    }

}
