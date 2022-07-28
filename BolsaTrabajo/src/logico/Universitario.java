package logico;


public class Universitario extends Candidato {
	private String carrera;
	private String CentroEducativo;
	public Universitario(String codigo, String nombre, String sexo, String password, String email,
			String provincia, boolean vehiculoPropio, String carrera, String nivelEstudio,String CentroEducativo, int annosExperiencia,
	 String telefono, int rangoSalarioMinimo, boolean viajarDisp) {
		super(codigo, nombre, sexo, password, email, provincia, vehiculoPropio, nivelEstudio,
				 annosExperiencia,  telefono, rangoSalarioMinimo, viajarDisp);
		this.carrera=carrera;
		this.CentroEducativo=CentroEducativo;
	}
	public String getCarrera() {
		return carrera;
	}
	public String getCentroEducativo() {
		return CentroEducativo;
	}

}
