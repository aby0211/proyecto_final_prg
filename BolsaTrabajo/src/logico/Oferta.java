package logico;

import java.sql.Date;

public class Oferta extends Solicitud {

	private ArrayList<Candidato> misCandidatos;
	public Oferta(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int cantVacantes, String jornada, float salario, String tipoContrato, String periodoCobro) {
		super(codigo, ofertaLaboral, categoriaLaboral, provincia, fechaVencimiento, cantVacantes, jornada, salario,
				tipoContrato, periodoCobro);
		this.misCandidatos=new ArrayList<Candidato>();
	}

}
