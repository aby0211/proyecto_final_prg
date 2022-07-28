package logico;

import java.util.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Solicitud {
	private String codigo;
	private String ofertaLaboral;
	private String categoriaLaboral;
	private String provincia;
	private Date fechaVencimiento;
	private int cantVacantes;
	private String jornada;
	private int salario;
	private String tipoContrato;
	private String periodoCobro;
	private CentroEmpleador miCentro;
	private String estado;
	private ArrayList<Candidato> misCandidatos;
	
	public Solicitud(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia,
			Date fechaVencimiento, int cantVacantes, String jornada, int salario, String tipoContrato,
			String periodoCobro, CentroEmpleador miCentro, String estado) {
		super();
		this.codigo = codigo;
		this.ofertaLaboral = ofertaLaboral;
		this.categoriaLaboral = categoriaLaboral;
		this.provincia = provincia;
		this.fechaVencimiento = fechaVencimiento;
		this.cantVacantes = cantVacantes;
		this.jornada = jornada;
		this.salario = salario;
		this.tipoContrato = tipoContrato;
		this.periodoCobro = periodoCobro;
		this.miCentro = miCentro;
		this.misCandidatos=new ArrayList<Candidato>();
		this.estado=estado;
		
	}
	public String getCodigo() {
		return codigo;
	}
	public String getOfertaLaboral() {
		return ofertaLaboral;
	}
	public String getCategoriaLaboral() {
		return categoriaLaboral;
	}
	public String getProvincia() {
		return provincia;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public int getCantVacantes() {
		return cantVacantes;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
