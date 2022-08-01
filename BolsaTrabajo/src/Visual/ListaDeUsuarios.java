package Visual;

import java.awt.BorderLayout;

import java.awt.EventQueue;
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

import logico.Administrador;
import logico.BolsaDeTrabajo;
import logico.Candidato;
import logico.CentroEmpleador;
import logico.Obrero;
import logico.Oferta;
import logico.Postulacion;
import logico.Solicitud;
import logico.Tecnico;
import logico.Universitario;
import logico.Usuario;

import java.awt.Dialog.ModalExclusionType;

public class ListaDeUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel model;
	private Object row[];
	JButton btnVerDetalles = new JButton("Ver detalles");
	private Usuario selected = null;

	/**
	 * Launch the application.
	 */
	

	public ListaDeUsuarios() {
		setModal(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Lista de usuarios");
		setBounds(100, 100, 811, 468);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		JButton btnEliminarUsuarios = new JButton("Eliminar usuario");
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
					String headers[] = {"Username","Tipo de cuenta", "Nombre","Género", "Cédula", "Teléfono", "Provincia"};
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
								btnVerDetalles.setEnabled(true);
								selected =  BolsaDeTrabajo.getInstance().buscarUsuarioByUser(table.getValueAt(row, 0).toString());
							}
							if(row>0){
								btnEliminarUsuarios.setEnabled(true);
							}
						}
					});
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
			

			btnEliminarUsuarios.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					int option = JOptionPane.showConfirmDialog(null, "Está seguro de eliminar el usuario con username: "+selected.getUsername() , "Confirmación",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
					if(option == JOptionPane.YES_OPTION){
						BolsaDeTrabajo.getInstance().getMisUsuarios().remove(BolsaDeTrabajo.getInstance().buscarUsuarioByUser(selected.getUsername()));
						BolsaDeTrabajo.getInstance().guardarBolsa();
						loadTable();
						int row = -1;
						row=table.getSelectedRow();
						if(row<0) {
							btnEliminarUsuarios.setEnabled(false);
						}
					}
				}
			});
			
			btnEliminarUsuarios.setEnabled(false);
			btnEliminarUsuarios.setBounds(623, 385, 152, 23);
			panel.add(btnEliminarUsuarios);
			btnVerDetalles.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//DetallesOferta list = new DetallesOferta(selected);
					//list.setVisible(true);
				}
			});
			
			
			btnVerDetalles.setEnabled(false);
			btnVerDetalles.setBounds(503, 385, 110, 23);
			panel.add(btnVerDetalles);
		}
		loadTable();
	}


	
	private void loadTable() {
		model.setRowCount(0);
		model.setColumnCount(7);
		row = new Object[model.getColumnCount()];
		for (int i = 0; i <BolsaDeTrabajo.getInstance().getMisUsuarios().size(); i++) {
			row[0] = BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getUsername();
			row[2] = BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getNombre();
			if(BolsaDeTrabajo.getInstance().getMisUsuarios().get(i)instanceof Candidato) {
				row[1] = "Candidato";
			}
			if(BolsaDeTrabajo.getInstance().getMisUsuarios().get(i)instanceof CentroEmpleador) {
				row[1] = "Empresa";
			}
			if(BolsaDeTrabajo.getInstance().getMisUsuarios().get(i)instanceof Administrador) {
				row[1] = "Administrador";
			}
			row[3] = BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getSexo();
			row[4] =  BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getCedula();
			row[5] =  BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getTelefono();
			row[6] =  BolsaDeTrabajo.getInstance().getMisUsuarios().get(i).getProvincia();
			model.addRow(row);
		}
	}
}
