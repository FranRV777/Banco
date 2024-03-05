package Banco;

import java.util.Scanner;

public class Empleado  {
	private String cod_emp;
	private String nombre;
	private Scanner scanner;
	
	public Empleado(String cod_emp, String nombre, Scanner scanner) {
		this.cod_emp = cod_emp;
		this.nombre = nombre;
		this.scanner = scanner;
	}
	public void crearEmpleado(Scanner scanner) {
		System.out.println ("Introduce el nombre ");
		nombre = scanner.nextLine();
		System.out.println ("Introduce el codigo de empleado");
		cod_emp = scanner.nextLine();
	}
	public void verEmpleado() {
		System.out.println ("Codigo: " + cod_emp);
		System.out.println("Nombre: " + nombre);
		System.out.println("Presiona Enter para continuar...");
		scanner.nextLine();
	}
}
