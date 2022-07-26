package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;

public class InicioEmpresa extends JFrame {

	
	private JPanel contentPane;
	private JTable table;
	private JTextField txtNombre;
	private JTextField txtRNC;
	private JTextField txtCategoriaLab;
	private JTextField txtProvincia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioEmpresa frame = new InicioEmpresa();
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
	public InicioEmpresa() {
		setTitle("Bolsa de trabajo para empresas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 504);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmMiEmpresa = new JMenuItem("Mi empresa");
		mntmMiEmpresa.setEnabled(false);
		menuBar.add(mntmMiEmpresa);
		
		JMenuItem mntmMisOfertas = new JMenuItem("Mis ofertas");
		menuBar.add(mntmMisOfertas);
		
		JMenuItem mntmCrearOferta = new JMenuItem("Crear oferta de trabajo");
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
		btnEditarBoton.setBounds(68, 373, 109, 25);
		panel_1.add(btnEditarBoton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(265, 63, 436, 305);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_2.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(265, 379, 436, 41);
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JButton btnShowResumen = new JButton("Ver resumen de postulacion");
		btnShowResumen.setEnabled(false);
		btnShowResumen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_3.add(btnShowResumen, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(265, 11, 436, 41);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblPostulaciones = new JLabel("Postulaciones mas recientes");
		lblPostulaciones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPostulaciones.setBounds(125, 11, 186, 14);
		panel_4.add(lblPostulaciones);
	}
}
