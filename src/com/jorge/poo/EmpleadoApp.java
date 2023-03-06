package com.jorge.poo;

public class EmpleadoApp {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Paola");
		Empleado empleado2 = new Empleado("Jorge");
		Empleado empleado3 = new Empleado("Deisy");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setArea("Finanzas");

		System.out.println(empleado1.getDatosEmpleado());
		System.out.println(empleado2.getDatosEmpleado());
		System.out.println(empleado3.getDatosEmpleado());
		System.out.println(Empleado.getIdSiguiente());
		
		Empleado miEmpleado = new Empleado("Luz Mila");
		System.out.println(miEmpleado.getDatosEmpleado());
	}

}


class Empleado{
	
	//El modificador final no permite cambiar el valor despues de asignar un valor la primera vez
	private final String nombre;
	private String area;
	private int id;
	//La palabra static indica que es una varible de clase y no pertenece a una instancia de la clase
	private static int idSiguiente=1;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		area = "Administración";
		id = idSiguiente;
		idSiguiente++;
	}
	
	public void setArea(String area) {
		this.area = area;
	}
	
	public String getDatosEmpleado(){
		return "El empleado " + nombre + " pertenece al area " + area + " y tiene el número " + id;
	}
	
	public static String getIdSiguiente() {
		return "El id del siguiente empleado será " +idSiguiente;
	}
	
}