package logico;

import java.util.ArrayList;

public class CentroEmpleador extends Usuario{

	private String nombreEmpresa;
	private String rnc;
	private String categoriaLaboral;
	private ArrayList<Solicitud> misSolicitudes;
	private ArrayList<Candidato> misCandidatos;
	
	public CentroEmpleador(String nombre,String cedula, String sexo,String nombreEmpresa, String provincia, String direccion, String telefono,
		 String username, String password, String rnc, String categoriaLaboral) {
		super(nombre,cedula, sexo, provincia, direccion, telefono, username, password);
		this.rnc=rnc;
		this.nombreEmpresa=nombreEmpresa;
		this.categoriaLaboral=categoriaLaboral;
		this.misCandidatos=new ArrayList<Candidato>();
		this.misSolicitudes=new ArrayList<Solicitud>();
		
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

	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}

	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}

	
	
}
