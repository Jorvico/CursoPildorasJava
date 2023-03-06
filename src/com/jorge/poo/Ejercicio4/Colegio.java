package com.jorge.poo.Ejercicio4;

public class Colegio {

	private final String nombreColegio;
	private Alumno[] arrayAlumnos;
	private static int indice = 0;

	public Colegio(String nombreColegio, int capacidadAlumnos) {
		this.nombreColegio = nombreColegio;
		arrayAlumnos = new Alumno[capacidadAlumnos];

	}

	public void nuevoAlumno(String nombreAlumno, double notaMedia) {
		Alumno alumno = new Alumno(nombreAlumno, notaMedia);
		arrayAlumnos[indice] = alumno;
		indice++;
	}

	public String getNombreColegio() {
		return "El nombre del colegio es " + nombreColegio;
	}

	public void getTodosAlumnos() {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if ( arrayAlumnos[i] != null) {
				System.out.println("Nombre alumno: " + arrayAlumnos[i].getNombreAlumno());
				System.out.println("Colegio: " + nombreColegio);
				System.out.println("Numero de alumno: " + i);
				System.out.println("Nota media: " + arrayAlumnos[i].getNotaMedia());
				System.out.println("");
			}
		}
	}

	public void getDatosAlumno(String nombreAlumno) {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
				System.out.println("Nombre alumno: " + arrayAlumnos[i].getNombreAlumno());
				System.out.println("Colegio: " + nombreColegio);
				System.out.println("Numero de alumno: " + i);
				System.out.println("Nota media: " + arrayAlumnos[i].getNotaMedia());
				System.out.println("");
			}
		}

	}

	public void expulsaAlumno(String nombreAlumno) {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if( arrayAlumnos[i] != null) {
				if (arrayAlumnos[i].getNombreAlumno() == nombreAlumno) {
					arrayAlumnos[i] = null;
				}
			}
		}
	}

	public void actualizaNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		for (int i = 0; i < arrayAlumnos.length; i++) {
			if (arrayAlumnos[i] != null) {
				if (arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				}
			}
		}
	}
}
