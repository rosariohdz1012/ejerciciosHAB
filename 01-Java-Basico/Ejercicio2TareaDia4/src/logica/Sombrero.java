package logica;

public class Sombrero extends Vestimenta {

    private String tipo;
    private float tamanio;

    public Sombrero() {
    }

    public Sombrero(String tipo, float tamanio) {
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public Sombrero(int codigo, String nombre, float precio, String marca, int talla, String color, String tipo, float tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Este sombrero es de marca: " + getMarca());
    }

}
