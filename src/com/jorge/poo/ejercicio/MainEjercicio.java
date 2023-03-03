package com.jorge.poo.ejercicio;

public class MainEjercicio {

	public static void main(String[] args) {
		
		//Se instancian los dos objetos
		CuentaCorriente cuenta1 = new CuentaCorriente("Jorge Vidal", 1000);
		CuentaCorriente cuenta2 = new CuentaCorriente("Deisy Rodriguez", 2000);
		
		//Se imprimen los datos de las cuentas
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
		System.out.println("");
		
		//Se realiza una tranferencia de uuna cuenta a otra
		System.out.println(cuenta1.transferirOtraCuenta(cuenta1, cuenta2, 500));
		System.out.println("");
		
		//Se imprimen los datos de las cuentas
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
	}

}
