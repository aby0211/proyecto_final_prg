package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;

public class ResumenPostulacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResumenPostulacion frame = new ResumenPostulacion();
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
	public ResumenPostulacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(10, 38, 238, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre de la empresa ");
		lblNewLabel.setBounds(10, 13, 122, 14);
		panel.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(258, 38, 238, 25);
		panel.add(textField_1);
		
		JLabel lblOfertaLaboral = new JLabel("Oferta laboral");
		lblOfertaLaboral.setBounds(258, 13, 122, 14);
		panel.add(lblOfertaLaboral);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(258, 74, 122, 14);
		panel.add(lblProvincia);
		
		JLabel lblNombreDeLa = new JLabel("Cantidad de vacantes:");
		lblNombreDeLa.setBounds(10, 104, 122, 14);
		panel.add(lblNombreDeLa);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(196, 99, 52, 25);
		panel.add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setBounds(258, 99, 239, 25);
		panel.add(comboBox);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setBounds(10, 135, 122, 14);
		panel.add(lblSalario);
		
		JLabel lblPeriodoDePago = new JLabel("Periodo de pago");
		lblPeriodoDePago.setBounds(258, 135, 122, 14);
		panel.add(lblPeriodoDePago);
		
		JLabel lblJornada = new JLabel("Jornada");
		lblJornada.setBounds(10, 196, 122, 14);
		panel.add(lblJornada);
		
		JLabel lblTipoDeContrato = new JLabel("Tipo de contrato");
		lblTipoDeContrato.setBounds(258, 196, 122, 14);
		panel.add(lblTipoDeContrato);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(10, 160, 237, 25);
		panel.add(spinner_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(257, 160, 239, 25);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(258, 221, 239, 25);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(10, 221, 239, 25);
		panel.add(comboBox_3);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de vencimiento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(183, 261, 136, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(11, 298, 102, 25);
		panel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(126, 298, 259, 25);
		panel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setEditable(true);
		comboBox_6.setBounds(397, 298, 102, 25);
		panel.add(comboBox_6);
		
		JLabel lblNewLabel_2 = new JLabel("Dia");
		lblNewLabel_2.setBounds(87, 279, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(352, 279, 29, 14);
		panel.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(469, 279, 29, 14);
		panel.add(lblAo);
		
		JButton btnNewButton = new JButton("Crear oferta");
		btnNewButton.setBounds(301, 344, 195, 35);
		panel.add(btnNewButton);
	}
}
