package com.jorge.poo.Ejercicio3;

public class CuentaCorrienteApp {

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente("Jorge", 2000);
		CuentaCorriente cuenta2 = new CuentaCorriente("Deisy", 1000);
		
		
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
		
		cuenta1.ingresarDinero(500);
		cuenta1.retirarDinero(300);
		cuenta2.retirarDinero(600);
		cuenta1.tranferirMonto(cuenta1, cuenta2, 400);
		
		System.out.println(cuenta1.getSaldoActual());
		System.out.println(cuenta2.getSaldoActual());
	}

}
