package logico;

import java.sql.Date;

public abstract class Solicitud {
	protected String codigo;
	protected String ofertaLaboral;
	protected String categoriaLaboral;
	protected String provincia;
	protected Date fechaVencimiento;
	protected int cantVacantes;
	protected String jornada;
	protected float salario;
	protected String tipoContrato;
	protected String periodoCobro;
	protected CentroEmpleador miCentro;
	public Solicitud(String codigo, String ofertaLaboral, String categoriaLaboral, String provincia,
			Date fechaVencimiento, int cantVacantes, String jornada, float salario, String tipoContrato,
			String periodoCobro, CentroEmpleador miCentro) {
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
	public float getSalario() {
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
	
	
	
}
