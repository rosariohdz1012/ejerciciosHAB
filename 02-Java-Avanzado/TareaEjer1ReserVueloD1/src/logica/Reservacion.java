package logica;

public class Reservacion {

    private Usuario usuario;
    private Vuelo vuelo;

    public Reservacion(Usuario usuario, Vuelo vuelo) {
        this.usuario = usuario;
        this.vuelo = vuelo;
    }

    public Reservacion() {

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public void reservar() {
        vuelo.asientosReservados(usuario.getNumAsientosDeseados());
    }

}
