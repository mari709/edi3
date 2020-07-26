package herencia;

public class Empleado extends Persona {
	private int numeroEmpleado;
	private String departamento;
	private String puesto;
	
	public Empleado() {
		
	}
	
	public Empleado (String nombre, int edad, char sexo, int numeroEmpleado, String departamento, String puesto) {
		super(nombre, edad, sexo);
		this.setNumeroEmpleado(numeroEmpleado);
		this.setDepartamento(departamento);
		this.setPuesto(puesto);
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	
	
}
