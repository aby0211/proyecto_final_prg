package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Postulacion {


	public Obrero(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String estado) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado);
		this.oficio=new ArrayList<ItemOficio>();
	}

	private ArrayList<ItemOficio> oficio;

	public ArrayList<ItemOficio> getOficio() {
		return oficio;
	}
	
	

	
	

}
