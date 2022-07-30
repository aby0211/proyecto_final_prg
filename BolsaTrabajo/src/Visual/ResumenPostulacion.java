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
	private JTextField txtOfertaLaboral;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFechaNacimiento;
	private JTextField txtNivelDeEstudio;
	private JTextField txtCentroEducativo;
	private JTextField txtTituloCurriculum;
	private JTextField txtAnnosExperiencia;

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
		setTitle("Resumen de candidato");
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
				txtOfertaLaboral = new JTextField();
				txtOfertaLaboral.setEditable(false);
				txtOfertaLaboral.setColumns(10);
				txtOfertaLaboral.setBounds(10, 36, 238, 25);
				panel.add(txtOfertaLaboral);
			}
			{
				JLabel lblOfertaLaboral = new JLabel("Oferta laboral:");
				lblOfertaLaboral.setBounds(10, 11, 144, 14);
				panel.add(lblOfertaLaboral);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBounds(10, 122, 511, 256);
				panel.add(panel_1);
				{
					txtNombre = new JTextField();
					txtNombre.setEditable(false);
					txtNombre.setColumns(10);
					txtNombre.setBounds(10, 36, 238, 25);
					panel_1.add(txtNombre);
				}
				{
					JLabel label = new JLabel("Nombre");
					label.setBounds(10, 11, 144, 14);
					panel_1.add(label);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.setEditable(false);
					txtTelefono.setColumns(10);
					txtTelefono.setBounds(258, 36, 238, 25);
					panel_1.add(txtTelefono);
				}
				{
					JLabel label = new JLabel("Tel\u00E9fono");
					label.setBounds(258, 11, 144, 14);
					panel_1.add(label);
				}
				{
					txtFechaNacimiento = new JTextField();
					txtFechaNacimiento.setEditable(false);
					txtFechaNacimiento.setColumns(10);
					txtFechaNacimiento.setBounds(10, 220, 238, 25);
					panel_1.add(txtFechaNacimiento);
				}
				{
					JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
					lblFechaDeNacimiento.setBounds(10, 195, 144, 14);
					panel_1.add(lblFechaDeNacimiento);
				}
				{
					txtNivelDeEstudio = new JTextField();
					txtNivelDeEstudio.setEditable(false);
					txtNivelDeEstudio.setColumns(10);
					txtNivelDeEstudio.setBounds(10, 97, 238, 25);
					panel_1.add(txtNivelDeEstudio);
				}
				{
					JLabel label = new JLabel("Nivel de estudio");
					label.setBounds(10, 72, 144, 14);
					panel_1.add(label);
				}
				{
					txtCentroEducativo = new JTextField();
					txtCentroEducativo.setEditable(false);
					txtCentroEducativo.setColumns(10);
					txtCentroEducativo.setBounds(258, 97, 238, 25);
					panel_1.add(txtCentroEducativo);
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
					txtTituloCurriculum = new JTextField();
					txtTituloCurriculum.setEditable(false);
					txtTituloCurriculum.setColumns(10);
					txtTituloCurriculum.setBounds(10, 158, 238, 25);
					panel_1.add(txtTituloCurriculum);
				}
				
				JLabel lblAosDeExperiencia = new JLabel("A\u00F1os de experiencia");
				lblAosDeExperiencia.setBounds(258, 133, 144, 14);
				panel_1.add(lblAosDeExperiencia);
				
				txtAnnosExperiencia = new JTextField();
				txtAnnosExperiencia.setEditable(false);
				txtAnnosExperiencia.setColumns(10);
				txtAnnosExperiencia.setBounds(258, 158, 238, 25);
				panel_1.add(txtAnnosExperiencia);
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
				JButton btnFinalizarContratacion = new JButton("Finalizar contrataci\u00F3n");
				btnFinalizarContratacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
				btnFinalizarContratacion.setBounds(354, 389, 167, 36);
				panel.add(btnFinalizarContratacion);
			}
		}
	}
}
