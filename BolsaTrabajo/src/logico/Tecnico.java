package logico;

import java.sql.Date;

public class Tecnico extends Candidato {

	private String areaTecnica;
	private String centroEducativo;

	public Tecnico(String codigo, String nombre, String sexo, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String centroEducativo, int annosExperiencia,
			 String telefono, int rangoSalarioMinimo, boolean viajarDisp, String areaTecnica) {
		super(codigo, nombre, sexo, password, email, provincia, vehiculoPropio, nivelEstudio,
			 annosExperiencia, telefono, rangoSalarioMinimo, viajarDisp);
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
