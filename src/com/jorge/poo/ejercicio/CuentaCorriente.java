package com.jorge.poo.ejercicio;

import java.util.Random;

public class CuentaCorriente {
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombreTiular, double saldo) {
		this.nombreTitular = nombreTiular;
		this.saldo = saldo;
		Random ran = new Random();
		numeroCuenta = Math.abs(ran.nextLong());
	}
	
	public void setIngresarDinero(double cantidadIngreso) {
		
		if(cantidadIngreso < 0) {
			System.out.println("No se permiten ingresos negativos");
		}else {
		saldo = saldo +cantidadIngreso;
		}
	}
	
	public void setRetirarDinero(double cantidadRetiro) {
		if(cantidadRetiro > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
		saldo = saldo - cantidadRetiro;
		}
	}
	
	public String getSaldo() {
		return "El saldo de la cuenta es " + saldo;
	}
	
	public String getDatosCuenta() {
		return "El titular de la cuenta es " + nombreTitular +
			   "\nEl numero de cuenta es: " + numeroCuenta +
			   "\nEl saldo actual es : " + saldo;	
	}
	
	public String transferirOtraCuenta(CuentaCorriente cuenta1, CuentaCorriente cuenta2,  double montoAtransferir) {
		cuenta1.saldo = cuenta1.saldo-montoAtransferir;
		cuenta2.saldo = cuenta2.saldo+montoAtransferir;
		return "Transferencia Exitosa por el monto $" + montoAtransferir +
				"Nuevo saldo : $" + saldo;
	}
}
