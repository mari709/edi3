package marina;

public class Rectangulo {
	private double ancho;
	private double alto;
	
	public Rectangulo() {
		this.setAncho(1.0);
		this.setAlto(1.0);
	}
	
	public Rectangulo(double ancho, double alto) {
		this.setAncho(ancho);
		this.setAlto(alto);
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public double getPerimetro() {
		return (2*ancho + 2*alto);
	}
	
	public double getArea() {
		return(ancho * alto);
	}
}