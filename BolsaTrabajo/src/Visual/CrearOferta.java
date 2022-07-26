package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;

public class CrearOferta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CrearOferta dialog = new CrearOferta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CrearOferta() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModal(true);
		setBounds(100, 100, 532, 367);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Nombre de la empresa ");
		label.setBounds(10, 11, 122, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Oferta laboral");
		label_1.setBounds(258, 11, 122, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 36, 238, 25);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(258, 36, 238, 25);
		panel.add(textField_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(183, 97, 65, 25);
		panel.add(spinner);
		
		JLabel label_2 = new JLabel("Provincia");
		label_2.setBounds(258, 72, 122, 14);
		panel.add(label_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
		comboBox.setEditable(true);
		comboBox.setBounds(258, 97, 239, 25);
		panel.add(comboBox);
		
		JLabel label_3 = new JLabel("Cantidad de vacantes:");
		label_3.setBounds(10, 102, 122, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Salario");
		label_4.setBounds(10, 133, 122, 14);
		panel.add(label_4);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(new Integer(12000), new Integer(12000), null, new Integer(1)));
		spinner_1.setBounds(10, 158, 237, 25);
		panel.add(spinner_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Quincenal", "Mensual"}));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(257, 158, 239, 25);
		panel.add(comboBox_1);
		
		JLabel label_5 = new JLabel("Periodo de pago");
		label_5.setBounds(258, 133, 122, 14);
		panel.add(label_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Tiempo completo", "Medio tiempo"}));
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(10, 219, 239, 25);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Por tiempo indefinido", "Por tiempo definido", ""}));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(258, 219, 239, 25);
		panel.add(comboBox_3);
		
		JLabel label_6 = new JLabel("Tipo de contrato");
		label_6.setBounds(258, 194, 122, 14);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Jornada");
		label_7.setBounds(10, 194, 122, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Fecha de vencimiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_8.setBounds(10, 255, 136, 14);
		panel.add(label_8);
		
		JButton button = new JButton("Crear oferta");
		button.setEnabled(false);
		button.setBounds(301, 270, 195, 35);
		panel.add(button);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setModel(new SpinnerDateModel(new Date(1658863542285L), new Date(1658863542285L), null, Calendar.DAY_OF_YEAR));
		spinner_4.setBounds(10, 280, 242, 25);
		panel.add(spinner_4);
	}
}
