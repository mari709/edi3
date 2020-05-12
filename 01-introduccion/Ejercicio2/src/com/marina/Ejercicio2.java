package com.marina;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//DECLARACION Y ASIGNACION
		int X = 10, Y= 9;
		double N= 2.50, M= 0.5;
		
		
		//MOSTRAR OPERACIONES ENTRE VARIABLES
		System.out.println("X + Y = " + (X+Y));
		System.out.println("X + N = " + (X+N));
		
		System.out.println("M - N = " + (M-N));
		System.out.println("X - Y = " + (X-Y));
		
		System.out.println("X * N = " + (X*N));
		System.out.println("X * Y * N * M = " + (X*Y*N*M));
		
		System.out.println("X / N = " + (X/N));
		System.out.println("N / X = " + (N/X));


		System.out.println("X ^ 2 + N + M = " + (Math.pow(X, 2) + N + M));

		System.out.println("sqrt(Y) + M = " + (Math.sqrt(Y) + M));

		
		
	}

}
