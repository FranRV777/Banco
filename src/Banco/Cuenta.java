package Banco;

public class Cuenta {
	// Atributos
	private String ccc;
	private String cod_cliente;
	private double saldo;
	
	// Constructor
	public Cuenta (String ccc, String cod_cliente, double saldo) {
		this.ccc=ccc;
		this.cod_cliente=cod_cliente;
		this.saldo=saldo;
	}
	
	// Metodos
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
	
    public void sacar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }    
	
    public void verCuenta() {
        System.out.println("Saldo actual: " + saldo);
    }

}
