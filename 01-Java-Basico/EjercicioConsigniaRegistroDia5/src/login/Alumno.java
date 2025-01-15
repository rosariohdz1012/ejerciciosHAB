
package login;

public class Alumno {
    
    private long matricula;
    private double  promedio;

    public Alumno() {
    }

    public Alumno(long matricula, double promedio) {
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
