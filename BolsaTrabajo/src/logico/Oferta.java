package logico;

import java.util.ArrayList;
import java.sql.Date;

public class Oferta extends Solicitud {

	private int cantVacantes;
	private String ofertaLaboral;
	private String nivelEstudioReq;
	private String jornada;
	private int salario;
	private String tipoContrato;
	private String periodoCobro;
	private CentroEmpleador miCentro;
	private ArrayList<Candidato> misCandidatos;
	
	public Oferta(String codigo, String categoriaLaboral,String ofertaLaboral,String nivelEstudioReq, String provincia, Date fechaVencimiento, int cantVacantes, String jornada, int salario, String tipoContrato, String periodoCobro, CentroEmpleador miCentro, String estado) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento,estado);
		this.cantVacantes=cantVacantes;
		this.ofertaLaboral=ofertaLaboral;
		this.nivelEstudioReq=nivelEstudioReq;
		this.jornada=jornada;
		this.salario=salario;
		this.tipoContrato=tipoContrato;
		this.periodoCobro=periodoCobro;
		this.miCentro=miCentro;
		this.misCandidatos=new ArrayList<Candidato>();
	}

	public int getCantVacantes() {
		return cantVacantes;
	}

	public String getNivelEstudioReq() {
		return nivelEstudioReq;
	}

	public String getJornada() {
		return jornada;
	}

	public int getSalario() {
		return salario;
	}

	public String getTipoContrato() {
		return tipoContrato;
	}

	public String getPeriodoCobro() {
		return periodoCobro;
	}

	public CentroEmpleador getMiCentro() {
		return miCentro;
	}

	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}

	public String getOfertaLaboral() {
		return ofertaLaboral;
	}
	

}
