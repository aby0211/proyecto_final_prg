package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import logico.Administrador;
import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.CentroEmpleador;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ResumenPostulacion extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtOfertaLaboral;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtFechaNacimiento;
	private JTextField txtNivelDeEstudio;
	private JTextField txtCarrera;
	private JTextField txtCE;
	private JTextField txtAreaTécnica;
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
	public ResumenPostulacion(Oferta oferta,Postulacion post, int modo) {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setTitle("Resumen de candidato");
		setModal(true);
		setBounds(100, 100, 550, 539);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{

			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel_1.setLayout(null);
				panel_1.setBounds(10, 61, 511, 324);
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
				
				txtAreaTécnica = new JTextField();
				txtAreaTécnica.setEditable(false);
				txtAreaTécnica.setColumns(10);
				txtAreaTécnica.setBounds(258, 158, 238, 25);
				panel_1.add(txtAreaTécnica);
				
				JLabel label = new JLabel("Carrera:");
				label.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label.setBounds(280, 110, 169, 14);
				panel_1.add(label);
				
				JLabel label_1 = new JLabel("Salario m\u00EDnimo:");
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
				label_1.setBounds(10, 194, 238, 14);
				panel_1.add(label_1);
				
				JLabel lblListaDeOficios = new JLabel("Lista de oficios:");
				lblListaDeOficios.setEnabled(false);
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
					txtAreaTécnica.setText("No disponible");
					txtCE.setText(((Universitario)post).getCentroEducativo());
				}
				if(post instanceof Tecnico) {
					txtNivelDeEstudio.setText("Técnico");
					txtCarrera.setText("No Disponible");
					txtAreaTécnica.setText(((Tecnico)post).getAreaTecnica());
					txtCE.setText(((Tecnico)post).getCentroEducativo());
				}
				if(post instanceof Obrero) {
					txtNivelDeEstudio.setText("Educ. Básica");
					txtCarrera.setText("No nisponible");
					txtAreaTécnica.setText("No disponible");
					
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
					if(post instanceof Obrero) {
						lblListaDeOficios.setEnabled(true);
						loadTable((Obrero)post);
					}
				}
				
				txtSalarioMin.setText(String.valueOf(post.getMiCandidato().getRangoSalarioMinimo()));
				//txtFechaNacimiento.setText();
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel_1.setBounds(10, 11, 511, 36);
				panel.add(panel_1);
				{
					JLabel label = new JLabel("Candidato");
					label.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel_1.add(label);
				}
			}
			{
				JButton btnFinalizarContratacion = new JButton("Finalizar contrataci\u00F3n");
				btnFinalizarContratacion.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						BolsaDeTrabajo.getInstance().confirmarContratacion(oferta, post);
						if(oferta.getCantVacantes()==oferta.getMiCentro().getMisCandidatos().size()) {
							BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(oferta.getCodigo()).setEstado("Completada");
						}
						
						BolsaDeTrabajo.getInstance().guardarBolsa();
						JOptionPane.showMessageDialog(null, "La contratación se ha realizado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
					}
				});
				btnFinalizarContratacion.setFont(new Font("Tahoma", Font.PLAIN, 13));
				btnFinalizarContratacion.setBounds(354, 443, 167, 36);
				panel.add(btnFinalizarContratacion);
				JLabel lblNewLabel = new JLabel("Completada");
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				panel_1.setBackground(new Color(127, 255, 0));
				panel_1.setBounds(10, 396, 511, 36);
				lblNewLabel.setText(post.getEstado());
				if(post.getEstado().equalsIgnoreCase("Completada")) {
					panel_1.setBackground(Color.GREEN);
					
				}else if(post.getEstado().equalsIgnoreCase("Enviada")) {
					panel_1.setBackground(Color.YELLOW);
				
				}else if(post.getEstado().equalsIgnoreCase("Eliminada")) {
					panel_1.setBackground(Color.RED);
					
				}else if(post.getEstado().equalsIgnoreCase("Expirada")) {
					panel_1.setBackground(Color.RED);
			
				}
				
				
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					
					lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
					lblNewLabel.setBounds(208, 5, 165, 25);
					panel_1.add(lblNewLabel);
					
				}
				if(modo==1) {
					btnFinalizarContratacion.setVisible(true);
					setBounds(100, 100, 550, 539);
				}else if(modo==0){
					setBounds(100, 100, 550, 492);
					btnFinalizarContratacion.setVisible(false);
				}
			}
			
			
		}
	}
	
	private void loadTable(Obrero post) {
		model.setRowCount(0);
		model.setColumnCount(1);
		row = new Object[model.getColumnCount()];
		for (int i = 0; i <post.getOficio().size(); i++) {
			row[0] = post.getOficio().get(i);
			model.addRow(row);
		}
	}
}
