package com.jorge.poo.Ejercicio3;

import java.util.Random;

public class CuentaCorriente {
	
	private final String nombreTitular;
	private final double saldoInicial;
	private double saldoActual;
	private final Long numeroCuenta;
	
	
	
	
	
	public CuentaCorriente(String nombreTitular, double saldoInicial ) {
		this.nombreTitular = nombreTitular;
		this.saldoInicial = saldoInicial;
		saldoActual = saldoInicial;
		Random ran = new Random();
		numeroCuenta=Math.abs(ran.nextLong());
	}
	
	public void ingresarDinero(double cantidadIngreso) {
		saldoActual += cantidadIngreso;
	}
	
	public void retirarDinero(double cantidadRetiro) {
		saldoActual -= cantidadRetiro;
	}
	
	public String getSaldoActual(){
		return "El saldo actual de la cuenta es: $" + saldoActual;
	}
	
	public String getDatosCuenta() {
		return "Nombre del titular " + nombreTitular +
				"\nNumero de cuenta " + numeroCuenta +
				"\nSaldo actual : $" + saldoActual;
	}
	
	public void tranferirMonto(CuentaCorriente cuenta1, CuentaCorriente cuenta2, double monto) {
		cuenta2.ingresarDinero(monto);
		cuenta1.retirarDinero(monto);
		System.out.println("Transferencia exitosa");
	}
	
}
