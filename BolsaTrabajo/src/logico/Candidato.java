package logico;

import java.sql.Date;
import java.util.ArrayList;

public abstract class Candidato {

	protected String codigo;
	protected String nombre;
	protected String sexo;
	protected String password;
	protected String email;
	protected String provincia;
	protected boolean vehiculoPropio;
	protected String nivelEstudio;
	protected int annosExperiencia;
	protected String telefono;
	protected float rangoSalarioMinimo;
	protected boolean ViajarDisp;
	protected ArrayList<Solicitud> misSolicitudes;
	public Candidato(String codigo, String nombre, String sexo, String password, String email,
			String provincia, boolean vehiculoPropio, String nivelEstudio, int annosExperiencia, String telefono, int rangoSalarioMinimo, boolean viajarDisp) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.sexo = sexo;
		this.password = password;
		this.email = email;
		this.provincia = provincia;
		this.vehiculoPropio = vehiculoPropio;
		this.nivelEstudio = nivelEstudio;

		this.annosExperiencia= annosExperiencia;
		this.telefono = telefono;
		this.rangoSalarioMinimo = rangoSalarioMinimo;
		ViajarDisp = viajarDisp;
		this.misSolicitudes = new ArrayList<Solicitud>();
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
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

	public int getAnnosExperiencia() {
		return annosExperiencia;
	}
	public void setAnnosExperiencia(int annosExperiencia) {
		this.annosExperiencia = annosExperiencia;
	}
	
	public float getRangoSalarioMinimo() {
		return rangoSalarioMinimo;
	}
	public void setRangoSalarioMinimo(int rangoSalarioMinimo) {
		this.rangoSalarioMinimo = rangoSalarioMinimo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
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
