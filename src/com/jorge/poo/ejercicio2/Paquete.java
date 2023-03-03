package com.jorge.poo.ejercicio2;

public class Paquete {
	
	private String referenciaEnvio;
	private double peso;
	private String dni;
	private int prioridad;
	
	public Paquete(String referenciaEnvio, double peso, String dni, int prioridad) {
		this.referenciaEnvio = referenciaEnvio;
		this.peso = peso;
		this.dni = dni;
		this.prioridad = prioridad;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getReferenciaEnvio() {
		return referenciaEnvio;
	}

	public void setReferenciaEnvio(String referenciaEnvio) {
		this.referenciaEnvio = referenciaEnvio;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return this.peso;
	}
	
	public int getPrioridad() {
		return this.prioridad;
	}
}
