package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.border.EtchedBorder;

import logico.Administrador;
import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.CentroEmpleador;
import logico.Obrero;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Registrar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreA;
	private JTextField txtDireccion;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtTelefono;
	private JTextField txtCedula;
	private JTextField txtNombreEmpresa;
	private JTextField txtRNC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Registrar dialog = new Registrar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Registrar() {
		setTitle("Registrarse");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/userIcon.png")));
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 626);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Registrar usuario como:");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel.setBounds(10, 27, 150, 14);
				panel.add(lblNewLabel);
			}
			JRadioButton rdbtnEmpresa = new JRadioButton("Empresa");
			rdbtnEmpresa.setSelected(true);
			JComboBox cbxProvincia = new JComboBox();
			cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
			JPanel panel_1 = new JPanel();
			JButton btnConfirmarReg = new JButton("Confirmar registro");
			
			JRadioButton rdbtnCandidato = new JRadioButton("Candidato");
			JRadioButton rdbtnAdminstrador = new JRadioButton("Adminstrador");
			JLabel lblCategoriaLaboral = new JLabel("Categoria Laboral:");
			JLabel lblVehiculoPropio = new JLabel("Disponibilidad para viajar:");
			JLabel lblNombreEmpresa = new JLabel("Nombre de la empresa:");
			txtRNC = new JTextField();
			txtNombreEmpresa = new JTextField();
			JSpinner spinner = new JSpinner();

			JRadioButton rdbtnViajar = new JRadioButton("Disponible");
			JRadioButton rdbtnVehiculo = new JRadioButton("Disponible");
			JLabel lblRnc = new JLabel("RNC:");
			JLabel lblVehiculo = new JLabel("Vehiculo Propio:");
			JComboBox cbxCategoriaLaboral = new JComboBox();
			JComboBox cbxGenero = new JComboBox();
			lblVehiculoPropio.setVisible(false);
			rdbtnViajar.setVisible(false);
			lblVehiculo.setVisible(false);
			rdbtnVehiculo.setVisible(false);
			txtNombreEmpresa.setVisible(true);
			lblNombreEmpresa.setVisible(true);
			txtRNC.setVisible(true);
			lblRnc.setVisible(true);
			cbxCategoriaLaboral.setVisible(true);
			lblCategoriaLaboral.setVisible(true);
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Hombre ", "Mujer", "Otro"}));
			btnConfirmarReg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnEmpresa.isSelected()) {
						
						CentroEmpleador auxUsuario = new CentroEmpleador(txtNombreA.getText(), txtCedula.getText(), cbxGenero.getSelectedItem().toString(), txtNombreEmpresa.getText(), cbxProvincia.getSelectedItem().toString(), txtDireccion.getText(), txtTelefono.getText(), txtUsername.getText(), txtPassword.getText(), txtRNC.getText(), cbxCategoriaLaboral.getSelectedItem().toString(),(Date) spinner.getValue());
						BolsaDeTrabajo.getInstance().getMisUsuarios().add(auxUsuario);
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "Usuario registrado como empleador exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);

						}
					else if(rdbtnCandidato.isSelected()) {
						Candidato auxUsuario = new Candidato(txtNombreA.getText(), txtCedula.getText(), cbxGenero.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), txtDireccion.getText(), txtTelefono.getText(), txtUsername.getText(), txtPassword.getText(), rdbtnViajar.isSelected(), rdbtnVehiculo.isSelected(),(Date) spinner.getValue());
						BolsaDeTrabajo.getInstance().getMisUsuarios().add(auxUsuario);
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "Usuario registrado como candidato exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					
					else if(rdbtnAdminstrador.isSelected()) {
						Administrador auxUsuario = new Administrador(txtNombreA.getText(), txtCedula.getText(), cbxGenero.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), txtDireccion.getText(), txtTelefono.getText(), txtUsername.getText(), txtPassword.getText(),(Date) spinner.getValue());
						BolsaDeTrabajo.getInstance().getMisUsuarios().add(auxUsuario);
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "Usuario registrado como adminsitrador exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					dispose();
					Registrar list=new Registrar();
					list.setVisible(true);
				}
				
				
			});
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			
			JLabel lblNombreApellido = new JLabel("Nombre y apellido:");
			JLabel lblDocumentoDeIdentificacion = new JLabel("Direcci\u00F3n:");
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			rdbtnCandidato.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnEmpresa.setSelected(false);
					rdbtnCandidato.setSelected(true);
					rdbtnAdminstrador.setSelected(false);
					setBounds(100, 100, 602, 530);
					btnConfirmarReg.setBounds(396, 440, 170, 31);
					panel_2.setVisible(true);

					lblVehiculoPropio.setVisible(true);
					rdbtnViajar.setVisible(true);
					rdbtnVehiculo.setVisible(true);
					panel_2.setBounds(10, 390, 556, 42);
					lblVehiculo.setVisible(true);
					txtNombreEmpresa.setVisible(false);
					lblNombreEmpresa.setVisible(false);
					txtRNC.setVisible(false);
					lblRnc.setVisible(false);
					cbxCategoriaLaboral.setVisible(false);
					lblCategoriaLaboral.setVisible(false);
					

				}
			});

			rdbtnEmpresa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBounds(100, 100, 602, 626);

					rdbtnCandidato.setSelected(false);
					rdbtnEmpresa.setSelected(true);
					rdbtnAdminstrador.setSelected(false);
					btnConfirmarReg.setBounds(396, 530, 170, 31);
					panel_2.setVisible(true);

					lblVehiculoPropio.setVisible(false);
					rdbtnViajar.setVisible(false);
					lblVehiculo.setVisible(false);
					panel_2.setBounds(10, 390, 556, 132);
					txtNombreEmpresa.setVisible(true);
					rdbtnVehiculo.setVisible(false);
					lblNombreEmpresa.setVisible(true);
					txtRNC.setVisible(true);
					lblRnc.setVisible(true);
					cbxCategoriaLaboral.setVisible(true);
					lblCategoriaLaboral.setVisible(true);
	
				}
			});
			
			rdbtnEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnEmpresa.setBounds(180, 23, 109, 23);
			panel.add(rdbtnEmpresa);
			rdbtnCandidato.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnCandidato.setBounds(317, 23, 109, 23);
			panel.add(rdbtnCandidato);
			
			
			panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_1.setBounds(10, 62, 556, 318);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			txtNombreA = new JTextField();
			txtNombreA.setBounds(10, 36, 260, 25);
			panel_1.add(txtNombreA);
			txtNombreA.setColumns(10);
			
			txtDireccion = new JTextField();
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(280, 158, 266, 25);
			panel_1.add(txtDireccion);
			
			
			lblNombreApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombreApellido.setBounds(10, 11, 169, 14);
			panel_1.add(lblNombreApellido);
			
			
			lblDocumentoDeIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDocumentoDeIdentificacion.setBounds(280, 133, 169, 14);
			panel_1.add(lblDocumentoDeIdentificacion);
			
			txtUsername = new JTextField();
			txtUsername.setColumns(10);
			txtUsername.setBounds(10, 97, 260, 25);
			panel_1.add(txtUsername);
			
			JLabel Username = new JLabel("Nombre de usuario:");
			Username.setFont(new Font("Tahoma", Font.PLAIN, 12));
			Username.setBounds(10, 72, 260, 14);
			panel_1.add(Username);
			
			JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
			lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblContrasea.setBounds(280, 72, 108, 14);
			panel_1.add(lblContrasea);
			
			txtPassword = new JTextField();
			txtPassword.setColumns(10);
			txtPassword.setBounds(280, 97, 266, 25);
			panel_1.add(txtPassword);
			
			JLabel lblProvincia = new JLabel("Provincia:");
			lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblProvincia.setBounds(10, 133, 108, 14);
			panel_1.add(lblProvincia);
			
			
			lblGnero.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblGnero.setBounds(280, 192, 108, 14);
			panel_1.add(lblGnero);
			
			
			cbxProvincia.setBounds(10, 158, 260, 25);
			panel_1.add(cbxProvincia);
			cbxGenero.setBounds(280, 217, 266, 25);
			panel_1.add(cbxGenero);
			
			txtTelefono = new JTextField();
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(10, 217, 260, 25);
			panel_1.add(txtTelefono);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelefono.setBounds(10, 194, 108, 14);
			panel_1.add(lblTelefono);
			
			txtCedula = new JTextField();
			txtCedula.setColumns(10);
			txtCedula.setBounds(280, 36, 266, 25);
			panel_1.add(txtCedula);
			
			JLabel lblCdula = new JLabel("C\u00E9dula:");
			lblCdula.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCdula.setBounds(280, 11, 169, 14);
			panel_1.add(lblCdula);
			
			JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento:");
			lblFechaDeNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblFechaDeNacimiento.setBounds(10, 253, 260, 14);
			panel_1.add(lblFechaDeNacimiento);
			
			spinner.setModel(new SpinnerDateModel(new Date(), null, new Date(), Calendar.DAY_OF_YEAR));
			spinner.setBounds(10, 278, 260, 25);
			panel_1.add(spinner);
			
			
			btnConfirmarReg.setBounds(396, 534, 170, 31);
			panel.add(btnConfirmarReg);
			
			
			rdbtnAdminstrador.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setBounds(100, 100, 602, 485);
					rdbtnCandidato.setSelected(false);
					rdbtnEmpresa.setSelected(false);
					rdbtnAdminstrador.setSelected(true);
					panel_2.setVisible(false);
					btnConfirmarReg.setBounds(396, 395, 170, 31);
				}
			});
			rdbtnAdminstrador.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnAdminstrador.setBounds(457, 23, 109, 23);
			panel.add(rdbtnAdminstrador);
			
			
			panel_2.setBounds(10, 391, 556, 132);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			
			lblVehiculoPropio.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblVehiculoPropio.setBounds(285, 12, 167, 14);
			panel_2.add(lblVehiculoPropio);
			rdbtnViajar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnViajar.setBounds(458, 7, 92, 23);
			panel_2.add(rdbtnViajar);
			
			
			lblVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblVehiculo.setBounds(10, 12, 167, 14);
			panel_2.add(lblVehiculo);
			rdbtnVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnVehiculo.setBounds(183, 7, 92, 23);
			panel_2.add(rdbtnVehiculo);
			
			
			txtNombreEmpresa.setColumns(10);
			txtNombreEmpresa.setBounds(10, 37, 260, 25);
			panel_2.add(txtNombreEmpresa);
			
			
			lblNombreEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombreEmpresa.setBounds(10, 12, 167, 14);
			panel_2.add(lblNombreEmpresa);
			
			
			txtRNC.setColumns(10);
			txtRNC.setBounds(280, 37, 266, 25);
			panel_2.add(txtRNC);
			
			
			lblRnc.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblRnc.setBounds(280, 12, 169, 14);
			panel_2.add(lblRnc);
			
			
			cbxCategoriaLaboral.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
			cbxCategoriaLaboral.setBounds(10, 96, 266, 25);
			panel_2.add(cbxCategoriaLaboral);
			
			
			lblCategoriaLaboral.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCategoriaLaboral.setBounds(10, 71, 205, 14);
			panel_2.add(lblCategoriaLaboral);
			
;
		}
	}
	public void clear() {
		
	}
}
