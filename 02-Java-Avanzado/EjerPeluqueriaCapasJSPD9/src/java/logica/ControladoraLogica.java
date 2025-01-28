package logica;

import java.time.LocalDate;
import java.time.Month;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
     
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearStock(String nombre, String cantidad, String fechaCaducidad) {
        String[]fechaC = fechaCaducidad.split("\\/");
        int dia,mes,anio;
        dia = Integer.parseInt(fechaC[0]);
        mes = Integer.parseInt(fechaC[1]);
        anio = Integer.parseInt(fechaC[2]);
        
        int cantida= Integer.parseInt(cantidad);
        
        
        ProductosCapilares proCapilares = new ProductosCapilares("lala", cantida, LocalDate.of(anio, mes, dia));
        this.mostrarPoCapilares(proCapilares);
    }
    
    public void mostrarPoCapilares(ProductosCapilares poCapilares) {
        poCapilares.toString();
    }
}
