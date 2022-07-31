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

public class CrearOferta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JComboBox cbxCategoriaLab;
	private JTextField OfertaLaboral;
	private JSpinner spnVacantes;
	private JSpinner spnSalario;
	private JTextField txtOfertaLab;
	
	public CrearOferta(Usuario user) {
		setTitle("Crear oferta de trabajo");
		setBounds(100, 100, 532, 475);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la empresa> ");
		lblNombreDeLa.setBounds(10, 25, 122, 14);
		panel.add(lblNombreDeLa);
		
		JLabel label_1 = new JLabel("Oferta laboral");
		label_1.setBounds(258, 56, 122, 14);
		panel.add(label_1);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(142, 20, 238, 25);
		txtNombre.setText(((CentroEmpleador)user).getNombreEmpresa());
		panel.add(txtNombre);
		
		JSpinner spnVacantes = new JSpinner();
		spnVacantes.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnVacantes.setBounds(182, 203, 65, 25);
		panel.add(spnVacantes);
		
		JLabel label_2 = new JLabel("Provincia");
		label_2.setBounds(257, 178, 122, 14);
		panel.add(label_2);
		
		JComboBox cbxProvincia = new JComboBox();
		cbxProvincia.setEnabled(false);
		cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
		cbxProvincia.setBounds(257, 203, 239, 25);
		cbxProvincia.setSelectedItem(((CentroEmpleador)user).getProvincia());
		panel.add(cbxProvincia);
		
		JLabel label_3 = new JLabel("Cantidad de vacantes:");
		label_3.setBounds(9, 208, 122, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Salario");
		label_4.setBounds(9, 239, 122, 14);
		panel.add(label_4);
		
		JSpinner spnSalario = new JSpinner();
		spnSalario.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
		spnSalario.setBounds(9, 264, 237, 25);
		panel.add(spnSalario);
		
		JComboBox cbxPeriodoPago = new JComboBox();
		cbxPeriodoPago.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Quincenal", "Mensual"}));
		cbxPeriodoPago.setBounds(256, 264, 239, 25);
		panel.add(cbxPeriodoPago);
		
		JLabel label_5 = new JLabel("Periodo de pago");
		label_5.setBounds(257, 239, 122, 14);
		panel.add(label_5);
		
		JComboBox cbxJornada = new JComboBox();
		cbxJornada.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Tiempo completo", "Medio tiempo"}));
		cbxJornada.setBounds(9, 325, 239, 25);
		panel.add(cbxJornada);
		
		JComboBox cbxTipoDeContrato = new JComboBox();
		cbxTipoDeContrato.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Por tiempo indefinido", "Por tiempo definido"}));
		cbxTipoDeContrato.setBounds(257, 325, 239, 25);
		panel.add(cbxTipoDeContrato);
		
		JLabel label_6 = new JLabel("Tipo de contrato");
		label_6.setBounds(257, 300, 122, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Jornada");
		label_7.setBounds(10, 300, 122, 14);
		panel.add(label_7);
		JSpinner spnFechaVencimiento = new JSpinner();
		JLabel label_8 = new JLabel("Fecha de vencimiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(9, 361, 136, 14);
		panel.add(label_8);
		JComboBox cbxCategoriaLab = new JComboBox();
		cbxCategoriaLab.setEnabled(false);
		JButton button = new JButton("Crear oferta");
		JComboBox cbxNivelEstudio = new JComboBox();
		txtOfertaLab = new JTextField();
		cbxNivelEstudio.setModel(new DefaultComboBoxModel(new String[] {"Universitario", "T\u00E9cnico", "Educaci\u00F3n b\u00E1sica"}));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Oferta auxOferta = new Oferta("CS-"+BolsaDeTrabajo.getInstance().getIdSolicitud(), cbxCategoriaLab.getSelectedItem().toString(), txtOfertaLab.getText(), cbxNivelEstudio.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), (java.sql.Date)spnFechaVencimiento.getValue(), Integer.parseInt(spnVacantes.getValue().toString()), cbxJornada.getSelectedItem().toString(), Integer.parseInt(spnSalario.getValue().toString()), cbxTipoDeContrato.getSelectedItem().toString(), cbxPeriodoPago.getSelectedItem().toString(), ((CentroEmpleador)user), "Disponible");
				((CentroEmpleador)user).getMisOfertas().add(auxOferta);
				BolsaDeTrabajo.getInstance().aumentarCodSol();
				BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxOferta);
				JOptionPane.showMessageDialog(null, "La oferta se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		button.setBounds(300, 376, 195, 35);
		panel.add(button);
		
		
		spnFechaVencimiento.setModel(new SpinnerDateModel(new Date(), new Date(), null, Calendar.DAY_OF_YEAR));
		spnFechaVencimiento.setBounds(9, 386, 242, 25);
		panel.add(spnFechaVencimiento);
		
		JLabel lblCategoriaLaboral = new JLabel("Categoria laboral:");
		lblCategoriaLaboral.setBounds(10, 56, 122, 14);
		panel.add(lblCategoriaLaboral);
		
		
		cbxCategoriaLab.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
		cbxCategoriaLab.setBounds(10, 81, 239, 25);
		panel.add(cbxCategoriaLab);
		cbxCategoriaLab.setSelectedItem(((CentroEmpleador)user).getCategoriaLaboral());
		
		
		cbxNivelEstudio.setBounds(9, 142, 239, 25);
		panel.add(cbxNivelEstudio);
		
		JLabel lblNivelDeEstudio = new JLabel("Nivel de estudio requerido:");
		lblNivelDeEstudio.setBounds(9, 117, 137, 14);
		panel.add(lblNivelDeEstudio);
		
		txtOfertaLab.setText((String) null);
		txtOfertaLab.setColumns(10);
		txtOfertaLab.setBounds(258, 81, 238, 25);
		panel.add(txtOfertaLab);
	}
}
