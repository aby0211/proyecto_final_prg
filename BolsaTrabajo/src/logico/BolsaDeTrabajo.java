package logico;

import java.util.ArrayList;

public class BolsaDeTrabajo {

	private ArrayList<Candidato> misCandidatos;
	private ArrayList<CentroEmpleador> misCentrosEmpleadores;
	private ArrayList<Solicitud> misSolicitudes;
	private int idSolicitud;
	public BolsaDeTrabajo() {
		super();
		this.misCandidatos = new ArrayList<Candidato>();
		this.misCentrosEmpleadores = new ArrayList<CentroEmpleador>();
		this.misSolicitudes = new ArrayList<Solicitud>();
	}
	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}
	public ArrayList<CentroEmpleador> getMisCentrosEmpleadores() {
		return misCentrosEmpleadores;
	}
	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}
	public int getIdSolicitud() {
		return idSolicitud;
	}
	
	
}
