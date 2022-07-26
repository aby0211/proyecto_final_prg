package logico;

import java.util.ArrayList;

public class CentroEmpleador {

	private String codigo;
	private String email;
	private String password;
	private String rnc;
	private String nombre;
	private String provincia;
	private String categoriaLaboral;
	private String telefono;
	private ArrayList<Solicitud> misSolicitudes;
	private ArrayList<Candidato> misCandidatos;
	public CentroEmpleador(String codigo, String email, String password, String rnc, String nombre, String provincia,
			String categoriaLaboral, String telefono) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.password = password;
		this.rnc = rnc;
		this.nombre = nombre;
		this.provincia = provincia;
		this.categoriaLaboral = categoriaLaboral;
		this.telefono = telefono;
		this.misSolicitudes=new ArrayList<Solicitud>();
		this.misCandidatos=new ArrayList<Candidato>();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCategoriaLaboral() {
		return categoriaLaboral;
	}
	public void setCategoriaLaboral(String categoriaLaboral) {
		this.categoriaLaboral = categoriaLaboral;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getRnc() {
		return rnc;
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}
	public ArrayList<Candidato> getMisCandidatos() {
		return misCandidatos;
	}
	
	
	
}
