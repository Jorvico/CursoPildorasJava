package com.jorge.poo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainVehiculo {

	public static void main(String[] args) {
		
		Vehiculo miVehiculo = new Vehiculo(3);
		
		String color = miVehiculo.getColor();

		System.out.println(color);
		miVehiculo.setColor("Blanco");
		
		color = miVehiculo.getColor();
		System.out.println(color);
		
		Vehiculo miVehiculo2 = new Vehiculo(4);
		
		miVehiculo2.setColor("Rojo");
		System.out.println(miVehiculo2.getColor());
		
		Vehiculo moto1 = new Vehiculo(2);
		
		System.out.println(moto1.getDatosVehiculo());
		
	}

}
