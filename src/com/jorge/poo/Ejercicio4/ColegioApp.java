package com.jorge.poo.Ejercicio4;

public class ColegioApp {
	
	public static void main(String [] args) {
		
		Colegio piloto = new Colegio("Piloto", 10);
		Colegio cecilia = new Colegio("Santa Cecilia", 20);
		
		piloto.nuevoAlumno("Jorge", 3.5);
		piloto.actualizaNotaMedia("Jorge", 4.8);
		piloto.nuevoAlumno("Deisy", 5);
		
		piloto.getTodosAlumnos();
		
		//piloto.getDatosAlumno("Jorge");
		
		cecilia.nuevoAlumno("Ana", 5);
		cecilia.nuevoAlumno("Camilo", 2);
		cecilia.nuevoAlumno("Andres", 1.8);
		
		cecilia.expulsaAlumno("Camilo");
		cecilia.getTodosAlumnos();
	}
	
	
}
