package logico;

import java.util.ArrayList;

public class BolsaDeTrabajo {

	private ArrayList<Usuario> misUsuarios;
	private ArrayList<Solicitud> misSolicitudes;
	private int idSolicitud;
	private int idCE;
	private int idCandidato;
	private static BolsaDeTrabajo bolsa = null;
	public BolsaDeTrabajo() {
		super();
		this.misUsuarios = new ArrayList<Usuario>();
		this.misSolicitudes = new ArrayList<Solicitud>();
		this.idCandidato=1;
		this.idCE=1;
		this.idSolicitud=1;
	}
	
	public static BolsaDeTrabajo getInstance(){
		if(bolsa == null){
			Administrador defaultUser = new Administrador("admin","NO", "NO", "Local", "Local", "Local", "admin", "admin");
			bolsa = new BolsaDeTrabajo();
			bolsa.getMisUsuarios().add(defaultUser);
		}
		return bolsa;
	}
	
	public ArrayList<Usuario> getMisUsuarios() {
		return misUsuarios;
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
	
	
	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}

	public boolean verificarLogin(String username ,String password) {
		boolean match = false;
		if(buscarUsuarioByUser(username)!=null) {
			if(buscarUsuarioByUser(username).getPassword().compareTo(password)==0) {
				match = true;
			}
		}
		
		return match;
	}

	public Usuario buscarUsuarioByUser(String username) {
		int i = 0;
		Usuario auxUsuario=null;
		boolean encontrado = false;
		while(encontrado!=true&&i<BolsaDeTrabajo.getInstance().getMisUsuarios().size()) {
			if(BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getUsername().equalsIgnoreCase(username)) {
				auxUsuario=BolsaDeTrabajo.getInstance().getMisUsuarios().get(i);
			}
			i++;
		}
		return auxUsuario;
	}
	
	public Solicitud buscarSolicitudByCodigo(String codigo) {
		Solicitud solicitud = null;
		int i =0;
		boolean encontrado = false;
		while(encontrado!=true&&i<BolsaDeTrabajo.getInstance().getMisUsuarios().size()) {
			if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				solicitud=BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i);
				encontrado=true;
			}
			i++;
		}
		return solicitud;
	}
	
	
}
