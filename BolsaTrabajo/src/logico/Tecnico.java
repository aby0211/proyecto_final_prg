package logico;

import java.sql.Date;

public class Tecnico extends Candidato {

	private String areaTecnica;

	public Tecnico(String codigo, String nombre, char sexo, Date fechaNacimiento, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String centroEducativo, int annosExperiencia,
			String estadoCivil, String telefono, String rangoSalarioMinimo, boolean viajarDisp, String areaTecnica) {
		super(codigo, nombre, sexo, fechaNacimiento, password, email, provincia, vehiculoPropio, nivelEstudio,
				centroEducativo, annosExperiencia, estadoCivil, telefono, rangoSalarioMinimo, viajarDisp);
		this.areaTecnica=areaTecnica;
	}

	public String getAreaTecnica() {
		return areaTecnica;
	}

	public void setAreaTecnica(String areaTecnica) {
		this.areaTecnica = areaTecnica;
	}

}
