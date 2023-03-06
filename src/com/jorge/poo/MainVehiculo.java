package com.jorge.poo;


public class MainVehiculo {

	public static void main(String[] args) {
		
		Vehiculo miVehiculo = new Vehiculo(4);
		
		miVehiculo.setColor("amarillo");
		System.out.println(miVehiculo.getColor());
		
		Vehiculo miVehiculo2 = new Vehiculo(4);
		
		miVehiculo.setColor("rojo");
		miVehiculo2.setExtra(true, true, true);
		
		System.out.println(miVehiculo2.getColor());
		System.out.println(miVehiculo2.getExtra());
		
		Vehiculo moto1 = new Vehiculo(2);
		
		System.out.println(miVehiculo.getDatosVehiculo());
		System.out.println(moto1.getDatosVehiculo());
		
		Vehiculo miMoto2 = new Vehiculo(2, 1, 0.3, 200);
		miMoto2.setColor("gris");
		
		Vehiculo miCamion = new Vehiculo(6, 3, 1.5, 3500);
		
		miCamion.setColor("Azul");
		
		miCamion.setExtra(true, true, false);
		
		System.out.println(miMoto2.getDatosVehiculo());
		System.out.println(miCamion.getDatosVehiculo());
		System.out.println(miCamion.getExtra());
		
		
		
		
		
		
	}

}
