package com.marina;

public class Main {

	public static void main(String[] args) {
		int x1 = 10;
		int x2 = ++x1;
		System.out.println(String.format("%s - %s", x1, x2)); // 11 - 11
		System.out.println("----------");

		int y1 = 10;
		int y2 = y1++;
		System.out.println(String.format("%s - %s", y1, y2)); // 11 - 10
		System.out.println("----------");
		
		int x = 1;
		if (x++ > 1) { //falso
			System.out.println(String.format("Valor dentro del if: %s", x));
		}	
		System.out.println(String.format("Valor fuera del if: %s", x));
		System.out.println("----------");

	
		int y = 1;
		if (++y > 1) { //verdadero
			System.out.println(String.format("Valor dentro del if: %s", y));
		}
		System.out.println(String.format("Valor fuera del if: %s", y));
		System.out.println("----------");
	}
}
