package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Administrador;
import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.CentroEmpleador;
import logico.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JComboBox;

public class DetalleUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nacimiento;
	private JTextField telefono;
	private JTextField direccion;
	private JTextField cedula;
	private JTextField nombre;
	private JTextField tipoCuenta;
	private JTextField provincia;
	private JTextField genero;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public DetalleUsuario(Usuario usuario) {
		setBounds(100, 100, 588, 306);
		getContentPane().setLayout(new BorderLayout());
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/userIcon.png")));

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			nacimiento = new JTextField();
			nacimiento.setText(usuario.getFechaNacimiento().toString());
			nacimiento.setEditable(false);
			nacimiento.setColumns(10);
			nacimiento.setBounds(10, 219, 260, 25);
			panel.add(nacimiento);
			
			JLabel label = new JLabel("Fecha de nacimiento:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label.setBounds(10, 194, 127, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("G\u00E9nero:");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_1.setBounds(10, 133, 108, 14);
			panel.add(label_1);
			
			telefono = new JTextField();
			telefono.setText((String) null);
			telefono.setEditable(false);
			telefono.setColumns(10);
			telefono.setBounds(280, 156, 266, 25);
			panel.add(telefono);
			
			JLabel label_2 = new JLabel("Tel\u00E9fono:");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_2.setBounds(280, 133, 108, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("Provincia:");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_3.setBounds(10, 72, 139, 14);
			panel.add(label_3);
			
			direccion = new JTextField();
			direccion.setText((String) null);
			direccion.setEditable(false);
			direccion.setColumns(10);
			direccion.setBounds(280, 97, 266, 25);
			panel.add(direccion);
			
			JLabel label_4 = new JLabel("Direcci\u00F3n:");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_4.setBounds(280, 72, 108, 14);
			panel.add(label_4);
			
			cedula = new JTextField();
			cedula.setText((String) null);
			cedula.setEditable(false);
			cedula.setColumns(10);
			cedula.setBounds(280, 36, 266, 25);
			panel.add(cedula);
			
			JLabel label_5 = new JLabel("Documento de identidad:");
			label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_5.setBounds(280, 11, 169, 14);
			panel.add(label_5);
			
			nombre = new JTextField();
			nombre.setText((String) null);
			nombre.setEditable(false);
			nombre.setColumns(10);
			nombre.setBounds(10, 36, 260, 25);
			panel.add(nombre);
			
			JLabel label_6 = new JLabel("Nombre y apellido:");
			label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_6.setBounds(10, 11, 127, 14);
			panel.add(label_6);
			
			tipoCuenta = new JTextField();
			tipoCuenta.setEditable(false);
			tipoCuenta.setColumns(10);
			tipoCuenta.setBounds(280, 219, 260, 25);
			panel.add(tipoCuenta);
			
			JLabel lblTipoDeCuenta = new JLabel("Tipo de cuenta:");
			lblTipoDeCuenta.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTipoDeCuenta.setBounds(280, 194, 127, 14);
			panel.add(lblTipoDeCuenta);
			
			provincia = new JTextField();
			provincia.setText((String) null);
			provincia.setEditable(false);
			provincia.setColumns(10);
			provincia.setBounds(10, 97, 260, 25);
			panel.add(provincia);
			
			genero = new JTextField();
			genero.setText((String) null);
			genero.setEditable(false);
			genero.setColumns(10);
			genero.setBounds(10, 156, 260, 25);
			panel.add(genero);
			
			nombre.setText(usuario.getNombre());
			cedula.setText(usuario.getCedula());
			direccion.setText(usuario.getDireccion());
			provincia.setText(usuario.getProvincia());
			genero.setText(usuario.getSexo());
			telefono.setText(usuario.getTelefono());
			if(usuario instanceof Candidato) {
				tipoCuenta.setText("Candidato");
			}
			if(usuario instanceof CentroEmpleador) {
				tipoCuenta.setText("Empresa");			}
			if(usuario instanceof Administrador) {
				tipoCuenta.setText("Administrador");			}
		}	
	}
}
