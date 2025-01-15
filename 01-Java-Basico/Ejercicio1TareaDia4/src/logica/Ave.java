package logica;

public class Ave extends Animal {

    private float envergadurAlas;
    private String tipoVuelo;
    private String colorplumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(float envergadurAlas, String tipoVuelo, String colorplumaje, String tipoPico) {
        this.envergadurAlas = envergadurAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorplumaje = colorplumaje;
        this.tipoPico = tipoPico;
    }

    public Ave(float envergadurAlas, String tipoVuelo, String colorplumaje, String tipoPico, long id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergadurAlas = envergadurAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorplumaje = colorplumaje;
        this.tipoPico = tipoPico;
    }

    public float getEnvergadurAlas() {
        return envergadurAlas;
    }

    public void setEnvergadurAlas(float envergadurAlas) {
        this.envergadurAlas = envergadurAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorplumaje() {
        return colorplumaje;
    }

    public void setColorplumaje(String colorplumaje) {
        this.colorplumaje = colorplumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola, soy un ave");
    }
    
    
}
