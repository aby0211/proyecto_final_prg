package logico;

import java.util.Date;

public class Administrador extends Usuario {

	public Administrador(String nombre,String cedula, String sexo, String provincia, String direccion, String telefono,
			String username, String password, Date fechaNacimiento) {
		super(nombre,cedula, sexo, provincia, direccion, telefono, username, password,fechaNacimiento);
	}

}
