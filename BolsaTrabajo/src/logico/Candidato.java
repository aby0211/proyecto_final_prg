package logico;

import java.util.ArrayList;
import java.util.Date;

public class Candidato extends Usuario {


	protected boolean viajarDisp;
	protected boolean vehiculoPropio;
	protected ArrayList<Postulacion> misPostulaciones;
	protected boolean empleado;
	
	
	public Candidato(String nombre,String cedula, String sexo, String provincia, String direccion, String telefono,
			String username, String password,  boolean viajarDisp, boolean vehiculoPropio, Date fechaNacimiento) {
		super(nombre,cedula, sexo, provincia, direccion, telefono, username, password, fechaNacimiento);

		this.viajarDisp=viajarDisp;
		this.vehiculoPropio=vehiculoPropio;
		this.misPostulaciones=new ArrayList<Postulacion>();
		this.empleado=false;
	}

	

	public boolean isViajarDisp() {
		return viajarDisp;
	}

	public boolean isVehiculoPropio() {
		return vehiculoPropio;
	}

	public ArrayList<Postulacion> getMisPostulaciones() {
		return misPostulaciones;
	}

	public boolean isEmpleado() {
		return empleado;
	}

	public void setEmpleado(boolean empleado) {
		this.empleado = empleado;
	}
	
	

	
}
