package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Dialog.ModalExclusionType;

public class MisOfertas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];

	/**
	 * Launch the application.
	 */
	

	public MisOfertas() {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Mis ofertas");
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
					String headers[] = {"Oferta laboral", "Estado de oferta", "Vacantes disponibles", "Cantidad de postulaciones", "Fecha de vencimiento"};
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
								//selected = Habana.getInstance().getMisFacturas().get(Habana.getInstance().buscarFacturaForIndex(table.getValueAt(row, 0).toString()));
							}
						}
					});
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			

			btnEliminarOferta.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			
			btnEliminarOferta.setEnabled(false);
			btnEliminarOferta.setBounds(651, 385, 124, 23);
			panel.add(btnEliminarOferta);
			
			JButton button = new JButton("Ver detalles");
			button.setEnabled(false);
			button.setBounds(531, 385, 110, 23);
			panel.add(button);
		}
		loadTable();
	}


	
	private void loadTable() {
		model.setRowCount(0);
		model.setColumnCount(5);
		row = new Object[model.getColumnCount()];
		//for (int i = 0; i < Habana.getInstance().getMisFacturas().size(); i++) {
			//row[0] = Habana.getInstance().getMisFacturas().get(i).getCodigo();
			//row[1] = String.valueOf(Habana.getInstance().getMisFacturas().get(i).precioTotalFactura());
			//model.addRow(row);
		//}

	}
}

