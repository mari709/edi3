package com.marina;

public class EjemploGC {
	
	public void ejemplo() {

	//Los valores primitivos son guardados en el stack
	int x = 17;
	
	//la referencia p es guardada en el stack 
	//los objetos de la clase Persona son guardados en el heap
	
	Persona p;
	

	p = new Persona("Sebastian");
	
	//reasigno "p"
	p = new Persona("Gonzalo");
	
	//La instancia "Sebastian" puede ser destruida por el GC
		

	
	}
}
