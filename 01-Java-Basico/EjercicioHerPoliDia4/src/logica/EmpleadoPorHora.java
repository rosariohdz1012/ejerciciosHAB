package logica;

/**
 *
 * @author Benjamin
 */
public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHora() {
    }

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public EmpleadoPorHora(int horasTrabajadas, double tarifaPorHora, String name, double salarioBase) {
        super(name, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String getDescripcion() {
        String salarioTotal = "" + calcularSalario();
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescripcion());
        sb.append("EmpleadoPorHora");
        sb.append("horasTrabajadas=").append(horasTrabajadas);
        sb.append(", tarifaPorHora=").append(tarifaPorHora);
        sb.append(salarioTotal);
   
        return sb.toString();
    }

}
