package logico;

import java.sql.Date;

public class Obrero extends Candidato {
	private String oficio;
	public Obrero(String codigo, String nombre, String sexo, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String oficio, int annosExperiencia,
		 String telefono, int rangoSalarioMinimo, boolean viajarDisp) {
		super(codigo, nombre, sexo, password, email, provincia, vehiculoPropio, nivelEstudio,
				 annosExperiencia, telefono, rangoSalarioMinimo, viajarDisp);
		this.oficio=oficio;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	

}
