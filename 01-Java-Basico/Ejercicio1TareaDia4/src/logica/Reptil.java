package logica;

public class Reptil extends Animal {

    private float longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String hábitat;

    public Reptil() {
    }

    public Reptil(float longitud, String tipoEscamas, String tipoVeneno, String hábitat) {
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.hábitat = hábitat;
    }

    public Reptil(float longitud, String tipoEscamas, String tipoVeneno, String hábitat, long id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.hábitat = hábitat;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHábitat() {
        return hábitat;
    }

    public void setHábitat(String hábitat) {
        this.hábitat = hábitat;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola, soy un reptil");
    }

}
