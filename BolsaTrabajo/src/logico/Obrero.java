package logico;

import java.util.ArrayList;
import java.util.Date;

public class Obrero extends Postulacion {


	public Obrero(String codigo, String categoriaLaboral, String provincia, Date fechaVencimiento,
			int salarioMinimo, int annosExp, String estado,Candidato miCandidato) {
		super(codigo, categoriaLaboral, provincia, fechaVencimiento, salarioMinimo, annosExp, estado, miCandidato);
		this.oficio=new ArrayList<String>();
	}

	private ArrayList<String> oficio;

	public ArrayList<String> getOficio() {
		return oficio;
	}
	
	public void copiarLista(ArrayList<String> lista) {
		for(int i =0;i<lista.size();i++) {
			oficio.add(lista.get(i));
		}
	}

	

	

	
	

}
