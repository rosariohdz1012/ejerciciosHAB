package logica;

public class Zapato extends Vestimenta {

    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(String materia, String tipoCierre) {
        this.material = materia;
        this.tipoCierre = tipoCierre;
    }

    public Zapato(int codigo, String nombre, float precio, String marca, int talla, String color, String materia, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = materia;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }

}
