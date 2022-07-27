package logico;

import java.sql.Date;
import java.util.ArrayList;

public class Oferta extends Solicitud {

	private ArrayList<Candidato>misCandidatos;
	public Oferta(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int cantVacantes, String jornada, float salario, String tipoContrato, String periodoCobro,
			CentroEmpleador miCentro) {
		super(codigo, ofertaLaboral, categoriaLaboral, provincia, fechaVencimiento, cantVacantes, jornada, salario,
				tipoContrato, periodoCobro, miCentro);
		this.misCandidatos=new ArrayList<Candidato>();
	}
	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}

}
