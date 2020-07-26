package marina;

public class Prueba {

	public static void main(String[] args) {
		
		//a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 25000. 
		Empleado e1 = new Empleado(23456345, "Carlos", "Gutiérrez", 25000);
		
		//b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 27500. 
		Empleado e2 = new Empleado(34234123, "Ana", "Sánchez", 27500);
		
		//c. Imprima ambos objetos por pantalla.
		System.out.println(e1);
		System.out.println(e2);
		
		//d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el salario anual del mismo.
		e1.aumentarSalario(15);
		System.out.println("Nuevo salario: " +e1.getSalario());
	}
		
}