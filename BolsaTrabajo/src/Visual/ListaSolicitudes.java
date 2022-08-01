package Visual;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import logico.CentroEmpleador;
import logico.Oferta;
import logico.Postulacion;
import logico.Solicitud;

import java.awt.Dialog.ModalExclusionType;

public class ListaSolicitudes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];
	JButton btnVerDetalles = new JButton("Ver detalles");
	private Solicitud selected = null;

	/**
	 * Launch the application.
	 */
	

	public ListaSolicitudes() {
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Mis solicitudes");
		setBounds(100, 100, 811, 468);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarOferta = new JButton("Eliminar oferta");
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
					String headers[] = {"Codigo", "Tipo de Solicitud", "Estado de solicitud", "Categoria Laboral", "Provincia", "Fecha de vencimiento"};
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
								selected = BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(table.getValueAt(row, 0).toString());
							}
						}
					});
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			

			btnEliminarOferta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int option = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar la solicitud con id: "+selected.getCodigo() , "Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(option == JOptionPane.YES_OPTION){
						BolsaDeTrabajo.getInstance().buscarSolicitudByCodigo(selected.getCodigo()).setEstado("Eliminada");
						BolsaDeTrabajo.getInstance().eliminarSolicitudGlobal(selected.getCodigo());
						loadTable();
					}
				}
			});
			
			btnEliminarOferta.setEnabled(false);
			btnEliminarOferta.setBounds(651, 385, 124, 23);
			panel.add(btnEliminarOferta);
			btnVerDetalles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(selected instanceof Oferta) {
						DetallesOferta list = new DetallesOferta((Oferta)selected);
						list.setVisible(true);	
					}
					if(selected instanceof Postulacion) {
						ResumenPostulacion list = new ResumenPostulacion((Postulacion)selected);
						list.setVisible(true);
					}

				}
			});
			
			
			btnVerDetalles.setEnabled(false);
			btnVerDetalles.setBounds(531, 385, 110, 23);
			panel.add(btnVerDetalles);
		}
		loadTable();
	}


	
	private void loadTable() {
		model.setRowCount(0);
		model.setColumnCount(6);
		row = new Object[model.getColumnCount()];
		for (int i = 0; i <BolsaDeTrabajo.getInstance().getMisSolicitudes().size(); i++) {
			row[0] = BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCodigo();
			if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Oferta) {
				row[1] = "Oferta";
			}else if(BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i)instanceof Postulacion) {
				row[1] = "Postulación";
			}
			
			if (BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getFechaVencimiento().before(new Date())) {
			    BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).setEstado("Expirada");
			}
			row[2] = BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getEstado();
			row[3] = BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getCategoriaLaboral();
			row[4] = BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getProvincia();
			row[5] = BolsaDeTrabajo.getInstance().getMisSolicitudes().get(i).getFechaVencimiento();
			model.addRow(row);
		}
	}
}