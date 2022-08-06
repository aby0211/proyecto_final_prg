package logico;

import java.io.Serializable;
import java.util.Date;

public abstract class Usuario implements Serializable{

	private static final long serialVersionUID = 2709757328464730776L;
	protected String nombre;
	protected String cedula;
	protected String sexo;
	protected String provincia;
	protected String direccion;
	protected String telefono;
	protected String username;
	protected String password;
	protected Date fechaNacimiento;
	
	public Usuario(String nombre,String cedula, String sexo, String provincia, String direccion, String telefono,
			String username, String password, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.provincia = provincia;
		this.direccion = direccion;
		this.telefono = telefono;
		this.cedula=cedula;
		this.username = username;
		this.password = password;
		this.fechaNacimiento=fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public String getProvincia() {
		return provincia;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
}
