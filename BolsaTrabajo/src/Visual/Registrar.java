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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.border.EtchedBorder;

import logico.BolsaDeTrabajo;
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
	private JTextField txtCedula;
	private JTextField txtCorreo;
	private JTextField txtPassword;
	private JTextField txtTelefono;
	private JTextField txtCentroeducativo;

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
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 602, 754);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Registrar cuenta como:");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lblNewLabel.setBounds(48, 27, 150, 14);
				panel.add(lblNewLabel);
			}
			JRadioButton rdbtnEmpresa = new JRadioButton("Empresa");
			JComboBox cbxCategoriaLab = new JComboBox();
			cbxCategoriaLab.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
			JComboBox cbxProvincia = new JComboBox();
			cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
			JPanel panel_2 = new JPanel();
			JPanel panel_1 = new JPanel();
			JButton btnConfirmarReg = new JButton("Confirmar registro");
			JRadioButton rdbtnCandidato = new JRadioButton("Candidato");
			JRadioButton rdbtnUniversitario = new JRadioButton("Universitario");
			JRadioButton rdbtnTcnico = new JRadioButton("T\u00E9cnico");
			JRadioButton rdbtnEducacionBsica = new JRadioButton("Educacion B\u00E1sica");
			JRadioButton rdbtnSiViajar = new JRadioButton("Si");
			JRadioButton rdbtnNoViajar = new JRadioButton("No");
			JRadioButton rdbtnNoVehiculo = new JRadioButton("No");
			JRadioButton rdbtnSiVehiculo = new JRadioButton("Si");
			JSpinner spnExperiencia = new JSpinner();
			spnExperiencia.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
			JComboBox cbxCarrera = new JComboBox();
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n Empresarial", "Adminsitraci\u00F3n Hotelera", "Arquitectura", "Comunicaci\u00F3n Social", "Derecho", "Dise\u00F1o e Interiorismo", "Direcci\u00F3n Empresarial", "Econom\u00EDa", "Educaci\u00F3n", "Estomatolog\u00EDa", "Filosof\u00EDa", "Gesti\u00F3n Financiera y Auditor\u00EDa", "Ingerier\u00EDa Civil", "Ingenier\u00EDa Mec\u00E1nica", "Ingenier\u00EDa El\u00E9ctrica ", "Ingenier\u00EDa Industrial", "Ingenier\u00EDa Mecatr\u00F3nica ", "Ingenier\u00EDa en Ciencias de la Computaci\u00F3n", "Ingenier\u00EDa Telem\u00E1tica", "Ingenier\u00EDa Ambiental", "Medicina", "Marketing", "Nutrici\u00F3n y Diet\u00E9tica", "Psicolog\u00EDa", "Terapia F\u00EDsica", "Trabajo Social", "Hospitalidad y Turismo"}));
			JComboBox cbxOficio = new JComboBox();
			cbxOficio.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Agricultor", "Artesano", "Carnicero", "Cajero", "Cocinero", "Carpintero", "Cerrajero", "Locutor", "Limpieza", "Mec\u00E1nico", "Obrero", "Panadero", "Pastor ganadero", "Peluquero", "Polic\u00EDa", "Repartidor", "Sastre", "Soldador", "Fontanero", "Vigilante"}));
			txtCentroeducativo = new JTextField();
			JComboBox cbxAreaTecnica = new JComboBox();
			cbxAreaTecnica.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Dise\u00F1o Gr\u00E1fico", "Publicidad y Medios Digitales", "Mercadeo", "Enfermer\u00EDa", "Automatizaci\u00F3n", "Artes Culinarias", "Redes de Datos", "Microfinanzas", "Gestion Social y Comunitaria", "Programaci\u00F3n Web", "Log\u00EDstica Integral"}));
			JSpinner spnSalarioMin = new JSpinner();
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Hombre ", "Mujer", "Otro"}));
			btnConfirmarReg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnEmpresa.isSelected()) {
						CentroEmpleador auxCE = new CentroEmpleador("CE-"+1, txtCorreo.getText(), txtPassword.getText(), txtCedula.getText(), txtNombreA.getText(), cbxProvincia.getSelectedItem().toString(), cbxCategoriaLab.getSelectedItem().toString(), txtTelefono.getText());
						BolsaDeTrabajo.getInstance().getMisCentrosEmpleadores().add(auxCE);
						JOptionPane.showMessageDialog(null, "El registro de empresa se ha realizado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						Login list = new Login();
						list.setVisible(true);
						}
					else if(rdbtnCandidato.isSelected()) {
						if(rdbtnUniversitario.isSelected()) {
							Universitario auxCan = new Universitario("CA-", txtNombreA.getText(), cbxGenero.getSelectedItem().toString(), txtPassword.getText(), txtCorreo.getText(), cbxProvincia.getSelectedItem().toString(), rdbtnSiVehiculo.isSelected(), cbxCarrera.getSelectedItem().toString(), "Universitario", txtCentroeducativo.getText(), Integer.parseInt(spnExperiencia.getValue().toString()), txtTelefono.getText(), Integer.parseInt(spnSalarioMin.getValue().toString()), rdbtnSiViajar.isSelected());
							BolsaDeTrabajo.getInstance().getMisCandidatos().add(auxCan);
						}
						if(rdbtnTcnico.isSelected()) {
							Tecnico auxCan = new Tecnico("CA-", txtNombreA.getText(), cbxGenero.getSelectedItem().toString(), txtPassword.getText(), txtCorreo.getText(), cbxProvincia.getSelectedItem().toString(), rdbtnSiVehiculo.isSelected(), "Técnico", txtCentroeducativo.getText(), Integer.parseInt(spnExperiencia.getValue().toString()), txtTelefono.getText(), Integer.parseInt(spnSalarioMin.getValue().toString()), rdbtnSiViajar.isSelected(), cbxAreaTecnica.getSelectedItem().toString());
							BolsaDeTrabajo.getInstance().getMisCandidatos().add(auxCan);
						}
						if(rdbtnEducacionBsica.isSelected()) {
							Obrero auxCan = new Obrero("CA-", txtNombreA.getText(), cbxGenero.getSelectedItem().toString(), txtPassword.getText(), txtCorreo.getText(), cbxProvincia.getSelectedItem().toString(), rdbtnSiVehiculo.isSelected(), "Educación básica", cbxOficio.getSelectedItem().toString(), Integer.parseInt(spnExperiencia.getValue().toString()), txtTelefono.getText(), Integer.parseInt(spnSalarioMin.getValue().toString()), rdbtnSiViajar.isSelected());
							BolsaDeTrabajo.getInstance().getMisCandidatos().add(auxCan);
							
						}
						JOptionPane.showMessageDialog(null, "El registro de candidato se ha realizado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
						dispose();
						Login list = new Login();
						list.setVisible(true);
					}
					
				}
			});
			
			JLabel lblNombreApellido = new JLabel("Nombre y apellido:");
			JLabel lblDocumentoDeIdentificacion = new JLabel("Documento de identidad:");
			JLabel lblGnero = new JLabel("G\u00E9nero:");
			
			rdbtnCandidato.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnEmpresa.setSelected(false);
					rdbtnCandidato.setSelected(true);
					lblNombreApellido.setText("Nombre y apellido:");
					lblDocumentoDeIdentificacion.setText("Documento de identidad:");
					cbxGenero.setVisible(true);
					lblGnero.setVisible(true);
					panel_2.setVisible(true);
					panel_1.setBounds(10, 62, 556, 329);
					setBounds(100, 100, 602, 754);
					btnConfirmarReg.setBounds(396, 666, 170, 31);
				}
			});

			rdbtnEmpresa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnCandidato.setSelected(false);
					rdbtnEmpresa.setSelected(true);
					lblNombreApellido.setText("Nombre de la empresa:");
					lblDocumentoDeIdentificacion.setText("RNC:");
					cbxGenero.setVisible(false);
					lblGnero.setVisible(false);
					panel_2.setVisible(false);
					panel_1.setBounds(10, 62, 556, 260);
					setBounds(100, 100, 602, 430);
					btnConfirmarReg.setBounds(396, 340, 170, 31);
					
				}
			});
			rdbtnEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnEmpresa.setBounds(239, 23, 109, 23);
			panel.add(rdbtnEmpresa);
			
	
			rdbtnCandidato.setSelected(true);
			rdbtnCandidato.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnCandidato.setBounds(381, 23, 109, 23);
			panel.add(rdbtnCandidato);
			
			
			panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_1.setBounds(10, 62, 556, 329);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			txtNombreA = new JTextField();
			txtNombreA.setBounds(10, 36, 260, 25);
			panel_1.add(txtNombreA);
			txtNombreA.setColumns(10);
			
			txtCedula = new JTextField();
			txtCedula.setColumns(10);
			txtCedula.setBounds(280, 36, 266, 25);
			panel_1.add(txtCedula);
			
			
			lblNombreApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNombreApellido.setBounds(10, 11, 127, 14);
			panel_1.add(lblNombreApellido);
			
			
			lblDocumentoDeIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDocumentoDeIdentificacion.setBounds(280, 11, 169, 14);
			panel_1.add(lblDocumentoDeIdentificacion);
			
			txtCorreo = new JTextField();
			txtCorreo.setColumns(10);
			txtCorreo.setBounds(10, 97, 260, 25);
			panel_1.add(txtCorreo);
			
			JLabel lblCorreoElectronico = new JLabel("Correo electronico:");
			lblCorreoElectronico.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCorreoElectronico.setBounds(10, 72, 108, 14);
			panel_1.add(lblCorreoElectronico);
			
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
			
			JLabel lblEstadoCivil = new JLabel("Categoria laboral:");
			lblEstadoCivil.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblEstadoCivil.setBounds(280, 133, 108, 14);
			panel_1.add(lblEstadoCivil);
			
			JLabel lblTelefono = new JLabel("Telefono:");
			lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelefono.setBounds(10, 194, 108, 14);
			panel_1.add(lblTelefono);
			
			JLabel lblDisponibilidadParaViajar = new JLabel("Disponibilidad para viajar:");
			lblDisponibilidadParaViajar.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDisponibilidadParaViajar.setBounds(10, 266, 163, 14);
			panel_1.add(lblDisponibilidadParaViajar);

			rdbtnNoViajar.setSelected(true);
			rdbtnNoViajar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnSiViajar.setSelected(false);
					rdbtnNoViajar.setSelected(true);
				}
			});
			
			rdbtnSiViajar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnSiViajar.setSelected(true);
					rdbtnNoViajar.setSelected(false);
				}
			});
			rdbtnSiViajar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnSiViajar.setBounds(201, 262, 109, 23);
			panel_1.add(rdbtnSiViajar);
			
			
			rdbtnNoViajar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnNoViajar.setBounds(343, 262, 109, 23);
			panel_1.add(rdbtnNoViajar);
			
			JLabel lblVehiculoPropio = new JLabel("Vehiculo propio:");
			lblVehiculoPropio.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblVehiculoPropio.setBounds(10, 302, 150, 14);
			panel_1.add(lblVehiculoPropio);

			rdbtnSiVehiculo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnNoVehiculo.setSelected(false);
					rdbtnSiVehiculo.setSelected(true);
				}
			});
			rdbtnSiVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnSiVehiculo.setBounds(201, 298, 109, 23);
			panel_1.add(rdbtnSiVehiculo);
			
			
			rdbtnNoVehiculo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnNoVehiculo.setSelected(true);
					rdbtnSiVehiculo.setSelected(false);
				}
			});
			rdbtnNoVehiculo.setSelected(true);
			rdbtnNoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnNoVehiculo.setBounds(343, 298, 109, 23);
			panel_1.add(rdbtnNoVehiculo);
			
			
			cbxCategoriaLab.setBounds(280, 156, 266, 25);
			panel_1.add(cbxCategoriaLab);
			
			
			btnConfirmarReg.setBounds(396, 666, 170, 31);
			panel.add(btnConfirmarReg);
			
			
			panel_2.setBounds(10, 402, 556, 253);
			panel.add(panel_2);
			panel_2.setLayout(null);
			JLabel lblAreaTcnica = new JLabel("Area t\u00E9cnica:");
			JLabel lblreaTnica = new JLabel("Carrera:");
			
			JLabel lblNewLabel_2 = new JLabel("Nivel de estudio");
			
