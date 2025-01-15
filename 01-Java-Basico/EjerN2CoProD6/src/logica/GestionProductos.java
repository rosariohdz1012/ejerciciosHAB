package logica;

import java.util.ArrayList;
import java.util.Comparator;
import modelo.Producto;

public class GestionProductos {

    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public GestionProductos() {
    }

    public void agregarP(Producto produc) {
        this.listaProductos.add(produc);
    }

    public Producto getProductoMayorV() {
        Comparator<Producto> comparacion = Comparator.comparing(Producto::getPrecioVenta);

        Producto producto = listaProductos.stream().max(comparacion).get();
        return producto;

    }

    public Producto getProductoMenorC() {
        Comparator<Producto> comparacion = Comparator.comparing(Producto::getPrecioCosto);

        Producto producto = listaProductos.stream().min(comparacion).get();
        return producto;

    }

    public Producto getProductoStockMayor() {

        Comparator<Producto> comparacionS = Comparator.comparing(Producto::getCantidadStock);

        Producto producto = listaProductos.stream().max(comparacionS).get();

        producto.setCantidadStock(producto.getCantidadStock() - 3);//seteo o actualizar valor 
        return producto;

    }

    public Producto eliminarProductos(int i) {

        return listaProductos.remove(i);

    }

    public void actualizarStockProducto(){        
        Producto p=getProductoStockMayor();
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).getCodigo()== p.getCodigo()) {
                listaProductos.set(i, p);
                return;
            }            
        }
        
    }
    
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("=*=*=*=*Lista de Productos=*=*=*=*n");
        
        for (Producto producto : listaProductos) {
            sb.append(producto);
        }
        
        return sb.toString();
    }

}
