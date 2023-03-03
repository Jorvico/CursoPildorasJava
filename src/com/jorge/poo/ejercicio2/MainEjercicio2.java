package com.jorge.poo.ejercicio2;

import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {

		int numeroSucursal, numeroPaquetes, prioridad;
		String direccionEnvio, ciudad, referenciaEnvio, dni;
		double peso;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de sucursal: \n1. Soacha \n2. Bogota \n3. Melgar)");
		numeroSucursal = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese la direccion de envio");
		direccionEnvio = sc.nextLine();
		
		System.out.println("Ingrese la direccion de ciudad");
		ciudad = sc.nextLine();
		
		Sucursal sucursal = new Sucursal(numeroSucursal, direccionEnvio, ciudad);
		
		System.out.println("Ingrese el numero de paquetes a enviar");
		numeroPaquetes = sc.nextInt();
		sc.nextLine();
		Paquete [] paquetes = new Paquete[numeroPaquetes];
		
		for (int i = 0; i < paquetes.length; i++) {
			System.out.println("Ingrese los datos para el paquete No. " + (i+1));
			System.out.println("Ingrese la refenrencia de envio");
			referenciaEnvio = sc.nextLine();
			System.out.println("Ingrese el DNI del remitente");
			dni = sc.nextLine();
			System.out.println("Ingrese el peso del paquete");
			peso = sc.nextDouble();
			System.out.println("Ingrese la prioridad");
			prioridad = sc.nextInt();
			sc.nextLine();
			Paquete paquete = new Paquete(referenciaEnvio, peso, dni, prioridad);
			paquetes[i] = paquete;
		}
		
		System.out.println("----------------------------------------");
		System.out.println("Datos del envio");
		System.out.println("Numero de sucursal: " + sucursal.getNumeroSucursal());
		System.out.println("Direccion de envio: " + sucursal.getDireccion());
		System.out.println("Ciudad: " + sucursal.getCiudad());
		
		for (int i = 0; i < paquetes.length; i++) {
			System.out.println("Datos del paquete numero "+ (i+1));
			System.out.println("Referencia " + paquetes[i].getReferenciaEnvio());
			System.out.println("Peso: " + paquetes[i].getPeso());
			System.out.println("Prioridad" + paquetes[i].getPrioridad());
			System.out.println("Precio: " + sucursal.calcularPrecio(paquetes[i]));	
		}
		sc.close();
	}

}