;

			rdbtnEducacionBsica.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnEducacionBsica.setSelected(true);
					rdbtnTcnico.setSelected(false);
					txtCentroeducativo.setEnabled(false);
					txtCentroeducativo.setEditable(false);
					rdbtnUniversitario.setSelected(false);
					cbxAreaTecnica.setEnabled(false);
					cbxOficio.setEnabled(true);
					cbxCarrera.setEnabled(false);
				}
			});
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel_2.setBounds(228, 11, 99, 14);
			panel_2.add(lblNewLabel_2);
			
			rdbtnTcnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnTcnico.setSelected(true);
					txtCentroeducativo.setEnabled(true);
					txtCentroeducativo.setEditable(true);
					rdbtnUniversitario.setSelected(false);
					cbxAreaTecnica.setEnabled(true);
					cbxOficio.setEnabled(false);
					cbxCarrera.setEnabled(false);
				}
			});
			
			
			rdbtnUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnUniversitario.setSelected(true);
					rdbtnTcnico.setSelected(false);
					txtCentroeducativo.setEnabled(true);
					txtCentroeducativo.setEditable(true);
					rdbtnEducacionBsica.setSelected(false);
					cbxAreaTecnica.setEnabled(false);
					cbxOficio.setEnabled(false);
					cbxCarrera.setEnabled(true);
					
				}
			});
			rdbtnUniversitario.setSelected(true);
			rdbtnUniversitario.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnUniversitario.setBounds(48, 32, 99, 23);
			panel_2.add(rdbtnUniversitario);
			
			
			rdbtnTcnico.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnTcnico.setBounds(241, 32, 74, 23);
			panel_2.add(rdbtnTcnico);
			
			rdbtnEducacionBsica.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnEducacionBsica.setBounds(386, 32, 128, 23);
			panel_2.add(rdbtnEducacionBsica);
			
			JLabel lblCentroEducativo = new JLabel("Centro educativo:");
			lblCentroEducativo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblCentroEducativo.setBounds(10, 62, 108, 14);
			panel_2.add(lblCentroEducativo);
			
			
			txtCentroeducativo.setColumns(10);
			txtCentroeducativo.setBounds(10, 87, 260, 25);
			panel_2.add(txtCentroeducativo);
			
			
			lblreaTnica.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblreaTnica.setBounds(280, 62, 169, 14);
			panel_2.add(lblreaTnica);
			
			
			lblAreaTcnica.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAreaTcnica.setBounds(10, 123, 108, 14);
			panel_2.add(lblAreaTcnica);
			cbxCarrera.setBounds(280, 87, 266, 25);
			panel_2.add(cbxCarrera);
			
			
			cbxAreaTecnica.setEnabled(false);
			cbxAreaTecnica.setBounds(10, 148, 260, 25);
			panel_2.add(cbxAreaTecnica);
			
			JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia:");
			lblAosDeExperiencia.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblAosDeExperiencia.setBounds(280, 152, 120, 14);
			panel_2.add(lblAosDeExperiencia);
			
			
			spnExperiencia.setBounds(472, 148, 74, 25);
			panel_2.add(spnExperiencia);
			
			JLabel lblOficio = new JLabel("Oficio:");
			lblOficio.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblOficio.setBounds(10, 184, 108, 14);
			panel_2.add(lblOficio);
			
			cbxOficio.setEnabled(false);
			cbxOficio.setBounds(10, 209, 260, 25);
			panel_2.add(cbxOficio);
			
			JLabel lblSalarioMnimo = new JLabel("Salario m\u00EDnimo:");
			lblSalarioMnimo.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblSalarioMnimo.setBounds(280, 184, 266, 14);
			panel_2.add(lblSalarioMnimo);
			
			
			spnSalarioMin.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
			spnSalarioMin.setBounds(280, 209, 266, 25);
			panel_2.add(spnSalarioMin);
		}
	}
}
