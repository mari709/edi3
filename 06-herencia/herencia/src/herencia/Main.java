package herencia;

public class Main {
	public static void main (String[] args) {
		
		
		//Instancia de empleado
		Empleado p = new Empleado();
		
		
		//seteamos atributos de persona
		p.setNombre("Pedro");
		p.setEdad(29);
		p.setSexo('M');
		
		//seteamos atributos de empleado en si
		p.setNumeroEmpleado(1234);
		p.setPuesto("Administrador");
		p.setDepartamento("Sistemas");
		
		System.out.println("Nombre del empleado: " + p.getNombre());
		System.out.println("Puesto del empleado: " + p.getPuesto());

	}

}
