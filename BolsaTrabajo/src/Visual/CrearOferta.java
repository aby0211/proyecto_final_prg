package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.BolsaDeTrabajo;
import logico.CentroEmpleador;
import logico.Solicitud;

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
	private JTextField txtOfertaLaboral;

	public CrearOferta(CentroEmpleador centro) {
		setBounds(100, 100, 532, 410);
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
		txtNombre.setText(centro.getNombre());
		panel.add(txtNombre);
		
		txtOfertaLaboral = new JTextField();


		txtOfertaLaboral.setColumns(10);
		txtOfertaLaboral.setBounds(258, 81, 238, 25);
		panel.add(txtOfertaLaboral);
		
		JSpinner spnVacantes = new JSpinner();
		spnVacantes.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spnVacantes.setBounds(183, 142, 65, 25);
		panel.add(spnVacantes);
		
		JLabel label_2 = new JLabel("Provincia");
		label_2.setBounds(258, 117, 122, 14);
		panel.add(label_2);
		
		JComboBox cbxProvincia = new JComboBox();
		cbxProvincia.setEnabled(false);
		cbxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
		cbxProvincia.setBounds(258, 142, 239, 25);
		cbxProvincia.setSelectedItem(centro.getProvincia());
		panel.add(cbxProvincia);
		
		JLabel label_3 = new JLabel("Cantidad de vacantes:");
		label_3.setBounds(10, 147, 122, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Salario");
		label_4.setBounds(10, 178, 122, 14);
		panel.add(label_4);
		
		JSpinner spnSalario = new JSpinner();
		spnSalario.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
		spnSalario.setBounds(10, 203, 237, 25);
		panel.add(spnSalario);
		
		JComboBox cbxPeriodoPago = new JComboBox();
		cbxPeriodoPago.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Quincenal", "Mensual"}));
		cbxPeriodoPago.setEditable(true);
		cbxPeriodoPago.setBounds(257, 203, 239, 25);
		panel.add(cbxPeriodoPago);
		
		JLabel label_5 = new JLabel("Periodo de pago");
		label_5.setBounds(258, 178, 122, 14);
		panel.add(label_5);
		
		JComboBox cbxJornada = new JComboBox();
		cbxJornada.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Tiempo completo", "Medio tiempo"}));
		cbxJornada.setEditable(true);
		cbxJornada.setBounds(10, 264, 239, 25);
		panel.add(cbxJornada);
		
		JComboBox cbxTipoDeContrato = new JComboBox();
		cbxTipoDeContrato.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Por tiempo indefinido", "Por tiempo definido"}));
		cbxTipoDeContrato.setEditable(true);
		cbxTipoDeContrato.setBounds(258, 264, 239, 25);
		panel.add(cbxTipoDeContrato);
		
		JLabel label_6 = new JLabel("Tipo de contrato");
		label_6.setBounds(258, 239, 122, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Jornada");
		label_7.setBounds(10, 239, 122, 14);
		panel.add(label_7);
		JSpinner spnFechaVencimiento = new JSpinner();
		JLabel label_8 = new JLabel("Fecha de vencimiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 300, 136, 14);
		panel.add(label_8);
		JComboBox cbxCategoriaLab = new JComboBox();
		JButton button = new JButton("Crear oferta");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				
				Solicitud auxSol = new Solicitud("CS-", txtOfertaLaboral.getText(), cbxCategoriaLab.getSelectedItem().toString(), cbxProvincia.getSelectedItem().toString(), date, Integer.parseInt(spnVacantes.getValue().toString()), cbxJornada.getSelectedItem().toString(), Integer.parseInt(spnSalario.getValue().toString()), cbxTipoDeContrato.getSelectedItem().toString(), cbxPeriodoPago.getSelectedItem().toString(), centro, "Disponible");
				BolsaDeTrabajo.getInstance().getMisSolicitudes().add(auxSol);
				BolsaDeTrabajo.getInstance().buscarEmpresaByEmail(centro.getEmail()).getMisSolicitudes().add(auxSol);
				JOptionPane.showMessageDialog(null, "La oferta se ha creado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		button.setBounds(301, 315, 195, 35);
		panel.add(button);
		
		
		spnFechaVencimiento.setModel(new SpinnerDateModel(new Date(1658863542285L), new Date(1658863542285L), null, Calendar.DAY_OF_YEAR));
		spnFechaVencimiento.setBounds(10, 325, 242, 25);
		panel.add(spnFechaVencimiento);
		
		JLabel lblCategoriaLaboral = new JLabel("Categoria laboral:");
		lblCategoriaLaboral.setBounds(10, 56, 122, 14);
		panel.add(lblCategoriaLaboral);
		
		
		cbxCategoriaLab.setModel(new DefaultComboBoxModel(new String[] {"<Seleccionar>", "Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
		cbxCategoriaLab.setBounds(10, 81, 239, 25);
		panel.add(cbxCategoriaLab);
		
	}

}
