package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;

public class ResumenPostulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ResumenPostulacion dialog = new ResumenPostulacion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ResumenPostulacion() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 550, 475);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				textField = new JTextField();
				textField.setEditable(false);
				textField.setColumns(10);
				textField.setBounds(10, 36, 238, 25);
				panel.add(textField);
			}
			{
				JLabel label = new JLabel("Nombre de la empresa ");
				label.setBounds(10, 11, 144, 14);
				panel.add(label);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBounds(10, 122, 511, 256);
				panel.add(panel_1);
				{
					textField_1 = new JTextField();
					textField_1.setEditable(false);
					textField_1.setColumns(10);
					textField_1.setBounds(10, 36, 238, 25);
					panel_1.add(textField_1);
				}
				{
					JLabel label = new JLabel("Nombre");
					label.setBounds(10, 11, 144, 14);
					panel_1.add(label);
				}
				{
					textField_2 = new JTextField();
					textField_2.setEditable(false);
					textField_2.setColumns(10);
					textField_2.setBounds(258, 36, 238, 25);
					panel_1.add(textField_2);
				}
				{
					JLabel label = new JLabel("Tel\u00E9fono");
					label.setBounds(258, 11, 144, 14);
					panel_1.add(label);
				}
				{
					textField_3 = new JTextField();
					textField_3.setEditable(false);
					textField_3.setColumns(10);
					textField_3.setBounds(10, 220, 238, 25);
					panel_1.add(textField_3);
				}
				{
					JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
					lblFechaDeNacimiento.setBounds(10, 195, 144, 14);
					panel_1.add(lblFechaDeNacimiento);
				}
				{
					textField_4 = new JTextField();
					textField_4.setEditable(false);
					textField_4.setColumns(10);
					textField_4.setBounds(10, 97, 238, 25);
					panel_1.add(textField_4);
				}
				{
					JLabel label = new JLabel("Nivel de estudio");
					label.setBounds(10, 72, 144, 14);
					panel_1.add(label);
				}
				{
					textField_5 = new JTextField();
					textField_5.setEditable(false);
					textField_5.setColumns(10);
					textField_5.setBounds(258, 97, 238, 25);
					panel_1.add(textField_5);
				}
				{
					JLabel label = new JLabel("Centro educativo:");
					label.setBounds(258, 72, 144, 14);
					panel_1.add(label);
				}
				{
					JLabel lblTituloDelCurriculum = new JLabel("Titulo del Curriculum");
					lblTituloDelCurriculum.setBounds(10, 133, 144, 14);
					panel_1.add(lblTituloDelCurriculum);
				}
				{
					textField_6 = new JTextField();
					textField_6.setEditable(false);
					textField_6.setColumns(10);
					textField_6.setBounds(10, 158, 238, 25);
					panel_1.add(textField_6);
				}
				
				JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia");
				lblAosDeExperiencia.setBounds(258, 133, 144, 14);
				panel_1.add(lblAosDeExperiencia);
				
				textField_7 = new JTextField();
				textField_7.setEditable(false);
				textField_7.setColumns(10);
				textField_7.setBounds(258, 158, 238, 25);
				panel_1.add(textField_7);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel_1.setBounds(10, 72, 511, 36);
				panel.add(panel_1);
				{
					JLabel label = new JLabel("Candidato");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel_1.add(label);
				}
			}
			{
				JButton btnNewButton = new JButton("Finalizar contrataci\u00F3n");
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
				btnNewButton.setBounds(354, 389, 167, 36);
				panel.add(btnNewButton);
			}
		}
	}
}
