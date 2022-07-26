package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class DetallesOferta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetallesOferta frame = new DetallesOferta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DetallesOferta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
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
		
		JLabel lblFechaDeVencimiento = new JLabel("Fecha de vencimiento");
		lblFechaDeVencimiento.setBounds(506, 133, 122, 14);
		panel.add(lblFechaDeVencimiento);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(664, 36, 80, 25);
		panel.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(258, 97, 238, 25);
		panel.add(textField_3);
		
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
		
		JLabel lblNewLabel = new JLabel("Listado de candidatos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel);
		
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
		
		JButton btnNewButton = new JButton("Ver candidato");
		btnNewButton.setEnabled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(565, 443, 179, 33);
		panel.add(btnNewButton);
	}
}
