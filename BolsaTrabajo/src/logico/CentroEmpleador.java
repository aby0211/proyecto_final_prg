package logico;

import java.util.ArrayList;
import java.util.Date;

public class CentroEmpleador extends Usuario{

	private String nombreEmpresa;
	private String rnc;
	private String categoriaLaboral;
	private ArrayList<Oferta> misOfertas;
	private ArrayList<Candidato> misCandidatos;
	
	public CentroEmpleador(String nombre,String cedula, String sexo,String nombreEmpresa, String provincia, String direccion, String telefono,
		 String username, String password, String rnc, String categoriaLaboral, Date fechaNacimiento) {
		super(nombre,cedula, sexo, provincia, direccion, telefono, username, password, fechaNacimiento);
		this.rnc=rnc;
		this.nombreEmpresa=nombreEmpresa;
		this.categoriaLaboral=categoriaLaboral;
		this.misCandidatos=new ArrayList<Candidato>();
		this.misOfertas=new ArrayList<Oferta>();
		
	}

	public String getRnc() {
		return rnc;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public String getCategoriaLaboral() {
		return categoriaLaboral;
	}

	public ArrayList<Oferta> getMisOfertas() {
		return misOfertas;
	}

	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}

	
	
}
