package logico;

import java.util.Date;

public class Postulacion extends Solicitud {

	
	private int salarioMinimo;
	private int annosExp;
	public Postulacion(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento, int salarioMinimo, int annosExp, String estado) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento,estado);
		this.salarioMinimo=salarioMinimo;
		this.annosExp=annosExp;
	}
	public int getSalarioMinimo() {
		return salarioMinimo;
	}
	public int getAnnosExp() {
		return annosExp;
	}
	

}
