package logico;

import java.util.Date;

public class Tecnico extends Postulacion {

	private String areaTecnica;
	private String centroEducativo;
	
	public Tecnico(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento, int salarioMinimo,
			int annosExp, String areaTecnica, String centroEducativo, String estado) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado);
		this.areaTecnica=areaTecnica;
		this.centroEducativo=centroEducativo;
	}


	public String getAreaTecnica() {
		return areaTecnica;
	}

	public String getCentroEducativo() {
		return centroEducativo;
	}
	
	


}
