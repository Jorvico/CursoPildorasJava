package com.jorge.poo.ejercicio2;

public class Sucursal {
	
	private int numeroSucursal;
	private String direccionEnvio;
	private String ciudad;
	
	public Sucursal(int numeroSucursal, String direccionEnvio, String ciudad) {
		this.numeroSucursal = numeroSucursal;
		this.direccionEnvio = direccionEnvio;
		this.ciudad = ciudad;
	}
	
	public Sucursal() {
		
	}
	
	public int getNumeroSucursal() {
		return this.numeroSucursal;
	}
	
	public String getDireccion() {
		return this.direccionEnvio;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public double calcularPrecio(Paquete paquete) {
		double precio = paquete.getPeso();
		if(paquete.getPrioridad() == 1) {
			precio = precio + 10;
		}else if(paquete.getPrioridad() == 2){
			precio = precio + 20;
		}
		return precio;
	}
}
