package logico;

import java.util.Date;

public class Tecnico extends Postulacion {

	public Tecnico(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String estado, String areaTecnica, String centroEducativo, Candidato miCandidato) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado, miCandidato);
		this.areaTecnica=areaTecnica;
		this.centroEducativo=centroEducativo;
	}

	private String areaTecnica;
	private String centroEducativo;
	



	public String getAreaTecnica() {
		return areaTecnica;
	}

	public String getCentroEducativo() {
		return centroEducativo;
	}
	
	


}
