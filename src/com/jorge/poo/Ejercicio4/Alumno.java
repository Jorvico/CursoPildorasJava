package com.jorge.poo.Ejercicio4;

public class Alumno {
	private String nombreAlumno;
	private double notaMedia;
	
	
	public Alumno(String nombreAlumno, double notaMedia) {
		this.nombreAlumno = nombreAlumno;
		this.notaMedia = notaMedia;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
}
