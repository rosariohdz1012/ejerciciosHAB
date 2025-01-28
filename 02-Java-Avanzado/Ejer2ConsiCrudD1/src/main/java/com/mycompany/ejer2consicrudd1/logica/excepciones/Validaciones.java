package com.mycompany.ejer2consicrudd1.logica.excepciones;

public class Validaciones {

    public void validarNombre(String nombre) throws NombreInvalidoException {
        if (nombre == null) {
            throw new NombreInvalidoException("El campo esta vacio");
        }
    }

    public void validarPrecio(double precio) throws PrecioInvalidoException {
        if (precio <= 0) {
            throw new PrecioInvalidoException("Digitar un monto valido mayor a 0");
        }
    }

    public void validarStock(int stock) throws StockInvalidoException {
        if (stock <= 0) {
            throw new StockInvalidoException("Digite una cantidad valida mayor a 0");
        }

    }

}
