package ejern2coprod6;

import presentacion.Presentacion;

public class EjerN2CoProD6 {

    public static void main(String[] args) {
        Presentacion present = new Presentacion();
        System.out.println("Creando lista productos: ");
        present.llenarLista();
        System.out.println("Lista creada con exito ");
        present.imprimirLista();
        System.out.println("\nEl producto con el mayor precio de venta es: ");
        present.mostrarProductoMayorPrecioVenta();
        System.out.println("\nEl producto con el menor precio de costo es: ");
        present.mostrarProductoMenorCosto();
        present.borrarProducto(5);
        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
        present.imprimirLista();
        present.actualizarStockProductoMayorCantidad();
        System.out.println("Lista de productos con la actualizacion del producto con mayor stock: ");
        present.imprimirLista();
    }

}
