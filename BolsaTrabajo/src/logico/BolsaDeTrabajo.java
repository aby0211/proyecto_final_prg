package logico;

import java.util.ArrayList;

public class BolsaDeTrabajo {

	private ArrayList<Usuario> misUsuarios;
	private ArrayList<Solicitud> misSolicitudes;
	private int idSolicitud;
	private static BolsaDeTrabajo bolsa = null;
	public BolsaDeTrabajo() {
		super();
		this.misUsuarios = new ArrayList<Usuario>();
		this.misSolicitudes = new ArrayList<Solicitud>();
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
	
	public Solicitud buscarSolicitudEnCandidato(Candidato user, String codigo) {
		Solicitud solicitud = null;
		int i =0;
		boolean encontrado = false;
		while(encontrado!=true&&i<user.getMisPostulaciones().size()) {
			if(user.getMisPostulaciones().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				solicitud=user.getMisPostulaciones().get(i);
				encontrado=true;
			}
			i++;
		}
		return solicitud;
	}
	
	public Solicitud buscarSolicitudEnEmpresa(CentroEmpleador user, String codigo) {
		Solicitud solicitud = null;
		int i =0;
		boolean encontrado = false;
		while(encontrado!=true&&i<user.getMisOfertas().size()) {
			if(user.getMisOfertas().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				solicitud=user.getMisOfertas().get(i);
				encontrado=true;
			}
			i++;
		}
		return solicitud;
	}
	
	public void aumentarCodSol() {
		idSolicitud++;
	}
	
	public void eliminarSolicitudEnCandidato(Candidato user,String codigo) {
		if(buscarSolicitudEnCandidato(user, codigo)!=null) {
			user.getMisPostulaciones().remove(buscarSolicitudEnCandidato(user, codigo));
		}
	}
	
	public void eliminarSolicitudEnCandidato(CentroEmpleador user,String codigo) {
		if(buscarSolicitudEnEmpresa(user, codigo)!=null) {
			user.getMisOfertas().remove(buscarSolicitudEnEmpresa(user, codigo));
		}
	}
	
	public void eliminarSolicitudGlobal(String codigo) {
		if(buscarSolicitudByCodigo(codigo)!=null) {
			BolsaDeTrabajo.getInstance().getMisSolicitudes().remove(buscarSolicitudByCodigo(codigo));
		}
	}
	
	
}
