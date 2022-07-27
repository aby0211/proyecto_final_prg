package logico;

import java.sql.Date;

public class Obrero extends Candidato {
	private String oficio;
	public Obrero(String codigo, String nombre, char sexo, Date fechaNacimiento, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String centroEducativo, String oficio, int annosExperiencia,
			String estadoCivil, String telefono, String rangoSalarioMinimo, boolean viajarDisp) {
		super(codigo, nombre, sexo, fechaNacimiento, password, email, provincia, vehiculoPropio, nivelEstudio,
				centroEducativo, annosExperiencia, estadoCivil, telefono, rangoSalarioMinimo, viajarDisp);
		this.oficio=oficio;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	

}
