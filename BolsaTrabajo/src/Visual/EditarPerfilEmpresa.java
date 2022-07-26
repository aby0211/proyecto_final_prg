package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.DefaultComboBoxModel;

public class EditarPerfilEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EditarPerfilEmpresa dialog = new EditarPerfilEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EditarPerfilEmpresa() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 323, 501);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(12, 36, 273, 25);
			panel.add(textField);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(12, 118, 273, 25);
			panel.add(textField_1);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(12, 364, 273, 25);
			panel.add(textField_3);
			
			JLabel label = new JLabel("Email");
			label.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label.setBounds(12, 11, 54, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Contrase\u00F1a");
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_1.setBounds(12, 93, 80, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Categoria laboral");
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_2.setBounds(12, 175, 111, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("Provincia");
			label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_3.setBounds(12, 257, 54, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("Telefono");
			label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
			label_4.setBounds(12, 341, 54, 14);
			panel.add(label_4);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Azua", "Bahoruco", "Barahona", "Dajab\u00F3n", "Duarte", "El Seibo", "El\u00EDas Pi\u00F1a", "Espaillat", "Hato Mayor", "Hermanas Mirabal", "Independencia", "La Altagracia", "La Romana", "La Vega", "Maria Trinidad S\u00E1nchez", "Monse\u00F1or Nouel", "Monte Cristi", "Monte Plata", "Pedernales", "Peravia", "Puerto Plata", "Saman\u00E1", "San Cristobal", "San Jos\u00E9 De Ocoa", "San Juan", "San Pedro De Macoris", "S\u00E1nchez Ram\u00EDrez", "Santiago", "Santiago Rodr\u00EDguez", "Santo Domingo", "Valverde", "Distrito Nacional"}));
			comboBox.setEditable(true);
			comboBox.setBounds(12, 282, 273, 25);
			panel.add(comboBox);
			
			JButton button = new JButton("Confirmar");
			button.setBounds(152, 414, 133, 27);
			panel.add(button);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mercado Financiero", "Crecimiento Econ\u00F3mico", "Biotecnolog\u00EDa y Seguridad Qu\u00EDmica", "Desarrollo Regional y Rural Urbano", "Turismo", "Medio Ambiente", "Comercio", "Asuntos Sociales y Bienestar", "Pymes y Emprendimiento", "Tecnolog\u00EDa de la Informaci\u00F3n y Comunicaciones", "Energ\u00EDa", "Legal", "Seguros y Pensiones", "Educaci\u00F3n", "Migraci\u00F3n", "Industrias y Servicios", "Inversiones", "Gobierno y Administraci\u00F3n P\u00FAblica", "Agricultura", "Pesca", "Salud", "Contabilidad"}));
			comboBox_1.setEditable(true);
			comboBox_1.setBounds(12, 200, 273, 25);
			panel.add(comboBox_1);
		}
	}
}
