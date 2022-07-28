package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import logico.CentroEmpleador;

import javax.swing.JTextField;

public class InicioEmpresa extends JFrame {

	
	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre;
	private JTextField txtRNC;
	private JTextField txtCategoriaLab;
	private JTextField txtProvincia;
	private DefaultTableModel model;	
	private Object row[];

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public InicioEmpresa(CentroEmpleador centro) {
	
		setTitle("Bolsa de trabajo para empresas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 504);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmMisOfertas = new JMenuItem("Mis ofertas");
		mntmMisOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MisOfertas list = new MisOfertas();
				list.setModal(true);
				list.setVisible(true);	
			}
		});
		
		JMenu mnMiEmpresa = new JMenu("Mi Empresa");
		menuBar.add(mnMiEmpresa);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesi\u00F3n");
		mnMiEmpresa.add(mntmCerrarSesion);
		menuBar.add(mntmMisOfertas);
		
		JMenuItem mntmCrearOferta = new JMenuItem("Crear oferta de trabajo");
		mntmCrearOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearOferta list2 = new CrearOferta(centro);
				list2.setVisible(true);
			}
		});
		menuBar.add(mntmCrearOferta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 11, 245, 409);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setBounds(10, 61, 225, 25);
		panel_1.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre de la empresa:");
		lblNombre.setBounds(10, 36, 167, 14);
		panel_1.add(lblNombre);
		
		txtRNC = new JTextField();
		txtRNC.setEditable(false);
		txtRNC.setColumns(10);
		txtRNC.setBounds(10, 147, 225, 25);
		panel_1.add(txtRNC);
		
		txtCategoriaLab = new JTextField();
		txtCategoriaLab.setEditable(false);
		txtCategoriaLab.setColumns(10);
		txtCategoriaLab.setBounds(10, 233, 225, 25);
		panel_1.add(txtCategoriaLab);
		
		txtProvincia = new JTextField();
		txtProvincia.setEditable(false);
		txtProvincia.setColumns(10);
		txtProvincia.setBounds(10, 319, 225, 25);
		panel_1.add(txtProvincia);
		
		JLabel lblRnc = new JLabel("RNC:");
		lblRnc.setBounds(10, 122, 129, 14);
		panel_1.add(lblRnc);
		
		JLabel lblCategoriaLaboral = new JLabel("Categoria laboral:");
		lblCategoriaLaboral.setBounds(10, 208, 129, 14);
		panel_1.add(lblCategoriaLaboral);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(10, 294, 129, 14);
		panel_1.add(lblProvincia);
		
		JButton btnEditarBoton = new JButton("Editar perfil");
		btnEditarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditarPerfilEmpresa list3 = new EditarPerfilEmpresa(centro);
				list3.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
				list3.setVisible(true);
			}
		});
		btnEditarBoton.setBounds(68, 373, 109, 25);
		panel_1.add(btnEditarBoton);
		JButton btnVerResumen = new JButton("Ver detalles de candidato");
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(265, 63, 436, 305);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_2.add(scrollPane);
		{
			String headers[] = {"Oferta laboral", "Codigo del candidato", "Nombre del candidato"};
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
						btnVerResumen.setEnabled(true);
						//selected = Habana.getInstance().getMisFacturas().get(Habana.getInstance().buscarFacturaForIndex(table.getValueAt(row, 1).toString()));
					}
				}
			});
			table.setModel(model);
			scrollPane.setViewportView(table);
		}
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(265, 11, 436, 41);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPostulaciones = new JLabel("Mejores candidatos para las ofertas");
		lblPostulaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPostulaciones.setBounds(102, 11, 277, 14);
		panel_4.add(lblPostulaciones);
		
		
		btnVerResumen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVerResumen.setEnabled(false);
		btnVerResumen.setBounds(265, 379, 207, 41);
		panel.add(btnVerResumen);
		
		JButton btnRefrescar = new JButton("Refrescar");
		btnRefrescar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNombre.setText(centro.getNombre());
				txtCategoriaLab.setText(centro.getCategoriaLaboral());
				txtProvincia.setText(centro.getProvincia());
				txtRNC.setText(centro.getRnc());
			}
		});
		btnRefrescar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRefrescar.setBounds(482, 379, 219, 41);
		panel.add(btnRefrescar);
		
		txtNombre.setText(centro.getNombre());
		txtCategoriaLab.setText(centro.getCategoriaLaboral());
		txtProvincia.setText(centro.getProvincia());
		txtRNC.setText(centro.getRnc());
		
		loadTable(); 
	}
	
	private void loadTable() {
		model.setRowCount(0);
		model.setColumnCount(3);
		row = new Object[model.getColumnCount()];
		//for (int i = 0; i < Habana.getInstance().getMisFacturas().size(); i++) {
			//row[0] = Habana.getInstance().getMisFacturas().get(i).getCodigo();
			//row[1] = String.valueOf(Habana.getInstance().getMisFacturas().get(i).precioTotalFactura());
			//model.addRow(row);
		//}

	}

}
