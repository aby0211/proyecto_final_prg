package Visual;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.CentroEmpleador;
import logico.Obrero;
import logico.Oferta;
import logico.Postulacion;
import logico.Solicitud;
import logico.Tecnico;
import logico.Universitario;

import java.awt.Dialog.ModalExclusionType;

public class ListaPostulaciones extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];
	JButton btnVerDetalles = new JButton("Ver detalles");
	private Postulacion selected = null;
	

	/**
	 * Launch the application.
	 */
	

	public ListaPostulaciones(Candidato user) {
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Lista de postulaciones");
		setBounds(100, 100, 811, 468);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaDeUsuarios.class.getResource("/post.png")));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarOferta = new JButton("Eliminar postulacion");
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(7, 11, 771, 362);
				scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				panel.add(scrollPane);
				{
					String headers[] = {"Codigo", "Estado de postulacion","Nivel de estudio", "Categoria Laboral", "Fecha de vencimiento"};
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
								btnEliminarOferta.setEnabled(true);
								btnVerDetalles.setEnabled(true);
								selected = (Postulacion) BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(table.getValueAt(row, 0).toString());
							}
						}
					});
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			

			btnEliminarOferta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int option = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar la oferta con id: "+selected.getCodigo() , "Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(option == JOptionPane.YES_OPTION){
						BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(selected.getCodigo()).setEstado("Eliminada");
						BolsaDeTrabajo.getInstance().buscarSolicitudEnCandidato(user, selected.getCodigo()).setEstado("Eliminada");
						BolsaDeTrabajo.getInstance().eliminarSolicitudEnCandidato(user, selected.getCodigo());
						BolsaDeTrabajo.getInstance().guardarBolsa();
						loadTable(user);
					}
				}
			});
			
			btnEliminarOferta.setEnabled(false);
			btnEliminarOferta.setBounds(623, 385, 152, 23);
			panel.add(btnEliminarOferta);
			btnVerDetalles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ResumenPostulacion list = new ResumenPostulacion(null,selected,0);
					list.setVisible(true);
				}
			});
			
			
			btnVerDetalles.setEnabled(false);
			btnVerDetalles.setBounds(503, 385, 110, 23);
			panel.add(btnVerDetalles);
		}
		loadTable(user);
	}


	
	private void loadTable(Candidato user) {
		model.setRowCount(0);
		model.setColumnCount(5);
		row = new Object[model.getColumnCount()];
		for (int i = 0; i <user.getMisPostulaciones().size(); i++) {
			row[0] = user.getMisPostulaciones().get(i).getCodigo();
			if (user.getMisPostulaciones().get(i).getFechaVencimiento().before(new Date())) {
			    user.getMisPostulaciones().get(i).setEstado("Expirada");
			}
			row[1] = user.getMisPostulaciones().get(i).getEstado();
			if(user.getMisPostulaciones().get(i)instanceof Universitario) {
				row[2] = "Universitario";
			}
			if(user.getMisPostulaciones().get(i)instanceof Tecnico) {
				row[2] = "Técnico";
			}
			if(user.getMisPostulaciones().get(i)instanceof Obrero) {
				row[2] = "Educ. Básica";
			}
			
			row[3] = user.getMisPostulaciones().get(i).getCategoriaLaboral();
			row[4] =  user.getMisPostulaciones().get(i).getFechaVencimiento();
			model.addRow(row);
		}
	}
}

