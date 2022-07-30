package logico;

import java.util.Date;

public class Universitario extends Postulacion {
	
	private String carrera;
	private String centroEducativo;
	
	public Universitario(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String carrera, String centroEducativo, String estado) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado);
		this.carrera=carrera;
		this.centroEducativo=centroEducativo;
	}

	public String getCarrera() {
		return carrera;
	}
	public String getCentroEducativo() {
		return centroEducativo;
	}
	

}
