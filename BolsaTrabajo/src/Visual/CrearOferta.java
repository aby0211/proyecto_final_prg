package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaDeTrabajo;
import logico.CentroEmpleador;
import logico.Oferta;
import logico.Solicitud;
import logico.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;

public class CrearOferta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JComboBox cbxCategoriaLab;
	private JTextField OfertaLaboral;
	private JSpinner spnVacantes;
	private JSpinner spnSalario;
	private JTextField txtOfertaLab;
	private JComboBox cbxNivelEstudio;
	private JComboBox cbxVariable;
	private JComboBox cbxPeriodoPago;
	private JComboBox cbxJornada;
	private JComboBox cbxTipoDeContrato;
	private JSpinner spnFechaVencimiento;
	
	public CrearOferta(Usuario user) {
		setTitle("Crear oferta de trabajo");
		setBounds(100, 100, 532, 581);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/oferta.png")));

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		JRadioButton rdbtnVehiculo = new JRadioButton("Vehiculo propio necesario");
		JPanel panel = new JPanel();
		contentPanel.add(panel, BorderLayout.CENTER);
		JRadioButton rdbtnViajar = new JRadioButton("Disponibilidad para viajar necesaria");
		panel.setLayout(null);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la empresa> ");
		lblNombreDeLa.setBounds(10, 25, 122, 14);
		panel.add(lblNombreDeLa);
		
		JLabel lblOfertaLaboral = new JLabel("Oferta laboral:");
		lblOfertaLaboral.setBounds(258, 56, 122, 14);
		panel.add(lblOfertaLaboral);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(142, 20, 238, 25);
		txtNombre.setText(((CentroEmpleador)user).getNombreEmpresa());
		JLabel lblCarrera = new JLabel("Carrera:");
		panel.add(txtNombre);
		JSpinner spnExperiencia = new JSpinner();
		
		JSpinner spnVacantes = new JSpinner();
		spnVacantes.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnVacantes.setBounds(182, 203, 65, 25);
		panel.add(spnVacantes);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(257, 178, 122, 14);
		panel.add(lblProvincia);
		
		JComboBox cbxProvincia = new JComboBox();
		cbxProvincia.setEnabled(false);
		cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
		cbxProvincia.setBounds(257, 203, 239, 25);
		cbxProvincia.setSelectedItem(((CentroEmpleador)user).getProvincia());
		panel.add(cbxProvincia);
		
		JLabel label_3 = new JLabel("Cantidad de vacantes:");
		label_3.setBounds(9, 208, 163, 14);
		panel.add(label_3);
		
		JLabel lblSalario = new JLabel("Salario:");
		lblSalario.setBounds(10, 342, 122, 14);
		panel.add(lblSalario);
		
		JSpinner spnSalario = new JSpinner();
		spnSalario.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
		spnSalario.setBounds(10, 367, 237, 25);
		panel.add(spnSalario);
		
		JComboBox cbxPeriodoPago = new JComboBox();
		cbxPeriodoPago.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Quincenal", "Mensual"}));
		cbxPeriodoPago.setBounds(256, 308, 239, 25);
		panel.add(cbxPeriodoPago);
		
		JLabel lblPeriodoDePago = new JLabel("Periodo de pago:");
		lblPeriodoDePago.setBounds(257, 283, 122, 14);
		panel.add(lblPeriodoDePago);
		
		JComboBox cbxJornada = new JComboBox();
		cbxJornada.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Tiempo completo", "Medio tiempo"}));
		cbxJornada.setBounds(10, 428, 239, 25);
		panel.add(cbxJornada);
		
		JComboBox cbxTipoDeContrato = new JComboBox();
		cbxTipoDeContrato.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Por tiempo indefinido", "Por tiempo definido"}));
		cbxTipoDeContrato.setBounds(257, 369, 239, 25);
		panel.add(cbxTipoDeContrato);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de contrato:");
		lblTipoDeContrato.setBounds(257, 344, 122, 14);
		panel.add(lblTipoDeContrato);
		
		JLabel lblJornada = new JLabel("Jornada:");
		lblJornada.setBounds(10, 403, 122, 14);
		panel.add(lblJornada);
		JSpinner spnFechaVencimiento = new JSpinner();
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento:");
		lblFechaDeVencimiento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFechaDeVencimiento.setBounds(10, 464, 136, 14);
		panel.add(lblFechaDeVencimiento);
		JComboBox cbxCategoriaLab = new JComboBox();
		JSpinner spnPorciento = new JSpinner();
		cbxCategoriaLab.setEnabled(false);
		JButton button = new JButton("Crear oferta");
		JComboBox cbxNivelEstudio = new JComboBox();
		JComboBox cbxVariable = new JComboBox();
		cbxVariable.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n hotelera", "Arquitectura", "Comunicaci\u00F3n social", "Derecho", "Dise\u00F1o e interiorismo", "Econom\u00EDa", "Eduaci\u00F3n", "Estomatolog\u00EDa", "Filosof\u00EDa", "Gesti\u00F3n financiera", "Ingenier\u00EDa civil", "Ingenieria m\u00E9canica", "Ingenier\u00EDa el\u00E9ctrica", "Ingenier\u00EDa industrial", "Ingenier\u00EDa mecatr\u00F3nica", "Ingenier\u00EDa de ciencias de la computaci\u00F3n", "Ingenier\u00EDa telem\u00E1tica", "Ingenier\u00EDa Ambiental", "Medic\u00EDna", "Marketing", "Nutrici\u00F3n", "Psicolog\u00EDa", "Terapia f\u00EDsica", "Trabajo social", "Hospitalidad y turismo"}));
		cbxNivelEstudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cbxNivelEstudio.getSelectedItem().toString().equalsIgnoreCase("Universitario")) {
					cbxVariable.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Administraci\u00F3n hotelera", "Arquitectura", "Comunicaci\u00F3n social", "Derecho", "Dise\u00F1o e interiorismo", "Econom\u00EDa", "Eduaci\u00F3n", "Estomatolog\u00EDa", "Filosof\u00EDa", "Gesti\u00F3n financiera", "Ingenier\u00EDa civil", "Ingenieria m\u00E9canica", "Ingenier\u00EDa el\u00E9ctrica", "Ingenier\u00EDa industrial", "Ingenier\u00EDa mecatr\u00F3nica", "Ingenier\u00EDa de ciencias de la computaci\u00F3n", "Ingenier\u00EDa telem\u00E1tica", "Ingenier\u00EDa Ambiental", "Medic\u00EDna", "Marketing", "Nutrici\u00F3n", "Psicolog\u00EDa", "Terapia f\u00EDsica", "Trabajo social", "Hospitalidad y turismo"}));
					lblCarrera.setText("Carrera:");
				}
				if(cbxNivelEstudio.getSelectedItem().toString().equalsIgnoreCase("Educación Básica")) {
					cbxVariable.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Alba\u00F1il", "Asistente de tienda", "Bibliotecario", "Bombero", "Carnicero", "Carpintero", "Cartero", "Chofer", "Electricista", "Florista", "Granjero", "Jardinero", "Limpiador", "Mec\u00E1nico", "Panadero", "Peluquero", "Plomero", "Secretario", "Sastre"}));
					lblCarrera.setText("Oficio:");
				}
				if(cbxNivelEstudio.getSelectedItem().toString().equalsIgnoreCase("Técnico")) {
					cbxVariable.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Automatizaci\u00F3n", "Artes culinarias", "Admistracion de empresas", "Dise\u00F1o gr\u00E1fico", "Enfermer\u00EDa", "Gesti\u00F3n social", "Logistica integral", "Microfinanzas", "Mercado", "Programaci\u00F3n web", "Publicidad", "Redes de datos"}));
					lblCarrera.setText("Área técnica:");
				}
			}
		});
		
			
		txtOfertaLab = new JTextField();
		cbxNivelEstudio.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Universitario", "T\u00E9cnico", "Educaci\u00F3n b\u00E1sica"}));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oferta auxOferta = new Oferta("CS-"+BolsaDeTrabajo.getInstance().getIdSolicitud(), cbxCategoriaLab.getSelectedItem().toString(), txtOfertaLab.getText(), cbxNivelEstudio.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), (Date)spnFechaVencimiento.getValue(), Integer.parseInt(spnVacantes.getValue().toString()), cbxJornada.getSelectedItem().toString(), Integer.parseInt(spnSalario.getValue().toString()), cbxTipoDeContrato.getSelectedItem().toString(), cbxPeriodoPago.getSelectedItem().toString(), ((CentroEmpleador)user), "Disponible", Integer.parseInt(spnPorciento.getValue().toString()),Integer.parseInt(spnExperiencia.getValue().toString()),cbxVariable.getSelectedItem().toString(),rdbtnViajar.isSelected(),rdbtnVehiculo.isSelected());
				((CentroEmpleador)user).getMisOfertas().add(auxOferta);
				BolsaDeTrabajo.getInstance().aumentarCodSol();
				BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxOferta);
				BolsaDeTrabajo.getInstance().guardarBolsa();
				//clean();
				JOptionPane.showMessageDialog(null, "La oferta se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		button.setBounds(301, 481, 195, 35);
		panel.add(button);
		
		
		spnFechaVencimiento.setModel(new SpinnerDateModel(new Date(), new Date(), null, Calendar.DAY_OF_YEAR));
		spnFechaVencimiento.setBounds(10, 489, 242, 25);
		panel.add(spnFechaVencimiento);
		
		JLabel lblCategoriaLaboral = new JLabel("Categoria laboral:");
		lblCategoriaLaboral.setBounds(10, 56, 238, 14);
		panel.add(lblCategoriaLaboral);
		
		
		cbxCategoriaLab.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
		cbxCategoriaLab.setBounds(10, 81, 239, 25);
		panel.add(cbxCategoriaLab);
		cbxCategoriaLab.setSelectedItem(((CentroEmpleador)user).getCategoriaLaboral());
		
		
		cbxNivelEstudio.setBounds(9, 142, 239, 25);
		panel.add(cbxNivelEstudio);
		
		JLabel lblNivelDeEstudio = new JLabel("Nivel de estudio requerido:");
		lblNivelDeEstudio.setBounds(9, 117, 238, 14);
		panel.add(lblNivelDeEstudio);
		
		txtOfertaLab.setText((String) null);
		txtOfertaLab.setColumns(10);
		txtOfertaLab.setBounds(258, 81, 238, 25);
		panel.add(txtOfertaLab);
		
		 
		lblCarrera.setBounds(257, 117, 137, 14);
		panel.add(lblCarrera);
		
		
		cbxVariable.setBounds(257, 142, 239, 25);
		panel.add(cbxVariable);
		
		
		spnPorciento.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnPorciento.setBounds(259, 430, 237, 25);
		panel.add(spnPorciento);
		
		JLabel lblPorcientoDeMatch = new JLabel("Porcentaje para contratar al candidato:");
		lblPorcientoDeMatch.setBounds(259, 405, 237, 14);
		panel.add(lblPorcientoDeMatch);
		
		
		spnExperiencia.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spnExperiencia.setBounds(10, 308, 237, 25);
		panel.add(spnExperiencia);
		
		JLabel lblAnnosexperiencia = new JLabel("A\u00F1os de experiencia requeridos:");
		lblAnnosexperiencia.setBounds(10, 283, 208, 14);
		panel.add(lblAnnosexperiencia);
		
		
		rdbtnVehiculo.setBounds(8, 243, 187, 23);
		panel.add(rdbtnVehiculo);
		
		
		rdbtnViajar.setBounds(256, 243, 242, 23);
		panel.add(rdbtnViajar);
	}
	
	private void clean() {
		txtOfertaLab.setText("");
		cbxNivelEstudio.setSelectedIndex(0);
		cbxVariable.setSelectedIndex(0);
		spnVacantes.setValue(Integer.parseInt("1"));
		spnSalario.setValue(Integer.parseInt("12,000"));
		cbxJornada.setSelectedIndex(0);
		cbxPeriodoPago.setSelectedIndex(0);
		cbxTipoDeContrato.setSelectedIndex(0);
		spnFechaVencimiento.setValue(new Date());
		
		
		
	}
}
