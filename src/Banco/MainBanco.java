package Banco;

import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Cliente cliente = new Cliente("Messi", "5692A", 10, scanner);
	        Empleado empleado = new Empleado("5810H", "Zorra", scanner);

	        int opcion;
	        do {
	            System.out.println("\nMenú:");
	            System.out.println("1. Crear cliente");
	            System.out.println("2. Ver cliente");
	            System.out.println("3. Ingresar dinero");
	            System.out.println("4. Sacar dinero");
	            System.out.println("5. Ver saldo");
	            System.out.println("6. Crear empleado");
	            System.out.println("7. Ver empleado");
	            System.out.println("0. Salir");
	            System.out.println("Elige una opción:");

	            opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar el buffer

	            switch (opcion) {
	                case 1:
	                    cliente.crearCliente(scanner);
	                    break;
	                case 2:
	                    cliente.verCliente();
	                    break;
	                case 3:
	                    System.out.println("Introduce la cantidad a ingresar:");
	                    double cantidadIngreso = scanner.nextDouble();
	                   // cuenta.ingresar(cantidadIngreso);
	                    break;
	                case 4:
	                    System.out.println("Introduce la cantidad a sacar:");
	                    double cantidadRetiro = scanner.nextDouble();
	                   // cuenta.sacar(cantidadRetiro);
	                    break;
	                case 5:
	                   // cuenta.verCuenta();
	                    break;
	                case 6:
	                    empleado.crearEmpleado(scanner);
	                    break;
	                case 7:
	                    empleado.verEmpleado();
	                    break;
	                case 0:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción inválida.");
	            }
	        } while (opcion != 0);
	        	scanner.close(); // Cerrar el Scanner al finalizar
	    }
	}
