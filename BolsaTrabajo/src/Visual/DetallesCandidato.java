package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DetallesCandidato extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFechaNacimiento;
	private JTextField txtProvincia;
	private JTextField txtNivelEstudio;
	private JTextField txtTituloCurriculum;
	private JTextField txtRangoSalario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetallesCandidato frame = new DetallesCandidato();
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
	public DetallesCandidato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 563, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 11, 517, 31);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Candidato");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 53, 517, 264);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(10, 11, 122, 14);
		panel_2.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(258, 11, 122, 14);
		panel_2.add(lblTelefono);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 36, 238, 25);
		panel_2.add(txtNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(258, 36, 238, 25);
		panel_2.add(txtTelefono);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setEditable(false);
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(10, 97, 238, 25);
		panel_2.add(txtFechaNacimiento);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(10, 72, 122, 14);
		panel_2.add(lblFechaDeNacimiento);
		
		JLabel lblProvinvic = new JLabel("Provincia");
		lblProvinvic.setBounds(258, 72, 122, 14);
		panel_2.add(lblProvinvic);
		
		txtProvincia = new JTextField();
		txtProvincia.setEditable(false);
		txtProvincia.setColumns(10);
		txtProvincia.setBounds(258, 97, 238, 25);
		panel_2.add(txtProvincia);
		
		txtNivelEstudio = new JTextField();
		txtNivelEstudio.setEditable(false);
		txtNivelEstudio.setColumns(10);
		txtNivelEstudio.setBounds(10, 158, 238, 25);
		panel_2.add(txtNivelEstudio);
		
		txtTituloCurriculum = new JTextField();
		txtTituloCurriculum.setEditable(false);
		txtTituloCurriculum.setColumns(10);
		txtTituloCurriculum.setBounds(258, 158, 238, 25);
		panel_2.add(txtTituloCurriculum);
		
		JLabel lblTituloDelCurriculum = new JLabel("Titulo del curriculum");
		lblTituloDelCurriculum.setBounds(258, 133, 122, 14);
		panel_2.add(lblTituloDelCurriculum);
		
		JLabel lblNivelDeEstudio = new JLabel("Nivel de estudio");
		lblNivelDeEstudio.setBounds(10, 133, 122, 14);
		panel_2.add(lblNivelDeEstudio);
		
		JLabel lblRangoDeSalario = new JLabel("Rango de salario minimo");
		lblRangoDeSalario.setBounds(10, 194, 122, 14);
		panel_2.add(lblRangoDeSalario);
		
		txtRangoSalario = new JTextField();
		txtRangoSalario.setEditable(false);
		txtRangoSalario.setColumns(10);
		txtRangoSalario.setBounds(10, 219, 238, 25);
		panel_2.add(txtRangoSalario);
		
		JButton btnContratar = new JButton("Contratar");
		btnContratar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnContratar.setBounds(362, 328, 165, 35);
		panel.add(btnContratar);
	}
}
