/*Crear una clase llamada VideoJuego, que tenga los siguientes atributos: codigo, titulo, consola, cantidadJugadores, 
categoría (tener en cuenta todos sus atributos, constructores, métodos getters y setters).*/
package logica;

public class VideoJuego {

    //atributos
    long codigo;
    String titulo;
    String consola;
    int cantJugadores;
    String categoria;
    //Consructores vacio/parametrizado

    public VideoJuego() {
    }

    public VideoJuego(long codigo, String titulo, String consola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }
    //métodos getters y setters

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoJuego{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", consola=").append(consola);
        sb.append(", cantJugadores=").append(cantJugadores);
        sb.append(", categoria=").append(categoria);
        sb.append('}');
        return sb.toString();
    }

    

}
