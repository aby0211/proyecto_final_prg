package logico;

import java.sql.Date;
import java.util.ArrayList;

public abstract class Candidato {

	protected String codigo;
	protected String nombre;
	protected char sexo;
	protected Date fechaNacimiento;
	protected String password;
	protected String email;
	protected String provincia;
	protected boolean vehiculoPropio;
	protected String nivelEstudio;
	protected String centroEducativo;
	protected int annosExperiencia;
	protected String estadoCivil;
	protected String telefono;
	protected String rangoSalarioMinimo;
	protected boolean ViajarDisp;
	protected ArrayList<Solicitud> misSolicitudes;
	public Candidato(String codigo, String nombre, char sexo, Date fechaNacimiento, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, String centroEducativo, int annosExperiencia ,
			String estadoCivil, String telefono, String rangoSalarioMinimo, boolean viajarDisp) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.password = password;
		this.email = email;
		this.provincia = provincia;
		this.vehiculoPropio = vehiculoPropio;
		this.nivelEstudio = nivelEstudio;
		this.centroEducativo = centroEducativo;
		this.annosExperiencia= annosExperiencia;
		this.estadoCivil = estadoCivil;
		this.telefono = telefono;
		this.rangoSalarioMinimo = rangoSalarioMinimo;
		ViajarDisp = viajarDisp;
		this.misSolicitudes = new ArrayList<Solicitud>();
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getNivelEstudio() {
		return nivelEstudio;
	}
	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}
	public String getCentroEducativo() {
		return centroEducativo;
	}
	public void setCentroEducativo(String centroEducativo) {
		this.centroEducativo = centroEducativo;
	}

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}
	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getRangoSalarioMinimo() {
		return rangoSalarioMinimo;
	}
	public void setRangoSalarioMinimo(String rangoSalarioMinimo) {
		this.rangoSalarioMinimo = rangoSalarioMinimo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public boolean isVehiculoPropio() {
		return vehiculoPropio;
	}
	public String getTelefono() {
		return telefono;
	}
	public boolean isViajarDisp() {
		return ViajarDisp;
	}
	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}
	
}
