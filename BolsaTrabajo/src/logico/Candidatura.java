package logico;

import java.sql.Date;

public class Candidatura extends Solicitud {
	private String estado;
	private Candidato miCandidato;
	public Candidatura(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia,
			Date fechaVencimiento, int cantVacantes, String jornada, float salario, String tipoContrato,
			String periodoCobro, CentroEmpleador miCentro, Candidato miCandidato, String estado) {
		super(codigo, ofertaLaboral, categoriaLaboral, provincia, fechaVencimiento, cantVacantes, jornada, salario,
				tipoContrato, periodoCobro, miCentro);
		this.estado=estado;
		this.miCandidato=miCandidato;
		
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Candidato getMiCandidato() {
		return miCandidato;
	}
			

}
