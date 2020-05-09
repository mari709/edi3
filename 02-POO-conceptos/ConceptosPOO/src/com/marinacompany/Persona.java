package com.marinacompany;

public class Persona {

	private String nombre;
	private String apellido;
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido (String a) {
		this.apellido = a;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void caminar() {
		System.out.println("Soy " + this.nombre + " " + this.apellido + " y estoy caminando, que piola!");
	}
}
