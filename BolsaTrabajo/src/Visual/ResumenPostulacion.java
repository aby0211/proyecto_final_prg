package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class ResumenPostulacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtRangoSalarioMin;
	private JTextField txtNivelEstudio;
	private JTextField txtCentroEducativo;
	private JTextField txtTituloCurriculum;
	private JTextField txtAnnoExperiencia;
	private JTextField txtFechaNacimiento;

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
		setBounds(100, 100, 557, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(10, 36, 238, 25);
		panel.add(textField);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la oferta");
		lblNombreDeLa.setBounds(10, 11, 144, 14);
		panel.add(lblNombreDeLa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 122, 511, 256);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 36, 238, 25);
		panel_1.add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 144, 14);
		panel_1.add(lblNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(258, 36, 238, 25);
		panel_1.add(txtTelefono);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(258, 11, 144, 14);
		panel_1.add(lblTelfono);
		
		txtRangoSalarioMin = new JTextField();
		txtRangoSalarioMin.setEditable(false);
		txtRangoSalarioMin.setColumns(10);
		txtRangoSalarioMin.setBounds(10, 220, 238, 25);
		panel_1.add(txtRangoSalarioMin);
		
		JLabel lblRangoDeSalario = new JLabel("Rango de salario minimo");
		lblRangoDeSalario.setBounds(10, 195, 144, 14);
		panel_1.add(lblRangoDeSalario);
		
		txtNivelEstudio = new JTextField();
		txtNivelEstudio.setEditable(false);
		txtNivelEstudio.setColumns(10);
		txtNivelEstudio.setBounds(10, 97, 238, 25);
		panel_1.add(txtNivelEstudio);
		
		JLabel lblNivelDeEstudio = new JLabel("Nivel de estudio");
		lblNivelDeEstudio.setBounds(10, 72, 144, 14);
		panel_1.add(lblNivelDeEstudio);
		
		txtCentroEducativo = new JTextField();
		txtCentroEducativo.setEditable(false);
		txtCentroEducativo.setColumns(10);
		txtCentroEducativo.setBounds(258, 97, 238, 25);
		panel_1.add(txtCentroEducativo);
		
		JLabel lblTituloDeCurriculum = new JLabel("Centro educativo");
		lblTituloDeCurriculum.setBounds(258, 72, 144, 14);
		panel_1.add(lblTituloDeCurriculum);
		
		JLabel lblTituloDelCurriculum = new JLabel("Titulo del curriculum");
		lblTituloDelCurriculum.setBounds(10, 133, 144, 14);
		panel_1.add(lblTituloDelCurriculum);
		
		txtTituloCurriculum = new JTextField();
		txtTituloCurriculum.setEditable(false);
		txtTituloCurriculum.setColumns(10);
		txtTituloCurriculum.setBounds(10, 158, 238, 25);
		panel_1.add(txtTituloCurriculum);
		
		txtAnnoExperiencia = new JTextField();
		txtAnnoExperiencia.setEditable(false);
		txtAnnoExperiencia.setColumns(10);
		txtAnnoExperiencia.setBounds(258, 158, 238, 25);
		panel_1.add(txtAnnoExperiencia);
		
		JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia");
		lblAosDeExperiencia.setBounds(258, 133, 144, 14);
		panel_1.add(lblAosDeExperiencia);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setEditable(false);
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(258, 220, 238, 25);
		panel_1.add(txtFechaNacimiento);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(258, 195, 144, 14);
		panel_1.add(lblFechaDeNacimiento);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(10, 72, 511, 36);
		panel.add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Candidato");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_2.add(lblNewLabel);
		
		JButton btnContratar = new JButton("Contratar");
		btnContratar.setBounds(377, 389, 144, 30);
		panel.add(btnContratar);
	}
}
