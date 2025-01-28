package logica.excepciones;

public class ReservacionExcepcion extends Exception{
    
    public static final long serialVersionUID = 700L;
    
    public ReservacionExcepcion(String mensaje){
        super(mensaje);
    }
    
}
