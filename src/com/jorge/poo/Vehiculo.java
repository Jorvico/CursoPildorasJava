package com.jorge.poo;

public class Vehiculo {
	
	//Atrubutos o propiedades
	private int ruedas;
	private String color;
	private int largo;
	private double ancho;
	private int peso;
	private boolean climatizador;
	private boolean tapiceriaCuero;
	private boolean gps;
	
	
	//Constructor de la clase
	//Sobrecarga de constructores
	public Vehiculo(int ruedas) {
		
		//Atributos iniciales al construir un objeto
		this.ruedas = ruedas;
		largo = 2;
		ancho=1;
		peso=2;
		color="sin color";
	}
	
public Vehiculo(int ruedas, int largo, double ancho, int peso) {
		
		//Atributos iniciales al construir un objeto
		this.ruedas = ruedas;
		this.largo = largo;
		this.ancho = ancho;
		this.peso=2;
		color="sin color";
	}
	
	//Metodos de acceso
	
	//Setter (Metodo que permite cambiar el atributo desde afuera)
	//Sobrecarga de metodos
	public void setExtra(boolean climatizador) {
		this.climatizador = climatizador;
	}

	
	public void setExtra(boolean climatizador, boolean tapiceriaCuero, boolean gps) {
		this.climatizador = climatizador;
		this.tapiceriaCuero = tapiceriaCuero;
		this.gps = gps;
	}
	
	
	public String getExtra() {
		if(climatizador && tapiceriaCuero == false && gps == false) {
			return "Tu vehiculo lleva el pack 1 de extras";
		}else if(climatizador && tapiceriaCuero && gps) {
			return "Tu vehiculo lleva el pack 2 de extras";
		}else {}
		return "La combinacion escogida no se admite";
		
	}
	 
		

	
	public void setColor(String color) {
		//color="Azul";
		this.color = color;
	}
	
	//Getter(Metodo que permite devolver el valor de una propiedad desde afuera)
	
	public String getColor() {
		return color;
	}
	
	public String getDatosVehiculo() {
		return "El vehiculo tiene " + this.ruedas + " ruedas y un color " + this.color;
	}
}
