package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Postulacion {


	public Obrero(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String estado,Candidato miCandidato,ArrayList<String> oficio) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado, miCandidato);
	}

	private ArrayList<String> oficio;

	public ArrayList<String> getOficio() {
		return oficio;
	}
	
	public void addOficio(String item) {
		oficio.add(item);
	}
	

	
	

}
