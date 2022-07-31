package logico;

import java.util.Date;

public class Postulacion extends Solicitud {

	
	protected int salarioMinimo;
	protected int annosExp;
	protected Candidato miCandidato;
	
	public Postulacion(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento, int salarioMinimo, int annosExp, String estado, Candidato miCandidato) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento,estado);
		this.salarioMinimo=salarioMinimo;
		this.annosExp=annosExp;
		this.miCandidato=miCandidato;
	}
	public int getSalarioMinimo() {
		return salarioMinimo;
	}
	public int getAnnosExp() {
		return annosExp;
	}
	public Candidato getMiCandidato() {
		return miCandidato;
	}
	

}
