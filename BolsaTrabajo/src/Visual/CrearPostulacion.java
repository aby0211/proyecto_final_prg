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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.border.EtchedBorder;

import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.Obrero;
import logico.Tecnico;
import logico.Universitario;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import javax.swing.SpinnerNumberModel;

public class CrearPostulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtCentroeducativo;
	private JTextField txtDireccion;
	private JTextField txtFechaNacimiento;
	private ArrayList<String> auxListaOficios;
	private JComboBox cbxCategoriaLaboral;
	private JComboBox cbxCarrera;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public CrearPostulacion(Candidato user) {
		auxListaOficios=new ArrayList<String>();
		setBounds(100, 100, 602, 801);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/post.png")));

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JButton btnCrearPost = new JButton("Crear postulacion");

			btnCrearPost.setBounds(414, 712, 152, 29);
			panel.add(btnCrearPost);
			
			JPanel panel_1 = new JPanel();
			panel_1.setLayout(null);
			panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_1.setBounds(10, 11, 556, 329);
			panel.add(panel_1);
			
			txtNombre = new JTextField();
			txtNombre.setEditable(false);
			txtNombre.setColumns(10);
			txtNombre.setBounds(10, 36, 260, 25);
			panel_1.add(txtNombre);
			

			txtCedula = new JTextField();
			txtCedula.setEditable(false);
			txtCedula.setColumns(10);
			txtCedula.setBounds(280, 36, 266, 25);
			panel_1.add(txtCedula);
			
			JLabel label = new JLabel("Nombre y apellido:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label.setBounds(10, 11, 127, 14);
			panel_1.add(label);
			
			JLabel label_1 = new JLabel("Documento de identidad:");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_1.setBounds(280, 11, 169, 14);
			panel_1.add(label_1);
			
			JLabel label_4 = new JLabel("Provincia:");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_4.setBounds(10, 72, 139, 14);
			panel_1.add(label_4);
			
			JLabel label_5 = new JLabel("G\u00E9nero:");
			label_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_5.setBounds(10, 133, 108, 14);
			panel_1.add(label_5);
			
			JComboBox cbxProvincia = new JComboBox();
			cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
			cbxProvincia.setEnabled(false);
			cbxProvincia.setBounds(10, 97, 260, 25);
			panel_1.add(cbxProvincia);
			
			JComboBox cbxGenero = new JComboBox();
			cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Hombre ", "Mujer", "Otro"}));
			cbxGenero.setEnabled(false);
			cbxGenero.setBounds(10, 158, 260, 25);
			panel_1.add(cbxGenero);
			
			txtTelefono = new JTextField();
			txtTelefono.setEditable(false);
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(280, 156, 266, 25);
			panel_1.add(txtTelefono);
			
			JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
			lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblTelfono.setBounds(280, 133, 108, 14);
			panel_1.add(lblTelfono);
			
			JLabel label_7 = new JLabel("Disponibilidad para viajar:");
			label_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_7.setBounds(10, 255, 163, 14);
			panel_1.add(label_7);
			
			JRadioButton rdbtnViajarSi = new JRadioButton("Si");
			rdbtnViajarSi.setEnabled(false);
			rdbtnViajarSi.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnViajarSi.setBounds(201, 251, 109, 23);
			panel_1.add(rdbtnViajarSi);
			
			JRadioButton rdbtnViajar = new JRadioButton("No");
			rdbtnViajar.setEnabled(false);
			rdbtnViajar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnViajar.setBounds(343, 251, 109, 23);
			panel_1.add(rdbtnViajar);
			
			JLabel label_8 = new JLabel("Vehiculo propio:");
			label_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_8.setBounds(10, 291, 150, 14);
			panel_1.add(label_8);
			
			JRadioButton rdbtnVehiculoSi = new JRadioButton("Si");
			rdbtnVehiculoSi.setEnabled(false);
			rdbtnVehiculoSi.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnVehiculoSi.setBounds(201, 287, 109, 23);
			panel_1.add(rdbtnVehiculoSi);
			
			JRadioButton rdbtnVehiculoNo = new JRadioButton("No");
			rdbtnVehiculoNo.setEnabled(false);
			rdbtnVehiculoNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
			rdbtnVehiculoNo.setBounds(343, 287, 109, 23);
			panel_1.add(rdbtnVehiculoNo);
			
			JLabel label_9 = new JLabel("Fecha de nacimiento:");
			label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_9.setBounds(10, 194, 127, 14);
			panel_1.add(label_9);
			
			txtDireccion = new JTextField();
			txtDireccion.setEditable(false);
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(280, 97, 266, 25);
			panel_1.add(txtDireccion);
			
			JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
			lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblDireccion.setBounds(280, 72, 108, 14);
			panel_1.add(lblDireccion);
			
			txtFechaNacimiento = new JTextField();
			txtFechaNacimiento.setText(user.getFechaNacimiento().toString());
			txtFechaNacimiento.setEditable(false);
			txtFechaNacimiento.setColumns(10);
			txtFechaNacimiento.setBounds(10, 219, 260, 25);
			panel_1.add(txtFechaNacimiento);
			
			JPanel panel_2 = new JPanel();
			panel_2.setLayout(null);
			panel_2.setBounds(10, 351, 556, 350);
			panel.add(panel_2);
			
			JLabel label_10 = new JLabel("Nivel de estudio");
			label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_10.setBounds(228, 11, 99, 14);
			panel_2.add(label_10);
			
			JRadioButton rdbtnUniversitario = new JRadioButton("Universitario");
			rdbtnUniversitario.setSelected(true);
			rdbtnUniversitario.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnUniversitario.setBounds(48, 32, 99, 23);
			panel_2.add(rdbtnUniversitario);
			
			JRadioButton rdbtnTecnico = new JRadioButton("T\u00E9cnico");
			rdbtnTecnico.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnTecnico.setBounds(241, 32, 74, 23);
			panel_2.add(rdbtnTecnico);
			
			JRadioButton rdbtnEducacionBasica = new JRadioButton("Educacion B\u00E1sica");
			rdbtnEducacionBasica.setFont(new Font("Tahoma", Font.PLAIN, 13));
			rdbtnEducacionBasica.setBounds(386, 32, 128, 23);
			panel_2.add(rdbtnEducacionBasica);
			
			JLabel label_11 = new JLabel("Centro educativo:");
			label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_11.setBounds(10, 121, 260, 14);
			panel_2.add(label_11);
			
			txtCentroeducativo = new JTextField();
			txtCentroeducativo.setColumns(10);
			txtCentroeducativo.setBounds(10, 146, 260, 25);
			panel_2.add(txtCentroeducativo);
			
			JLabel label_12 = new JLabel("Carrera:");
			label_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_12.setBounds(280, 60, 169, 14);
			panel_2.add(label_12);
			
			JLabel label_13 = new JLabel("Area t\u00E9cnica:");
			label_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_13.setBounds(10, 182, 260, 14);
			panel_2.add(label_13);
			
			JComboBox cbxCarrera = new JComboBox();
			cbxCarrera.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n hotelera", "Arquitectura", "Comunicaci\u00F3n social", "Derecho", "Dise\u00F1o e interiorismo", "Econom\u00EDa", "Eduaci\u00F3n", "Estomatolog\u00EDa", "Filosof\u00EDa", "Gesti\u00F3n financiera", "Ingenier\u00EDa civil", "Ingenieria m\u00E9canica", "Ingenier\u00EDa el\u00E9ctrica", "Ingenier\u00EDa industrial", "Ingenier\u00EDa mecatr\u00F3nica", "Ingenier\u00EDa de ciencias de la computaci\u00F3n", "Ingenier\u00EDa telem\u00E1tica", "Ingenier\u00EDa Ambiental", "Medic\u00EDna", "Marketing", "Nutrici\u00F3n", "Psicolog\u00EDa", "Terapia f\u00EDsica", "Trabajo social", "Hospitalidad y turismo"}));
			cbxCarrera.setBounds(280, 85, 266, 25);
			panel_2.add(cbxCarrera);
			
			JComboBox cbxAreaTecnica = new JComboBox();
			cbxAreaTecnica.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Automatizaci\u00F3n", "Artes culinarias", "Admistracion de empresas", "Dise\u00F1o gr\u00E1fico", "Enfermer\u00EDa", "Gesti\u00F3n social", "Logistica integral", "Microfinanzas", "Mercado", "Programaci\u00F3n web", "Publicidad", "Redes de datos"}));
			cbxAreaTecnica.setEnabled(false);
			cbxAreaTecnica.setBounds(10, 207, 260, 25);
			panel_2.add(cbxAreaTecnica);
			
			JLabel label_14 = new JLabel("A\u00F1os de experiencia:");
			label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_14.setBounds(280, 150, 180, 14);
			panel_2.add(label_14);
			
			JSpinner spnAnnosExp = new JSpinner();
			spnAnnosExp.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
			spnAnnosExp.setBounds(472, 146, 74, 25);
			panel_2.add(spnAnnosExp);
			
			JLabel label_15 = new JLabel("Oficio:");
			label_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_15.setBounds(10, 243, 108, 14);
			panel_2.add(label_15);
			
			JComboBox cbxOficio = new JComboBox();
			cbxOficio.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Asistente de tienda", "Bibliotecario", "Bombero", "Carnicero", "Carpintero", "Cartero", "Chofer", "Electricista", "Florista", "Granjero", "Jardinero", "Limpiador", "Mec\u00E1nico", "Panadero", "Peluquero", "Plomero", "Secretario", "Sastre"}));
			cbxOficio.setEnabled(false);
			cbxOficio.setBounds(10, 268, 260, 25);
			panel_2.add(cbxOficio);
			
			JLabel label_16 = new JLabel("Salario m\u00EDnimo:");
			label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_16.setBounds(280, 182, 266, 14);
			panel_2.add(label_16);
			
			JSpinner spnSalarioMin = new JSpinner();
			spnSalarioMin.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
			spnSalarioMin.setBounds(280, 207, 266, 25);
			panel_2.add(spnSalarioMin);
			
			JComboBox cbxCategoriaLaboral = new JComboBox();
			cbxCategoriaLaboral.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
			cbxCategoriaLaboral.setBounds(10, 85, 260, 25);
			panel_2.add(cbxCategoriaLaboral);
			
			JLabel label_17 = new JLabel("Categoria laboral:");
			label_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
			label_17.setBounds(10, 62, 260, 14);
			panel_2.add(label_17);
			
			JSpinner spnVencimiento = new JSpinner();
			spnVencimiento.setModel(new SpinnerDateModel(new java.util.Date(), new java.util.Date(), null, Calendar.DAY_OF_YEAR));
			spnVencimiento.setBounds(280, 268, 266, 25);
			panel_2.add(spnVencimiento);
			
			JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento:");
			lblFechaDeVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblFechaDeVencimiento.setBounds(280, 243, 266, 14);
			panel_2.add(lblFechaDeVencimiento);
			JButton btnAnadirLista = new JButton("A\u00F1adir a la lista de oficios");
			btnAnadirLista.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					auxListaOficios.add(cbxOficio.getSelectedItem().toString());
					JOptionPane.showMessageDialog(null, "El oficio se ha agregado a la lista de oficios", "Información", JOptionPane.INFORMATION_MESSAGE);
				}
			});
			
			btnAnadirLista.setEnabled(false);
			btnAnadirLista.setBounds(10, 304, 153, 23);
			panel_2.add(btnAnadirLista);
			
			rdbtnEducacionBasica.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnEducacionBasica.setSelected(true);
					rdbtnTecnico.setSelected(false);
					txtCentroeducativo.setEnabled(false);
					txtCentroeducativo.setEditable(false);
					rdbtnUniversitario.setSelected(false);
					cbxAreaTecnica.setEnabled(false);
					cbxOficio.setEnabled(true);
					cbxCarrera.setEnabled(false);
					btnAnadirLista.setEnabled(true);
					
				}
			});
			
			rdbtnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnTecnico.setSelected(true);
					txtCentroeducativo.setEnabled(true);
					txtCentroeducativo.setEditable(true);
					rdbtnUniversitario.setSelected(false);
					cbxAreaTecnica.setEnabled(true);
					cbxOficio.setEnabled(false);
					cbxCarrera.setEnabled(false);
					btnAnadirLista.setEnabled(false);
				}
			});
			
			rdbtnUniversitario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnUniversitario.setSelected(true);
					rdbtnTecnico.setSelected(false);
					txtCentroeducativo.setEnabled(true);
					txtCentroeducativo.setEditable(true);
					rdbtnEducacionBasica.setSelected(false);
					cbxAreaTecnica.setEnabled(false);
					cbxOficio.setEnabled(false);
					cbxCarrera.setEnabled(true);
					btnAnadirLista.setEnabled(false);
					
				}
			});
			
			
			
			btnCrearPost.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(rdbtnUniversitario.isSelected()) {
						Universitario auxSol = new Universitario("CS-"+BolsaDeTrabajo.getInstance().getIdSolicitud(), cbxCategoriaLaboral.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), (Date)spnVencimiento.getValue(), Integer.parseInt(spnSalarioMin.getValue().toString()), Integer.parseInt(spnAnnosExp.getValue().toString()), "Enviada", cbxCarrera.getSelectedItem().toString(), txtCentroeducativo.getText(),user);
						BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxSol);
						user.getMisPostulaciones().add(auxSol);
						BolsaDeTrabajo.getInstance().aumentarCodSol();
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "La postulación se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if(rdbtnTecnico.isSelected()) {
						Tecnico auxSol = new Tecnico("CS-"+BolsaDeTrabajo.getInstance().getIdSolicitud(), cbxCategoriaLaboral.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), (Date)spnVencimiento.getValue(), Integer.parseInt(spnSalarioMin.getValue().toString()), Integer.parseInt(spnAnnosExp.getValue().toString()), "Enviada", cbxAreaTecnica.getSelectedItem().toString(), txtCentroeducativo.getText(),user);
						BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxSol);
						user.getMisPostulaciones().add(auxSol);
						BolsaDeTrabajo.getInstance().aumentarCodSol();
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "La postulación se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					
					if(rdbtnEducacionBasica.isSelected()) {
						Obrero auxSol = new Obrero("CS-"+BolsaDeTrabajo.getInstance().getIdSolicitud(), cbxCategoriaLaboral.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), (Date)spnVencimiento.getValue(), Integer.parseInt(spnSalarioMin.getValue().toString()), Integer.parseInt(spnAnnosExp.getValue().toString()), "Enviada", user);
						auxSol.copiarLista(auxListaOficios);
						BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxSol);
						user.getMisPostulaciones().add(auxSol);
						BolsaDeTrabajo.getInstance().aumentarCodSol();
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "La postulación se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
					dispose();
					CrearPostulacion list = new CrearPostulacion(user);
					list.setVisible(true);
				}
			});
			
			txtNombre.setText(user.getNombre());
			txtCedula.setText(user.getCedula());
			cbxProvincia.setSelectedItem(user.getProvincia());
			txtDireccion.setText(user.getDireccion());
			cbxGenero.setSelectedItem(user.getSexo());
			txtTelefono.setText(user.getTelefono());
			if(user.isViajarDisp()) {
				rdbtnViajarSi.setSelected(true);
			}else {
				rdbtnViajar.setSelected(true);
			}
			if(user.isVehiculoPropio()) {
				rdbtnVehiculoSi.setSelected(true);
			}else {
				rdbtnVehiculoNo.setSelected(true);
			}
			
			
			
			
		}
	}
}
