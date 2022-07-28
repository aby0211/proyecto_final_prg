package logico;

import java.util.ArrayList;

public class BolsaDeTrabajo {

	private ArrayList<Candidato> misCandidatos;
	private ArrayList<CentroEmpleador> misCentrosEmpleadores;
	private ArrayList<Solicitud> misSolicitudes;
	private int idSolicitud;
	private int idCE;
	private int idCandidato;
	private static BolsaDeTrabajo bolsa = null;
	public BolsaDeTrabajo() {
		super();
		this.misCandidatos = new ArrayList<Candidato>();
		this.misCentrosEmpleadores = new ArrayList<CentroEmpleador>();
		this.misSolicitudes = new ArrayList<Solicitud>();
		this.idCandidato=1;
		this.idCE=1;
		this.idSolicitud=1;
	}
	
	public static BolsaDeTrabajo getInstance(){
		if(bolsa == null){
			bolsa = new BolsaDeTrabajo();
		}
		return bolsa;
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

	public int getIdCE() {
		return idCE;
	}

	public int getIdCandidato() {
		return idCandidato;
	}
	
	public boolean verificarLogin(String email ,String password) {
		boolean match = false;
		if(buscarEmpresaByEmail(email)!=null) {
			if(buscarEmpresaByEmail(email).getPassword().equals(password)) {
				match = true;
			}
		}
		
		return match;
	}

	public CentroEmpleador buscarEmpresaByEmail(String email) {
		CentroEmpleador auxEmpresa=null;
		int i = 0;
		boolean encontrado = false;
		while(encontrado!=true&&i<BolsaDeTrabajo.getInstance().getMisCentrosEmpleadores().size()) {
			if(BolsaDeTrabajo.getInstance().getMisCentrosEmpleadores().get(i).getEmail().equalsIgnoreCase(email)) {
				auxEmpresa=BolsaDeTrabajo.getInstance().getMisCentrosEmpleadores().get(i);
				encontrado=true;
			}
			i++;
		}
		return auxEmpresa;
	}
	
	
	
}
