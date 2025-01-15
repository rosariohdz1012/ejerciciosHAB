package login;

public class CuentaBancaria {
    
    private String titular ;
    private double saldo;
    private int numCuenta;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String titular, double saldo, int numCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
//solo se accede dentro de la clase donde se crea
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    
 
}
