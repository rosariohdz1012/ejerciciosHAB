package logica;

public class Electrodomestico {
    String bacalao;
    String marca;
    String modelo;
    String consumo; 
    String color;

    public Electrodomestico() {
    }

    public Electrodomestico(String bacalao, String marca, String modelo, String consumo, String color) {
        this.bacalao = bacalao;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public String getBacalao() {
        return bacalao;
    }

    public void setBacalao(String bacalao) {
        this.bacalao = bacalao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
