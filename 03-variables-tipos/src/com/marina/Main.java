package com.marina;

public class Main {

	public static void main(String[] args) {
		//char
		char caracter = 'A';
		
		
		//boolean
		boolean b = true;
		b = 10 > 20;
		
		//integers
		int entero = 15;
		double doble = 20;
		
		doble = entero;
		
		
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		
		persona2.setNombre("jaimito");
		
		persona3 = persona2; //MEMORIA- AMBOS APUNTAN A LA MISMA DIRECCION DE MEMORIA
		System.out.println(persona3.getNombre());
		System.out.println(persona2.getNombre());

	}

}
