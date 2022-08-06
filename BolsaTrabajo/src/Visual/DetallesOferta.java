package Visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.Oferta;
import logico.Postulacion;
import logico.Solicitud;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetallesOferta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEmpresa;
	private JTextField txtOfertaLab;
	private JTextField txtFechaVencimiento;
	private JTextField txtCantVacantes;
	private JTextField txtSalario;
	private JTextField txtPeriodoPago;
	private JTextField txtJornada;
	private JTextField txtTipoContrato;
	private JTextField txtProvincia;
	private JTable table;
	private DefaultTableModel model;
	private Object row[];
	private Postulacion selected=null;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public DetallesOferta(Oferta oferta) {
		setResizable(false);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		
		setTitle("Detalles de oferta");
		setBounds(100, 100, 780, 506);
		getContentPane().setLayout(new BorderLayout());
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/oferta.png")));

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel label = new JLabel("Tipo de contrato");
			label.setBounds(258, 194, 122, 14);
			panel.add(label);
			
			JLabel label_1 = new JLabel("Jornada");
			label_1.setBounds(10, 194, 122, 14);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("Salario");
			label_2.setBounds(258, 133, 122, 14);
			panel.add(label_2);
			
			JLabel label_3 = new JLabel("Periodo de pago");
			label_3.setBounds(506, 133, 122, 14);
			panel.add(label_3);
			
			JLabel label_4 = new JLabel("Provincia");
			label_4.setBounds(10, 133, 122, 14);
			panel.add(label_4);
			
			JLabel lblVacantesDisponibles = new JLabel("Vacantes disponibles:");
			lblVacantesDisponibles.setBounds(506, 102, 148, 14);
			panel.add(lblVacantesDisponibles);
			
			txtNombreEmpresa = new JTextField();
			txtNombreEmpresa.setEditable(false);
			txtNombreEmpresa.setColumns(10);
			txtNombreEmpresa.setBounds(258, 97, 238, 25);
			panel.add(txtNombreEmpresa);
			
			JLabel label_6 = new JLabel("Nombre de la empresa ");
			label_6.setBounds(258, 72, 139, 14);
			panel.add(label_6);
			
			JLabel label_7 = new JLabel("Oferta laboral");
			label_7.setBounds(10, 72, 122, 14);
			panel.add(label_7);
			
			txtOfertaLab = new JTextField();
			txtOfertaLab.setEditable(false);
			txtOfertaLab.setColumns(10);
			txtOfertaLab.setBounds(10, 97, 238, 25);
			panel.add(txtOfertaLab);
			
			txtFechaVencimiento = new JTextField();
			txtFechaVencimiento.setEditable(false);
			txtFechaVencimiento.setColumns(10);
			txtFechaVencimiento.setBounds(506, 219, 238, 25);
			panel.add(txtFechaVencimiento);
			
			JLabel label_8 = new JLabel("Fecha de vencimiento");
			label_8.setBounds(506, 194, 122, 14);
			panel.add(label_8);
			
			txtCantVacantes = new JTextField();
			txtCantVacantes.setEditable(false);
			txtCantVacantes.setColumns(10);
			txtCantVacantes.setBounds(664, 97, 80, 25);
			panel.add(txtCantVacantes);
			
			txtSalario = new JTextField();
			txtSalario.setEditable(false);
			txtSalario.setColumns(10);
			txtSalario.setBounds(258, 158, 238, 25);
			panel.add(txtSalario);
			
			txtPeriodoPago = new JTextField();
			txtPeriodoPago.setEditable(false);
			txtPeriodoPago.setColumns(10);
			txtPeriodoPago.setBounds(506, 158, 238, 25);
			panel.add(txtPeriodoPago);
			
			txtJornada = new JTextField();
			txtJornada.setEditable(false);
			txtJornada.setColumns(10);
			txtJornada.setBounds(10, 219, 238, 25);
			panel.add(txtJornada);
			
			txtTipoContrato = new JTextField();
			txtTipoContrato.setEditable(false);
			txtTipoContrato.setColumns(10);
			txtTipoContrato.setBounds(258, 219, 238, 25);
			panel.add(txtTipoContrato);
			
			txtProvincia = new JTextField();
			txtProvincia.setEditable(false);
			txtProvincia.setColumns(10);
			txtProvincia.setBounds(10, 158, 238, 25);
			panel.add(txtProvincia);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			panel_1.setBounds(10, 255, 734, 32);
			panel.add(panel_1);
			
			JLabel lblCandidatoQueMejor = new JLabel("Candidatos que mejor se adaptan a la oferta");
			lblCandidatoQueMejor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			panel_1.add(lblCandidatoQueMejor);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(10, 298, 734, 103);
			panel.add(panel_2);
			panel_2.setLayout(new BorderLayout(0, 0));
			JButton btnVerCandidato = new JButton("Ver candidato");

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			panel_2.add(scrollPane, BorderLayout.CENTER);
			{
				String headers[] = {"Codigo", "Nombre","Sexo", "Nivel de estudio", "Categoria Laboral", "Fecha de vencimiento"};
				model = new DefaultTableModel();
				model.setColumnIdentifiers(headers);
				table = new JTable();
				table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						int row = -1;
						row = table.getSelectedRow();
						if(row>-1){
							btnVerCandidato.setEnabled(true);
							selected = (Postulacion) BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(table.getValueAt(row, 0).toString());
						}
					}
				});
				table.setModel(model);
				scrollPane.setViewportView(table);
			}
			
			btnVerCandidato.setFont(new Font("Tahoma", Font.PLAIN, 14));
			btnVerCandidato.setEnabled(false);
			if(oferta.getEstado().equalsIgnoreCase("Expirada")) {
				btnVerCandidato.setEnabled(false);
			}
			btnVerCandidato.setBounds(565, 412, 179, 33);
			panel.add(btnVerCandidato);
			
			txtOfertaLab.setText(oferta.getOfertaLaboral());
			txtNombreEmpresa.setText(oferta.getMiCentro().getNombreEmpresa());
			txtCantVacantes.setText(String.valueOf(oferta.getCantVacantes()));
			txtJornada.setText(oferta.getJornada());
			txtPeriodoPago.setText(oferta.getPeriodoCobro());
			txtProvincia.setText(oferta.getProvincia());
			txtSalario.setText(String.valueOf(oferta.getSalario()));
			txtTipoContrato.setText(oferta.getTipoContrato());
			txtFechaVencimiento.setText(oferta.getFechaVencimiento().toString());
			
			txtEstado = new JTextField();
			txtEstado.setText((String) null);
			txtEstado.setEditable(false);
			txtEstado.setColumns(10);
			txtEstado.setBounds(10, 36, 238, 25);
			txtEstado.setText(oferta.getEstado());
			if(oferta.getEstado().equalsIgnoreCase("Completada")) {
				txtEstado.setBackground(Color.GREEN);
			}
			if(oferta.getEstado().equalsIgnoreCase("Disponible")) {
				txtEstado.setBackground(Color.yellow);
			}
			if(oferta.getEstado().equalsIgnoreCase("Eliminada")) {
				txtEstado.setBackground(Color.RED);
			}
			if(oferta.getEstado().equalsIgnoreCase("Expirada")) {
				txtEstado.setBackground(Color.RED);
			}
			
			
			
			
			panel.add(txtEstado);
			
			JLabel lblEstadoDeLa = new JLabel("Estado de la oferta:");
			lblEstadoDeLa.setBounds(10, 11, 122, 14);
			panel.add(lblEstadoDeLa);
			int k =0;
			for(int i=0;BolsaDeTrabajo.getInstance().getMisSolicitudes().size()>i;i++) {
				if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Postulacion) {
					k++;
				}
			}

			if(oferta.getEstado().equalsIgnoreCase("Disponible")&&k>0) {
				loadTable(oferta);	
			}
			
			btnVerCandidato.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ResumenPostulacion list = new ResumenPostulacion(oferta,selected,1);
					list.setVisible(true);
				}
			});
		}
		
		
	}
	
	private void loadTable(Oferta oferta) {
		
		model.setRowCount(0);
		model.setColumnCount(6);
			BolsaDeTrabajo.getInstance().algoritmoBuscarMejorCandidato(oferta);
			row = new Object[model.getColumnCount()];
			for (int i = 0; i < oferta.getMisPostulaciones().size(); i++) {
				
				row[0] = oferta.getMisPostulaciones().get(i).getCodigo();
				row[1] = oferta.getMisPostulaciones().get(i).getMiCandidato().getNombre();
				row[2] = oferta.getMisPostulaciones().get(i).getMiCandidato().getSexo();
				row[3] = oferta.getMisPostulaciones().get(i).getMiCandidato().getProvincia();
				row[4] = oferta.getMisPostulaciones().get(i).getCategoriaLaboral();
				row[5] = oferta.getMisPostulaciones().get(i).getFechaVencimiento().toString();
				model.addRow(row);
			}
	}
}
