package logico;

import java.sql.Date;

public class Candidatura extends Solicitud {

	private String estado;
	public Candidatura(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia,
			Date fechaVencimiento, int cantVacantes, String jornada, float salario, String tipoContrato,
			String periodoCobro, String estado) {
		
		super(codigo, ofertaLaboral, categoriaLaboral, provincia, fechaVencimiento, cantVacantes, jornada, salario,
				tipoContrato, periodoCobro);
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	
	
}
