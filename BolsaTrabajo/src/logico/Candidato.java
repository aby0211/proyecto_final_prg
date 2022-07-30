package logico;

import java.util.ArrayList;

public class Candidato extends Usuario {

	protected float rangoSalarioMinimo;
	protected boolean viajarDisp;
	protected boolean vehiculoPropio;
	protected ArrayList<Solicitud> misSolicitudes;
	protected boolean empleado;
	
	
	public Candidato(String nombre,String cedula, String sexo, String provincia, String direccion, String telefono,
			String username, String password, float rangoSalarioMinimo, boolean viajarDisp, boolean vehiculoPropio) {
		super(nombre,cedula, sexo, provincia, direccion, telefono, username, password);
		this.rangoSalarioMinimo=rangoSalarioMinimo;
		this.viajarDisp=viajarDisp;
		this.vehiculoPropio=vehiculoPropio;
		this.misSolicitudes=new ArrayList<Solicitud>();
		this.empleado=false;
	}

	public float getRangoSalarioMinimo() {
		return rangoSalarioMinimo;
	}

	public boolean isViajarDisp() {
		return viajarDisp;
	}

	public boolean isVehiculoPropio() {
		return vehiculoPropio;
	}

	public ArrayList<Solicitud> getMisSolicitudes() {
		return misSolicitudes;
	}

	public boolean isEmpleado() {
		return empleado;
	}

	
}
