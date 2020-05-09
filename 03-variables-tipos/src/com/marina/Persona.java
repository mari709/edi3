package com.marina;

public class Persona {

	//ATRIBUTOS
	private String nombre; //variable de instancia
	
	//CONSTRUCTOR
	public Persona() {
		
	}
	
	public Persona(String n) {
		this.nombre = n;
	}
	
	//METODOS DE ACCESO

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}

	
	// OTROS METODOS
	
	public void checkNombre () {
		String nombreLocal = this.getNombre();
		
		if(nombreLocal.length() > 0) {
			String nombre2 = nombreLocal;
			
			System.out.println(nombre2);
		}
	}


	
}
	