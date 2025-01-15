/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Benjamin
 */
public class EmpleadoDependencia extends Empleado {

    private double bono;

    public EmpleadoDependencia() {
    }

    public EmpleadoDependencia(double bono) {
        this.bono = bono;
    }

    public EmpleadoDependencia(double bono, String name, double salarioBase) {
        super(name, salarioBase);
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }

    @Override
    public String getDescripcion() {
        String salarioTotal = "" + calcularSalario();
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDescripcion());
        sb.append("EmpleadoDependencia");
        sb.append("bono=").append(bono);
        sb.append(salarioTotal);
               return sb.toString();
    }

}
