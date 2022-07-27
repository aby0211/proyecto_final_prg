package logico;

import java.sql.Date;

public class Universitario extends Candidato {
	private String carrera;
	public Universitario(String codigo, String nombre, char sexo, Date fechaNacimiento, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String centroEducativo, String carrera, int annosExperiencia,
			String estadoCivil, String telefono, String rangoSalarioMinimo, boolean viajarDisp) {
		super(codigo, nombre, sexo, fechaNacimiento, password, email, provincia, vehiculoPropio, nivelEstudio,
				centroEducativo, annosExperiencia, estadoCivil, telefono, rangoSalarioMinimo, viajarDisp);
		this.carrera=carrera;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}
