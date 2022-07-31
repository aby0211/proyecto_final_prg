package logico;

import java.util.Date;

public class Universitario extends Postulacion {
	
	public Universitario(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String estado, String carrera, String centroEducativo) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado);
		this.carrera=carrera;
		this.centroEducativo=centroEducativo;
	}
	private String carrera;
	private String centroEducativo;
	


	public String getCarrera() {
		return carrera;
	}
	public String getCentroEducativo() {
		return centroEducativo;
	}
	

}
