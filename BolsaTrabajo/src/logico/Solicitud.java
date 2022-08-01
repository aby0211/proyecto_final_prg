package logico;

import java.io.Serializable;
import java.util.Date;

public abstract class Solicitud implements Serializable {
	private static final long serialVersionUID = -17876355794681696L;
	protected String codigo;
	protected String categoriaLaboral;
	protected String provincia;
	protected Date fechaVencimiento;
	protected String estado;
	
	public Solicitud(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento, String estado) {
		super();
		this.codigo = codigo;
		this.categoriaLaboral = categoriaLaboral;
		this.provincia = provincia;
		this.fechaVencimiento = fechaVencimiento;
		this.estado=estado;
	}
	public String getCodigo() {
		return codigo;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
