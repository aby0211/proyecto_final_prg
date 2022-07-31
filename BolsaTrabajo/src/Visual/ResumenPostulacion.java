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
import javax.swing.table.DefaultTableModel;

import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.Obrero;
import logico.Oferta;
import logico.Postulacion;
import logico.Tecnico;
import logico.Universitario;

import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class ResumenPostulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtOfertaLaboral;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFechaNacimiento;
	private JTextField txtNivelDeEstudio;
	private JTextField txtCarrera;
	private JTextField txtCE;
	private JTextField txtAreaT�cnica;
	private JTextField txtSalarioMin;
	private JTable table;
	private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public ResumenPostulacion(Oferta oferta, Postulacion post) {
		setTitle("Resumen de candidato");
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setModal(true);
		setResizable(false);
		setBounds(100, 100, 550, 545);
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
				txtOfertaLaboral.setText(oferta.getOfertaLaboral());
			}
			{
				JLabel lblOfertaLaboral = new JLabel("Oferta laboral:");
				lblOfertaLaboral.setBounds(10, 11, 144, 14);
				panel.add(lblOfertaLaboral);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setLayout(null);
				panel_1.setBounds(10, 122, 511, 324);
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
					txtFechaNacimiento.setBounds(10, 280, 238, 25);
					panel_1.add(txtFechaNacimiento);
				}
				{
					JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
					lblFechaDeNacimiento.setBounds(10, 255, 144, 14);
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
					txtCarrera = new JTextField();
					txtCarrera.setEditable(false);
					txtCarrera.setColumns(10);
					txtCarrera.setBounds(258, 97, 238, 25);
					panel_1.add(txtCarrera);
				}
				{
					JLabel lblCarrera = new JLabel("Carrera:");
					lblCarrera.setBounds(258, 72, 144, 14);
					panel_1.add(lblCarrera);
				}
				{
					JLabel lblTituloDelCurriculum = new JLabel("Centro educativo:");
					lblTituloDelCurriculum.setBounds(10, 133, 144, 14);
					panel_1.add(lblTituloDelCurriculum);
				}
				{
					txtCE = new JTextField();
					txtCE.setEditable(false);
					txtCE.setColumns(10);
					txtCE.setBounds(10, 158, 238, 25);
					panel_1.add(txtCE);
				}
				
				JLabel lblAosDeExperiencia = new JLabel("Area t\u00E9cnica:");
				lblAosDeExperiencia.setBounds(258, 133, 144, 14);
				panel_1.add(lblAosDeExperiencia);
				
				txtAreaT�cnica = new JTextField();
				txtAreaT�cnica.setEditable(false);
				txtAreaT�cnica.setColumns(10);
				txtAreaT�cnica.setBounds(258, 158, 238, 25);
				panel_1.add(txtAreaT�cnica);
				
				JLabel label = new JLabel("Carrera:");
				label.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label.setBounds(280, 110, 169, 14);
				panel_1.add(label);
				
				JLabel label_1 = new JLabel("Salario m\u00EDnimo:");
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_1.setBounds(10, 194, 238, 14);
				panel_1.add(label_1);
				
				JLabel lblListaDeOficios = new JLabel("Lista de oficios:");
				lblListaDeOficios.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblListaDeOficios.setBounds(258, 194, 108, 14);
				panel_1.add(lblListaDeOficios);
				
				txtSalarioMin = new JTextField();
				txtSalarioMin.setEditable(false);
				txtSalarioMin.setColumns(10);
				txtSalarioMin.setBounds(10, 219, 238, 25);
				panel_1.add(txtSalarioMin);
				txtNombre.setText(post.getMiCandidato().getNombre());
				
				
				if(post instanceof Universitario) {
					txtNivelDeEstudio.setText("Universitario");
					txtCarrera.setText(((Universitario)post).getCarrera());
				}
				if(post instanceof Tecnico) {
					txtNivelDeEstudio.setText("T�cnico");
					txtAreaT�cnica.setText(((Tecnico)post).getAreaTecnica());
				}
				if(post instanceof Obrero) {
					txtNivelDeEstudio.setText("Educ. B�sica");
					table.setEnabled(true);
					loadTable(post);
					
				}

				
				txtTelefono.setText(post.getMiCandidato().getTelefono());
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(258, 219, 238, 86);
				panel_1.add(panel_2);
				panel_2.setLayout(new BorderLayout(0, 0));
				{
					JScrollPane scrollPane = new JScrollPane();
					scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
					panel_2.add(scrollPane, BorderLayout.CENTER);
					{
						String headers[] = {"Oficio"};
						model = new DefaultTableModel();
						model.setColumnIdentifiers(headers);
						table = new JTable();
						table.setModel(model);
						scrollPane.setViewportView(table);
					}
					
					table = new JTable();
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
					if(post instanceof Obrero) {
						loadTable(post);
					}
				}
				
				txtSalarioMin.setText(String.valueOf(post.getMiCandidato().getRangoSalarioMinimo()));
				//txtFechaNacimiento.setText();
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
				btnFinalizarContratacion.setBounds(354, 457, 167, 36);
				panel.add(btnFinalizarContratacion);
			}
			
		}
	}
	private void loadTable(Postulacion post) {
		model.setRowCount(0);
		model.setColumnCount(1);
		row = new Object[model.getColumnCount()];
		for (int i = 0; i <(((Obrero)post).getOficio().size()); i++) {
			row[0] = (((Obrero)post).getOficio().get(i)); 
			model.addRow(row);
		}
	}
}
