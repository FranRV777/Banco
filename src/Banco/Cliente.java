package Banco;

import java.util.Scanner;

public class Cliente {
	// Atributos 
	private String cod_cliente;
	private String nombre;
	private Integer newAttr;
	private Scanner scanner;
	
	//Constructor 
	public Cliente(String cod_cliente,String nombre, Integer newAttr, Scanner scanner) {
		this.cod_cliente = cod_cliente;
		this.nombre = nombre;
		this.newAttr = newAttr;
		this.scanner = scanner;
	}
	//Metodos
	public void crearCliente(Scanner scanner) {
		System.out.println ("Introduce el nombre del cliente");
		nombre = scanner.nextLine();
		System.out.println ("Introduce el codigo del cliente");
		cod_cliente = scanner.nextLine();
		System.out.println ("Introduce datos personales del cliente");
		newAttr = scanner.nextInt();
	}
	public void verCliente() {
		System.out.println("Nombre: " + nombre);
		System.out.println ("Codigo: " + cod_cliente);
		System.out.println ("Datos personales: " + newAttr);
		System.out.println("Presiona Enter para continuar...");
		scanner.nextLine();
	}
	
}
