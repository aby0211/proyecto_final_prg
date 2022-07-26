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

public class CrearOferta extends JFrame {

	private JPanel contentPane;
	private JTextField txtEmpresa;
	private JTextField txtOfertaLaboral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearOferta frame = new CrearOferta();
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
	public CrearOferta() {
		setTitle("Crear oferta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setEditable(false);
		txtEmpresa.setBounds(10, 38, 238, 25);
		panel.add(txtEmpresa);
		txtEmpresa.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre de la empresa ");
		lblNewLabel.setBounds(10, 13, 122, 14);
		panel.add(lblNewLabel);
		
		txtOfertaLaboral = new JTextField();
		txtOfertaLaboral.setEditable(false);
		txtOfertaLaboral.setColumns(10);
		txtOfertaLaboral.setBounds(258, 38, 238, 25);
		panel.add(txtOfertaLaboral);
		
		JLabel lblOfertaLaboral = new JLabel("Oferta laboral");
		lblOfertaLaboral.setBounds(258, 13, 122, 14);
		panel.add(lblOfertaLaboral);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(258, 74, 122, 14);
		panel.add(lblProvincia);
		
		JLabel lblNombreDeLa = new JLabel("Cantidad de vacantes:");
		lblNombreDeLa.setBounds(10, 104, 122, 14);
		panel.add(lblNombreDeLa);
		
		JSpinner SpnCantVacantes = new JSpinner();
		SpnCantVacantes.setBounds(183, 99, 65, 25);
		panel.add(SpnCantVacantes);
		
		JComboBox cmbxProvincia = new JComboBox();
		cmbxProvincia.setEditable(true);
		cmbxProvincia.setBounds(258, 99, 239, 25);
		panel.add(cmbxProvincia);
		
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
		
		JSpinner spnSalario = new JSpinner();
		spnSalario.setBounds(10, 160, 237, 25);
		panel.add(spnSalario);
		
		JComboBox cmbxPeriodoPago = new JComboBox();
		cmbxPeriodoPago.setEditable(true);
		cmbxPeriodoPago.setBounds(257, 160, 239, 25);
		panel.add(cmbxPeriodoPago);
		
		JComboBox cmbxContrato = new JComboBox();
		cmbxContrato.setEditable(true);
		cmbxContrato.setBounds(258, 221, 239, 25);
		panel.add(cmbxContrato);
		
		JComboBox cmbxJornada = new JComboBox();
		cmbxJornada.setEditable(true);
		cmbxJornada.setBounds(10, 221, 239, 25);
		panel.add(cmbxJornada);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de vencimiento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(183, 261, 136, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox cmbxDia = new JComboBox();
		cmbxDia.setEditable(true);
		cmbxDia.setBounds(11, 298, 102, 25);
		panel.add(cmbxDia);
		
		JComboBox cmbxMes = new JComboBox();
		cmbxMes.setEditable(true);
		cmbxMes.setBounds(126, 298, 259, 25);
		panel.add(cmbxMes);
		
		JComboBox cmbxAnno = new JComboBox();
		cmbxAnno.setEditable(true);
		cmbxAnno.setBounds(397, 298, 102, 25);
		panel.add(cmbxAnno);
		
		JLabel lblNewLabel_2 = new JLabel("Dia");
		lblNewLabel_2.setBounds(87, 279, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(352, 279, 29, 14);
		panel.add(lblMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setBounds(469, 279, 29, 14);
		panel.add(lblAo);
		
		JButton btnCrearOferta = new JButton("Crear oferta");
		btnCrearOferta.setEnabled(false);
		btnCrearOferta.setBounds(301, 344, 195, 35);
		panel.add(btnCrearOferta);
	}
}