package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class DetallesOferta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DetallesOferta dialog = new DetallesOferta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DetallesOferta() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 780, 533);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel label = new JLabel("Tipo de contrato");
			label.setBounds(258, 133, 122, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Jornada");
			label_1.setBounds(10, 133, 122, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Salario");
			label_2.setBounds(258, 72, 122, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("Periodo de pago");
			label_3.setBounds(506, 72, 122, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("Provincia");
			label_4.setBounds(10, 72, 122, 14);
			panel.add(label_4);
			
			JLabel label_5 = new JLabel("Cantidad de vacantes:");
			label_5.setBounds(506, 41, 122, 14);
			panel.add(label_5);
			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(258, 36, 238, 25);
			panel.add(textField);
			
			JLabel label_6 = new JLabel("Nombre de la empresa ");
			label_6.setBounds(258, 11, 122, 14);
			panel.add(label_6);
			
			JLabel label_7 = new JLabel("Oferta laboral");
			label_7.setBounds(10, 11, 122, 14);
			panel.add(label_7);
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(10, 36, 238, 25);
			panel.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(506, 158, 238, 25);
			panel.add(textField_2);
			
			JLabel label_8 = new JLabel("Fecha de vencimiento");
			label_8.setBounds(506, 133, 122, 14);
			panel.add(label_8);
			
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(664, 36, 80, 25);
			panel.add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(258, 97, 238, 25);
			panel.add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBounds(506, 97, 238, 25);
			panel.add(textField_5);
			
			textField_6 = new JTextField();
			textField_6.setEditable(false);
			textField_6.setColumns(10);
			textField_6.setBounds(10, 158, 238, 25);
			panel.add(textField_6);
			
			textField_7 = new JTextField();
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(258, 158, 238, 25);
			panel.add(textField_7);
			
			textField_8 = new JTextField();
			textField_8.setEditable(false);
			textField_8.setColumns(10);
			textField_8.setBounds(10, 97, 238, 25);
			panel.add(textField_8);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_1.setBounds(10, 211, 734, 32);
			panel.add(panel_1);
			
			JLabel label_9 = new JLabel("Listado de candidatos");
			label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
			panel_1.add(label_9);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(10, 254, 734, 178);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_2.add(scrollPane, BorderLayout.CENTER);
			
			table = new JTable();
			table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			scrollPane.setViewportView(table);
			
			JButton button = new JButton("Ver candidato");
			button.setFont(new Font("Tahoma", Font.PLAIN, 14));
			button.setEnabled(false);
			button.setBounds(565, 440, 179, 33);
			panel.add(button);
		}
	}
}
