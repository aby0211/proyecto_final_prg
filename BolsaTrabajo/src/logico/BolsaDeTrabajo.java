package logico;

import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BolsaDeTrabajo implements Serializable{

	private ArrayList<Usuario> misUsuarios;
	private ArrayList<Solicitud> misSolicitudes;
	private int idSolicitud;
	private static BolsaDeTrabajo bolsa = null;
	private static final long serialVersionUID = -6634036610616475881L;
	private int cantTecnicosE;
	private int cantUniversitariosE;
	private int cantObrerosE;
	private int hombresE;
	private int mujeresE;
	private int otrosE;
	public BolsaDeTrabajo() {
		super();
		this.misUsuarios = new ArrayList<Usuario>();
		this.misSolicitudes = new ArrayList<Solicitud>();
		this.idSolicitud=1;
		this.cantTecnicosE=0;
		this.cantUniversitariosE=0;
		this.cantObrerosE=0;
		this.hombresE=0;
		this.mujeresE=0;
		this.otrosE=0;
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

	public int getHombresE() {
		return hombresE;
	}
	
	public int getOtrosE() {
		return otrosE;
	}
	
	public void aumentarHombresE() {
		hombresE++;
	}
	
	public void aumentarMujeresE() {
		mujeresE++;
	}
	
	public void aumentarOtrosE() {
		otrosE++;
	}
	

	public int getMujeresE() {
		return mujeresE;
	}

	public int getCantUniversitariosE() {
		return cantUniversitariosE;
	}
	
	public void aumentarCantUniversitariosE() {
		cantUniversitariosE++;
	}

	public int getCantTecnicosE() {
		return cantTecnicosE;
	}

	public void aumentarCantTecnicosE() {
		cantTecnicosE++;
	}
	
	public void aumentarCantObrerosE() {
		cantObrerosE++;
	}
	
	public int getCantObrerosE() {
		return cantObrerosE;
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

	public static void setInstanciaGlobal(BolsaDeTrabajo bolsa) {
		BolsaDeTrabajo.bolsa = bolsa;
	}
	
	//Fichero
	
	public void cargarBolsa()  {
		FileInputStream file;
		ObjectInputStream oos;
		try {
			file = new FileInputStream("Bolsa.dat");
			oos = new ObjectInputStream(file);
			BolsaDeTrabajo.setInstanciaGlobal((BolsaDeTrabajo)oos.readObject());
			oos.close();
		} catch(IOException | ClassNotFoundException e) 
		{
			BolsaDeTrabajo.getInstance().guardarBolsa();
		}
	}

	public void guardarBolsa() {
	FileOutputStream file;
	try {
		file = new FileOutputStream("Bolsa.dat");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(BolsaDeTrabajo.getInstance());
		oos.close();
	} catch(IOException e)
	{
		e.printStackTrace();
	}
	
	//Metodos buscar
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
	
	public Candidato buscarCandidatoByPostulacion(String codigo) {
		int i = 0;
		Candidato auxUsuario=null;
		boolean encontrado = false;
		while(encontrado!=true&&i<BolsaDeTrabajo.getInstance().getMisSolicitudes().size()) {
			if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Postulacion) {
				if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo().equalsIgnoreCase(codigo)) {
					auxUsuario=(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getMiCandidato());
				}
			}
			i++;
		}
		return auxUsuario;
	}
	
	public Postulacion buscarPostulacionByCodigo(String codigo) {
		int i = 0;
		Postulacion auxUsuario=null;
		boolean encontrado = false;
		while(encontrado!=true&&i<BolsaDeTrabajo.getInstance().getMisSolicitudes().size()) {
			if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Postulacion) {
				if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo().equalsIgnoreCase(codigo)) {
					
					auxUsuario=(Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i);
				}
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
	public Postulacion buscarPostulacionEnOferta(Oferta oferta, String codigo) {
		Postulacion solicitud = null;
		int i =0;
		boolean encontrado = false;
		while(encontrado!=true&&i<oferta.getMisPostulaciones().size()) {
			if(oferta.getMisPostulaciones().get(i).getCodigo().equalsIgnoreCase(codigo)) {
				solicitud=oferta.getMisPostulaciones().get(i);
				encontrado=true;
			}
			i++;
		}
		return solicitud;
	}
	
	public void aumentarCodSol() {
		idSolicitud++;
	}
	
	//Metodos eliminar
	
	public void eliminarSolicitudEnCandidato(Candidato user,String codigo) {
		if(buscarSolicitudEnCandidato(user, codigo)!=null) {
			user.getMisPostulaciones().remove(buscarSolicitudEnCandidato(user, codigo));
		}
	}
	
	public void eliminarSolicitudEnEmpresa(CentroEmpleador user,String codigo) {
		if(buscarSolicitudEnEmpresa(user, codigo)!=null) {
			user.getMisOfertas().remove(buscarSolicitudEnEmpresa(user, codigo));
		}
	}
	
	public void eliminarSolicitudGlobal(String codigo) {
		if(buscarSolicitudByCodigo(codigo)!=null) {
			BolsaDeTrabajo.getInstance().getMisSolicitudes().remove(buscarSolicitudByCodigo(codigo));
		}
	}
	
	//Finalizar contratacion
	
	public void aumerCantEPorTipo(Postulacion post) {
		if(post instanceof Universitario) {
			aumentarCantUniversitariosE();
		}else if(post instanceof Tecnico) {
			aumentarCantTecnicosE();
		}else if(post instanceof Obrero) {
			aumentarCantObrerosE();
		}
	}
	
	public void aumentarCantEPorSexo(Postulacion post) {
		if(post.getMiCandidato().getSexo().equalsIgnoreCase("Hombre")) {
			aumentarHombresE();
		}else if(post.getMiCandidato().getSexo().equalsIgnoreCase("Mujer")) {
			aumentarMujeresE();
		}else if(post.getMiCandidato().getSexo().equalsIgnoreCase("Otro")) {
			aumentarOtrosE();
		}
	}
	
	public void confirmarContratacion(Oferta oferta,Postulacion post) {
		oferta.getMiCentro().getMisCandidatos().add(post.getMiCandidato());
		oferta.getMisPostulaciones().remove(post);
		aumerCantEPorTipo(post);
		aumentarCantEPorSexo(post);
		oferta.disminuirCantVacantes();
		post.getMiCandidato().setEmpleado(true);
		buscarCandidatoByPostulacion(post.getCodigo()).setEmpleado(true);
		holdPostCandidato(post);
		
	}
	
	public void holdPostCandidato(Postulacion post) {
		for(int i =0; buscarCandidatoByPostulacion(post.getCodigo()).getMisPostulaciones().size()>i;i++) {
			buscarCandidatoByPostulacion(post.getCodigo()).getMisPostulaciones().get(i).setEstado("Detenido");
			buscarPostulacionByCodigo(post.getCodigo()).setEstado("Completado");
			buscarCandidatoByPostulacion(post.getCodigo()).setEmpleado(true);
		}
		post.setEstado("Completada");
	}
	
	
	//Algoritmo de candidato mejor match
	
	public void algoritmoBuscarMejorCandidato(Oferta oferta) {
		int i;
		int j;
		int porcientoMayor=0;
		int porciento=0;
		boolean encontrado=false;
		Postulacion auxPost=null;
		for(j=0;oferta.getCantVacantes()>j;j++) {
			for(i=0;BolsaDeTrabajo.getInstance().getMisSolicitudes().size()>i;i++) {
				if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Postulacion) {
					if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Universitario) {
						if(BolsaDeTrabajo.getInstance().buscarPostulacionEnOferta(oferta, BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo())==null) {
							if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getEstado().equalsIgnoreCase("Enviada")){
								
								if(oferta.getCategoriaLaboral().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCategoriaLaboral())) {
									porciento+=30;
								}
								if(oferta.getProvincia().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getProvincia())) {
									porciento+=10;
								}
								if(oferta.getAnnosExperiencia()>=(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getAnnosExp())) {
									porciento+=10;
								}
								if(oferta.getSalario()<(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getSalarioMinimo())) {
									porciento+=20;
								}
								if(oferta.getHabilidadRequerida().equalsIgnoreCase(((Universitario)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getCarrera())){
									porciento+=30;
								}
								if(porciento>porcientoMayor) {
									porcientoMayor=porciento;
									auxPost=(Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i);
									porciento=0;
								
								}
							}	
						}	
					}
					
					if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Tecnico) {
						if(BolsaDeTrabajo.getInstance().buscarPostulacionEnOferta(oferta, BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo())==null) {
							if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getEstado().equalsIgnoreCase("Enviada")){
								
								if(oferta.getCategoriaLaboral().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCategoriaLaboral())) {
									porciento+=20;
								}
								
								if(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getMiCandidato().isVehiculoPropio()) {
									porciento+=10;
								}
								
								if(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getMiCandidato().isViajarDisp()) {
									porciento+=10;
								}
								
								if(oferta.getProvincia().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getProvincia())) {
									porciento+=5;
								}
								if(oferta.getAnnosExperiencia()>=(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getAnnosExp())) {
									porciento+=5;
								}
								if(oferta.getSalario()<(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getSalarioMinimo())) {
									porciento+=20;
								}
								if(oferta.getHabilidadRequerida().equalsIgnoreCase(((Tecnico)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getAreaTecnica())){
									porciento+=30;
								}
								if(porciento>porcientoMayor) {
									porcientoMayor=porciento;
									auxPost=(Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i);
									porciento=0;
								
								}
							}	
						}	
					}
					
					if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Obrero) {
						if(BolsaDeTrabajo.getInstance().buscarPostulacionEnOferta(oferta, BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo())==null) {
							if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getEstado().equalsIgnoreCase("Enviada")){
								
								if(oferta.getCategoriaLaboral().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCategoriaLaboral())) {
									porciento+=30;
								}
								if(oferta.getProvincia().equalsIgnoreCase(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getProvincia())) {
									porciento+=10;
								}
								if(oferta.getAnnosExperiencia()>=(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getAnnosExp())) {
									porciento+=10;
								}
								if(oferta.getSalario()<(((Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getSalarioMinimo())) {
									porciento+=20;
								}
								int k = 0;
								while(encontrado!=true&&(((Obrero)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getOficio().size())>k) {
									if(((Obrero)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)).getOficio().get(k).equalsIgnoreCase(oferta.getHabilidadRequerida())) {
										porciento+=30;
										encontrado=true;
									}
									k++;
								}
								encontrado=false;
								
								if(porciento>porcientoMayor) {
									porcientoMayor=porciento;
									auxPost=(Postulacion)BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i);
									porciento=0;
								
								}
							}	
						}	
					}
					
					
				}
				
			}
			if(porcientoMayor>=oferta.getPorcientoMatch()) {
				oferta.getMisPostulaciones().add(auxPost);
				porcientoMayor=0;
			}
			
		}
	}
	
	
}
