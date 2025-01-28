package logica;

public class Carro {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long num_Motor;
    private String modelo;
    private String marca;
    @OneToOne
    private Propietario unPropietario;

    public Carro() {
    }

    public Carro(Long num_Motor, String modelo, String marca, Propietario unPropietario) {
        this.num_Motor = num_Motor;
        this.modelo = modelo;
        this.marca = marca;
        this.unPropietario = unPropietario;
    }

    public Long getNum_Motor() {
        return num_Motor;
    }

    public void setNum_Motor(Long num_Motor) {
        this.num_Motor = num_Motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Propietario getUnPropietario() {
        return unPropietario;
    }

    public void setUnPropietario(Propietario unPropietario) {
        this.unPropietario = unPropietario;
    }

}
