package marina;

public class Prueba {

	public static void main(String[] args) {
		
		//a. Inicializar un objeto Rectángulo estableciendo ancho y alto.
		Rectangulo r1 = new Rectangulo(5, 2);
		
		//b. Imprimir por pantalla el alto y ancho. 
		System.out.println("Ancho: "+ r1.getAncho() + " Alto: "+ r1.getAlto());
		
		//c. Imprimir por pantalla el área y perímetro. 
		System.out.println("Area: "+ r1.getArea() +
						   " Perimetro: "+ r1.getPerimetro()); 
		
		//d. Modificar el alto y el ancho de la instancia. 
		r1.setAlto(30);
		r1.setAncho(1.5);
		
		//e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
		System.out.println("Area: "+ r1.getArea() +
				   " Perimetro: "+ r1.getPerimetro()); 
		
		//f. Inicializar un objeto Rectángulo con los valores por defecto y verificar. 
		Rectangulo r2 = new Rectangulo();
		System.out.println("Ancho: "+ r2.getAncho() + " Alto: "+ r2.getAlto());
	}

}